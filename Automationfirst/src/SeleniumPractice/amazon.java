package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniAuto.openurl;

public class amazon {
	public static void main(String[] args) {
		WebDriver driver = openurl.openBrowser("https://www.amazon.in/");
		
//		WebElement signup = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(signup).perform();
//		
//		
//		WebElement yourorder = driver.findElement(By.xpath("//span[text()='Your Orders']"));
//		yourorder.click();
//		driver.navigate().back();
//		
//		WebElement fashionicon = driver.findElement(By.xpath("//a[text()='Fashion']"));
//		fashionicon.click();
//		
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		logo.isDisplayed();
		//System.out.println(a);
		
		
	}
	

}
