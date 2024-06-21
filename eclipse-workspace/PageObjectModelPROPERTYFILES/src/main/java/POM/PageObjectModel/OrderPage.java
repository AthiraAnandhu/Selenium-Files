package POM.PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractReusableComponents.AbstractComponents;

public class OrderPage extends AbstractComponents {

	WebDriver driver;

	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//tr/td[2]")
	List<WebElement> productnames;

	@FindBy(xpath = "//div[@class='subtotal cf ng-star-inserted']/ul/li[3]/button")
	WebElement checkoutele;

	// now verify item in the cart is same as our selection
	public Boolean verifyOrderDisplay(String productname) {
		Boolean match = productnames.stream().anyMatch(a -> a.getText().equalsIgnoreCase(productname));
		return match;
	}


		
	}

