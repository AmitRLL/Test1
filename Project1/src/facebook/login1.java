package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		WebElement user =driver.findElement(By.xpath("//button[contains(@data-testid,_button)]/parent::div/ancestor::form/child::div/child::div/input")); //by tag and attribute value
//		user.sendKeys("amit");
		WebElement forgot = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		forgot.click();
		
	}

}
