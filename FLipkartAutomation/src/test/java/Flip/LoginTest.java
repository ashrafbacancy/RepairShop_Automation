package Flip;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void CreateOrder() throws Exception
	{
		//getting to the url
		pages.getLoginPage().getURL("https://www.flipkart.com");
		
		
		//Entering login credentials
		pages.getLoginPage().SetEmailAndPassword("8447883807", "a12345678");
	
	
	
		//Clicking On Login Button
		pages.getLoginPage().ClickOnLoginButton();
	
	
	//	Thread.sleep(5000);
		//Searching for the item
		pages.getLoginPage().SearchForAnItemAndClickOnDesiredResult("Iphone 12",2);
	
	
	
		//clicking on desired position
		pages.getLoginPage().ClickOnDesiredPosition(1);
		
		//switching the driver to new window
		pages.getLoginPage().switchdriver();
		
		//clicking on buy now button
		pages.getLoginPage().ClickOnBuyNow();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}