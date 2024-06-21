import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDynamicUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String monthnumber="6";
		String year="15";
		String date="2027";
		

		
			WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='2027']")).click();
		//driver.findElement(By.className("react-calendar__navigation__label__labelText")).get(Integer.parseInt(monthnumber)-1).click();
		
		
	}

}
