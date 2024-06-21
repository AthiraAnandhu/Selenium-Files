package JavaStreams;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

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
	List<String> originallist =	elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	
	//sort the above list
	List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
	System.out.println("originallist"+ originallist);
	System.out.println("sortedlist="+ sortedlist);
	//compare both list
	Assert.assertTrue(originallist.equals(sortedlist));
		
	}

}
