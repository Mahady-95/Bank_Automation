package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DepositPage {

	
WebDriver lddriver;
	
	public DepositPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[8]/a[1]")
	@CacheLookup
	WebElement lnkDeposit;
	
	@FindBy(how = How.NAME, using ="accountno")
	@CacheLookup
	WebElement txtDepositAcc;
	
	@FindBy(how = How.NAME, using ="ammount")
	@CacheLookup
	WebElement txtAmount;
	
	@FindBy(how = How.NAME, using ="desc")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickDeposit()
	{
		lnkDeposit.click();
	}
	public void accountNO(String accountno)
	{
		txtDepositAcc.sendKeys(String.valueOf(accountno));
	}
	public void ammountDepo(String ammount)
	{
		txtAmount.sendKeys(String.valueOf(ammount));
	}
	public void depoDescription(String desc)
	{
		txtDescription.sendKeys(String.valueOf(desc));
	}
	
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
