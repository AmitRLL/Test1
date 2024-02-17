  package SeleniAuto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingLchild {
	public static void main(String[] args) {
		WebDriver driver =openurl.openBrowser("https://vctcpune.com/");
		WebElement prac =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		prac.click();
		
//		String print =driver.getWindowHandle();//ye sirf main page ka address dega
//		System.out.println(print);
		
		Set<String> addres=driver.getWindowHandles();
		Iterator<String> i =addres.iterator();
		
		while(i.hasNext()) {
		//System.out.println(i.next());
		driver.switchTo().window(i.next());
		System.out.println(driver.getTitle());
		
		}
	}

}
