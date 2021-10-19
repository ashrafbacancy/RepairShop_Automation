package com.Repairshop.tests;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Repairshop.pages.PageCollection;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Extras.Listeneres;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	
	//static WebDriver dr;
	public  ThreadLocal<WebDriver>driver=new ThreadLocal<WebDriver>();
	
	public PageCollection pages;
	

	//public  WebDriver Currentdriver;
	
	
	
	public ExtentTest test;
	
	//public  String pathToChromeDriver=System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
	
	
	@BeforeMethod
	public void SetUp()
	{
		 if(Objects.isNull(driver.get())) {
			 System.out.println("in setup");
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/" + "Resources" + "/" + "chromedriver.exe");

		ChromeOptions options;
	//	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setHeadless(false);
	//	Currentdriver=new ChromeDriver(options);
		driver.set(new ChromeDriver(options));	
		
		System.out.println(driver.get());
		
		driver.get().manage().window().maximize();

	}
		
		
	}
	

	@BeforeMethod(alwaysRun = true)
	public void initialie()
	{
		System.out.println("Initialized page collection");
		pages=new PageCollection(driver);
		
	}
	
	
	
	
	@AfterMethod
	public void TearDown(ITestResult res)
	{
		System.out.println("inside teardown");
		
		if(Objects.nonNull(driver.get()))
		{
			driver.get().close();
			driver.get().quit();
			driver.remove();
	}
		
		
	
		
		
		
		}
	
	
	
	
	public static String TakeScreenshot(String TestName,WebDriver driver) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile=new File(System.getProperty("user.dir") + "\\Report\\"+TestName+".png");
		System.out.println("-------------------------------------------------------------------->>>"+DestFile);
		FileUtils.copyFile(SrcFile, DestFile);
		
		return System.getProperty("user.dir") + "\\Report\\"+TestName+".png";
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}