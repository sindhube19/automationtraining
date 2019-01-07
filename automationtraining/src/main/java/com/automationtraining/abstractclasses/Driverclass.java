/**
 * 
 */
package com.automationtraining.abstractclasses;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.automationtraining.headlessbrowser.HeadlessBrowser;
import com.automationtraining.utilities.TestUtils;

/**
 * @author Sindhuja Ethiraj
 *
 * 05-Dec-2018
 */
public abstract class Driverclass  {
	protected  WebDriver driver;
	public static int lineno =0;
    public static String classname = Thread.currentThread().getStackTrace()[1].getClassName().toString(); 
	public Driverclass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);


	}
	public static void SetExceptionDetails(int lineno1, String classname1) {
		lineno = lineno1;
		classname = classname1;
	} 
	
	
}
