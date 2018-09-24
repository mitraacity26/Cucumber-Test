package org.automation.testingworld.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testingworld.DataProvider.DataGen;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.pages.LoginPage;
import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC01_ValidateLoginFunctionality {
	WebDriver driver;
	public void i_should_be_navigated_to_Contact_us_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//String Expected = "IT WOULD BE GREAT TO HEAR FROM YOU!!!!";
		String Xpath = Utility.fetchOR("Contactpage_Xpath1").toString();
		//String Actual = driver.findElement(By.xpath(Xpath)).toString();
		String Actual1 = driver.findElement(By.xpath(Xpath)).getAttribute("innertext").toString();
		System.out.println("*****Actual********"+Actual1);
		
	}
}
