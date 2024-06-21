package POM.PageObjectModel;

import java.io.IOException;
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
import org.testng.annotations.Test;

import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidations extends BaseTest {

	@Test

	public void LoginErrorValidation() throws IOException {
		String productname = "ZARA COAT 3";

		// giving wrong email id and password
		ProductCatalogue productcatalogue = landingPage.loginApplication("athira43@gmail.com", "Mluathi123@");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

	}

	@Test

	public void ProductErrorValidation() throws IOException {
		String productname = "ZARA COAT 3";
		ProductCatalogue productcatalogue = landingPage.loginApplication("athira0@gmail.com", "Moluathi123@");
		List<WebElement> products = productcatalogue.getProductList();
		productcatalogue.addProductToCart(productname);
		CartPage cartpage = productcatalogue.clickingCartButton();
		Boolean match = cartpage.verifyProductDisplay("ZARA COAT 33");
		Assert.assertTrue(match);

	}

}
