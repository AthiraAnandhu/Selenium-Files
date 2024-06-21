package POM.PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractReusableComponents.AbstractComponents;

public class CartPage extends AbstractComponents {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@class='cartSection']/h3")
	List<WebElement> producttitles;

	@FindBy(xpath = "//div[@class='subtotal cf ng-star-inserted']/ul/li[3]/button")
	WebElement checkoutele;

	// now verify item in the cart is same as our selection
	public Boolean verifyProductDisplay(String productname) {
		Boolean match = producttitles.stream().anyMatch(a -> a.getText().equalsIgnoreCase(productname));
		return match;
	}

	public Checkout gotocheckout() {
		checkoutele.click();
		Checkout checkout = new Checkout(driver);
		return checkout;
		
	}
}
