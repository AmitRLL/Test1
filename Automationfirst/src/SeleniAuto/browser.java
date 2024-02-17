package SeleniAuto;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
//		System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver"); // Setting system properties of FirefoxDriver
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().back();//this is apply on amazon.
		driver.navigate().forward();//this is apply on amazon.
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();//this is for flipkart.
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//I have title of S/W compare with current software.
		String atitle = ("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		String ctitle =driver.getTitle();
		System.out.println(ctitle);
		if(atitle.equals(ctitle)) {
			System.out.println("Result:same");
		}else {
			System.out.println("Result:error");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		Dimension d = new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		Point p = new Point(500,500);
		driver.manage().window().setPosition(p);
		//Java String Pool is the special memory region where Strings are stored by the JVM
		
		
		
		
	}

}
