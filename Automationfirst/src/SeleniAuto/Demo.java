package SeleniAuto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "exe path of browser");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.navigate().to("");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.wait(2000);
		WebElement f = driver.findElement(By.xpath(""));
		Select d = new Select(f);
		d.selectByIndex(0);
		d.selectByValue("");
		d.selectByVisibleText("");
		Alert a= driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys(null);
		a.getText();
		WebElement c = driver.findElement(By.xpath(null));
		Set<String> ch = driver.getWindowHandles();
		Iterator<String> i = ch.iterator();
		while(i.hasNext()) {
		driver.switchTo().window(i.next());
		}
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileHandler.copy(source, destination);
		
		JavascriptExecutor e = ((JavascriptExecutor)driver);
		e.executeScript("window.scrollBy(100,200)");
		FileInputStream file = new FileInputStream("");
		WorkbookFactory.create(file).getSheet(null).getRow(0).getCell(0).getStringCellValue();
		
	    
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
