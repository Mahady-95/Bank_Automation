package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DepositPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DepositTest_009 extends BaseClass {
	
	
	@Test
	public void deposit() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		DepositPage depos = new DepositPage(driver);
		
		logger.info("Providing Deposit details...");
		
		depos.clickDeposit();
		Thread.sleep(3000);
		
		depos.accountNO("123456");
		
		depos.ammountDepo("11000");
		depos.depoDescription("Ammount added");
		
		depos.accSubmit();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
	}

}
