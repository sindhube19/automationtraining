package com.automationtraining.utilities;

import java.util.Iterator;
import java.util.Set;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationtraining.basetest.BaseTest;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class SeleniumUtils  {
	public static  void lookupWindowhandler(String data,WebDriver driver) throws InterruptedException {
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("searchFrame");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"lksrch\"]")).sendKeys(data);
		driver.findElement(By.name("go")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("resultsFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a")).click();
		driver.switchTo().window(parentWindow);

	}
	public static void highLightelements(WebElement Element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//use executeScript() method and pass the arguments 
		//Here i pass values based on css style. Yellow background color with solid red color border. 
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", Element);

	}

	public static void FailedhighLightelements(WebElement Element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//use executeScript() method and pass the arguments 
		//Here i pass values based on css style. Yellow background color with solid red color border. 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');", Element);

	}

	public static void switchToNewTab(WebDriver driver, String url) {

		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
		driver.get(url);
	} 


}
