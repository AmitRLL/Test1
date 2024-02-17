package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testingRkeybord {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	
	Actions act = new Actions(driver);
	
	WebElement firstname = driver.findElement(By.xpath("//input[@id='userName']"));
	firstname.sendKeys("amit");
	
	Thread.sleep(2000);
	act.sendKeys(Keys.TAB);
	act.sendKeys("automationclass@gmail.com");
	
	Thread.sleep(2000);
	act.sendKeys(Keys.TAB);
	act.sendKeys("Nagpur");
	
	Thread.sleep(2000);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);//select all
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);//copy
	
	act.sendKeys(Keys.TAB);//next tab
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();//past
	
	Thread.sleep(2000);
	WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
	submit.click();
	
	
	
	
	

	
	
	}

}
