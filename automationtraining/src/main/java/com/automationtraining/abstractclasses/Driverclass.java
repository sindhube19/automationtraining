/**
 * 
 */
package com.automationtraining.abstractclasses;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Sindhuja Ethiraj
 *
 * 05-Dec-2018
 */
public abstract class Driverclass  {
	protected  WebDriver driver;

	public Driverclass(WebDriver driver) 
	{
		this.driver=driver;
 PageFactory.initElements(driver,this);
 
	
	}
	}
