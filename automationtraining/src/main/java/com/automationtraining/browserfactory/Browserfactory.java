
package com.automationtraining.browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browserfactory {
	public static WebDriver driver;

@BeforeMethod	
public void browseropen() {
driver = new ChromeDriver();

	
}

@AfterMethod
public void browserclose() {
	//driver.close();
}
}
