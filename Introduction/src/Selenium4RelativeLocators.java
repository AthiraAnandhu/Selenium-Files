import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium4RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        WebElement nameEditBox = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
        //finding above nameEditbox
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
        
        //finding below dateofbirth but due to some error it will click on submit
        
        WebElement dob = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        driver.findElement(with(By.tagName("input")).below(dob)).click();
        
        //click checkbox to left of Check me out if you Love IceCreams!
      
        WebElement checkboxleft = driver.findElement(By.xpath("//label[@class='form-check-label']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(checkboxleft)).click();
        
        //find student
        WebElement radiobutton = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
	}

}
