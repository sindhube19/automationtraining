package com.automationtraining.utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.automationtraining.basetest.Basetest;

public class Natureofinjury extends Basetest{
	public static void injury() throws InterruptedException {
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("searchFrame");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"lksrch\"]")).sendKeys(" Mental Disorder");
        driver.findElement(By.name("go")).click();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("resultsFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a")).click();
		driver.switchTo().window(parentWindow);
		WebElement dateBox = driver.findElement(By.id("j_id0:j_id5:j_id9:j_id155:j_id159:whatsus"));
	    dateBox.sendKeys(Keys.TAB);
	}
}