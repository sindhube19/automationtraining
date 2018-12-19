/**
 * 
 */
package com.automationtraining.pageobject;

import org.openqa.selenium.WebDriver;

import com.automationtraining.abstractclasses.Driverclass;

/**
 * @author Sindhuja Ethiraj
 *
 * 12-Dec-2018
 */
public class Loginpages extends Driverclass {

	/**
	 * @param driver
	 */
	public Loginpages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param driver
	 */
	public Form101Page formUrl101(){
		return new Form101Page(driver);
	} 
	
	


}
