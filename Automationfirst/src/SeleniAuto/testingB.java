 package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Locators
//By.tagname,By.id,By.name

public class testingB {
      public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
    	WebElement login = driver.findElement(By.tagName("button"));
    
    	WebElement userName = driver.findElement(By.id("email"));
    	userName.sendKeys("amit");
    	
    	WebElement pass = driver.findElement(By.name("pass"));
    	pass.sendKeys("Lilhare");
    	Thread.sleep(3000);
    	login.click();
    	  	 
    	 
	}
	
	
}
