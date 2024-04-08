import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.className("blinkingText")).click();
		
		Set <String> windows=driver.getWindowHandles();  //parentid , childid
		Iterator <String> it =windows.iterator();
		String parentid = it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		
		
		System.out.println(driver.findElement(By.xpath("//p[text()='Please email us at ']")).getText());
		
		//extract emailid
		String emailid = driver.findElement(By.xpath("//p[text()='Please email us at ']")).getText().split("at")[1].split("with")[0].trim();
		
		//now switch to parent window to enter emailid
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
		
	}

}
