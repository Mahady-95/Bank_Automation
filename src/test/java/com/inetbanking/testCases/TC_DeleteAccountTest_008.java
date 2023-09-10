package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteAccountTest_008 extends BaseClass {

	
	
	@Test
	public void deleteAcount() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		DeleteAccountPage dltAcc = new DeleteAccountPage(driver);
		
		logger.info("Providing Account details...");
		
		dltAcc.clickNewAccount();
		Thread.sleep(3000);
		
		dltAcc.customerId("12345");
		
		dltAcc.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
	}
}
