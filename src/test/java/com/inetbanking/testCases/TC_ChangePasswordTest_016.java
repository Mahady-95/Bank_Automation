package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.ChangePasswordPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_ChangePasswordTest_016 extends BaseClass {

	
	@Test
	public void chnagePassword() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UName);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickLogin();
		Thread.sleep(5000);
		
		ChangePasswordPage chngPass = new ChangePasswordPage(driver);
		
		logger.info("Providing Password details...");
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		
		chngPass.clickChangePassword();
		Thread.sleep(3000);
		
		chngPass.oldPass("123@abc");
		chngPass.newPass("123abc@");
		chngPass.confirmPass("123abc@");
		
		chngPass.buttonSubmit();
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
