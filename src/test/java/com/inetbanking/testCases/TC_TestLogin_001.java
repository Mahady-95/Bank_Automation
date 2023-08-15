package com.inetbanking.testCases;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.*;

public class TC_TestLogin_001 extends BaseClass {
	@Test
	public void TestLogin() throws IOException
	{
		
		driver.get(bURL);
		logger.info("URl is oppend");
		
		LoginPage lpp = new LoginPage(driver);
		
		lpp.setUserName(UName);
		logger.info("Enter username");
		
		lpp.setPassword(password);
		logger.info("Enter password");
		
		lpp.clickLogin();
		
		String a = driver.getTitle();
		System.out.println(a);
	

		if(a.equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"TestLogin");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
