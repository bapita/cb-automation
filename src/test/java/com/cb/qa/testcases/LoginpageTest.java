package com.cb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cb.qa.base.TestBase;
import com.cb.qa.pages.DashboardPage;
import com.cb.qa.pages.LoginPage;

public class LoginpageTest extends TestBase {

	// Objects of required pages for testing
	LoginPage loginpage;
	DashboardPage dashboardpage;

	// Defining constructor of the class
	public LoginpageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}

//////////////writing the test cases below//////////
	
	@Test(priority = 1)
	public void loginTest() {
		dashboardpage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
