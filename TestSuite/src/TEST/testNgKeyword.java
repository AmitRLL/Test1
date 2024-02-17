package TEST;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNgKeyword {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@Test(enabled = false)//it is use to ignore this test and run next test
	public void testA()
	{
		System.out.println("TestA completed");
	}
	@Test(invocationCount = 1)//that we want to run this test how many times is given
	public void testB()
	{
		System.out.println("TestB completed");
	}
	@Test(priority = -2,timeOut = 500)//this test should complete in what time is given
	public void testC()
	{
		System.out.println("TestC completed");
		
	}
	@Test(priority = -1)
	public void login()
	{
		System.out.println("Login done");
	}
	@Test(dependsOnMethods = {"login"})
	public void homepage()
	{
		System.out.println("Home page");
	}
	@Test
	@Parameters({"firstname","secondname"})//This is for parameter keyword is given
	public void checkA(int a,int b)
	{
		System.out.println(a+b);
	}
	@DataProvider(name="testdata")
	public Object[] [] checkB()
	{
		return new Object[] [] {{20,30},{20,20},{10,40}};
	}
	@Test(dataProvider="testdata")
	public void checkC(int c,int d)
	{
		System.out.println(c+d);
	}
	

}
