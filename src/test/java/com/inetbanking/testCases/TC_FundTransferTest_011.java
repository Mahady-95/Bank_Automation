package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.FundTransferPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_FundTransferTest_011 extends BaseClass {

	
	@Test
	public void fundTransfer() throws InterruptedException
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
		
		FundTransferPage fndtrns = new FundTransferPage(driver);
		
		logger.info("Providing fund transfer details...");
		
		fndtrns.clickFundTransfer();
		Thread.sleep(3000);
		
		fndtrns.payersAccount("123456");
		fndtrns.payeeAccount("98708");
		
		fndtrns.ammountFundTransfer("11000");
		fndtrns.fundTransferDesc("Fund transfered");
		
		fndtrns.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
	}
}
