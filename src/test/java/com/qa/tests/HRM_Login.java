package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRM_Login {
	
	@Test
	
	public void login()
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mridha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/");
		String actTitle = driver.getTitle();
		String expTitle = "OrangeHRM";
		Assert.assertTrue(actTitle.equals(expTitle));
		//assert.assertFalse(actTitle.equals(expTitle));	
	//	driver.quit();
		
	}

}
