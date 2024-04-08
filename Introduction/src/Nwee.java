import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nwee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("file:///C:/Users/Owner/Downloads/RegistrationPage.html");
		driver.get("file:///C:/Users/Owner/Downloads/Sample1.html");
		
		//driver.findElement(By.linkText("messages123")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("a[id='a1']")).click();
			
				//driver.findElement(By.partialLinkText("messages")).click();
				
				//driver.close();
		
		
		
	}

}
