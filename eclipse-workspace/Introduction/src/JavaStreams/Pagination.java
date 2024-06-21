package JavaStreams;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		
		List<String> price;
		do {
		// capture all elements to list
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));

		// get all text and add to list
		price= elementlist.stream().filter(s -> s.getText().contains("Rice"))
				.map(s -> getPriceofBeans(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}

	private static String getPriceofBeans(WebElement s) {

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
