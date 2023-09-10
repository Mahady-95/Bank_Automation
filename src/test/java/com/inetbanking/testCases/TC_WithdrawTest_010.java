package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.WithdrawPage;

public class TC_WithdrawTest_010 extends BaseClass {

	
	@Test
	public void withdraw() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		WithdrawPage wdr = new WithdrawPage(driver);
		
		logger.info("Providing withdraw details...");
		
		wdr.clickWithdraw();
		Thread.sleep(3000);
		
		wdr.accountNO("123456");
		
		wdr.ammountWithdraw("11000");
		wdr.WithdrawDesc("Ammount added");
		
		wdr.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
	}
}
