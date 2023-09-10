package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteCustomerTest_005 extends BaseClass {
	
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		DeleteCustomerPage deleteCust = new DeleteCustomerPage(driver);
		
		logger.info("Providing Account no...");
		
		deleteCust.clickDeleteCustomer();
		Thread.sleep(3000);
		
		deleteCust.accountNo("12345");
		
		deleteCust.deleteSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
		
	}
}
