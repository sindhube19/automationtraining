/**
 * 
 */
package com.automationtraining.abstractclasses;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

/**
 * @author Sindhuja Ethiraj
 *
 * 05-Dec-2018
 */
public class Driverclass {
	protected WebDriver driver;

	//public Driverclass(WebDriver driver) 
	public void getElementvalue(WebDriver driver) throws InvalidFormatException, IOException {
	//	PageFactory.initElements(driver, Driverclass.class);
		/*this.driver=driver;
		Driverclass getElementValues = PageFactory.initElements(driver,Driverclass.class);*/
		// Signin sign = PageFactory.initElements(driver, Signin.class);
		//System.out.println("driverclass"+getElementValues);
		
	}
}
