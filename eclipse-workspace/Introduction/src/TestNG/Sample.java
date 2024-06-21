package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	@AfterTest
	public void OnlyLast()
	{
		System.out.println("I will execute Last");
	}
	@Test(groups={"Smoke"})
	public void Demo()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	@AfterSuite
	public void AfLast()
	{
		System.out.println("I am the No:1 from the last");
	}
}
