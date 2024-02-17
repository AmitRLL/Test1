package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingOifram2 {
	public static void main(String[] args) {
		WebDriver driver = openurl.openBrowser("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		String a = driver.getTitle();
		System.out.println("Title:"+a);
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String s =text.getText();
		System.out.println("Text:"+s);
	}

}
