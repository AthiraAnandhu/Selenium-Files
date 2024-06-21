package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import POM.PageObjectModel.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
 public WebDriver driver;
 public LandingPage landingPage;
	public WebDriver initializeDriver() throws IOException
	{
		//properties file
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+"//src//main//java//Resources//GlobalData.properties");
		
		//src\\main\\java\\Resources\\GlobalData.properties
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
				{
			//firefox code
				}
		
		else if (browsername.equalsIgnoreCase("edge"))
		{
			//edge code
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	

		public List<HashMap<String, String>> getJsonDataToMap(String filepath) throws IOException {
			//read json to string
			
		String jsoncontent=	FileUtils.readFileToString(new File(filepath),
				StandardCharsets.UTF_8);
		//string content to HashMap ---Jackson Databind
		ObjectMapper mapper = new ObjectMapper();
		List <HashMap<String,String>> data = mapper.readValue(jsoncontent, new TypeReference<List<HashMap<String, String>>> ()
				{
			
				});
		return data;
		
		}
		public String getScreenShot(String testcaseName, WebDriver driver ) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File file = new File(System.getProperty("user.dir")+"//reports"+ testcaseName +".png");
			FileUtils.copyDirectory(source, file);
			return System.getProperty("user.dir")+"//reports"+ testcaseName +".png" ;
			
		}
	@BeforeMethod(alwaysRun=true)
	public LandingPage launchApplication() throws IOException
	{
		driver = initializeDriver();
		 landingPage= new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}
	@AfterMethod(alwaysRun=true)
	public void TearDown()
	{
		driver.close();
	}
}

