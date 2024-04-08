package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLoan {

	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCar");
	}
	@BeforeMethod
	public void BfMethod()
	{
		System.out.println("I will execute before every test methods in car loan class");
	}
	@BeforeClass
	public void Bfclass()
	{
		System.out.println("before executing any method in car loan class");
	}
	@AfterClass
	public void Afclass()
	{
		System.out.println("after executing any method in car loan class");
	}
	@AfterMethod
	public void AfMethod()
	{
		System.out.println("I will execute after every test methods in car loan class");
	}
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar");
	}
	@Test
	public void MobileSognInCarLoan()
	{
		System.out.println("MobileSigninCar");
	}@Test
	public void MobileSearchCarLoan()
	{
		System.out.println("MobileSearchCar");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am No:1");
	}
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICar");
	}
}
