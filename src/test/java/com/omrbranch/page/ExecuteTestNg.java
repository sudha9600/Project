package com.omrbranch.page;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworkday2.Baseclass;

public class ExecuteTestNg extends Baseclass{

	@BeforeClass
	public void browserLaunch() {
	}
	
	public void enterApplicationsUrl(String Url) {
	}
	@AfterClass
	public void closeDriver()
	{
		closeAllWindow();
	}
	
	@BeforeMethod
	public void beforeScreenshot() throws IOException
	{
	 screenshot(new File("C:\\Users\\My PC\\Downloads\\Testng"+System.currentTimeMillis()+"before.png"));
	}
	@AfterMethod
	public void afterScreenshot() throws IOException
	{
	 screenshot(new File("C:\\Users\\My PC\\Downloads\\Testng"+System.currentTimeMillis()+"after.png"));
	}
	@Test
	public void LoginPage() 
	{
		LoginPage page=new LoginPage();
		page.login(getApplicationUrl(), getApplicationTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
