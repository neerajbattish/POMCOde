package com.pomexample.Testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Driverpackage.BaseClass;
import com.facebkpages.LoginPage;

public class LoginPageTestCase extends BaseClass {

	LoginPage loginPage;
	public LoginPageTestCase()
	{
		super();
	
	}
	
	@BeforeSuite
	public void setup()
	{
		
		initialize();
		loginPage=new LoginPage();
		
	}
	
	@Test
	public void verifytitle()
	{
		String title=loginPage.verifyTitle();
		AssertJUnit.assertEquals(title, "Facebook...");
	}
	
	@Test
	public void verifyLogintest()
	{
		loginPage.verifylogin();
		
	}
	

	
	
}
