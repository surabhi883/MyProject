package Projects.seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverbasics {
	
		  

public void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
}
}