package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CustomizedStatementPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_CustomizedStatementTest_014 extends BaseClass {

	
	@Test
	public void customStatement() throws InterruptedException
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
		
		CustomizedStatementPage customSt = new CustomizedStatementPage(driver);
		
		logger.info("Providing fund custom statement details...");
		
		customSt.clickCustomTarnsaction();
		Thread.sleep(3000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		customSt.accNo("123456");
		Thread.sleep(2000);
		
		customSt.fromDate("10","31","1984");
		Thread.sleep(2000);
		customSt.toDate("11","30","1984");
		Thread.sleep(2000);
		customSt.minTarnsacVal("1000");
		
		customSt.numOfTransaction("12");
		customSt.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
	}
}
