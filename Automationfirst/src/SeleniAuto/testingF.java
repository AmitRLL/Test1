package SeleniAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testingF {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user =driver.findElement(By.xpath("//input[@id=\"email\"]"));
		user.sendKeys("lilhareamit");
		WebElement pass =driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		pass.sendKeys("amit");
		//WebElement login =driver.findElement(By.xpath("//button[@name=\"login\"]"));
	//login.click();
		//driver.navigate().back();
		//driver.navigate().back();
		
		//WebElement forgot =driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		//forgot.click();
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().forward();
		WebElement creat =driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		creat.click();
	}

}
