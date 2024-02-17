package SeleniAuto;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingTforlogin {
	public void enterusername(WebDriver driver,String username)
	{
		WebElement userId = driver.findElement(By.xpath("//input[@id='userid']"));
		 userId.sendKeys(username);
		
	}
	public void enterpassword(WebDriver driver,String pass)
	{
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
	}
	public void clicklogin(WebDriver driver)
	{
		WebElement login = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		login.click();
	}
	public void enterpin(WebDriver driver,String pinNumber)
	{
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(pinNumber);
	}
	public void clickpinsubmit(WebDriver driver)
	{
		WebElement pinsubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		pinsubmit.click();
	}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		WebDriver driver = openurl.openBrowser("https://kite.zerodha.com/");
//		
//		testingTforlogin obj =new testingTforlogin();
//		
//		String username = excelsheetcall.parametrization(0, 1, "Credential");
//		obj.enterusername(driver, username);
//		
//		String password = excelsheetcall.parametrization(1, 1, "Credential");
//		obj.enterpassword(driver, password);
//		
//		Thread.sleep(2000);
//		obj.clicklogin(driver);
//		
//		Thread.sleep(3000);
//		String pin  = excelsheetcall.parametrization(2, 1, "Credential");
//		obj.enterpin(driver, pin);
//		
//		obj.clickpinsubmit(driver);
//	}
	

}
