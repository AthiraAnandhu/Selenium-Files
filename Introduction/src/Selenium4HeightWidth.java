import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4HeightWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        WebElement nameEditBox = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
       
        System.out.println(nameEditBox.getRect().getDimension().getHeight());
        System.out.println(nameEditBox.getRect().getDimension().getWidth());
	}

}
