package com.automationtraining.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automationtraining.browserfactory.Browserfactory;

public class Pageobject extends Browserfactory {
	@FindBy(how=How.ID, using="username")
	WebElement username;
	@FindBy(how=How.ID, using="password")
    WebElement password;
	@FindBy(how=How.ID, using="Login")
	WebElement Login;
	
	@Test
	public static void leadcreate()
	{
	Pageobject leadcrt = PageFactory.initElements(driver, Pageobject.class);
		leadcrt.username.sendKeys("sindhuja.e@mstsolutions.com");
		leadcrt.password.sendKeys("S!ndhuja12");
		leadcrt.Login.click();
		}
 }