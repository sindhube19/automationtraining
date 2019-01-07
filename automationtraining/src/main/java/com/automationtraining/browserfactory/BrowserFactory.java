
package com.automationtraining.browserfactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.automationtraining.constant.ConstantFile;
import com.automationtraining.headlessbrowser.HeadlessBrowser;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BrowserFactory extends HeadlessBrowser{
	public static WebDriver driver;


	public static WebDriver getNewdriver(String browser) {

		switch(browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", ConstantFile.driverchrome);
			driver = HeadlessBrowser.headLess();
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", ConstantFile.driverfirefox);
		}
		return driver;
}
}
