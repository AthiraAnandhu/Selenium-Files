package POM.PageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) {
		
		String productname="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//login actions
		LandingPage landingPage= new LandingPage(driver);
		landingPage.goTo();
		ProductCatalogue productcatalogue = landingPage.loginApplication("athira430@gmail.com", "Moluathi123@");
		
		//product catalogue actions
		 
		//find path of particular product from each and compare it with our need and save it to webelement
		List <WebElement>products =productcatalogue.getProductList();
		//now find xpath of add to cart from product path and click on it
		productcatalogue.addProductToCart(productname);

		//now click on add to cart
		CartPage cartpage = productcatalogue.clickingCartButton();
		//now verify item in the cart is same as our selection
		Boolean match= cartpage.verifyProductDisplay(productname);
		Assert.assertTrue(match);
		
		//now click on checkout
		Checkout checkout = cartpage.gotocheckout();
		checkout.typecheckoutdetails("India");
		ConfirmationPage ConfirmationPage = checkout.submitOrder();
		
		
		String confirmmsg =ConfirmationPage.ThankyouMessage();		
		Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
		
	}

}
