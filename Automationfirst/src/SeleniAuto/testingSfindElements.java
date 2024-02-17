package SeleniAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testingSfindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = openurl.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//there is iframe so we have to change scope of element from main page to iframe. 
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(iframe);
		for(int i=0;i<=4;i++) {
		Thread.sleep(2000);
		List<WebElement> firstbox = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		
		WebElement secondbox = driver.findElement(By.xpath("(//div[@id=\"trash\"])[1]"));
		
		Actions act = new Actions(driver);//To perform mouse action. 
		Thread.sleep(3000);
		act.dragAndDrop(firstbox.get(0), secondbox).perform();
		}
	}
	

}
