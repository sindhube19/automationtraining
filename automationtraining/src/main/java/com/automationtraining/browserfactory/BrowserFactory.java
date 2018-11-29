
package com.automationtraining.browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BrowserFactory {
	public static WebDriver driver;

@BeforeMethod	
public void browserOpen() {
driver = new ChromeDriver();

	
}

@AfterMethod
public void browserClose() {
	//driver.close();
}
}
