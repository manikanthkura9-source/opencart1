package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage
{
	
	public homepage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//li[@class='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement Login;
	
	public void clickmyaccount()
	{
		lnkmyaccount.click();
	}
	
	public void lnkregister()
	{
		lnkregister.click();
	}
	
	public void clicklogin()
	{
		Login.click();
	}
}
