package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationpage extends basepage

{
	public registrationpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement inpfname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement inplname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inpemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement intphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inppw;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement inppwdconfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;


	public void setfname(String fname)
	{
		inpfname.sendKeys(fname);
	}
	
	public void setlname(String lname)
	{
		inplname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		inpemail.sendKeys(email);
	}
	
	public void setphone(String phone)
	{
		intphone.sendKeys(phone);
	}
	
	public void setpw(String pwd)
	{
		inppw.sendKeys(pwd);
	}
	
	public void setpwdconf(String pwdc)
	{
		inppwdconfirm.sendKeys(pwdc);
	}
	
	public void agree()
	{
		chkagree.click();
	}
	
	public void continuebtn()
	{
		btncontinue.click();
	}
	
	public String verifymsg()
	{
		try{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
}


