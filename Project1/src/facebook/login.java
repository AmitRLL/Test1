package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//CSS Selector by tag and ID
		driver.findElement(By.cssSelector("#email")).sendKeys("amit");
		                              //OR
		driver.findElement(By.cssSelector("input#email")).sendKeys("ammit");
		
		
		
		// CSS Selector by tag attribut and attribute value
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("amut");
		                              //OR
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("lilhare");
		
		
		
		//CSS Selector by tag and class
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("amitll");//attributevalue
	                                  //OR
	    driver.findElement(By.cssSelector("input.inputtext")).sendKeys("amit12");
	    
	    
	    //CSS Selector by tag class and attribute attributevalue
	    driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_email']")).sendKeys("lilhare");
		
	}

}
