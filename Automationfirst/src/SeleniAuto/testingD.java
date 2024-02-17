package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingD {
	public static void main(String[] args) {
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		
		WebElement username =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		username.click();
		WebElement singh = driver.findElement(By.id("ap_email"));
		singh.sendKeys("8788186496");
		WebElement login = driver.findElement(By.id("continue"));
		login.click();
		WebElement forgot =driver.findElement(By.id("auth-fpp-link-bottom"));
		forgot.click();
		//WebElement conti =driver.findElement(By.id("continue"));
		//conti.click();
		//WebElement conti1 =driver.findElement(By.name("count"));
		//conti1.sendKeys("460284");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		WebElement all =driver.findElement(By.className("hm-icon-label"));
		all.click();
		WebElement mobi =driver.findElement(By.linkText("Mobiles, Computers"));
		mobi.click();
		WebElement mobil =driver.findElement(By.partialLinkText("All Mobile"));
		mobil.click();
				
		
		
	}

}
