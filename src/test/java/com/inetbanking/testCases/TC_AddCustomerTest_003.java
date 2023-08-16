package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

//import net.bytebuddy.utility.RandomString;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickLogin();
		
		Thread.sleep(5000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		logger.info("Providing the customer details....");
		
		addcust.clickAddNewCustomer();
		Thread.sleep(5000);
		
		
		addcust.custName("Mahady");
		addcust.custGenden("male");
		addcust.custDob("10","31","1984");
		Thread.sleep(5000);
		addcust.custAddress("Bangladesh");
		addcust.custCity("Nikunjo");
		addcust.custState("Dhaka");
		addcust.custPinno("500765");
		addcust.custTelephone("987890091");
		
		String email = randomString()+"@gmail.com";
		addcust.custEmailId(email);
		addcust.custPassword("abcdefg");
		addcust.custSubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			logger.info("Test case is passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test is failed");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
	}
	
}
