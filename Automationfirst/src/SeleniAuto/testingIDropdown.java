package SeleniAuto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testingIDropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
        // System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
         WebDriver driver = openurl.openBrowser("https://vctcpune.com/selenium/practice.html");
         WebElement list = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
         Select dropdown = new Select(list);
       //  dropdown.selectByIndex(1);
        // Thread.sleep(4000);
         dropdown.selectByValue("option2");
       // dropdown.selectByVisibleText("Option3");
	    screenshot.takescreensot(driver, "vntc2");
	
	
	
//	System.setProperty("webdriver.chrome.driver","C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver =new ChromeDriver();
//	driver.get("https://vctcpune.com/selenium/practice.html");
//	JavascriptExecutor execute = ((JavascriptExecutor)driver);
//	execute.executeScript("window.scrollBy(200,500)");
//	WebElement drop =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//	Select a = new Select(drop);
//	a.selectByIndex(2);
	
	}

}
