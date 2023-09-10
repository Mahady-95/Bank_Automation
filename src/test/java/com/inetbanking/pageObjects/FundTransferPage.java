package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {

	
WebDriver lddriver;
	
	public FundTransferPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[10]/a[1]")
	@CacheLookup
	WebElement lnkfundTransfer;
	
	@FindBy(how = How.NAME, using ="payersaccount")
	@CacheLookup
	WebElement txtPayersACC;
	
	@FindBy(how = How.NAME, using ="payeeaccount")
	@CacheLookup
	WebElement txtpayeeACC;
	
	@FindBy(how = How.NAME, using ="ammount")
	@CacheLookup
	WebElement txtAmount;
	
	@FindBy(how = How.NAME, using ="desc")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickFundTransfer()
	{
		lnkfundTransfer.click();
	}
	public void payersAccount(String payersaccount)
	{
		txtPayersACC.sendKeys(String.valueOf(payersaccount));
	}
	public void payeeAccount(String payeeaccount)
	{
		txtpayeeACC.sendKeys(String.valueOf(payeeaccount));
	}
	
	public void ammountFundTransfer(String ammount)
	{
		txtAmount.sendKeys(String.valueOf(ammount));
	}
	public void fundTransferDesc(String desc)
	{
		txtDescription.sendKeys(String.valueOf(desc));
	}
	
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
