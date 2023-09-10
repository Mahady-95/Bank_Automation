package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	
WebDriver lddriver;
	
	public NewAccountPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[5]/a[1]")
	@CacheLookup
	WebElement lnkNewAccCustomer;
	
	@FindBy(how = How.NAME, using ="cusid")
	@CacheLookup
	WebElement txtCustomerId;
	
	@FindBy(how = How.NAME, using ="selaccount")
	@CacheLookup
	WebElement selectDropDown;
	
	
	
	@FindBy(how = How.NAME, using = "inideposit")
	@CacheLookup
	WebElement txtInitialDeposit;
	
	@FindBy(how = How.NAME, using="button2")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickNewAccount()
	{
		lnkNewAccCustomer.click();
	}
	public void customerId(String custid)
	{
		txtCustomerId.sendKeys(String.valueOf(custid));
	}
	public void selAccDropDown()
	{
		WebElement dropdown = selectDropDown;
		Select select = new Select(dropdown);
		select.selectByValue("Current");
	}
	
	public void initialDeposit(String inideposit) 
	{
		txtInitialDeposit.sendKeys(inideposit);
	}
	public void accSubmit()
	{
		btnSubmit.click();
	}

}
