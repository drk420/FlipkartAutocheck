package com.Flipkart.Utility;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Flipkart.TestBase.TestBase;



public class ListenerSetUp extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(result.getName()+"Test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger.info(result.getName()+"Test case is completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	logger.info(result.getName()+"Test case is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	logger.info(result.getName()+"Test case is skipped");
	}





	
	
	
	
	
	
	
	
	
	
}
