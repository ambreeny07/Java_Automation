package com.test.suite.testSteps;

import com.ascm.pages.LaunchApplication;
import com.ascm.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPage loginPage;
	LaunchApplication launchApplication;

	@Step
	public void launchApplicationStep() {
		launchApplication.launchApplication();
	}
	@Step
	public void goToLoginPage() {
		launchApplication.goToLoginPage();
	}
	
	
	@Step
	public void clickOnCookieStep() {
	loginPage.clickOnCookie();
	}

	@Step
	public void clickLoginStep() {
		loginPage.clickLogin();
	}

	@Step
	public void enterUserNameStep(String value) {
		loginPage.enterUserName(value);
	}

	@Step
	public void enterPasswordStep(String value) {
		loginPage.enterPassword(value);
	}

	@Step
	public void clickSubmitButtonStep() {
		loginPage.clickSubmitButton();
	}

	@Step
	public void invalidLoginStep(String expectedText) {
		loginPage.invalidLogin(expectedText);
	}

	@Step
	public void requiredUserNameStep(String expectedText) {
		loginPage.requiredUserName(expectedText);
	}

	@Step
	public void requiredPasswordStep(String expectedText) {
		loginPage.requiredPassword(expectedText);
	}
	
	@Step
	public void enterIncorrectUserNameStep(String value) {
		loginPage.enterIncorrectUserName(value);
	}

	@Step
	public void enterIncorrectPasswordStep(String value) {
		loginPage.enterIncorrectPassword(value);
	}
}
