package com.Repairshop.tests;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Extras.Listeneres;
import utils.TestUtils;


@Listeners(Extras.Listeneres.class)
public class LoginTest extends BaseTest {

	String FirstName = TestUtils.uniqueTextGenerator("Ashraf");

	String LastName = TestUtils.uniqueTextGenerator("Test_Engg");

	String BuisnessName = TestUtils.uniqueTextGenerator("Test_Automation");

	String Email = TestUtils.getUniqueEmail();
	
	public WebDriver Driver;

	@Test(priority=1)
	public void CreateCustomer() throws Exception {
		// System.out.println("-------------------------------");
		// getting to the url
		//

		
	//	
	//	Listeneres.extenttest.get().log(Status.INFO, "for test automation in part 1");
		pages.getLoginPage().getURL("https://abhiabc.repairshopr.com/users/sign_in");

	
		// Entering login credentials
//	//	Listeneres.extenttest.get().log(Status.INFO, "set email and password.");
		pages.getLoginPage().SetEmailAndPassword("teststackshare@gmail.com", "Repairshop@12345");
//
//		// Clicking On Login Button
//	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Login Button.");
		pages.getLoginPage().ClickOnLoginButton();
//
		Assert.assertTrue(false);
//	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getCustomersPage().clickOnCustomersButton();
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Add Customer Button.");
//		pages.getCustomersPage().ClickOnAddCustomersButton();
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Adding First Name.");
//		pages.getNewCustomerPage().SetFirstName(FirstName);
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Adding Last Name.");
//		pages.getNewCustomerPage().SetLastName(LastName);
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Adding Buisness Name.");
//		pages.getNewCustomerPage().SetBuisnessName(BuisnessName);
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Adding Email Name.");
//		pages.getNewCustomerPage().SetEmail(Email);
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Selecting Phone options");
//		pages.getNewCustomerPage().SelectPhoneOption();
//
//	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getNewCustomerPage().ClickOnCreateCustomerbutton();
//
//		// test.log(Status.INFO, "Verifying the Success Message for customer
//		// creation.");
//		Assert.assertTrue(pages.getCustomersPage().verifySucessMessage(), "Success message is not displayed");
//
	}

	@Test(priority=2)
	public void CreateCustomer2() throws Exception {
		// System.out.println("-------------------------------");
		// getting to the url

		
	//	Assert.assertTrue(false);
	//	Listeneres.extenttest.get().log(Status.INFO, "for test automation in part 1");
		pages.getLoginPage().getURL("https://abhiabc.repairshopr.com/users/sign_in");

		
		// Entering login credentials
	//	Listeneres.extenttest.get().log(Status.INFO, "set email and password.");
		pages.getLoginPage().SetEmailAndPassword("teststackshare@gmail.com", "Repairshop@12345");

		Assert.assertTrue(false);
		// Clicking On Login Button
	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Login Button.");
		pages.getLoginPage().ClickOnLoginButton();

	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
		pages.getCustomersPage().clickOnCustomersButton();

	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Add Customer Button.");
		pages.getCustomersPage().ClickOnAddCustomersButton();

	//	Listeneres.extenttest.get().log(Status.INFO, "Adding First Name.");
		pages.getNewCustomerPage().SetFirstName(FirstName);

	//	Listeneres.extenttest.get().log(Status.INFO, "Adding Last Name.");
		pages.getNewCustomerPage().SetLastName(LastName);

	//	Listeneres.extenttest.get().log(Status.INFO, "Adding Buisness Name.");
		pages.getNewCustomerPage().SetBuisnessName(BuisnessName);

	//	Listeneres.extenttest.get().log(Status.INFO, "Adding Email Name.");
		pages.getNewCustomerPage().SetEmail(Email);

	//	Listeneres.extenttest.get().log(Status.INFO, "Selecting Phone options");
		pages.getNewCustomerPage().SelectPhoneOption();

	//	Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
		pages.getNewCustomerPage().ClickOnCreateCustomerbutton();

		// test.log(Status.INFO, "Verifying the Success Message for customer
		// creation.");
		Assert.assertTrue(pages.getCustomersPage().verifySucessMessage(), "Success message is not displayed");

	}
//
//	//@Test
//	public void CreateCustomer3() throws Exception {
//		// System.out.println("-------------------------------");
//		// getting to the url
//		Listeneres.extenttest.get().log(Status.INFO, "for test automation in part 3");
//		pages.getLoginPage().getURL("https://abhiabc.repairshopr.com/users/sign_in");
//
//		// Entering login credentials
//		Listeneres.extenttest.get().log(Status.INFO, "set email and password.");
//		pages.getLoginPage().SetEmailAndPassword("teststackshare@gmail.com", "Repairshop@12345");
//
//		// Clicking On Login Button
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Login Button.");
//		pages.getLoginPage().ClickOnLoginButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getCustomersPage().clickOnCustomersButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Add Customer Button.");
//		pages.getCustomersPage().ClickOnAddCustomersButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding First Name.");
//		pages.getNewCustomerPage().SetFirstName(FirstName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Last Name.");
//		pages.getNewCustomerPage().SetLastName(LastName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Buisness Name.");
//		pages.getNewCustomerPage().SetBuisnessName(BuisnessName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Email Name.");
//		pages.getNewCustomerPage().SetEmail(TestUtils.getUniqueEmail());
//
//		Listeneres.extenttest.get().log(Status.INFO, "Selecting Phone options");
//		pages.getNewCustomerPage().SelectPhoneOption();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getNewCustomerPage().ClickOnCreateCustomerbutton();
//
//		Assert.assertTrue(pages.getCustomersPage().verifySucessMessage(), "Success message is not displayed");
//
////		pages.getCustomersPage().clickOnCustomersButton();
////	
////	Assert.assertTrue(pages.getCustomersPage().VerifyEmailOnCustomerPage(Email), "Success message is not displayed");
////	
//
//	}
//
//	//@Test
//	public void CreateCustomer4() throws Exception {
//		// System.out.println("-------------------------------");
//		// getting to the url
//		Listeneres.extenttest.get().log(Status.INFO, "for test automation in part 4");
//		pages.getLoginPage().getURL("https://abhiabc.repairshopr.com/users/sign_in");
//
//		// Entering login credentials
//		Listeneres.extenttest.get().log(Status.INFO, "set email and password.");
//		pages.getLoginPage().SetEmailAndPassword("teststackshare@gmail.com", "Repairshop@12345");
//
//		// Clicking On Login Button
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Login Button.");
//		pages.getLoginPage().ClickOnLoginButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getCustomersPage().clickOnCustomersButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Add Customer Button.");
//		pages.getCustomersPage().ClickOnAddCustomersButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding First Name.");
//		pages.getNewCustomerPage().SetFirstName(FirstName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Last Name.");
//		pages.getNewCustomerPage().SetLastName(LastName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Buisness Name.");
//		pages.getNewCustomerPage().SetBuisnessName(BuisnessName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Email Name.");
//		pages.getNewCustomerPage().SetEmail(TestUtils.getUniqueEmail());
//
//		Listeneres.extenttest.get().log(Status.INFO, "Selecting Phone options");
//		pages.getNewCustomerPage().SelectPhoneOption();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getNewCustomerPage().ClickOnCreateCustomerbutton();
//
//		Assert.assertTrue(pages.getCustomersPage().verifySucessMessage(), "Success message is not displayed");
//
////		pages.getCustomersPage().clickOnCustomersButton();
////	
////	Assert.assertTrue(pages.getCustomersPage().VerifyEmailOnCustomerPage(Email), "Success message is not displayed");
////	
//
//	}
//
////	@Test
//	public void CreateCustomer5() throws Exception {
//		// System.out.println("-------------------------------");
//		// getting to the url
//		Listeneres.extenttest.get().log(Status.INFO, "for test automation in part 5");
//		pages.getLoginPage().getURL("https://abhiabc.repairshopr.com/users/sign_in");
//
//		// Entering login credentials
//		Listeneres.extenttest.get().log(Status.INFO, "set email and password.");
//		pages.getLoginPage().SetEmailAndPassword("teststackshare@gmail.com", "Repairshop@12345");
//
//		// Clicking On Login Button
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Login Button.");
//		pages.getLoginPage().ClickOnLoginButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getCustomersPage().clickOnCustomersButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Add Customer Button.");
//		pages.getCustomersPage().ClickOnAddCustomersButton();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding First Name.");
//		pages.getNewCustomerPage().SetFirstName(FirstName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Last Name.");
//		pages.getNewCustomerPage().SetLastName(LastName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Buisness Name.");
//		pages.getNewCustomerPage().SetBuisnessName(BuisnessName);
//
//		Listeneres.extenttest.get().log(Status.INFO, "Adding Email Name.");
//		pages.getNewCustomerPage().SetEmail(TestUtils.getUniqueEmail());
//
//		Listeneres.extenttest.get().log(Status.INFO, "Selecting Phone options");
//		pages.getNewCustomerPage().SelectPhoneOption();
//
//		Listeneres.extenttest.get().log(Status.INFO, "Clicking On Customer tab.");
//		pages.getNewCustomerPage().ClickOnCreateCustomerbutton();
//
//		Assert.assertTrue(pages.getCustomersPage().verifySucessMessage(), "Success message is not displayed");
//
////		pages.getCustomersPage().clickOnCustomersButton();
////	
////	Assert.assertTrue(pages.getCustomersPage().VerifyEmailOnCustomerPage(Email), "Success message is not displayed");
////	
//
//	}

}