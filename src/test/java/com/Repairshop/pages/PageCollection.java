package com.Repairshop.pages;

import org.openqa.selenium.WebDriver;

public class PageCollection {

	ThreadLocal<WebDriver>driver;
	public PageCollection(ThreadLocal<WebDriver> driver) {
		this.driver = driver;
	}

	private LoginPage loginPage;

	private CustomersPage homePage;
	
	private NewCustomerPage newCustomerPage;

	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public CustomersPage getCustomersPage() {

		return (homePage == null) ? homePage = new CustomersPage(driver) : homePage;
	}
	
	public NewCustomerPage getNewCustomerPage() {

		return (newCustomerPage == null) ? newCustomerPage = new NewCustomerPage(driver) : newCustomerPage;
	}

}