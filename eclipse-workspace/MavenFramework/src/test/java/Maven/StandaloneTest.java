package Maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userEmail")).sendKeys("athira430@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Moluathi123@");
		driver.findElement(By.id("login")).click();
		String productname="ZARA COAT 3";
		//Explicit wait globally
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		//collect all products to list using common class name card
		List<WebElement> product =driver.findElements(By.cssSelector(".mb-3"));
		
		//find path of particular product from each and compare it with our need and save it to webelement
		WebElement prod =product.stream().filter(s->s.findElement(By.cssSelector("b"))
				.getText().equals(productname)).findFirst().orElse(null);
		
		//now find xpath of add to cart from product path and click on it
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		//now wait till visibility of message at button with product added to cart
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		
		//now wait till invisibility of loading button,here class name of it is ng-animating
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ng-animating")));
		
		//now click on add to cart
		driver.findElement(By.xpath("//ul/li[4]/button[@class='btn btn-custom']")).click();
		
		//now verify item in the cart is same as our selection
		List <WebElement> cartlist=
		driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
		Boolean match= cartlist.stream().anyMatch(a->a.getText().equalsIgnoreCase(productname));
		Assert.assertTrue(match);
		
		//now click on checkout
		driver.findElement(By.xpath("//div[@class='subtotal cf ng-star-inserted']/ul/li[3]/button")).click();
		
		//now click and type on select country bar
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("(//input[@class='input txt text-validated'])[2]")), "India").build().perform();
		//wait until block is loaded 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[contains(@class,'ta-results')]")));
		//now select india from it
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		
		//now place order click
		driver.findElement(By.xpath("//a[contains(@class,'btnn action')]")).click();
		
		//now get text of thakyou order
		String confirmmsg =driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText();
		Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
		
	}

}
