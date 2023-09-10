package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.NewAccountPage;

public class TC_NewAccountTest_006 extends BaseClass {

	@Test
	public void newAccount() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		NewAccountPage newAcc = new NewAccountPage(driver);
		
		logger.info("Providing Account no...");
		
		newAcc.clickNewAccount();
		Thread.sleep(3000);
		
		newAcc.customerId("12345");
		newAcc.selAccDropDown();
		newAcc.initialDeposit("7000");
		
		newAcc.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
		
	}
	
}
