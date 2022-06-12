package com.cb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cb.qa.base.TestBase;

public class DashboardPage extends TestBase {

	// Creating Page Libraries or page objects
	@FindBy(xpath = "//h1[contains(text(),'Sue')]")
	WebElement platformName;

	@FindBy(name = "company")
	WebElement selectCompany;

	// Initializing page objects
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	// Defining actions one by one
	public void selectCompany() {
		Select dropdown = new Select(selectCompany);
		dropdown.getOptions().get(48).click();
//		return new DashboardPage();
	}

}
