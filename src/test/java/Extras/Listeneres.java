package Extras;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Repairshop.tests.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeneres  implements ITestListener{


	static ExtentReports extent =ReportGenerator.ExtentReportGenerator();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
	System.out.println("---------------------------------------------------------------------------On Start test");
	ReportGenerator.setExtentReport(extent.createTest(result.getMethod().getMethodName()));
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ReportGenerator.getExtentReport().log(Status.PASS, "Test Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ThreadLocal<WebDriver> driver=null;
		WebDriver Driver=null;
		// TODO Auto-generated method stub
		ReportGenerator.getExtentReport().fail(result.getThrowable());
		try {
			driver=(ThreadLocal<WebDriver>)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			
		
			
			System.out.println("value of driver -=========================================>"+driver.get());
////			
////		
		}
		 catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
////		
		try {
			
			ReportGenerator.getExtentReport().addScreenCaptureFromPath(BaseTest.TakeScreenshot(result.getMethod().getMethodName(),driver.get()),result.getMethod().getMethodName());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	
		//extenttest.remove();
		extent.flush();
		
	}

}
