package TestNG;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHome");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHome");
	}
}
