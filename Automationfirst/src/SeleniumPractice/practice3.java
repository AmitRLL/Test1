package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("url");
		driver.navigate().to("url");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		Dimension d =new Dimension(230,254);
		driver.manage().window().setSize(d);
		
		Point p =new Point(550,658);
		driver.manage().window().setPosition(p);//(semicolumne)
		
		WebElement sign= driver.findElement(By.cssSelector(null)); 
		sign.click();
		sign.sendKeys();
		sign.isSelected();
		sign.isEnabled();
		sign.isSelected();
		sign.getText();
		sign.clear(); 
		
		
	}

}
