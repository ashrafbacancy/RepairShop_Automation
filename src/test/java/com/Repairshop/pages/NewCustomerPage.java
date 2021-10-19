package com.Repairshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCustomerPage extends BasePage{

	public NewCustomerPage(ThreadLocal<WebDriver>driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	By FirstName=By.id("customer_firstname");
	By LastName=By.id("customer_lastname");
	By BuisnessName=By.id("customer_business_name");
	By Email=By.id("customer_email");
	By Create_Customer_button=By.id("customer_create_button");
	
	By MobileNumberDropdown=By.id("customer_phones_attributes_0_label");
	
	
	public void SetFirstName(String FirstName)
	{
		SetText(this.FirstName, FirstName);
	}
	
	
	public void SetLastName(String LastName)
	{
		SetText(this.LastName, LastName);
	}
	
	
	public void SetBuisnessName(String BuisnessName)
	{
		SetText(this.BuisnessName, BuisnessName);
	}
	
	
	public void SetEmail(String Email)
	{
		SetText(this.Email, Email);
	}
	
	
	public void ClickOnCreateCustomerbutton()
	{
		clickandwait(Create_Customer_button);
	}
	
	
	
	public void SelectPhoneOption()
	{
		SelectFromDropDown(e->e.selectByValue("Office"), MobileNumberDropdown);
	}
	
	
	
	
	
	
	
	
	
	
	
}
