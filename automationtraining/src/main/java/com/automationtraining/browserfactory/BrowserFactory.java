
package com.automationtraining.browserfactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.automationtraining.constant.ConstantFile;


/**
 * @author Sindhuja Ethiraj
 *
 */

public class BrowserFactory{
	public static WebDriver driver;


	public static WebDriver getNewdriver(String browser) {

		switch(browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", ConstantFile.driverchrome);
			driver = new ChromeDriver();
		
			
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", ConstantFile.driverfirefox);
			driver = new FirefoxDriver();
		break;
		
		}
		return driver;
}
	
	
}

