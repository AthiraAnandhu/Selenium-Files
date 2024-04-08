import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableGrids {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		scroll.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//sum all the values in 4th column
		List <WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		
		int sum=0;
		for(int i=0; i<values.size();i++)
		{
			sum=sum+(Integer.parseInt(values.get(i).getText())); 
		}
		System.out.println(sum);
		
		//compare the sum with total amount shown onscreen
		//driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText();
		
		int totalValue= Integer.parseInt(driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, totalValue);
		
		//ASSIGNMENT- SUM VALUE IN OLUMN OF LEFT TABLE
		
		Thread.sleep(3000);
		scroll.executeScript("document.querySelector('.left-align').scrollTop=5000");
		
		List <WebElement> newvalues =driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[2]/td[3]"));
		int newsum=0;
		for(int i=0; i<newvalues.size();i++)
		{
			newsum=newsum+ (Integer.parseInt(newvalues.get(i).getText())); 
		}
		System.out.println(newsum);
	}

}
