package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.zerodhaLogin;
import Utility.Browsercall;
import Utility.callExcelSheet;


public class zerodhaLoginTest {
	WebDriver driver;
	@BeforeMethod
	public void callurl()
	{
		driver =Browsercall.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void loginwithValidData() throws EncryptedDocumentException, IOException
	{
		zerodhaLogin obj = new zerodhaLogin(driver);
		obj.enterusername(callExcelSheet.parametrization(0, 1, "Credential"));
		obj.enterpassword(callExcelSheet.parametrization(1, 1, "Credential"));
		obj.clickonlogin();
		obj.enterpin(callExcelSheet.parametrization(2, 1, "Credential"),driver);
		obj.clicksubmitpin();
	}
	@Test
	public void loginwithInvalidData()
	{
		zerodhaLogin obj = new zerodhaLogin(driver);
		obj.enterusername("AEK465");
		obj.clickonlogin();
		obj.enterpassword("WSC123456");
		obj.clickonlogin();
	}
	@Test
	public void clickonForgotpassword()
	{
		zerodhaLogin obj = new zerodhaLogin(driver);
		obj.clickForgotpassword();
	}
	@Test
	public void clickonNewsingup()
	{
		zerodhaLogin obj = new zerodhaLogin(driver);
		obj.clicksingup();
	}
	@Test
	public void clearcookies()
	{
		driver.get("chrome://settings/clearBrowserData");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		zerodhaLoginTest obj1 = new zerodhaLoginTest();
		obj1.loginwithValidData();
		//Thread.sleep(3000);
		//obj1.loginwithInvalidData();
	}

}
