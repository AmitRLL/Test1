 package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniAuto.excelsheetcall;
import SeleniAuto.openurl;

public class zerodhalogin {
	
	@FindBy(xpath ="//input[@id='userid']")private WebElement userName;
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement clickLogin;
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submitpin;
	@FindBy(xpath="//a[@class='text-light']")private WebElement clicksign;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotpassword;
	@FindBy(xpath="//a[@class='text-light']")private WebElement ifdonthaveaccountsingup;
	//constructor to use to call @FindBy Elements.
	public zerodhalogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterusername(String user)
	{
		userName.sendKeys(user);
    }
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickonlogin()
	{
		clickLogin.click();
	}
	public void enterpin(String pinnumber)
	{
		pin.sendKeys(pinnumber);
	}
	public void clicksubmitpin()
	{
		submitpin.click();
	}
	public void clickForgotpassword()
	{
		forgotpassword.click();
	}
	public void clicksingup()
	{
		ifdonthaveaccountsingup.click();
	}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		WebDriver driver=openurl.openBrowser("https://kite.zerodha.com/");
//		
//		zerodhalogin obj = new zerodhalogin(driver);
//		
//		String userId=excelsheetcall.parametrization(0, 1,"Credential");
//		
//		obj.enterusername(userId);
//		
//		String passWord =excelsheetcall.parametrization(1, 1,"Credential");
//		obj.enterpassword(passWord);
//		
//		obj.clickonlogin();
//		
//		Thread.sleep(3000);
//		
//		String pinnum =excelsheetcall.parametrization(2, 1,"Credential");
//		obj.enterpin(pinnum);
//		
//		obj.clicksubmitpin();
//	}
	

}
