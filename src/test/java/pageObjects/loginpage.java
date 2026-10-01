package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends basepage

{
	public loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement locemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement locpw;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement locsub;
	
	
	public void setemail(String email)
	{
		locemail.sendKeys(email);
	}
	
	public void setpw(String password)
	{
		locpw.sendKeys(password);
	}
	
	public void clicksub()
	{
		locsub.click();
	}
}
