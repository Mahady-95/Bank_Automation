package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BalanceEnquiryPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_BalanceEnquiryTest_012 extends BaseClass {

	
	@Test
	public void balanceEnquiry() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		
		BalanceEnquiryPage bEnq = new BalanceEnquiryPage(driver);
		
		logger.info("Providing fund balance enquiry details...");
		
		bEnq.clickBalanceEnq();
		Thread.sleep(3000);
		
		bEnq.enqAccountNo("123456");
		
		bEnq.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
	}
}
