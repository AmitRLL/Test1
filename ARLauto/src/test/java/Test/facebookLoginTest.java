package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.facebookLogin;
import Pojo.Browser;
import Utility.Excel;

public class facebookLoginTest extends BaseTest {
	 @BeforeMethod
	 public void callsBrowser()
	 {
		driver=Browser.openBrowser("https://www.facebook.com/");
	 }
	 @Test
	public void validateEmailAndPasswordtab() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 Thread.sleep(3000);
		facebookLogin login =new facebookLogin(driver);
		login.sendemailAndphone(Excel.parametrization(0, 0, "Credential1"));
		login.sendpassword(Excel.parametrization(1, 0, "Credential1"));
		login.clicklogin();
		login.clickAccount();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		login.clickonLogout();
		
		
	}

}
