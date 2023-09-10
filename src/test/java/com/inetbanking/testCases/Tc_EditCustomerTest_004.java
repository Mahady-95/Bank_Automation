package com.inetbanking.testCases;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class Tc_EditCustomerTest_004 extends BaseClass {

	@Test
	public void editCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		
		logger.info("Providing customer id...");
		
		editcust.clickEditCustomer();
		Thread.sleep(3000);
		editcust.customerId("12345");
		
		editcust.editSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
//		
//		Thread.sleep(5000);
		
		
	}

}
