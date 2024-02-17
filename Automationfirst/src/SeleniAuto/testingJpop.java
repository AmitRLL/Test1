package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testingJpop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement arl = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	    arl.click();
	    Thread.sleep(3000);
	    WebElement first = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	    first.sendKeys("amit");
	    WebElement last = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	    last.sendKeys("Lilhare");
	    WebElement email = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[3]"));
	    email.sendKeys("amitlilhare@gmail.com");
	    Thread.sleep(2000);
	    WebElement reemail = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[4]"));
	    reemail.sendKeys("amitlilhare@gmail.com");
	    Thread.sleep(2000);
	    WebElement pass = driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]"));
	    pass.sendKeys("Amit#1234");
	    WebElement date = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
	    Select dropdown = new Select(date);
	    dropdown.selectByIndex(0);
	    WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	    Select dropdown1 = new Select(month);
	    dropdown1.selectByIndex(7);
	    WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	    Select dropdown2 = new Select(year);
	    dropdown2.selectByIndex(23);
	    WebElement gender = driver.findElement(By.xpath("//input[@value=\"2\"]"));
	    gender.click();
	    boolean check = gender.isSelected();
	    System.out.println(check);
	    WebElement button = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
	    button.click();
	    
	    
	    
	}

}
