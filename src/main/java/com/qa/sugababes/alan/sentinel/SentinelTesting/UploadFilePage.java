package com.qa.sugababes.alan.sentinel.SentinelTesting;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilePage {
	
	@FindBy(xpath="//*[@id=\"searchText\"]")
	WebElement reportTitle;
	
	@FindBy(xpath= "browseButton")
	WebElement browseButton;
	
	@FindBy(xpath = "//*[@id=\"contentRow\"]/div[1]/div/a[2]")
	WebElement fileName;
					
	@FindBy(xpath = "//*[@id=\"searchButton\"]")
	WebElement submitButton;
	
	
	
	public void InputReportTitle() {
		reportTitle.click();
		reportTitle.sendKeys("First Report");
	}
	
	public void ClickBrowseButton() {
		browseButton.click();
	}
	
	public String FileNameResult() {
		return fileName.getText(); 
	}
	
	public void ClickSubmitButton() {
		submitButton.click();
	}
	
	public void robotUploadFile() {
		UploadFileRobot uploadFile = new UploadFileRobot();
		uploadFile.uploadFile();
	}
}
