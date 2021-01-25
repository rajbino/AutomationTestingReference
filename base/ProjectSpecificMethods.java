package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	
	
	public static ChromeDriver driver;
	
	
    	@BeforeMethod
		public void InvokeDriver()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
    	
    	@AfterMethod
    	public void CloseBrowser()
    	{
    		driver.close();
    	}
    	
    	
    	
	}
	
