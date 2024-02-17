package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver openBrowser(String url) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\velocity-java-eclipse\\Naukri\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
