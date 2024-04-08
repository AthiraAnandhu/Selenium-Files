import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingMultpleItemCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int j=0;

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// iterate throgh size
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual product name without Brocolli - 1 Kg
			// convert array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);
			// check whether name you extracted is present in array or not
			if (itemsNeededList.contains("name")) {
				j++;
				// click on add to cart
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				
				if(j==3)
				{
					break;
				}

			}

		}
	}
}
