package Test;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.screenShot;

public class ListenerTest extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Testing Started :"+result.getName());
		
	}
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test is Success :"+result.getName());
		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test is Failed :"+result.getName());
		try {
			screenShot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test is Skipped :"+result.getName());
	}

}
