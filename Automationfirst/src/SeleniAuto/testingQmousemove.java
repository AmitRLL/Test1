package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testingQmousemove {
	public static void main(String[] args) {
		WebDriver driver = openurl.openBrowser("https://www.amazon.in/");
		
		Actions mouse = new Actions(driver);
		
		WebElement signupbutton = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		mouse.moveToElement(signupbutton).perform();
		
		WebElement yourorder =driver.findElement(By.xpath("//span[text()='Your Orders']"));
		mouse.click(yourorder).perform();
		
		
	}

}
