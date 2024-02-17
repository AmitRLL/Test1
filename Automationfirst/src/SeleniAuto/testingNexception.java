package SeleniAuto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingNexception {
	public static void main(String[] args) throws IOException {
		WebDriver driver = openurl.openBrowser("https://vctcpune.com/");
		driver.manage().window().maximize();
		WebElement openselenium = driver.findElement(By.xpath("//a[text()=\"Start Selenium Practice\"]"));
		openselenium.click();
		openselenium.click();
		//openselenium.click();
		
		Set address = driver.getWindowHandles();
		ArrayList<String>list = new ArrayList(address);
		try {                  //try waha use krte hai jaha problem ane wala ho. 
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		}catch(Exception e) {   //catch problem ko handle kr ke age ki statement ko print krta hai.
			System.out.println("i handle exception");
		}
		
		
		
		driver.switchTo().window(list.get(2));
		screenshot.takescreensot(driver, "array3");
		WebElement radio1 = driver.findElement(By.xpath("//input[@value=\"Radio1\"]"));
		radio1.click();
		}

	}



