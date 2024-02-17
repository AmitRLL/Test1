package SeleniumPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import SeleniAuto.screenshot;
import SeleniAuto.openurl;

public class practscreenshot {
	public static void main(String[] args) throws IOException {
//		String d =Gatedatetime.datetime();
		WebDriver driver = openurl.openBrowser("https://www.amazon.in/");
	    
		screenshot.takescreensot(driver, "amazonhome");
	}

}
