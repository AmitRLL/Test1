package SeleniAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingOifram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=openurl.openBrowser("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//WebElement singleiframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		//singleiframe.click(); //click nhi krna hai.
		driver.switchTo().frame(0); //use this method to focus on iframe.
		
		WebElement text = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		text.sendKeys("velocity");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//to move from frame to home page.
		
		WebElement doubleiframe = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		doubleiframe.click();
		
		WebElement parentiframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(parentiframe);
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(childframe);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("katraj");
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
