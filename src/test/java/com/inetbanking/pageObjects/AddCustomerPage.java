package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCusttomer;
	
	@FindBy(how=How.NAME, using ="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME, using ="rad1")
	@CacheLookup
	WebElement rdGender;
	
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="dob")
	WebElement txtDob;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="addr")
	WebElement txtAddress;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="city")
	WebElement txtCity;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="state")
	WebElement txtState;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="pinno")
	WebElement txtPinno;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="telephoneno")
	WebElement txtTelephone;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="emailid")
	WebElement txtEmailid;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="password")
	WebElement txtPassword;
	
	@CacheLookup
	@FindBy(how=How.NAME, using ="sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCusttomer.click();
	}
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	public void custGenden(String cgender)
	{
		rdGender.click();
	}
	public void custDob(String mm,String dd,String yy)
	{
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yy);
		
	}
	public void custAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	public void custPinno(String cpinno)
	{
		txtPinno.sendKeys(String.valueOf(cpinno)); //type casting
	}
	public void custTelephone(String ctelephone)
	{
		txtTelephone.sendKeys(ctelephone);
	}
	public void custEmailId(String cemailid)
	{
		txtEmailid.sendKeys(cemailid);
	}
	public void custPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	public void custSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
	
}
