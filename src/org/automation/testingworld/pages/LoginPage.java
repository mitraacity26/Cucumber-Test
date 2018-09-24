package org.automation.testingworld.pages;


import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	
	
	public void EnterUserName(String Uname) throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id((Utility.fetchOR("Username_id").toString()))));
		driver.findElement(By.id(Utility.fetchOR("Username_id").toString())).sendKeys(Uname);;
		
		
	}
	
	public void EnterPassword(String Pword) throws Exception
	{
		driver.findElement(By.id(Utility.fetchOR("pass_id").toString())).sendKeys(Pword);;
		
		
	}
	
	public void ClickSigninButton() throws Exception
	{

		driver.findElement(By.id(Utility.fetchOR("signin_button_id").toString())).click();
		
			
	}
}
