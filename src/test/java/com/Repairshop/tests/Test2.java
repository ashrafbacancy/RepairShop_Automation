package com.Repairshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.TestUtils;

public class Test2 extends BaseTest {

	
String FirstName=TestUtils.uniqueTextGenerator("Ashraf");
	
	String LastName=TestUtils.uniqueTextGenerator("Test_Engg");
	
	String BuisnessName=TestUtils.uniqueTextGenerator("Test_Automation");
	
	String Email=TestUtils.getUniqueEmail();
	
	@Test
	public void CreateCustomer() throws Exception
	{
		System.out.println("-------------------------------");
		//getting to the url
		pages.getLoginPage().getURL("https://abhiabc.repairshopr.com/users/sign_in");
		
		
		//Entering login credentials
		pages.getLoginPage().SetEmailAndPassword("teststackshare@gmail.com", "Repairshop@12345");
	
	
	
		//Clicking On Login Button
		pages.getLoginPage().ClickOnLoginButton();
	
	
	
		pages.getCustomersPage().clickOnCustomersButton();
		
		
		pages.getCustomersPage().ClickOnAddCustomersButton();
		
		
		pages.getNewCustomerPage().SetFirstName(FirstName);
	
		pages.getNewCustomerPage().SetLastName(LastName);
	
		pages.getNewCustomerPage().SetBuisnessName(BuisnessName);
		
		pages.getNewCustomerPage().SetEmail(Email);
	
	
	
		pages.getNewCustomerPage().SelectPhoneOption();
	
		pages.getNewCustomerPage().ClickOnCreateCustomerbutton();
		
//		pages.getCustomersPage().clickOnCustomersButton();
//		
//		
//		
//		pages.getCustomersPage().waitforTableToAppear();
//		
	
	Assert.assertTrue(pages.getCustomersPage().verifySucessMessage(), "Success message is not displayed");
	
	
	
	}
	
	
	
	
	
	
	
}
