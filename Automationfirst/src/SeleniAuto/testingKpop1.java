 package SeleniAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingKpop1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = openurl.openBrowser("https://nxtgenaiacademy.com/alertandpopup/");
	WebElement tab1 = driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
	tab1.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	Thread.sleep(3000);
	
	WebElement tab2 = driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]"));
	tab2.click();
	Alert b = driver.switchTo().alert();
	b.accept();
	
	Thread.sleep(3000); 
	
	WebElement tab3 = driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]"));
	tab3.click();
	Thread.sleep(1000);
	tab3.sendKeys("Yes");
	Alert c = driver.switchTo().alert();
	c.accept();
	
	
	
	
	}
}
