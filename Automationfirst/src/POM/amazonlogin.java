package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonlogin {
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement singup;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement emailmobile;
	@FindBy(xpath="//input[@id='continue']")private WebElement continuetab;
	@FindBy(xpath="//a[text()='Conditions of Use']")private WebElement conditionofuse;
	@FindBy(xpath="//a[text()='Privacy Notice']")private WebElement privacynotice;
	@FindBy(xpath="//span[@class='a-expander-prompt']")private WebElement needhelp;
	@FindBy(xpath="//a[@id='createAccountSubmit']")private WebElement createaccount;
	public amazonlogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicksingup()
	{
		singup.click();
	}
	public void entermobilenum(String mobile)
	{
		emailmobile.sendKeys(mobile);
	}
	public void clickcontinuetab()
	{
		continuetab.click();
	}
	public void clickconditionuse()
	{
		conditionofuse.click();
	}
	public void clickprivacyNotice()
	{
		privacynotice.click();
	}
	public void clickneedhelp()
	{
		needhelp.click();
	}
	public void clickcreateaccount()
	{
		createaccount.click();
	}

}
