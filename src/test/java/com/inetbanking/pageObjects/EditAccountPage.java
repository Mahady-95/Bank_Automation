package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {

	
WebDriver lddriver;
	
	public EditAccountPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[6]/a[1]")
	@CacheLookup
	WebElement lnkEditAccount;
	
	@FindBy(how = How.NAME, using ="accountno")
	@CacheLookup
	WebElement txtAccName;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickNewAccount()
	{
		lnkEditAccount.click();
	}
	public void customerId(String custid)
	{
		txtAccName.sendKeys(String.valueOf(custid));
	}
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
