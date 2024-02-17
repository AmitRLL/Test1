package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonLogin {
	@FindBy(xpath ="//span[@class=\"nav-line-2 \"]")private WebElement toAccountandList;
	@FindBy(xpath ="(//span[@class=\"nav-action-inner\"])[1]")private WebElement clickSignIn;
	public amazonLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void moveToElement(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(toAccountandList);
		
	}
	public void clickSignin()
	{
		clickSignIn.click();
	}


}
