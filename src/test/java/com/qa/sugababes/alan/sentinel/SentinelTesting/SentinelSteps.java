package com.qa.sugababes.alan.sentinel.SentinelTesting;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SentinelSteps {
	
	static WebDriver driver;
	WebDriverWait wait;
	UploadFilePage uploadPage;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Constants.DRIVERLOCATION);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);
	}
	
	@After
	public static void teardown() {  
		driver.quit();   
	} 
	
	
	@Given("^I have the correct web address$") 
	public void i_have_the_correct_web_address() { 
		driver.get(Constants.URLHOME);
	}
	
	@Given("^Have entered a report name$")
	public void have_entered_a_report_name() {
		uploadPage = PageFactory.initElements(driver, UploadFilePage.class);
		
		uploadPage.InputReportTitle();
	}
	@When("^I click Choose File button$")
	public void i_click_Choose_File_button()  {
		uploadPage.ClickChooseFileButton();
	}
	    
	@When("^Click on a file pressing enter$")
	public void click_on_a_file_pressing_enter() {
		UploadFileRobot uploadPage = PageFactory.initElements(driver, UploadFileRobot.class);
		UploadFileRobot.setClipboardData(toString());
		uploadPage.uploadFile();
	}  
	    

	@When("^I click submit$")
	public void i_click_submit(){
		uploadPage = PageFactory.initElements(driver, UploadFilePage.class);
		uploadPage.ClickSubmitButton();
	}	    

	@Then("^a submission message is displayed$")
	public void a_submission_message_is_displayed() throws InterruptedException {
		Thread.sleep(300);
		uploadPage = PageFactory.initElements(driver, UploadFilePage.class);
		assertEquals( "File Has Been Submitted", uploadPage.FileNameResult()); 
		
	}
	
	@Then("^an error should appear$")
	public void an_error_should_appear() {
		uploadPage = PageFactory.initElements(driver, UploadFilePage.class);
	    
	}
	     
	

	
}
