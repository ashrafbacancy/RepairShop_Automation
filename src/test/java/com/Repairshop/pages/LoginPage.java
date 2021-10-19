package com.Repairshop.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By UserName=By.id("user_email");
	
	By Passwordfield=By.id("user_password");
	
	By LoginButton=By.xpath("//input[@value='Sign in']");
	
	By CustomerButton=By.xpath("//ul[@class='mainnav']/li[1]");
	
	By searchButton=By.xpath("//button[@class='L0Z3Pu']//child::*[position()='2']");
	
	By BooksTab=By.xpath("//*[@class='_1kidPb']//span[7]");
	
	By BookSection=By.xpath("//a[@title='Books']");
	
	By firsttBook=By.xpath("//*//div[@class='_13oc-S'][1]//div[1]");
	
	By BuyNowButton=By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']");
	
	By DeliverHereButton=By.xpath("//button[text()='Deliver Here']");
	
	By ListOfDesiredElements=By.className("_4rR01T");
	
	
	public void getURL(String URL)
	{
		driver.get().get(URL);
		waitforPresenceOFElement(UserName);
	}
	
	
	public void SetEmailAndPassword(String Phone,String Password)
	{
		SeTText(UserName, Phone);
		SeTText(Passwordfield, Password);
		
	}
	
	public void ClickOnLoginButton() throws InterruptedException
	{
		clickandwait(LoginButton);
		
		waitforPresenceOFElement(CustomerButton);
	}
	
	
	
	
	
	
	

}