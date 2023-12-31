package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class EditCustomerPage {
	
WebDriver lddriver;
	
	public EditCustomerPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement lnkEditCustomer;
	
	@FindBy(how = How.NAME, using ="cusid")
	@CacheLookup
	WebElement txtCustomerId;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickEditCustomer()
	{
		lnkEditCustomer.click();
	}
	public void customerId(String custid)
	{
		txtCustomerId.sendKeys(String.valueOf(custid));
	}

	public void editSubmit()
	{
		btnSubmit.click();
	}


}
