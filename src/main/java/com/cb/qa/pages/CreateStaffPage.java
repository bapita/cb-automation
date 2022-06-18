package com.cb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cb.qa.base.TestBase;

public class CreateStaffPage extends TestBase{
	
	// Creating Page objects 
	@FindBy(xpath="h1[class='title']")
	WebElement pageName;
	
	@FindBy(name="employee_id")
	WebElement employeeId;
	
	@FindBy(name="role")
	WebElement systemRoleSelect;
	
	@FindBy(name="title")
	WebElement titleSelect;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="gender")
	WebElement genderSelect;

	@FindBy(id="location_id")
	WebElement locationSelect;
	
	@FindBy(id="main_loc")
	WebElement mainLocationSelect;
	
	@FindBy(name="driver")
	WebElement driverCheck;
	
	@FindBy(name="job_title")
	WebElement jobTitle;
	
	@FindBy(name="holiday_type")
	WebElement holidayTypeSelect;
	
	@FindBy(name="user_status")
	WebElement userStatusSelect;
	
	@FindBy(name="position_status")
	WebElement positionStatus;
	
	
	@FindBy(name="email")
	WebElement emailType;

	@FindBy(name="start_date")
	WebElement startDate;
	
	@FindBy(name="photo")
	WebElement choosePhoto;
	
	@FindBy(name="photo_agreement")
	WebElement photoAgreementCheck;
	
	@FindBy(name="is_medical_alert")
	WebElement medicalAlertCheck;
	
	@FindBy(id="tinymce")
	WebElement writeMedicalAlert;
	
	@FindBy(id="staffSubBtn")
	WebElement staffSubmitBtn;
	
	
	// Constructor
	public CreateStaffPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// Action methods 
	public void submitCreateStaffForm() {
		
	}

}
