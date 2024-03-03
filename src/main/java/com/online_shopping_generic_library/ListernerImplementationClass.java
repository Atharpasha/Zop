package com.online_shopping_generic_library;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernerImplementationClass implements ITestListener   {
	public ExtentReports report;
	public ExtentTest test;

	public void onTestStart(ITestResult result) {	
		String MethodName=result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"----"+"TestScript Execuation Starts");
	}
	public void onTestSuccess(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"--passed");
		Reporter.log(MethodName+"---"+"Test Script passed");
		
	}
	public void onTestFailure(ITestResult result) {
		
		try {
			WebDriverUtility wLib=new WebDriverUtility();
			String MethodName=result.getMethod().getMethodName();
			JavaUtility Jlib=new JavaUtility();
			String FailedTS=MethodName+Jlib.getSysDateFormat();
		    BaseClass bc=new BaseClass();
			 String FailedTestScript=wLib.takeScreenShot(bc.sdriver)+FailedTS;
			test.addScreenCaptureFromPath(FailedTestScript);
		} catch (IOException e) {
			e.printStackTrace();
		}
	String MethodName=result.getMethod().getMethodName();	
	test.log(Status.FAIL,MethodName+"--Testscript failed");
	test.log(Status.FAIL,result.getThrowable());
	Reporter.log(MethodName+"TestScript Failed");
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"---TestScript skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(MethodName+"---TestScript is Skipped");
		
	}

	public void onStart(ITestContext context) {
		//create html report 
	ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/Report.html");	
	htmlreport.config().setDocumentTitle("E-commerce");
	htmlreport.config().setTheme(Theme.STANDARD);
	htmlreport.config().setReportName("Online-shopping");
	
	report=new ExtentReports();
	report.attachReporter(htmlreport);
	report.setSystemInfo("OS","WINDOWS");
	report.setSystemInfo("Base-browser", "chrome");
	report.setSystemInfo("Base-Url","http://localhost:8888/");
	report.setSystemInfo("Reporter name","Athar");
		
	}

	public void onFinish(ITestContext context) {
		//consolidate report
		report.flush();
		
	}

}
