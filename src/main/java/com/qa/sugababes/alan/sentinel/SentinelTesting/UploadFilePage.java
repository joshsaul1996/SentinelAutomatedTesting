package com.qa.sugababes.alan.sentinel.SentinelTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage {
	
	@FindBy(xpath="//*[@id=\"ReportName\"]")
	WebElement reportTitle;
	
	@FindBy(xpath= "//*[@id=\"fileUpload\"]")
	WebElement chooseFile;
	
					
	@FindBy(xpath = "//*[@id=\"submitButton\"]")
	WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/nav/div/div/p/text([2])")
	WebElement submitMessage;
	
	
	
	public void InputReportTitle() {
		reportTitle.click();
		reportTitle.sendKeys("First Report");
	}
	
	public void ClickChooseFileButton() {
		chooseFile.click();
	}
	
	public String FileNameResult() {
		return chooseFile.getText(); 
	}
	
	public void ClickSubmitButton() {
		submitButton.click();
	}
	
	public void robotUploadFile() {
		UploadFileRobot uploadFile = new UploadFileRobot();
		uploadFile.uploadFile();
	}
	
	public String SubmitMessageResult() {
		return submitMessage.getText(); 
	}
	
}