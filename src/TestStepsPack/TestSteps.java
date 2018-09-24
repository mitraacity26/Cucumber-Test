package TestStepsPack;

import org.automation.testingworld.DataProvider.DataGen;
import org.automation.testingworld.assertions.Compare;
import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	/**
	 * Java Doc
	 */
	
	//driver object 
	public WebDriver driver;
	//Creating wait object which can be used later
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	 //Opening browser and navigate to site
	@Given("^I am on the toolsqa Site$")
	public void i_am_on_the_toolsqa_Site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
		driver.manage().window().maximize();

	}
	 //Navigate to Contact Us page under About
	@When("^I click on Contact us option under About$")
	public void i_click_on_Contact_us_option_under_About() throws Throwable {
		
		//Wait for a element in home page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchOR("About_Xpath").toString())));
		//Action class used to perform mouse hover
		Actions builder = new Actions(driver);
		//Fetch property values from ElementRepository file using fetchOR function
		builder.moveToElement(driver.findElement(By.xpath(Utility.fetchOR("About_Xpath").toString()))).perform();
		
		builder.moveToElement(driver.findElement(By.xpath(Utility.fetchOR("Contact_Xpath").toString()))).click().perform();
		Thread.sleep(5000);
	}
	 //Verify Page text with expected one
	@Then("^I should be navigated to Contact us page$")
	public void i_should_be_navigated_to_Contact_us_page() throws Throwable {
		
		String Expected = "IT WOULD BE GREAT TO HEAR FROM YOU!!!!";
		
		String Xpath = Utility.fetchOR("Contactpage_Xpath1").toString();
		//String Actual = driver.findElement(By.xpath(Xpath)).toString();
		//Navigate to required element
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(Xpath)));
		String Actual1 = driver.findElement(By.xpath(Xpath)).getAttribute("innertext").toString();
		//System.out.println("*****Actual********");
		
		if (Actual1 != null) {
			Boolean Z = Compare.verifydata(driver, Expected, Actual1);
			if (Z = true)

			{
				System.out.println("landed in the correct page");

			} else {
				System.out.println("Not landed in the correct page");

			}
		}
		else {
			System.out.println("XPath Object not found!!!");
		}
		
	}
	
	
	 //Let user know that he is in correct page
	@Given("^I am on Contact us page of toolsqa Site$")
	public void i_am_on_Contact_us_page_of_toolsqa_Site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("landed in the correct page");
	}
	 //Enter details in Contact Us page
	@When("^I enter following information in the page$")
	public void i_enter_following_information_in_the_page() throws Throwable {
		 //Call DataGen function which will return 2 dimensional array
		Object testdata[][] = DataGen.TestDataGenerator();
		//Fill values in the required fields
		driver.findElement(By.className(Utility.fetchOR("Name_class").toString())).sendKeys(testdata[0][0].toString());
		driver.findElement(By.className(Utility.fetchOR("Email_class").toString())).sendKeys(testdata[0][1].toString());
		driver.findElement(By.className(Utility.fetchOR("Message_class").toString())).sendKeys(testdata[0][2].toString());

	}
	 //Click on send buttons
	@When("^Click on Send button$")
	public void click_on_Send_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className(Utility.fetchOR("Button_Class").toString())).click();

	}
	 //Verify the error message
	@Then("^I should get an error message$")
	public void i_should_get_an_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String Expected = "Validation errors occurred. Please confirm the fields and submit it again.";
		String Xpath1 = Utility.fetchOR("Error_Xpath").toString();
		String Actual = driver.findElement(By.xpath(Xpath1)).getAttribute("innertext").toString();
		Boolean Z = Compare.verifydata(driver, Expected, Actual);
		if (Z = true)

		{
			System.out.println("Error message appeared");

		} else {
			System.out.println("Error message not appeared");
			driver.quit();

		}

	}

}
