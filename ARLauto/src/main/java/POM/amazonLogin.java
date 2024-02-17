package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Excel;

public class amazonLogin {
	WebDriver driver;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")private WebElement hello;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signin;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement mobino;
	@FindBy(xpath="//input[@id='ap_password']")private WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement signinSubmit;
	@FindBy(xpath="//input[@id='continue']")private WebElement continuetab;
	//@FindBy(xpath="")private WebElement login;
	//@FindBy(xpath="")private WebElement login;
	//@FindBy(xpath="")private WebElement login;
	//@FindBy(xpath="")private WebElement login;
	//@FindBy(xpath="")private WebElement login;
	//@FindBy(xpath="")private WebElement login;
	
	public amazonLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonHelloSignin() 
	{
//		WebDriverWait wait = new WebDriverWait(driver,3000);
//		wait.until(ExpectedConditions.visibilityOf(hello));
//		Actions action =new Actions(driver);
//		action.moveToElement(hello).perform();
		hello.click();
	}
	public void clickonSignin()
	{
//		WebDriverWait wait = new WebDriverWait(driver,3000);
//		wait.until(ExpectedConditions.visibilityOf(signin));
		signin.click();
	}
	public void sendMobileno(String mobileno) throws EncryptedDocumentException, IOException
	{
		mobino.sendKeys(mobileno);
	}
	public void clickContinuetab()
	{
		continuetab.click();
	}
	public void sendPassword(String pass) throws EncryptedDocumentException, IOException
	{
//		WebDriverWait wait = new WebDriverWait(driver,3000);
//		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(pass);
	}
	public void clickSigninSubmit()
	{
		signinSubmit.click();
		
	}

}
