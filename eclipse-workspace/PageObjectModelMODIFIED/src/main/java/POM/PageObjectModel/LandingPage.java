package POM.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractReusableComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {

	 WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
      @FindBy(id="userEmail")
      WebElement myemail;
      
      @FindBy(id="userPassword")
      WebElement mypassword;
      
      @FindBy(id="login")
      WebElement usersubmit;
      
      
      //action class for login
      public ProductCatalogue loginApplication(String email, String password) {
    	  myemail.sendKeys(email);
    	  mypassword.sendKeys(password);
    	  usersubmit.click();
    	  ProductCatalogue productcatalogue = new ProductCatalogue(driver);
    	  return productcatalogue;
      }
      //action class for url
      public void goTo()
      {
    	  driver.get("https://rahulshettyacademy.com/client");
      }
}
