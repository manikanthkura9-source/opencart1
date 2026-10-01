package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountpage extends basepage
{
	public myaccountpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement locmyele;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement linklogout;
	
	public boolean ismyaccpageexists()
	{
		try{
			return(locmyele.isDisplayed());
		}
		catch(Exception e) 
		{
			 System.out.println("My Account element not found: "
                     + e.getMessage());
			return (false);
		}
	}
	public void clicklogout()
	{
		linklogout.click();
	}
}
