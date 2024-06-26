package AbstractReusableComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.PageObjectModel.CartPage;

public class AbstractComponents {
	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//ul/li[4]/button[@class='btn btn-custom']")
	WebElement cartbutton;

		

		public void waitforElementToAppear(By findBy)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		}
		
		
		public void waitforElementToDisappear(WebElement ele)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOf(ele));
		}
		
		//as cart button is a common heading we can write it her in abstract class
		public CartPage clickingCartButton()
		{
			cartbutton.click();
			CartPage cartpage = new CartPage(driver);
			return cartpage;
		}
	}


