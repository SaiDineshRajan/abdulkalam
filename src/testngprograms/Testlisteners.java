package testngprograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Testlisteners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	   Reporter.log("Test started");	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

Reporter.log("test success");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test failed");

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
	public void onStart(ITestContext resulis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		Reporter.log("Test finished");
		
	}
   
}
