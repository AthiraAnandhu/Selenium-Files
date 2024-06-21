import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4PartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        //fill in the name field with the first course name available at https://rahulshettyacademy.com/
        
        driver.switchTo().newWindow(WindowType.TAB);
        
       //now we need to switch driver control to new window so use window handles.
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        
        //now control of driver is in childid so give url
        driver.get("https://rahulshettyacademy.com/");
        
        //now get text of first course
        
        String course=
        		//driver.findElement(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')][1]")).getText();
      driver.findElement(By.xpath("//a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']")).getText();
        
        //now switch driver to parent id
       driver.switchTo().window(parentid);
       
       //now enter the course text on name field
       
      WebElement name = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
      name.sendKeys(course);
      
      
      //taking partial screenshot
     File file =  name.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file, new File("logo.png"));
       
       driver.quit();       
	}

}
