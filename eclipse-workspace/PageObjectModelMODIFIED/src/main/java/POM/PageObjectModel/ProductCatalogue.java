package POM.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbstractReusableComponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents{

	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(className="ng-animating")
	WebElement spinner;
	
	
	
	By productsBy =By.cssSelector(".mb-3");
	By addtoCart =By.cssSelector(".card-body button:last-of-type");
	By toastMessage= By.id("toast-container");
	By invisibilityMsg= By.className("ng-animating");
	
	public List<WebElement> getProductList()
	{
		waitforElementToAppear(productsBy);
		return products;
	}
	
	public WebElement findproductbyname(String productname)
	{
		WebElement prod =getProductList().stream().filter(s->s.findElement(By.cssSelector("b"))
				.getText().equals(productname)).findFirst().orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productname)
	{
		WebElement prod =findproductbyname(productname);
		prod.findElement(addtoCart).click();
		waitforElementToAppear(toastMessage);
		waitforElementToDisappear(spinner);
		
	
	}
	

}
