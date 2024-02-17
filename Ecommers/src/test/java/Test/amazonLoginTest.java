package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.amazonLogin;
import Pojo.Browser;

public class amazonLoginTest extends BaseTest {
	@BeforeMethod
	public void callUrl()
	{
		driver=Browser.openBrowser("https://www.amazon.in/");
	}
	@Test
	public void signInwithValidCredential()
	{
		amazonLogin amazonSignIn = new amazonLogin(driver);
		amazonSignIn.moveToElement(driver);
		amazonSignIn.clickSignin();
		
	}
	

}
