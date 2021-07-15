package Flip;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page.PageCollection;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	public WebDriver driver;
	public PageCollection pages;
	 
	public ChromeOptions options;
	@BeforeTest
	public void SetUp()
	{
		 
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver=new ChromeDriver(options);	
		
		
		
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void initialie()
	{pages=new PageCollection(driver);}
	
	
	
	
	@AfterSuite
	public void TearDown()
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}