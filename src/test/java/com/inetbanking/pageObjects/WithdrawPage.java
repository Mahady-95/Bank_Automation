package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WithdrawPage {

	
WebDriver lddriver;
	
	public WithdrawPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[9]/a[1]")
	@CacheLookup
	WebElement lnkWithdraw;
	
	@FindBy(how = How.NAME, using ="accountno")
	@CacheLookup
	WebElement txtWithdrawAcc;
	
	@FindBy(how = How.NAME, using ="ammount")
	@CacheLookup
	WebElement txtAmount;
	
	@FindBy(how = How.NAME, using ="desc")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickWithdraw()
	{
		lnkWithdraw.click();
	}
	public void accountNO(String accountno)
	{
		txtWithdrawAcc.sendKeys(String.valueOf(accountno));
	}
	public void ammountWithdraw(String ammount)
	{
		txtAmount.sendKeys(String.valueOf(ammount));
	}
	public void WithdrawDesc(String desc)
	{
		txtDescription.sendKeys(String.valueOf(desc));
	}
	
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
