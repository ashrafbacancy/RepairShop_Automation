package com.Repairshop.pages;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  BasePage {
	
	protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	PageCollection pages;
	public BasePage(ThreadLocal<WebDriver> driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement waitforPresenceOFElement(By locator)
	{
		System.out.println();
		WebElement firstResult = new WebDriverWait(driver.get(),60)
		        .until(ExpectedConditions.presenceOfElementLocated(locator));
		return firstResult;
		
	}
	
	
	public WebElement waitforPresenceOFElementUntilCLickable(By locator)
	{
		//System.out.println();
		WebElement firstResult = new WebDriverWait(driver.get(),60)
		        .until(ExpectedConditions.elementToBeClickable(locator));
		return firstResult;
		
	}
	
	
	
	public void clickandwait(By locator)
	{
		WebElement el=waitforPresenceOFElementUntilCLickable(locator);
		el.click();
		
	}
	
	public void ClickUsingActionClass(By locator)
	{
		WebElement el=waitforPresenceOFElementUntilCLickable(locator);
		new Actions(driver.get()).click(el).build().perform();
		System.out.println("element has been clicked");
	}
	
	public void SeTText(By locator, String keysToSend)
	{
		WebElement el=waitforPresenceOFElement(locator);
		el.sendKeys(keysToSend);
	}
	
	
	public  void switchTab(int i) {
		ArrayList<String> tabs = new ArrayList<String>(driver.get().getWindowHandles());
			
		driver.get().switchTo().window(tabs.get(i));
	}
	
	
	public void waitforelementtoBecomePresent(By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver.get(),60);
		WebElement el=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
	
	
	public void waitforelementtoBecomeclickable(By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver.get(),60);
		WebElement el=wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		
	}
	
	
	public boolean waitforelementtoBecomeVisible(By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver.get(),60);
		WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return el.isDisplayed();
		
	}
	
	
	
	
	public void SetText(By locator,String text)
	{
		waitforelementtoBecomePresent(locator);
		waitforelementtoBecomeclickable(locator);
		
		driver.get().findElement(locator).sendKeys(text);
	}
	
	
	
	public void Clickandwait(By locator)
	{
		waitforelementtoBecomePresent(locator);
		waitforelementtoBecomeclickable(locator);
		
		driver.get().findElement(locator).click();
	}
	
	
	public void SelectFromDropDown(Consumer<Select> consumer, By element)
	{
	
		Select select=new Select(driver.get().findElement(element));
		consumer.accept(select);
		
		
		
	}
	
	
	public void PerFormActionUsingActionsClass(Consumer<Actions>consumer)
	{
	
		consumer.accept(new Actions(driver.get()));
	}
	
	public String getAttribute(By locator,String NameOfAttribute)
	{
		return driver.get().findElement(locator).getAttribute(NameOfAttribute);
		
	}
	

}
