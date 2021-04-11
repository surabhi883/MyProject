package com.sap.java.sampletestng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Helper {

	@FindBy(id = "usernameField")
	WebElement loginUserName;

	@FindBy(id = "passwordField")
	WebElement loginUserPwd;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@class = \"user-name roboto-bold-text\"]")
	WebElement titleText;

	public LoginPage() { 
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String userName) {
		loginUserName.sendKeys(userName);
	}

	public void enterpassword(String password) {
		loginUserPwd.sendKeys(password);
	}

	public void clickLogin() {
		loginbutton.click();
	}

	public String getLoginTitle() {
		return titleText.getText();
	}

}
