package Test;

import java.io.IOException;

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

import POM.amazonHomepage;
import POM.amazonLogin;
import Pojo.Browser;
import Utility.Excel;
import Utility.Reports;
@Listeners(ListenerTest.class)

public class amazonHomeTest extends BaseTest {
	@BeforeMethod
	public void callBrowser()
	{
			driver=Browser.openBrowser("https://www.amazon.in/");
				
	}	ExtentReports reports;
	ExtentTest test;
	@BeforeClass
	public void setReport() 
	{
		reports =Reports.addReport();
	  	
	}
	
	@AfterMethod   
	public void captureResult(ITestResult result)// by extend report result capture
	{
		if(result.getStatus()==ITestResult.FAILURE)
			
		{
			test.log(Status.FAIL,result.getName());
			
		}else if(result.getStatus()==ITestResult.SUCCESS)
			
		{
				test.log(Status.PASS, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
		
	}
	@AfterClass
	public void reportFlush() {
		reports.flush();
	}
	@Test
	public void validateSearchBox() throws EncryptedDocumentException, IOException
	{
		test =reports.createTest("validateSearchbox");
		amazonLogin login =new amazonLogin(driver);
		login.clickonHelloSignin();
		login.sendMobileno(Excel.parametrization(2, 0, "Credential1"));
		login.clickContinuetab();
		login.sendPassword(Excel.parametrization(3, 0, "Credential1"));
		login.clickSigninSubmit();
		amazonHomepage home = new amazonHomepage(driver);
		home.clickOnSearchtab("mobile");
		home.clickOnSearchbotton();
	}
	@Test
	public void validateDropdown() throws EncryptedDocumentException, IOException
	{
		test =reports.createTest("validatedropdown");
		amazonLogin login =new amazonLogin(driver);
		login.clickonHelloSignin();
		login.sendMobileno(Excel.parametrization(2, 0, "Credential1"));
		login.clickContinuetab();
		login.sendPassword(Excel.parametrization(3, 0, "Credential1"));
		login.clickSigninSubmit();
		amazonHomepage home = new amazonHomepage(driver);
		home.clickonSearchDropdown();
		home.clickOnSearchbotton();
	}
	@Test
	public void ValidateLogo() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test=reports.createTest("validateLogo");
		amazonLogin login =new amazonLogin(driver);
		login.clickonHelloSignin();
		login.sendMobileno(Excel.parametrization(2, 0, "Credential1"));
		login.clickContinuetab();
		login.sendPassword(Excel.parametrization(3, 0, "Credential1"));
		login.clickSigninSubmit();
		amazonHomepage home = new amazonHomepage(driver);
		home.checkLogo();
	}
	@Test
	public void validateBeautyPersonalcare() throws EncryptedDocumentException, IOException
	{
		test=reports.createTest("validatbeautypersonalcare");
		amazonLogin login =new amazonLogin(driver);
		login.clickonHelloSignin();
		login.sendMobileno(Excel.parametrization(2, 0, "Credential1"));
		login.clickContinuetab();
		login.sendPassword(Excel.parametrization(3, 0, "Credential1"));
		login.clickSigninSubmit();
		amazonHomepage home = new amazonHomepage(driver);
		home.clickBeautyPersonalcare();
	}
	

}
