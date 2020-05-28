package com.hybridFramework.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hybridFramework.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		
		logger.info("URL is opened");
		//create object of LoginPage object class
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage123")){
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		else{
			
			captureScreenshot(driver,"loginTest");
			Assert.assertFalse(false);
			logger.info("Login Test failed");
		}
		
	}
}
