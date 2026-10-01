package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homepage;
import pageObjects.loginpage;
import pageObjects.myaccountpage;
import testBase.baseClass;
import utilities.DataProviders;

public class TC003_ddttestcase extends baseClass
{

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void datadriventc(String email, String password, String exp) 
	{
		try
		{logger.info("Started");
		homepage hp= new homepage(driver);
		logger.info("homepage");
		hp.clickmyaccount();
		hp.clicklogin();
		loginpage lp = new loginpage(driver);
		lp.setemail(email);
		lp.setpw(password);
		lp.clicksub();
		//Thread.sleep(2000);
	
		myaccountpage mp= new myaccountpage(driver);
		boolean targetpage=mp.ismyaccpageexists();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				mp.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				mp.clicklogout();
				Assert.assertTrue(false);			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail("an exception occured "+e.getMessage());
		}
		}
		
}
