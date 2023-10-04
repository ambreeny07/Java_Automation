package com.ascm.pages;

import org.openqa.selenium.WebDriver;
import com.ascm.util.SeleniumHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends SeleniumHelper
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[contains(@class,'header-secondary-nav-item-icon--user')]//a")
	WebElementFacade loginButton;

	@FindBy(id = "Username")
	WebElementFacade userName;

	@FindBy(id = "Password")
	WebElementFacade password;

	@FindBy(xpath = "//*[@type='submit']")
	WebElementFacade submitButton;

	@FindBy(xpath = "//*[contains(@class,'validation-summary-errors')]//li")
	WebElementFacade invalidLogin;

	@FindBy(id = "Username-error")
	WebElementFacade invalidUserName;

	@FindBy(id = "Password-error")
	WebElementFacade invalidPassword;

	@FindBy(xpath = "//button[text()='OK']")
	WebElementFacade clickOnCookie;

	// Below are methods for login page

	public void clickOnCookie() {
		try {
			jsClick(clickOnCookie);
		}catch (Exception e) {
			try {
				Waits.wait5Second();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
			}
		}
		
		try {
			jsClick(clickOnCookie);
		}catch (Exception e) {
			try {
				Waits.wait5Second();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
			}
		}
		
	}

	public void clickLogin() {
		jsClick(loginButton);
	}

	public void enterUserName(String value) {
		typeInto(userName, value);
	}

	public void enterPassword(String value) {
		typeInto(password, value);
	}

	public void clickSubmitButton() {
		click(submitButton);
	}

	public void invalidLogin(String expectedText) {
		verifyText(invalidLogin, expectedText);
	}

	public void requiredUserName(String expectedText) {
		verifyText(invalidUserName, expectedText);
	}

	public void requiredPassword(String expectedText) {
		verifyText(invalidPassword, expectedText);
	}
	
	public void enterIncorrectUserName(String value) {
		typeInto(userName, value);
	}

	public void enterIncorrectPassword(String value) {
		typeInto(password, value);
	}

}