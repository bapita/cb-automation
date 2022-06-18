package com.cb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cb.qa.base.TestBase;

public class StaffPage extends TestBase {

	// Creating Page libraries
	@FindBy(xpath = "//h1[class='title']")
	WebElement staffListTitle;

	@FindBy(xpath = "//a[class='title__add']")
	WebElement addButton;

	// constructor
	public StaffPage() {
		PageFactory.initElements(driver, this);
	}

	// Action methods

	public String verifyStaffPageTitle() {
		return driver.getTitle();
	}

	public String verifyStaffListName() {
		return staffListTitle.getText();
	}

	public CreateStaffPage clickAddButton() {
		addButton.click();
		return new CreateStaffPage();
	}

}
