package SeleniAuto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingMpoparry {
	public static void main(String[] args) throws IOException {
	WebDriver driver = openurl.openBrowser("https://vctcpune.com/");
	driver.manage().window().maximize();
	WebElement openselenium = driver.findElement(By.xpath("//a[text()=\"Start Selenium Practice\"]"));
	openselenium.click();
	openselenium.click();
	openselenium.click();
	
	Set address = driver.getWindowHandles();
	ArrayList<String>list = new ArrayList(address);
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	System.out.println(list.get(3));
	
	
	
	driver.switchTo().window(list.get(3));
	screenshot.takescreensot(driver, "vctc");
	WebElement radio1 = driver.findElement(By.xpath("//input[@value=\"Radio1\"]"));
	radio1.click();
	}

}
 