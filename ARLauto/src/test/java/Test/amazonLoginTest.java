package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.amazonLogin;
import POM.amazonLoginwithmouse;
import Pojo.Browser;
import Utility.Excel;
import Utility.Reports;
@Listeners(ListenerTest.class)
public class amazonLoginTest extends BaseTest
{ 
	ExtentReports reports;
	ExtentTest test;
	@BeforeClass
	public void setReport() 
	{
		reports =Reports.addReport();
	  	
	}
	@BeforeMethod
	public void callURL()
	{
		driver=Browser.openBrowser("https://www.amazon.in/");
	}
	@AfterMethod   
	public void captureResult(ITestResult result)// by extend report result capture
	{
		if(result.getStatus()==ITestResult.FAILURE)
			
		{
			test.log(Status.FAIL,result.getName());
			
		}else if(result.getStatus()==ITestResult.SUCCESS)
			
		{
				test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.FAIL, result.getName());
		}
		
	}
	@AfterClass
	public void reportFlush() {
		reports.flush();
	}
	@Test
	public void loginWithValidCredential() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test =reports.createTest("loginWithValidCredential");
		amazonLogin amazonlogin = new amazonLogin(driver);
		//Thread.sleep(2000);
		amazonlogin.clickonHelloSignin();
		//amazonlogin.clickonSignin();//it is not use
		amazonlogin.sendMobileno(Excel.parametrization(2, 0, "Credential1"));
		amazonlogin.clickContinuetab();
		amazonlogin.sendPassword(Excel.parametrization(3, 0, "Credential1"));
		amazonlogin.clickSigninSubmit();
	}
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		amazonLoginwithmouse login = new amazonLoginwithmouse(driver);
		login.ClickonSignIn(driver);
		login.ClickonSign();
		amazonLogin amazonlogin = new amazonLogin(driver);
		amazonlogin.sendMobileno(Excel.parametrization(2, 0, "Credential1"));
		amazonlogin.clickContinuetab();
		amazonlogin.sendPassword(Excel.parametrization(3, 0, "Credential1"));
		amazonlogin.clickSigninSubmit();
	}

}
