package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.LogoutPage;

public class TC_LogoutTest_015 extends BaseClass {


	@Test
	public void logout() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		LogoutPage logout = new LogoutPage(driver);
		
//		logger.info("Providing Account no...");
		
		logout.clickLogout();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(5000);
		
		String redirected_url = driver.getCurrentUrl();//This url is not matching with the one  showing in address bar.
		driver.get(redirected_url);
		Thread.sleep(2000);
		
	}
}
