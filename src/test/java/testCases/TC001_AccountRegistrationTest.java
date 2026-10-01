package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homepage;
import pageObjects.registrationpage;
import testBase.baseClass;

public class TC001_AccountRegistrationTest extends baseClass
{
		
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info(" Started test case 1 ");
		try
		{
		homepage hp= new homepage(driver);
		hp.clickmyaccount();
		hp.lnkregister();
		
		registrationpage regn= new registrationpage(driver);
		regn.setfname(randomngenerate().toUpperCase());
		regn.setlname(randomngenerate().toUpperCase());
		regn.setemail((randomngenerate())+"@gmail.com");
		regn.setphone(randomnumber());
		
		String password=randomalphanumeric();
		regn.setpw(password);
		regn.setpwdconf(password);
		regn.agree();
		regn.continuebtn();
		logger.info(" Validating expected message ");
		String orgmsg=regn.verifymsg();
		if(orgmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.assertTrue(false);
		}
			
			//Assert.assertEquals(orgmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Test passed ");

	}
	
	
	
	
	
}
