package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlfile {
	@Test(dataProvider="getData")
	
	public void Demo(String username,String password)
	{
		System.out.println("hello");
		System.out.println(username);
		System.out.println(password);
	}
	@Parameters({"url"})
	@Test(groups={"Smoke"})
	public void secondTest(String urlname)
	{
		System.out.println("bye");
		System.out.println(urlname);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
		
	}
}
