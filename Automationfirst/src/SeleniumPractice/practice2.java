package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniAuto.openurl;

public class practice2 {
	
	public static void main(String[] args) {
	     
	    WebDriver driver= openurl.openBrowser("http://demo.automationtesting.in/Frames.html");
	    
	  WebElement single =driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	  driver.switchTo().frame(single);//this is by WebElement
//	  driver.switchTo().frame(0); //this is by index 
//	  driver.switchTo().frame("id='singleframe'");//this is by name or id
	  

	//	WebDriverWait wait = new WebDriverWait(driver,3000);
	//	wait.until(ExpectedConditions.visibilityOf(single));
		
	 WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	 textbox.sendKeys("Amit");
	    
	}

}
