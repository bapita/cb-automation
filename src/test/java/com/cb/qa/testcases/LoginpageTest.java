package com.cb.qa.testcases;

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
	}
	
}
