package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Locators
//By.class,By.CSS-(cascading style sheets)
public class testingC {
	public static void main(String[] args) throws InterruptedException {
		//testingA.openBrowser("https://www.facebook.com/").findElement(By.tagName("button")).click();
		//upper jaisa likh sakte hai pr confuse hoga is liye uuse small part me break kiye to understand.like below
		WebDriver driver = openurl.openBrowser("https://www.facebook.com/");
		
		
		//By.class
		//WebElement login = driver.findElement(By.className("_6ltg"));//there is must unique class is available
		//login.click();
		
		//For By.css syntax: tagname[attribute="attribute value"]
		WebElement user = driver.findElement(By.cssSelector("input[type='text']"));
		user.sendKeys("Amit");
		
		//Link text
		//WebElement user1 = driver.findElement(By.linkText("Create New Account"));
		//user1.click();
		
		//driver.navigate().back();
		//driver.navigate().refresh();
		
		WebElement createAc = driver.findElement(By.partialLinkText("Create New"));
		createAc.click();
		Thread.sleep(3000);
		driver.navigate().back();
	    
	
	
	}

}
