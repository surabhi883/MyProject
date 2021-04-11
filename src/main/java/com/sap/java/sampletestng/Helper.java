package com.sap.java.sampletestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	public static WebDriver driver;
	
	 public static void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		  	driver = new ChromeDriver();
			driver.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/homepage");  
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
			driver.manage().deleteAllCookies();
	 }
	 //comment for test
	 public static void launchway2automation() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		  	driver = new ChromeDriver();
			driver.get("http://way2automation.com/way2auto_jquery/registration.php#load_box");  
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
			driver.manage().deleteAllCookies();
	 }
	 
	 public static void closeBrowser() {
		 driver.close();
	 }
	
}
