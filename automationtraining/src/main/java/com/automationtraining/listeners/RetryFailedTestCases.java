package com.automationtraining.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @author Sindhuja Ethiraj
 *
 * 17-Dec-2018
 */




public class RetryFailedTestCases implements  IRetryAnalyzer{

//	@SuppressWarnings({ "rawtypes", "javadoc" })
	
	private int retryCnt = 0;
    //You could mentioned maxRetryCnt (Maximium Retry Count) as per your requirement. Here I took 2, If any failed testcases then it runs two times
    private int maxRetryCnt = 2;
    
    //This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
  //  @SuppressWarnings("javadoc")
	public boolean retry(ITestResult result) {
        if (retryCnt < maxRetryCnt) {
            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
            retryCnt++;
            return true;
        }
        return false;
    }
	
}