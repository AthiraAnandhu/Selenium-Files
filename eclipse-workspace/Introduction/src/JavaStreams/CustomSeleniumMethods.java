package JavaStreams;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomSeleniumMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		//capture all elements to list
		List<WebElement> elementlist= driver.findElements(By.xpath("//tr/td[1]"));
	//get all text and add to list
		List<String> price=
	elementlist.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceofBeans(s)).collect(Collectors.toList());
	price.forEach(a->System.out.println(a));
	}

	private static String getPriceofBeans(WebElement s) {
	
		String pricevalue =s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}
