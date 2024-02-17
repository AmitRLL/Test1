package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import SeleniAuto.excelsheetcall;
import SeleniAuto.openurl;

public class facebookloginTest {
	public void loginWithValidData() throws EncryptedDocumentException, IOException
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.enterEmailPhone(excelsheetcall.parametrization(0, 0, "Cridential1"));
		obj.enterpassword(excelsheetcall.parametrization(1, 0, "Cridential1"));
		obj.submitlogin();
		
	}
	public void loginWithoutData()
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.submitlogin();
	}
	public void loginWithInvalidMobilenum() throws EncryptedDocumentException, IOException
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.enterEmailPhone("1234567890");
		obj.enterpassword(excelsheetcall.parametrization(1, 0, "Cridential1"));
		obj.submitlogin();
	}
	public void loginWithInvalidPassword() throws EncryptedDocumentException, IOException
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.enterEmailPhone(excelsheetcall.parametrization(0, 0, "Cridential1"));
		obj.enterpassword("7654321");
		obj.submitlogin();
	}
	public void loginPageclickOnForgetpassword() throws EncryptedDocumentException, IOException
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.enterEmailPhone(excelsheetcall.parametrization(0, 0, "Cridential1"));
		obj.clickforgotPassword();
	}
	public void loginclickOnCreatnewAcount()
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.clickcreatNewAccount();
		
	}
	public void loginclickCreatPage()
	{
		WebDriver driver =openurl.openBrowser("https://www.facebook.com/");
		facebooklogin obj = new facebooklogin(driver);
		obj.clickcreatPage();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		facebookloginTest obj1 = new facebookloginTest();
		obj1.loginWithValidData();
		obj1.loginWithoutData();
		obj1.loginWithInvalidMobilenum();
		obj1.loginWithInvalidPassword();
		obj1.loginPageclickOnForgetpassword();
		obj1.loginclickOnCreatnewAcount();
		obj1.loginclickCreatPage();
	}

}
