package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {

	
WebDriver lddriver;
	
	public ChangePasswordPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[11]/a[1]")
	@CacheLookup
	WebElement lnkChangePass;
	
	@FindBy(how = How.NAME, using ="oldpassword")
	@CacheLookup
	WebElement txtOldPass;
	
	@FindBy(how = How.NAME, using ="newpassword")
	@CacheLookup
	WebElement txtNewPass;
	
	@FindBy(how = How.NAME, using ="confirmpassword")
	@CacheLookup
	WebElement txtConfirmPass;
	
	
	@FindBy(how = How.NAME, using="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickChangePassword()
	{
		lnkChangePass.click();
	}
	public void oldPass(String oldpassword)
	{
		txtOldPass.sendKeys(String.valueOf(oldpassword));
	}
	public void newPass(String newpassword)
	{
		txtNewPass.sendKeys(String.valueOf(newpassword));
	}
	public void confirmPass(String confirmpassword)
	{
		txtConfirmPass.sendKeys(String.valueOf(confirmpassword));
	}
	
	public void buttonSubmit()
	{
		btnSubmit.click();
	}
}
