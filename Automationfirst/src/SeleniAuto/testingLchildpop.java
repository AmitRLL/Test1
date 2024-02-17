package SeleniAuto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingLchildpop {
	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://vctcpune.com/");
	     
	     WebElement tab = driver.findElement(By.xpath("//a[text()=\"Start Selenium Practice\"]"));
	    // String practicepage = driver.getWindowHandle();//it gives address of main page.
	    // System.out.println(practicepage);
	     tab.click();
	     
	     Set<String> tab1 = driver.getWindowHandles();//get windowHandles is use to get address of all web page.
	     Iterator<String> i = tab1.iterator();
	     
	     while(i.hasNext()) {
	    	 driver.switchTo().window(i.next());
	    	// System.out.println(i.next());
	         System.out.println(driver.getTitle());
	    
	    }
	     }
	     
	

}
