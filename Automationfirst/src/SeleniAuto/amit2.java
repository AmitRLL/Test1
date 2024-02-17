package SeleniAuto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amit2 {
	public static void main(String[] args) throws IOException {
//	System.setProperty("webdriver.chrome.driver","C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//    
//	driver.get("");
//	driver.navigate().to("");
//	driver.navigate().refresh();
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.manage().window().maximize();
//	driver.manage().window().minimize();
//	driver.getTitle();
//	driver.getCurrentUrl();
//	
//	Dimension d = new Dimension(100,200);
//	driver.manage().window().setSize(d);
//	
//	Point p = new Point(200,500);
//	driver.manage().window().setPosition(p);
//	
//	Alert a = driver.switchTo().alert();
//	a.accept();
//	a.dismiss();
//	a.getText();
//	a.sendKeys("");
//	
//	Set<String> pop =driver.getWindowHandles();
//	Iterator<String> i = pop.iterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//		driver.switchTo().window(i.next());
//	}
//	 JavascriptExecutor execut = ((JavascriptExecutor)driver);
//	 execut.executeScript("window.scrollBy(100,200)");
//	 
//	 WebElement list =driver.findElement(By.xpath(""));
//	 Select drop = new Select(list);
//	 drop.selectByIndex(0);
//	 drop.selectByValue(null);
//	 drop.selectByVisibleText(null);
//	 
//	 Actions act = new Actions(driver);
//	 act.click();
//	 act.contextClick();  //Right click
//	 act.moveToElement(list);
//	 act.dragAndDrop(list, list);
//	 act.keyDown(Keys.ALT);
//	 act.build().perform();
//	 
//	 FileInputStream file = new FileInputStream("D:\\Excel\\Book1.xlsx");
//	 //WorkbookFactory.create(null).getSheet().getRow().getCell().getStringCellValue();
//	 
//	
//	 File source  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//	 File destination = new File("");
//	 FileHandler.copy(source, destination);
//	   
//	 driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
//	 
//	 WebDriverWait wait = new WebDriverWait(driver,2000);
//	wait.until(ExpectedConditions.visibilityOf(list));
//		
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver= new ChromeDriver();
		driver.get("");
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.getCurrentUrl();
		driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		WebElement e =driver.findElement(By.xpath(""));
		e.isDisplayed();
		e.isEnabled();
		e.isSelected();
		e.click();
		e.clear();
		e.sendKeys(args);
		e.getText();
		
		Select s=new Select(e);
		s.selectByIndex(0);
		s.selectByValue(null);
		s.selectByVisibleText(null);
		
		Dimension d =new Dimension(100,200);
		driver.manage().window().setSize(d);
		
		Point p =new Point(100,200);
		driver.manage().window().setPosition(p);
		
		FileInputStream f =new FileInputStream("exe/path/of/file");
	   //WorkbookFactory.create(f).getSheet(gh).getRow().getCell().getStringValue();
		
		Alert a=driver.switchTo().alert();
		a.dismiss();
		a.accept();
		a.sendKeys("hdjh");
		a.getText();
		
		Set<String> w= driver.getWindowHandles();
		Iterator<String> i=w.iterator();
		while(i.hasNext()) {
			driver.switchTo().window(i.next());
		}
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		
		WebDriverWait wait =new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOf(e));
		
		
	}

}
