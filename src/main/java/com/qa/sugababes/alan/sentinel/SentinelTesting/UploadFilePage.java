package com.qa.sugababes.alan.sentinel.SentinelTesting;

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
	
	
	
	public void InputReportTitle(WebDriver driver, String text) {
		WebElement selectFileFieldClick = (new WebDriverWait(driver,10))
				.until(ExpectedConditions.elementToBeClickable(reportTitle));
		selectFileFieldClick.click();
		reportTitle.sendKeys(text);
	}
	
	public void ClickBrowseButton() {
		browseButton.click();
	}
	
	public String FileNameResult(WebDriver driver) {
		WebElement FileNameResult = (new WebDriverWait(driver,10))
				.until(ExpectedConditions.elementToBeClickable(fileName));
		return FileNameResult.getText(); 
	}
	
	public void ClickSubmitButton() {
		submitButton.click();
	}
	

}
