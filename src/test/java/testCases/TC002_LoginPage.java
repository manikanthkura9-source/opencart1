package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homepage;
import pageObjects.loginpage;
import pageObjects.myaccountpage;
import testBase.baseClass;

public class TC002_LoginPage extends baseClass
{
	@Test(groups={"Sanity","Master"})
	public void verifyloginpage()
	{
		try
		{
		logger.info("Started");
		homepage hp= new homepage(driver);
		logger.info("homepage");
		hp.clickmyaccount();
		hp.clicklogin();
		logger.info("homepage completed");
		logger.info("login page Started");
		loginpage lp = new loginpage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpw(p.getProperty("password"));
		lp.clicksub();
		logger.info("loginpage completed");
		Thread.sleep(5000);
		logger.info("accountpage started");
		myaccountpage mp= new myaccountpage(driver);
		boolean targetpage=mp.ismyaccpageexists();
		
	  //  Assert.assertEquals(targetpage, true, "Login failed");
		Assert.assertTrue(targetpage);
		}
			catch(Exception e)
			{
			    logger.error("Login test failed", e);
			    Assert.fail("Login test failed: " + e.getMessage(), e);
			}
		logger.info("Completed");
	}
	
}
