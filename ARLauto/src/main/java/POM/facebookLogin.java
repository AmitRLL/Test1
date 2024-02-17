package POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLogin {
	WebDriver driver;
	@FindBy(xpath="//input[@id=\"email\"]")private WebElement emailAndphone;
	@FindBy(xpath="//input[@id=\"pass\"]")private WebElement passWord;
	@FindBy(xpath="//button[@name=\"login\"]")private WebElement login;
	@FindBy(xpath="//a[text()=\"Forgotten password?\"]")private WebElement forgotpassword;
	@FindBy(xpath="//a[@data-testid=\"open-registration-form-button\"]")private WebElement createAccount;
	@FindBy(xpath="//img[@alt=\"Facebook\"]")private WebElement logo;
	@FindBy(xpath="//div[text()=\"Recent logins\"]")private WebElement text1;
	@FindBy(xpath="//div[@class=\"j83agx80 l9j0dhe7\"]")private WebElement account;
	@FindBy(xpath="(//div[@tabindex=\"0\"])[140]")private WebElement logout;
	public facebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendemailAndphone(String user)
	{
		
		emailAndphone.sendKeys(user);
	}
	public void sendpassword(String pass)
	{
		passWord.sendKeys(pass);
	}
	public void clicklogin()
	{
		login.click();
	}
	public void clickforgotpassword()
	{
		forgotpassword.click();
	}
	public void clickoncreateAccount()
	{
		createAccount.click();
	}
	public void checkLogo()
	{
		System.out.println(logo.isDisplayed());
	}
	public void text1()
	{
		System.out.println(text1.isDisplayed());
	}
	public void clickAccount()
	{
		account.click();
	}
	public void clickonLogout()
	{
		logout.click();
	}

}

