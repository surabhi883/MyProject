package com.sap.java.sampletestng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Helper{
	
	@FindBy(name = "name")
	
	WebElement enterName;
	
	@FindBy(xpath = "//label[contains (text(), 'Last Name:')]")
	WebElement enterlastName;

	@FindBy(xpath = "//*[text()=' Single']")
	WebElement radiobuttonSingle;
	
	@FindBy(xpath = "//*[text()=' Married']")
	WebElement radiobuttonMarried;
	
	@FindBy(xpath = "//*[text()=' Divorced']")
	WebElement radiobuttonDivorced;
	
	@FindBy(xpath = "//*[text()=' Dance']")
	WebElement checkBoxDance;
	
	@FindBy(xpath = "//*[text()=' Reading']")
	WebElement checkBoxReading;

	@FindBy(xpath = "//*[text()=' Cricket']")
	WebElement checkBoxCricket;
	
	public RegistrationPage() { 
		PageFactory.initElements(driver, this);
	}
	public void enter_FName(String userName) {
		System.out.println("inside fname");
		enterName.sendKeys(userName);
	}
	
	public void enter_LName(String userName) {
		enterlastName.sendKeys(userName);
	}
	
	public void clickRadioButtonsingle(String userName) {
		radiobuttonSingle.click();
	}

	public void clickRadioButtonmarried(String userName) {
		radiobuttonMarried.click();
	}
	
	public void clickRadioButtondivorce(String userName) {
		radiobuttonDivorced.click();
	}
}
