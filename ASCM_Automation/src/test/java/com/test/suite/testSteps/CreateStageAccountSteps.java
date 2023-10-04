package com.test.suite.testSteps;

import com.ascm.pages.CreateStageAccountPage;
import com.ascm.pages.LaunchApplication;
import net.thucydides.core.annotations.Step;

public class CreateStageAccountSteps {
 CreateStageAccountPage createStageAcount;
	LaunchApplication launchApplication;
	MembershipSteps membershipSteps;

	@Step
	public void launchCreateAccountStep() {
		launchApplication.goToCreateStageAccount();
	}
	@Step
	public void launchLoginAccountStep() {
		launchApplication.goToLoginAccount();
	}
	
	@Step
	public void enterEmail(String value) {
		createStageAcount.enterEmail(value);
	}

	@Step
	public void enterPassword(String value) {
		createStageAcount.enterPassword(value);
	}

	@Step
	public void enterFirstName(String value) {
		createStageAcount.enterFirstName(value);
	}

	@Step
	public void enterLastName(String value) {
		createStageAcount.enterLastName(value);
	}

	@Step
	public void clickSubmitButtonStep() {
		createStageAcount.clickSubmitButton();
	}
	
	@Step
	public void verifyDashboard() throws InterruptedException {
		createStageAcount.verifyDashboard();
	}
	
	@Step
	public void click_on_login_icon() {
		createStageAcount.click_on_login_icon();
	}
	
	@Step
	public void ConfirmPasswordStep(String value) {
		createStageAcount.ConfirmPassword(value);
	}

	@Step
	public void clickCheckTerm() {
		createStageAcount.clickCheckTerm();
	}
	@Step
	public void clickCreateanAccount() {
		createStageAcount.clickCreateanAccount();
	}
	
	
	@Step
	public void clickLogInButton() {
		createStageAcount.clickLogInButton();
	}
	@Step
	public void clickHereLink() {
		createStageAcount.clickHereLink();
	}
	@Step
	public void clickAgreeAccountCheckout() {
		createStageAcount.clickAgreeAccountCheckout();
	}
	
	@Step
	public void clickOnCreateAnAccountIcon() {
		createStageAcount.click_on_create_an_account();
	}
	
	@Step
	public void verifySignupPageTitle() throws InterruptedException {
		createStageAcount.verifySignupPageTitle();
	}
	
	@Step
	public void enterEmailAddress(String emailAddress) {
		createStageAcount.enterEmailAddress(emailAddress);
	}
	
	@Step
	public void enterNewPassword(String Password) {
		createStageAcount.enterNewPassword(Password);
	}
	
	@Step
	public void enterNewFirstName(String FirstName) {
		createStageAcount.enterNewFirstName(FirstName);
	}
	
	@Step
	public void enterNewLastName(String LastName) {
		createStageAcount.enterNewLastName(LastName);
	}
	
	@Step
	public void clickTermsConditionsCheckBox() {
		createStageAcount.clickTermsConditionsCheckBox();
	}
	
	@Step
	public void clickSignupSubmitButton() {
		createStageAcount.clickSignupSubmitButton();
	}
	
	@Step
	public void verifyYourAccountHasBeenCreatedTitle() throws InterruptedException {
		createStageAcount.verifyYourAccountHasBeenCreatedTitle();
	}
	
	@Step
	public void enterCreatedUserNameStep(String value) {
		createStageAcount.enterCreatedUserName(value);
	}

	@Step
	public void enterCreatedPasswordStep(String value) {
		createStageAcount.enterCreatedPassword(value);
	}
	
	@Step
	public void clickLoginButton() {
		createStageAcount.clickLoginButton();
	}
	
	@Step
	public void verifyInvalidMessage() throws InterruptedException {
		createStageAcount.verifyInvalidMessage();
	}
	@Step
	public void enterJobTitle(String jobTitle) {
		createStageAcount.enterJobTitle(jobTitle);
	}
	@Step
	public void enterCompanyName(String jobTitle) {
		createStageAcount.enterCompanyName(jobTitle);
	}
	
}
