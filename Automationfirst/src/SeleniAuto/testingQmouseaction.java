package SeleniAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testingQmouseaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=openurl.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		 WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		 Actions act = new Actions(driver);//object for mouse action.
		 
		 Thread.sleep(2000);
		 act.contextClick(rightclick).perform();//use this method for right click
		 
		 Thread.sleep(2000);
		 
		 WebElement clickcopy = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']"));
		 clickcopy.click();
		 Thread.sleep(2000);
		 
		 Alert a = driver.switchTo().alert();//switch to alert popup
		 a.accept();
		 
		 WebElement clickdouble = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 act.doubleClick(clickdouble).perform();
		 Thread.sleep(2000);
		 a.accept();
	}

}
