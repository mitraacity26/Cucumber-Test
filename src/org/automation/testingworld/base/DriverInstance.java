package org.automation.testingworld.base;

import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverInstance {
	
	public WebDriver driver;
	@BeforeTest
	public void InitiateDriverInstance() throws Exception
	
	{
		if (Utility.fetchPropertyValue("browserNmae").toString().equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if (Utility.fetchPropertyValue("browserNmae").toString().equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if (Utility.fetchPropertyValue("browserNmae").toString().equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
					
		}
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void CloseDriverInstance()
	
	{
		
		driver.quit();
	}
	
	
}
