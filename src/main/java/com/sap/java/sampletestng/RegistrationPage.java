package com.sap.java.sampletestng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Helper{
	
	@FindBy(name = "name")
	
	WebElement enterName;
	
	@FindBy(xpath = "//label[contains (text(), 'Last Name:')]//following::input[1]")
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
	
	@FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[4]/select")
	WebElement selectCountry;
	
	@FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")
	WebElement selectMonth;
	
	@FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")
	WebElement selectDay;
	
	@FindBy(xpath = "//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")
	WebElement selectYear;
	
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
	public void clickCheckBoxHobbyCricket() {
		checkBoxCricket.click();
	}
	public void clickCheckBoxHobbyDance() {
		checkBoxDance.click();
	}
	public void selectCountry(String cntry) {
		System.out.println("inside select country");
		Select country = new Select(selectCountry);
		country.selectByVisibleText(cntry);
	}
	public void selectMonth(String month) {
		Select select = new Select(selectMonth);
		select.selectByVisibleText(month);
	}
	public void selectDay(String day) {
		Select select = new Select(selectDay);
		select.selectByVisibleText(day);
	}
	public void selectYear(String year) {
		Select select = new Select(selectYear);
		select.selectByVisibleText(year);
	}
}
