package testprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Jjjavaproram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.get("http://www.leafground.com/pages/sorttable.html");driver.get("http://www.leafground.com/pages/sorttable.html");driver.get("http://www.leafground.com/pages/sorttable.html");
	
	
		
		//driver.close();
		

	}

}
