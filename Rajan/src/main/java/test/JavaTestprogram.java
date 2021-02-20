package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaTestprogram {

	
	ChromeDriver driver;
		
        @BeforeTest
        public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        }
		
		@Test
		public void openUrl()
		{
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		System.out.println("Success");
		
		}
		
		@AfterTest
		public void afterTest() {
		driver.close();
		
		}
	
	
	
}
