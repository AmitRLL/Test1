package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniAuto.excelsheetcall;
import SeleniAuto.openurl;

public class facebooklogin {
	@FindBy(xpath="//input[@id='email']")private WebElement emailphone;
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	@FindBy(xpath="//button[@name='login']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgotpass;
	@FindBy(xpath="//a[text()='Create a Page']")private WebElement creatpage;
	@FindBy(xpath="(//a[@role='button'])[2]")private WebElement creatnewaccount;
	public facebooklogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEmailPhone(String mobi)
	{
		emailphone.sendKeys(mobi);
	}
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	public void submitlogin()
	{
		login.click();
	}
	public void clickforgotPassword()
	{
		forgotpass.click();
	}
	public void clickcreatNewAccount()
	{
		creatnewaccount.click();
	}
	public void clickcreatPage()
	{
		creatpage.click();
	}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
//		facebooklogin obj = new facebooklogin(driver);
//		String usertext =excelsheetcall.parametrization(0,1,"Fbpass");
//		Thread.sleep(2000);
//		obj.enterusername(usertext);
//		String passtext =excelsheetcall.parametrization(1, 2, "Fbpass");
//		obj.enterpassword(passtext);
//		obj.submitlogin();
//	}

}
