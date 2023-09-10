package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

WebDriver lddriver;
	
	public LogoutPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	@CacheLookup
	WebElement lnkLogout;

	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
