package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonHomepage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement search;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement clicksearch;
	@FindBy(xpath="//select[@id='searchDropdownBox']")private WebElement searchdropdown;
	@FindBy(xpath="//a[@id='nav-logo-sprites']")private WebElement logo;
	@FindBy(xpath="//a[text()='Beauty & Personal Care']")private WebElement beautypersonalcare;
	public amazonHomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSearchtab(String product)
	{
		search.sendKeys(product);
	}
	public void clickOnSearchbotton()
	{
		clicksearch.click();
	}
	public void clickonSearchDropdown()
	{
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOf(logo));
		//searchdropdown.click();
		Select list =new Select(searchdropdown);
		list.selectByIndex(9);
	}
	public void checkLogo() throws InterruptedException
	{
		Thread.sleep(1000);
		if(logo.isDisplayed()) {
			System.out.println(logo.getText());
			
		}	
	}
	public void clickBeautyPersonalcare()
	{
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOf(logo));
////		Actions act = new Actions(driver);
////		act.click(beautypersonalcare);
////		act.perform();
		beautypersonalcare.click();
		
	}
	

}
