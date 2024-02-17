package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingG {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.navigate().refresh();
		WebElement login = driver.findElement(By.xpath("//li[@data-cy=\"account\"]"));
		login.click();
		//Absolute Xpath.
		WebElement hotel = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/nav/ul/li[2]/a/span[2]"));
		hotel.click();
		//Relative xpath. 
		WebElement home = driver.findElement(By.xpath("//html//body//ul//li[3]//a//span[2]"));
		home.click();
		
		 
	}

}
