package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By UserName=By.xpath("//form//div[@class='IiD88i _351hSN' and position()='1']//input");
	
	By Passwordfield=By.xpath("//form//div[@class='IiD88i _351hSN' and position()='2']//input");
	
	By LoginButton=By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL'][1]");
	
	By searchField=By.name("q");
	
	By searchButton=By.xpath("//button[@class='L0Z3Pu']//child::*[position()='2']");
	
	By BooksTab=By.xpath("//*[@class='_1kidPb']//span[7]");
	
	By BookSection=By.xpath("//a[@title='Books']");
	
	By firsttBook=By.xpath("//*//div[@class='_13oc-S'][1]//div[1]");
	
	By BuyNowButton=By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']");
	
	By DeliverHereButton=By.xpath("//button[text()='Deliver Here']");
	
	By ListOfDesiredElements=By.className("_4rR01T");
	
	
	public void getURL(String URL)
	{
		driver.get(URL);
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
		Thread.sleep(5000);
		
	}
	
	
	
	public void SearchForAnItemAndClickOnDesiredResult (String text,int position) throws InterruptedException
	{
		SeTText(searchField, text);
		Thread.sleep(3000);
		ClickOnDesiredOptions(searchField, position);
	}
	
	
	
	
	
	public void ClickOnDesiredPosition(int position)
	{
			waitforelementtoBecomeVisible(ListOfDesiredElements);
			List<WebElement>list=driver.findElements(ListOfDesiredElements);
			
			list.get(position).click();
			
			
	}
	
	
	
	public void switchdriver()
	{
		switchTab(1);
		
	}
	
	
	
	
	public void ClickOnBuyNow()
	{
		//clickandwait(BuyNowButton);
	
		waitforPresenceOFElementUntilCLickable(BuyNowButton);
		clickandwait(BuyNowButton);
	
	}
	
	
	public void ClickOnesiredElementOfSearchBar(int position)
	{
		By DesiredElement =By.xpath("//ul[@class='col-12-12 _1MRYA1']//li["+position+"]//a");
		waitforelementtoBecomeVisible(DesiredElement);
		Clickandwait(DesiredElement);
	}
	
	
	
	
	public void Clickandwait(By locator)
	{
		waitforelementtoBecomePresent(locator);
		waitforelementtoBecomeclickable(locator);
		
		driver.findElement(locator).click();
	}
	
	
	
	

}