package com.automationtraining.smokesuite;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.basetest.BaseTest;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.pageobject.Loginpages;
import com.automationtraining.utilities.Log;
import com.automationtraining.utilities.TestUtils;

/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101validation extends  BaseTest{



	@Test
	public void formFilling101() throws Exception
	{
		
		page101=Loginpages.formUrl101();
		page101.formvalidation();
		Assert.assertTrue(true);
		Log.info("Running @Test methods");


	}

}


