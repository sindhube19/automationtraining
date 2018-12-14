package com.automationtraining.ExtentReportListener;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.automationtraining.constant.ConstantFile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import java.io.IOException;

import java.io.File;


public class ReportGenerator 
{
	ExtentTest parentTest;
	ExtentTest childTest;
	private static ExtentReports reporter=ExtentReportFactory.getReporter();
public ReportGenerator (String methodName,String author) {
	parentreport(methodName,author);
}
public void parentreport(String methodName,String author) {
	parentTest=reporter.createTest(methodName+"_");
	parentTest.assignAuthor(author);
	parentTest.assignCategory("Automation Advance Training");
}
	
		
	

public void childReport(String methodName) 
{        
	childTest = parentTest.createNode(methodName);    
	childTest.log(Status.PASS, methodName);     
	}

    public void flush(){ 
    	reporter.flush();    
    	}            
    public void logScreenshot(WebDriver screenDriver, String testCaseName, String res, Exception e) throws Exception{      
    	try{       
    		File file  = ((TakesScreenshot)screenDriver).getScreenshotAs(OutputType.FILE);   
    		File dir = new File(ConstantFile.SCREENSHOTPATH+testCaseName);          
    		dir.mkdirs();                
    		String workspace =     ((new File(".").getAbsolutePath()).replace("\\", "/")).replace(".", "");   
    		String fileName= workspace+ConstantFile.SCREENSHOTPATH+testCaseName+"/"+testCaseName+".jpg";        
    		FileUtils.copyFile(file, new File(fileName));          
    		ExtentTest logger = this.childTest;        
    		logger.fail(e);         
    		logger.info("Attached screen shot").addScreenCaptureFromPath("screenshot/"+testCaseName+"/"+testCaseName+".jpg");                      }         
    	catch (Exception ce) {       
    		ce.printStackTrace();          
    		throw ce;     
    		}             }         
    public void logSkipTest(WebDriver screenDriver, String testCaseName, String res) throws IOException {        
    	File file  = ((TakesScreenshot)screenDriver).getScreenshotAs(OutputType.FILE);         
    	File dir = new File(ConstantFile.SCREENSHOTPATH+testCaseName);         
    	dir.mkdirs();        
    	String workspace =     ((new File(".").getAbsolutePath()).replace("\\", "/")).replace(".", "");   
    	String fileName= workspace+ConstantFile.SCREENSHOTPATH+testCaseName+"/"+testCaseName+".jpg";  
    	FileUtils.copyFile(file, new File(fileName));     
    	ExtentTest logger = this.childTest;        
    	logger.fail("Attached screen shot").addScreenCaptureFromPath("screenshot/"+testCaseName+"/"+testCaseName+".jpg");     
    	}
    
    		
}