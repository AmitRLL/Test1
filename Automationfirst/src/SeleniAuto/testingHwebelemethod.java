package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingHwebelemethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.xpath("//input[@id=\"vfb-7-1\"]"));
		radio1.click();
		boolean status = radio1.isSelected();
		System.out.println(status);
		WebElement chek1 = driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]"));
		chek1.click();
		boolean check = chek1.isSelected();
		System.out.println(check);
		WebElement agiletab = driver.findElement(By.xpath("//a[text()=\"Agile Project\"]"));
		agiletab.click();
		boolean check1 =agiletab.isEnabled();
		System.out.println(check1);
		WebElement display = driver.findElement(By.xpath("//a[text()=\"Insurance Project\"]"));
		display.click();
		//WebElement ads = driver.findElement(By.xpath("//div[@id=\"dismiss-button\"]"));
		//ads.click();
		boolean see =display.isDisplayed();
		System.out.println(see);
		
		
	}

}
