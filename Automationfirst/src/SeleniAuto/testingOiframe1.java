 package SeleniAuto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingOiframe1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =openurl.openBrowser("https://vctcpune.com/");
		WebElement selenium = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		selenium.click();
		
		
		Thread.sleep(3000);
		Set<String> addres=driver.getWindowHandles();
		Iterator<String> i =addres.iterator();
		while(i.hasNext()) {
		//System.out.println(i.next());
		driver.switchTo().window(i.next());
		}
		WebElement iframes = driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		
		JavascriptExecutor execute =((JavascriptExecutor)driver);
		execute.executeScript("arguments[0].scrollIntoView(true)", iframes);
		//execute.executeScript("window.scrollBy(100,200)");
		Thread.sleep(3000);
		 driver.switchTo().frame("courses-iframe");
		WebElement button = driver.findElement(By.xpath("//span[@id='et_search_icon']"));
		button.click();
		//
	}
}
