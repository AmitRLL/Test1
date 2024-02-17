package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonLoginwithmouse {
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement signin;
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")private WebElement clicksign;
	
	
	public amazonLoginwithmouse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void ClickonSignIn(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();
	}
	public void ClickonSign()
	{
		clicksign.click();
	}

}
