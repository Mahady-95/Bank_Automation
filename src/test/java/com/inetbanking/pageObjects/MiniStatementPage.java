package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementPage {

	
WebDriver lddriver;
	
	public MiniStatementPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[13]/a[1]")
	@CacheLookup
	WebElement lnkMinistate;
	
	@FindBy(how = How.NAME, using ="accountno")
	@CacheLookup
	WebElement txtAccEnq;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickMiniState()
	{
		lnkMinistate.click();
	}
	public void miniSAccountNo(String accountno)
	{
		txtAccEnq.sendKeys(String.valueOf(accountno));
	}
	
	public void accSubmit()
	{
		btnSubmit.click();
	}
}
