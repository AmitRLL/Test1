	package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import SeleniAuto.excelsheetcall;
import SeleniAuto.openurl;

public class amazonloginTest {
	
	public void loginWithvalidcredential() throws EncryptedDocumentException, IOException
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.entermobilenum(excelsheetcall.parametrization(2, 0, "Credential1"));
		obj.clickcontinuetab();
		
	}
	public void loginWithoutcredential()
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.clickcontinuetab();
	}
	public void loginwithwroungnumber()
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.entermobilenum("1245784535");
		obj.clickcontinuetab();
	}
	public void loginPageClickonCondition()
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.clickconditionuse();
	}
	public void loginPageClickonPrivacynotice()
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.clickprivacyNotice();
	}
	public void loginPageClickonNeedhelp()
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.clickneedhelp();
	}
	public void loginPageClickonCreataccount()
	{
		WebDriver driver =openurl.openBrowser("https://www.amazon.in/");
		amazonlogin obj =new amazonlogin(driver);
		obj.clicksingup();
		obj.clickcreateaccount();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		amazonloginTest obj1 = new amazonloginTest();
		
		obj1.loginWithvalidcredential();
		obj1.loginWithoutcredential();
		obj1.loginwithwroungnumber();
		obj1.loginPageClickonCondition();
		obj1.loginPageClickonPrivacynotice();
	}

}
