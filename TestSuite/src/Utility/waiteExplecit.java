package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waiteExplecit {
	public static WebElement explecit(WebDriver driver,WebElement explecitwait)
	{
	WebDriverWait wait = new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.visibilityOf(explecitwait));
	return explecitwait;
	}

}
