package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testingRkeybord1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = openurl.openBrowser("https://demoqa.com/text-box");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='userName']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.click(firstname);
		act.sendKeys("amit");
		
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB);
		act.sendKeys("amit@gmail.com");
		
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB);
		act.sendKeys("Nagpur");
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		//act.build().perform();
		
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		//act.build().perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
        act.perform();
		
		
		
	}

}
