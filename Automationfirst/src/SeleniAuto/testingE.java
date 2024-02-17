package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Flipkart
public class testingE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//WebDriver driver =testingA.openBrowser("https://www.flipkart.com/");
	    driver.get("https://www.flipkart.com");
	   WebElement login =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	   login.click();
	  WebElement log = driver.findElement(By.xpath("//a[text()=\"Login\"]"));
	  log.click();
	  WebElement user =driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
	  user.sendKeys("lilhareamit4@gmail.com");
	  WebElement pass =driver.findElement(By.xpath("//input[@type=\"password\"]"));
	  pass.sendKeys("Arl123");
	  WebElement submit =driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
	  submit.click();
	  Thread.sleep(3000);
	  WebElement usermobi =driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
      usermobi.sendKeys("8788186496");
	  
		
		
	}

}
