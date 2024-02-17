package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot{
	public static void takeScreenshot(WebDriver driver,String name) throws IOException
	{
		String dt =Getdatetime.datetimes();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\velocity-java-eclipse\\Amazon\\Screenshot\\screenshot1"+name+""+dt+".jpg");
		FileHandler.copy(source, destination); 
	}

}
