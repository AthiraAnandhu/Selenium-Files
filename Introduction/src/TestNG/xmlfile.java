package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xmlfile {
	@Test
	
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@Test(groups={"Smoke"})
	public void secondTest()
	{
		System.out.println("bye");
	}
	
	
}
