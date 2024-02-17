package SeleniAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openurl {
	public static  WebDriver openBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium2\\chromedriver_win32\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	return driver;
		
	}
	

}
