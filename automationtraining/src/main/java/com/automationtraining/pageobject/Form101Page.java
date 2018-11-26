package com.automationtraining.pageobject;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automationtraining.utilities.SeleniumUtils;

import org.openqa.selenium.support.ui.Select;


public class Form101Page{
	public WebDriver driver;

@Test
public static void log(WebDriver driver) throws InterruptedException
{
/****************************************************EMPLOYEE***************************************************************************/
	
	
	driver.get("https://qadevpro2-azicawc-webforms.cs32.force.com/forms/Webform101_VF");
	/** lastname **/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id15:last\"]")).sendKeys("ethiraj");
	
	/** firstname **/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id18:first\"]")).sendKeys("sindhuja");
	
	/** social security number **/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id23:social\"]")).sendKeys("123456789");
	
	/** DOB **/
	WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id26:birth\"]"));
    dateBox.sendKeys("01191994");
    dateBox.sendKeys(Keys.TAB);
    
    
	
	/** Home address **/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id29:home\"]")).sendKeys("5 Birch Hill Avenue \r\n");
	
	/** City **/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id32:CITY\"]")).sendKeys("Santa Monica");
	
	
    /** State **/
    driver.findElement(By.id("j_id0:j_id5:j_id9:j_id14:j_id35:STATE")).sendKeys("CA");
    
    /** Zip code **/
    driver.findElement(By.id("j_id0:j_id5:j_id9:j_id14:j_id38:ZIPCODE")).sendKeys("90403");
    
    /**Telephone**/
    driver.findElement(By.id("j_id0:j_id5:j_id9:j_id14:j_id41:TELEPHONE")).sendKeys("9094874306");
    
    /**Gender**/
    Select gender = new Select(driver.findElement(By.id("j_id0:j_id5:j_id9:j_id14:j_id44:SEX")));
   // gender.selectByVisibleText("Female");
    gender.selectByIndex(2);
    Thread.sleep(5);
    driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id44:SEX\"]")).sendKeys(Keys.TAB);
    Thread.sleep(10);
    
    /**Marital status**/
    Select maritalstatus = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS\"]")));
    //maritalstatus.selectByVisibleText("Single");
    maritalstatus.selectByIndex(1);
   // driver.findElement(By.xpath("//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS\\\"]")).sendKeys(Keys.TAB);
/***************************************************************EMPLOYER*************************************************************************************/
    
    /** EMPLOYER'S NAME **/
	driver.findElement(By.id("j_id0:j_id5:j_id9:j_id48:j_id49:EMPLOYERNAME")).sendKeys("Sindhuja automation expert");
	
    /**FEIN NUMBER**/
	driver.findElement(By.id("j_id0:j_id5:j_id9:j_id48:j_id52:FEINNUMBER")).sendKeys("121314151");
	
   /**OFFICE ADDRESS**/
	driver.findElement(By.id("j_id0:j_id5:j_id9:j_id48:j_id57:officeadd")).sendKeys("24 Yukon Ave. Avon, IN 46123.");
	
   /**CITY**/
	driver.findElement(By.id("j_id0:j_id5:j_id9:j_id48:j_id60:officecity")).sendKeys("Avon");
	
   /**STATE**/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id48:j_id63:officstate\"]")).sendKeys("IN");
	
   /**ZIPCODE**/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id48:j_id66:officzip\"]")).sendKeys("46123");
	
	/**TELEPHONE**/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id48:j_id69:telephone\"]")).sendKeys("9876342176");
	

/*************************************************************ACCOUNT DETAILS******************************************************************************/
	/**DATE OF INJURY OR ILLNESS**/
	WebElement injury = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id72:j_id73:doi\"]"));
	injury.sendKeys("20042000");
	//injury.sendKeys(Keys.TAB);
	
	/**DATE EMPLOYER NOTIFIED OF INJURY**/
	WebElement notified = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id72:j_id76:empnotif\"]"));
	notified.sendKeys("25082006");
	notified.sendKeys(Keys.TAB);
	
	/**LAST DAY OF WORK AFTER INJURY**/
	WebElement afterinjury = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id72:j_id81:lastday\"]"));
	afterinjury.sendKeys("25082006");
	afterinjury.sendKeys(Keys.TAB);
	
	/**HAS EMPLOYEE RETURNED HOME**/
	WebElement radioBtn = driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id84:0"));
	radioBtn.click();
	
	/**EMPLOYEE OCCUPATION**/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id72:j_id88:empcontri\"]")).sendKeys("46123");

	
	/**EMPLOYEE PREMISES**/
	Select employeepremises = new Select(driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id96:empconpre")));
	employeepremises.selectByVisibleText("Yes");
	employeepremises.selectByIndex(1);
	
	/**WAS THE INJURY OR ILLNESS**/
	driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id109:injurill")).sendKeys("injury");
	
	/**PART OF BODY INJURED**/
	WebElement tab = driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id112:partofbody"));
	tab.sendKeys("injury");
	tab.sendKeys(Keys.TAB);
	
	/**part of body injured table**/
	driver.findElement(By.xpath("//*[@id=\"j_id0:j_id5:j_id9:j_id72:j_id114:partofbodyinjury_lkwgt\"]/img")).click();
	Thread.sleep(5000);
	System.out.println("Hi");
	SeleniumUtils.lookupwindowhandler();
	//driver.switchTo().frame("searchFrame");
	System.out.println("hello");
    Thread.sleep(10);
	
	
	
	
	
	/**FATAL**/
	  Select fatal = new Select(driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id121:fatal")));
	  fatal.selectByVisibleText("Yes");
	  fatal.selectByIndex(1);
	  
	/**EMPLOYEE TREATED IN EMERGENCY ROOM**/
	  Select emp = new Select(driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id126:empemergency")));
	  emp.selectByVisibleText("Yes");
	  emp.selectByIndex(1);
	  
	 /**EMPLOYEE HOSPITALIZED**/
	  Select inpatient = new Select(driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id139:overnight")));
	  inpatient.selectByVisibleText("Yes");
	  inpatient.selectByIndex(1);
	  
	 /**CLAIM DOUBTED**/
	  Select claim = new Select(driver.findElement(By.id("j_id0:j_id5:j_id9:j_id72:j_id152")));
	  claim.selectByVisibleText("Yes");
	  claim.selectByIndex(1);
	  
	  /**PART OF BODY INJURED**/
	  
	  
/*******************************************************************CAUSE OF ACCIDENT***************************************************************/
	  
 
	 /****/ 
	//*[@id="j_id0:j_id5:j_id9:j_id72:j_id81:lastday"]

	/*driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sindhuja.e@mstsolutions.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sindhuja");
	//driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.id("Login")).click();*/
}
}
