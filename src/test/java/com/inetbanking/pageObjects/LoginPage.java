package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogIn;
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String uname)
	{
		txtUName.sendKeys(uname);
	}
	public void setPassword(String pws)
	{
		txtpass.sendKeys(pws);
	}
	public void clickLogin()
	{
		btnLogIn.click();
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
