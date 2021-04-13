package com.sap.java.sampletestng;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sap.java.utis.ConfigFileReader;

public class Helper {
	public static WebDriver driver;
	public static String currentWorkingPath =System.getProperty("user.dir");
	public static String  deiverPath = currentWorkingPath+ConfigFileReader.getDriverPath();
	 public static void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver", deiverPath);
		  	driver = new ChromeDriver();
			driver.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/homepage");  
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
			driver.manage().deleteAllCookies();
	 }
	 public static void launchway2automation() {
		 System.setProperty("webdriver.chrome.driver", deiverPath);
		  	driver = new ChromeDriver();
			driver.get(ConfigFileReader.getregestrationUrl());  
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
			driver.manage().deleteAllCookies();
	 }
	 
	 public static void closeBrowser() {
		 driver.close();
	 }
	
}
