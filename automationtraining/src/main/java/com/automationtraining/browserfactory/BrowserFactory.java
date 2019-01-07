
package com.automationtraining.browserfactory;

import java.security.InvalidParameterException;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.automationtraining.constant.ConstantFile;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BrowserFactory {
	public static WebDriver driver;


	/*public static WebDriver getNewdriver(String browser) {

		switch(browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", ConstantFile.driverchrome);
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", ConstantFile.driverfirefox);
		}
		return driver;
}*/

	public static WebDriver getNewdriver(String browser) {
		
		switch(browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver",ConstantFile.driverchrome);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			
		}
		return driver;
	
	}

	public static WebDriver closeDriver() {
		driver.close();

		return driver;

	}
}
