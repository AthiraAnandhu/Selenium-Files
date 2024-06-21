package POM.PageObjectModel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest extends BaseTest{
	String productname="ZARA COAT 3";
	
	@Test(dataProvider="getData",groups= {"Purchase"})
	//public void submitOrder(String email,String Password,String productname) throws IOException
	public void submitOrder(HashMap<String,String> input) throws IOException
	{
	//LandingPage landingPage = launchApplication();
		
		ProductCatalogue productcatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
		
		//product catalogue actions
		 
		//find path of particular product from each and compare it with our need and save it to webelement
		List <WebElement>products =productcatalogue.getProductList();
		//now find xpath of add to cart from product path and click on it
		productcatalogue.addProductToCart(input.get("product"));

		//now click on add to cart
		CartPage cartpage = productcatalogue.clickingCartButton();
		//now verify item in the cart is same as our selection
		Boolean match= cartpage.verifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		
		//now click on checkout
		Checkout checkout = cartpage.gotocheckout();
		checkout.typecheckoutdetails("India");
		ConfirmationPage ConfirmationPage = checkout.submitOrder();
		
		
		String confirmmsg =ConfirmationPage.ThankyouMessage();		
		Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
	}
	
	//to verify zara coat 3 is displayed in orders page
	@Test(dependsOnMethods= {"submitOrder"})
	
	public void OrderHistory() throws IOException
	{
		ProductCatalogue productcatalogue = landingPage.loginApplication("athira430@gmail.com", "Moluathi123@");
		//click on orders
		OrderPage orderpage =productcatalogue.gotoorderPage();
		Assert.assertTrue(orderpage.verifyOrderDisplay(productname));
	}
	
	
	public String getScreenShot(String testcaseName ) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//reports"+ testcaseName +".png");
		FileUtils.copyDirectory(source, file);
		return System.getProperty("user.dir")+"//reports"+ testcaseName +".png" ;
		
	}
	
	/*
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"athira430@gmail.com","Moluathi123@","ZARA COAT 3"},{"anshika@gmail.com","Iamking@000","ADIDAS ORIGINAL"}};
	}
	*/
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		/*
		HashMap <String,String> map = new HashMap <String,String> ();
		map.put("email", "athira430@gmail.com");
		map.put("password", "Moluathi123@");
		map.put("product", "ZARA COAT 3");
		
		HashMap <String,String> map1 = new HashMap <String,String> ();
		map1.put("email", "anshika@gmail.com");
		map1.put("password", "Iamking@000");
		map1.put("product", "ADIDAS ORIGINAL");
		*/
		List <HashMap<String,String>> data = getJsonDataToMap (System.getProperty("user.dir")+"\\src\\test\\java\\Datas\\PurchaseOrder.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
}
