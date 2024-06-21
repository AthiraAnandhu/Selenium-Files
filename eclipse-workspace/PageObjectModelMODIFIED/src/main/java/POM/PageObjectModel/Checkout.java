package POM.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractReusableComponents.AbstractComponents;

public class Checkout extends AbstractComponents {

	WebDriver driver;

	public Checkout(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//input[@class='input txt text-validated'])[2]")
	WebElement country;
	
	By results = By.xpath("//section[contains(@class,'ta-results')]");
	
	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectcountry;
	
	@FindBy(xpath = "//a[contains(@class,'btnn action')]")
	WebElement submitOrder;

	public void typecheckoutdetails(String countryname) {
		//now click and type on select country bar
		Actions a = new Actions(driver);
		a.sendKeys(country, countryname).build().perform();
		//wait until block is loaded 
		waitforElementToAppear(results);
		//now select india from it
		selectcountry.click();
	}
	
	//now place order click
	public ConfirmationPage submitOrder()
	{
		submitOrder.click();
		ConfirmationPage ConfirmationPage = new ConfirmationPage(driver);
		return ConfirmationPage;
	}
}
