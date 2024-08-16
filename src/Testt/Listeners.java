package Testt;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	 @Override		
	    public void onFinish(ITestContext Result) {					
	        // TODO Auto-generated method stub
		 // at last this method will print  once all test execution done 
	        System.out.println("All test pass");
	    }		

	    @Override		 
	    public void onStart(ITestContext Result) {					
	        // TODO Auto-generated method stub
	    	// before any test case or before suit this method will execute 
	        System.out.println("All test started");
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult Result) {					
	        // TODO Auto-generated method stub
	    	// screenshot code
	    	// response if API code failed
	    	// getName() method will print actual failed test menthod name 
	        System.out.println("test is failed" + Result.getName());	
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        System.out.println(" test is skipped");
	    }		

	    @Override		
	    public void onTestStart(ITestResult Result) {					
	        // TODO Auto-generated method stub	
	        System.out.println(" actual test execution started");
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult Result) {					
	        // TODO Auto-generated method stub	
	        System.out.println(" test executed sucssefully");
	        		
	    }		

}
