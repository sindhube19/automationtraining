package com.automationtraining.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.utilities.Log;

/**
 * @author Sindhuja Ethiraj
 *
 * 12-Dec-2018
 */
public class Loginpages extends Driverclass {
	
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'Username')]/following::input[1]")
	public
	WebElement lightningusername;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'Password')]/following::input[1]")
	public
	WebElement lightningpassword;
	@FindBy(how=How.XPATH, using=".//form/input[2]")
	public
	WebElement loginbutton;

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
	
	public void login() {
		
		Log.info("Loging into the Lightning Successfully");
		lightningusername.sendKeys("divya.k@mstsolutions.com");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		lightningpassword.sendKeys("welcome123");
		loginbutton.click();
	
	}

	/**
	 * @return
	 */
	public Form101verification formFilling101() {
		// TODO Auto-generated method stub
		return new Form101verification(driver);
	}
	
	


}