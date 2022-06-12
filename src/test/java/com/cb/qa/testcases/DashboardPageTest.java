package com.cb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cb.qa.base.TestBase;
import com.cb.qa.pages.DashboardPage;
import com.cb.qa.pages.LoginPage;

public class DashboardPageTest extends TestBase{
	
	LoginPage loginpage;
	DashboardPage dashboardpage; 
	
	public DashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		dashboardpage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	// Writing the test cases here 
	@Test(priority =1)
	public void selectCompanyNameTest() {
		dashboardpage.selectCompany();
	}
}
