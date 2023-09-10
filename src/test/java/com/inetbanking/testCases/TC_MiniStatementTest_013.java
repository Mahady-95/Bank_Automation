package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.MiniStatementPage;

public class TC_MiniStatementTest_013 extends BaseClass {

	
	@Test
	public void miniStateMent() throws InterruptedException
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
		
		MiniStatementPage bEnq = new MiniStatementPage(driver);
		
		logger.info("Providing fund balance enquiry details...");
		
		bEnq.clickMiniState();
		Thread.sleep(3000);
		
		bEnq.miniSAccountNo("123456");
		
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
