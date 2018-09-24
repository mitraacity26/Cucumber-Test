package org.automation.testingworld.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {

	public static Boolean verifydata(WebDriver driver,String Expected,String Actual)
	{
		boolean flag=false;
		//String ActualURL=driver.getCurrentUrl();
		if(Expected.equalsIgnoreCase(Actual))
			
		{
			flag=true;
		
		}
		
		return flag;
		
	}
	
	
	
}
