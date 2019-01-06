/**
 * 
 */
package com.automationtraining.smokesuite;

import org.testng.annotations.Test;

import com.automationtraining.basetest.BaseTest;

/**
 * @author Sindhuja Ethiraj
 *
 * 03-Jan-2019
 */
public class Form101verification extends  BaseTest{
	
	@Test
	public void formFilling101() throws Exception
	{
		page102=Loginpages.formFilling101();
		page102.formverification();
}
}
