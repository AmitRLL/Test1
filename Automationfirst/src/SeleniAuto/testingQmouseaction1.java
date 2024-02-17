package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testingQmouseaction1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = openurl.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//there is iframe so we have to change scope of element from main page to iframe. 
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(iframe);
		
		WebElement firstelement = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
		WebElement secondelement = driver.findElement(By.xpath("(//div[@id=\"trash\"])[1]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(firstelement, secondelement).build().perform();
	}

}
//driver.switchto.frame();
//driver.switchto.alert();
//Actions act = new Actions(driver);