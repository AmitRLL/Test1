package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniAuto.excelsheetcall;
import SeleniAuto.openurl;

public class zerodhaloginTest {
	WebDriver driver;
	@BeforeMethod
	public void callurl()
	{
		driver =openurl.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void loginwithValidData() throws EncryptedDocumentException, IOException
	{
		zerodhalogin obj = new zerodhalogin(driver);
		obj.enterusername(excelsheetcall.parametrization(0, 1, "Credential"));
		obj.enterpassword(excelsheetcall.parametrization(1, 1, "Credential"));
		obj.clickonlogin();
//		obj.enterpin(excelsheetcall.parametrization(2, 1, "Credential"));
//		obj.clicksubmitpin();
	}
	@Test
	public void loginwithInvalidData()
	{
		zerodhalogin obj = new zerodhalogin(driver);
		obj.enterusername("AEK465");
		obj.clickonlogin();
		obj.enterpassword("WSC123456");
		obj.clickonlogin();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		zerodhaloginTest obj1 = new zerodhaloginTest();
		obj1.loginwithValidData();
//		Thread.sleep(3000);
//		obj1.loginwithInvalidData();
	}
	

}
