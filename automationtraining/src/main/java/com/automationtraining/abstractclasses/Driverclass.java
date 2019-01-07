/**
 * 
 */
package com.automationtraining.abstractclasses;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import com.automationtraining.utilities.TestUtils;

/**
 * @author Sindhuja Ethiraj
 *
 * 05-Dec-2018
 */
public abstract class Driverclass  {
	protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;
    /**
     * 
     */
    public static int lineno =0;
    /**
     * 
     */
    public static String classname = Thread.currentThread().getStackTrace()[1].getClassName().toString();
   
    /**
     * @param driver
     */
    public Driverclass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    /**
     * @param lineno1
     * @param classname1
     */
    public static void SetExceptionDetails(int lineno1, String classname1) {
        lineno = lineno1;
        classname = classname1;
    }
    
    
 

}
