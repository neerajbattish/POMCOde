package com.facebkpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Driverpackage.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="email")
	WebElement uname;
	
	@FindBy(id="pass")
	WebElement userpass;
	
	@FindBy(xpath="//input[@value='Log In'")
	WebElement loginButton;
	
	
	public void verifylogin()
	{
		uname.sendKeys("Admin");
		userpass.sendKeys("Admin");
		loginButton.click();
	}


	public String verifyTitle() 
	{
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
