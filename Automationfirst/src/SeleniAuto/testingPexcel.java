package SeleniAuto;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingPexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver =openurl.openBrowser("https://kite.zerodha.com/");
		
		String userID = excelsheetcall.parametrization(0,1,"Credential");
		System.out.println("ID:"+userID);
		String pass = excelsheetcall.parametrization(1,1,"Credential");
		System.out.println("PASSWORD:"+pass);
		String callpin = excelsheetcall.parametrization(2,1,"Credential");
		System.out.println("PIN:"+callpin);
		
		Thread.sleep(2000);
		
		WebElement userid = driver.findElement(By.id("userid"));
		userid.sendKeys(userID);
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys(pass);
		
		
		WebElement logIn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		logIn.click();
		
		Thread.sleep(2000);
		
		WebElement Pinno = driver.findElement(By.xpath("//input[@id='pin']"));
		Pinno.sendKeys(callpin);
		
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		
	}

}
