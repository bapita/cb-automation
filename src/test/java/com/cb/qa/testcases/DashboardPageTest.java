package com.cb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cb.qa.base.TestBase;
import com.cb.qa.pages.DashboardPage;
import com.cb.qa.pages.LoginPage;
import com.cb.qa.pages.StaffPage;

public class DashboardPageTest extends TestBase{
	
	LoginPage loginpage;
	DashboardPage dashboardpage; 
	StaffPage staffpage;
	
	public DashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		staffpage = new StaffPage();
		dashboardpage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	// Writing the test cases here 
	@Test(priority = 1)
	public void selectCompanyNameTest() {
		dashboardpage.selectCompany();
	}
	
	@Test(priority = 2)
	public void visitStaffPageTest() {
		staffpage = dashboardpage.clickStaffLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
