package JavaLec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Demo {
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://vctcpune.com/");
//		WebElement practice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
//		practice.click();
//		Set<String> a = driver.getWindowHandles();
//		Iterator<String> i = a.iterator();
//		while(i.hasNext())
//		{ 
//			driver.switchTo().window(i.next());
//			System.out.println(driver.getTitle());
//		}
//		JavascriptExecutor execute = ((JavascriptExecutor)driver);
//		execute.executeScript("window.scrollBy(100,200)");
//		//Implicite wait
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		//Explicite wait
//		WebDriverWait wait = new WebDriverWait(driver, 2000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='dropdown-class-example']")));
//		
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		Select down = new Select(dropdown);
//		down.selectByIndex(1);
//		
//		
//		/////////////////////////////////////////////////////
//		driver.get("http://demo.guru99.com/test/web-table-element.php#");
//		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
//		 System.out.println(row.size());
//		 double m=0;
//		 double n=0;
//		 
//		 
//		 for(int q=1;q<=row.size();q++)
//		 {
//			 String max = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+q +"]//td[4]")).getText();
//			 m = Double.parseDouble(max);
//			 if(m>n)
//			 {
//				
//			   n=m;
//			 }
//		 }
//		 System.out.println(n);
//		 
//		 JavascriptExecutor execut = ((JavascriptExecutor)driver);
//		 execut.executeScript("windows.scrollBy(100,200)");
		
		HashMap<String,Integer> hm =new HashMap<String, Integer>();
		hm.put("vinod", 10);
		hm.put("Rahul", 12);
		System.out.println(hm.get("vinod"));
		
		
	
		
	}
}
   
		
		
		
		
			
				
		
