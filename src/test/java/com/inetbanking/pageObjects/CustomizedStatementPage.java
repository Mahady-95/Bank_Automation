package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatementPage {

	
WebDriver lddriver;
	
	public CustomizedStatementPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[14]/a[1]")
	@CacheLookup
	WebElement lnkCustomState;
	
	@FindBy(how = How.NAME, using ="accountno")
	@CacheLookup
	WebElement txtAccNo;
	
	@FindBy(how = How.NAME, using ="fdate")
	@CacheLookup
	WebElement txtFromDate;
	
	@FindBy(how = How.NAME, using ="tdate")
	@CacheLookup
	WebElement txtToDate;
	
	@FindBy(how = How.NAME, using ="amountlowerlimit")
	@CacheLookup
	WebElement txtAmountLowLimit;
	
	@FindBy(how = How.NAME, using ="numtransaction")
	@CacheLookup
	WebElement txtNoOftransaction;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickCustomTarnsaction()
	{
		lnkCustomState.click();
	}

	public void accNo(String accountno)
	{
		txtAccNo.sendKeys(accountno);
	}
	public void fromDate(String mm,String dd,String yy)
	{
		txtFromDate.sendKeys(mm);
		txtFromDate.sendKeys(dd);
		txtFromDate.sendKeys(yy);
	}
	public void toDate(String mm,String dd,String yy)
	{
		txtToDate.sendKeys(mm);
		txtToDate.sendKeys(dd);
		txtToDate.sendKeys(yy);
	}
	
	public void minTarnsacVal(String amountlowerlimit)
	{
		txtAmountLowLimit.sendKeys(String.valueOf(amountlowerlimit));
	}
	public void numOfTransaction(String numtransaction)
	{
		txtNoOftransaction.sendKeys(String.valueOf(numtransaction));
	}
	
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
