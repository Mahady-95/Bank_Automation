package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {

	
WebDriver lddriver;
	
	public DeleteAccountPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[7]/a[1]")
	@CacheLookup
	WebElement lnkDltAccount;
	
	@FindBy(how = How.NAME, using ="accountno")
	@CacheLookup
	WebElement txtDltAcc;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickNewAccount()
	{
		lnkDltAccount.click();
	}
	public void customerId(String custid)
	{
		txtDltAcc.sendKeys(String.valueOf(custid));
	}
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
