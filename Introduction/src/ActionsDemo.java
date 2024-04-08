import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		driver.manage().window().maximize();
		
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//span[text()='Free Trial']"))).build().perform();
	
	//capital letter and double click
	driver.findElement(By.xpath("//button[@class='bstack-mm-search-menu doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle hide-sm hide-xs']")).click();
	a.moveToElement(driver.findElement(By.id("doc-search-box-input"))).keyDown(Keys.SHIFT).sendKeys("athira prasannakumar").doubleClick().build().perform();
	
	//right click or context click
	a.moveToElement(driver.findElement(By.xpath("//span[text()='Free Trial']"))).contextClick().build().perform();
	}

}
