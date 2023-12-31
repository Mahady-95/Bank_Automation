package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
WebDriver lddriver;
	
	public DeleteCustomerPage(WebDriver rdriver)
	{
		lddriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement lnkDltCustomer;
	
	@FindBy(how = How.NAME, using ="cusid")
	@CacheLookup
	WebElement txtAccountNo;
	
	@FindBy(how = How.NAME, using="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickDeleteCustomer()
	{
		lnkDltCustomer.click();
	}
	public void accountNo(String cusid)
	{
		txtAccountNo.sendKeys(String.valueOf(cusid));
	}

	public void deleteSubmit()
	{
		btnSubmit.click();
	}
	
}
