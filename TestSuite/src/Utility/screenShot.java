package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.getDateTime;



public class screenShot{
	public static void takescreensot(WebDriver driver,String name) throws IOException {
		String d = getDateTime.datetimes();
		driver.manage().window().maximize();
	   File source = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   File destination = new File("D:\\Selenium screenshot"+name+""+d+".jpg");
	   
	   FileHandler.copy(source, destination);
	}

}
