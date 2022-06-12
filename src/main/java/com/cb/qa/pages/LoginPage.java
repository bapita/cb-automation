package com.cb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cb.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Creating object repository
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/section/div/div/form/div[2]/button")
	WebElement loginBtn;

	// Initializing the Page Objects with this(current class objects)
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	// login method
		public DashboardPage login(String en, String pwd) { 
			 email.sendKeys(en); 
			 password.sendKeys(pwd);
			 loginBtn.click(); 
			 
			 // after clicking on login button, it is moving to home page. So DashboardPage is the return type of login function
			 return new DashboardPage(); 
			// returning HomePage class object. Instead of void return type, the DashboardPage class is to be mentioned
		}

}
