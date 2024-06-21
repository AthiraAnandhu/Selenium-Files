import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //delete cookies
        driver.manage().deleteAllCookies();
        
        //delecte only one cookie with name
        driver.manage().deleteCookieNamed("ghsahg");
        
        //add cookie
       // driver.manage().addCookie("sf");
		driver.get("https://www.google.ca/");
	}

}
