package com.Repairshop.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestUtils;

public class CustomersPage extends BasePage {

	public CustomersPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By CustomerButton = By.xpath("//ul[@class='mainnav']/li[1]");

	By AddCustomersButton = By
			.xpath("//div[@class='col-md-5 page-title-adj btn-bar text-right']//a[@href='/customers/new']");

	By AllEmailfield = By.xpath("//b[text()='Email']//following-sibling::a");

	By SuccessMessage = By.xpath("//button[@class='close']//parent::div[@class='alert alert-info']");

	By NextArrowParentElement = By.xpath("//ul[@class='pagination pagination']//li[4]");
	
	By NextArrow=By.className("next");

	public void clickOnCustomersButton() {
		clickandwait(CustomerButton);

	}

	public void ClickOnAddCustomersButton() {
		clickandwait(AddCustomersButton);

	}

	public void waitforTableToAppear() {
		WebDriverWait wait = new WebDriverWait(driver.get(), 60);
		wait.withMessage("waiting for the customer table to appear")
				.until(ExpectedConditions.numberOfElementsToBeMoreThan(AllEmailfield, 1));

	}

	public boolean VerifyEmailOfNewlyCreatedCustomer(String Email) {
		System.out.println("In email verification method");
		List<WebElement> li = driver.get().findElements(AllEmailfield);
		li.forEach(l->System.out.println(l.getText().equalsIgnoreCase(Email)));
		return li.stream().anyMatch(l -> (l.getText()).trim().equalsIgnoreCase(Email.trim()));

	}

	public boolean VerifyEmailOnCustomerPage(String Email) {
		int i=1;
		while(i>0) {
			waitforTableToAppear();
			boolean status=VerifyEmailOfNewlyCreatedCustomer(Email);
			if(status)
			{
				return status;
			}
			
			ClickUsingActionClass(NextArrow);
			if(getAttribute(NextArrowParentElement, "class").contains("disabled"))
			{i=0;}
			
		} 
		return false;
	}

	public boolean verifySucessMessage() {
		return waitforelementtoBecomeVisible(SuccessMessage);

	}

}
