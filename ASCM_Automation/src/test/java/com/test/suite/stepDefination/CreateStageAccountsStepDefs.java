package com.test.suite.stepDefination;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ascm.pages.LoginConstants;
import com.ascm.util.Utility;
import com.test.suite.testSteps.CreateStageAccountSteps;
import com.test.suite.testSteps.ExamPurchaseSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CreateStageAccountsStepDefs {
	@Steps
	CreateStageAccountSteps createStageAccountSteps;
	
	@Steps
	ExamPurchaseSteps examPurchaseSteps;

	@Given("^Launch Create Account$")
	public void launch_Application() {
		createStageAccountSteps.launchCreateAccountStep();
	}
	
	@Given("^Launch Login Account$")
	public void launch_Application_Login() {
		createStageAccountSteps.launchLoginAccountStep();
	}


	@Then("^Enter New Email \"([^\"]*)\"$")
	public void enterEmail(String arg1) {
		final Pattern VALID_EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(arg1);
		if(!matcher.find()) {
		long randomNo=Utility.timeStamp();
		String email="Automation"+randomNo+"@gmail.com";
		createStageAccountSteps.enterEmail(email);
		LoginConstants.LoginEmail=email;
		}
		else {
			createStageAccountSteps.enterEmail(arg1);
			LoginConstants.LoginEmail=arg1;
		}
	}

	@Then("^Enter New Password \"([^\"]*)\"$")
	public void enterPassword(String arg2) {
		createStageAccountSteps.enterPassword(arg2);
		LoginConstants.LoginPassword=arg2;
	}

	@Then("^Enter Confirm Password \"([^\"]*)\"$$")
	public void ConfirmPasswordStep(String value) {
		createStageAccountSteps.ConfirmPasswordStep(value);
	}
	@Then("^Enter First Name \"([^\"]*)\"$")
	public void enterFirstName(String arg1) {
		createStageAccountSteps.enterFirstName(arg1);
	}
	@Then("^Enter Last Name \"([^\"]*)\"$")
	public void enterLastName(String arg1) {
		createStageAccountSteps.enterLastName(arg1);
	}
	
	@Then("^Enter Company Name \"([^\"]*)\"$")
	public void enterCompanyName(String arg1) {
		createStageAccountSteps.enterCompanyName(arg1);
	}

	@Then("^Click Submit$")
	public void click_submit() {
		createStageAccountSteps.clickSubmitButtonStep();
	}
	@Then("^Verify Dashboard$")
	public void verifyDashboard() throws InterruptedException {
		createStageAccountSteps.verifyDashboard();
	}
	@Then("^Click On Login Icon$")
	public void click_on_login_icon() {
		createStageAccountSteps.click_on_login_icon();
	}
	@Then("^Click Ceck Term$")
	public void clickCheckTerm() {
		createStageAccountSteps.clickCheckTerm();
	}
	@Then("^Click Create an Account$")
	public void clickCreateanAccount() {
		createStageAccountSteps.clickCreateanAccount();
	}
	
	@Then("^Click Login Button$")
	public void clickLogInButton() {
		createStageAccountSteps.clickLogInButton();
	}
	@Then("^Click Here Link$")
	public void clickHereLink() {
		createStageAccountSteps.clickHereLink();
	}
	@Then("^Click Agree Account Checkout$")
	public void clickAgreeAccountCheckout() {
		createStageAccountSteps.clickAgreeAccountCheckout();
	}

	@Then("^Click On Create An Account$")
	public void clickOnCreateAnAccountIcon() {
		createStageAccountSteps.clickOnCreateAnAccountIcon();
	}
	
	@Then("^Verify Signup Page Title$")
	public void verifySignupPageTitle() throws InterruptedException {
		createStageAccountSteps.verifySignupPageTitle();
	}
	
	@And("^Enter Stage New Email Address$")
	public void enterEmailAddress() {
		createStageAccountSteps.enterEmailAddress(LoginConstants.stage_SignupEmail);
	}
	
	@And("^Enter Stage New Password$")
	public void enterNewPassword() {
		createStageAccountSteps.enterNewPassword(LoginConstants.stage_ExistingLoginPassword);
	}
	
	@And("^Enter Stage New Last Name$")
	public void enterNewLastName() {
		createStageAccountSteps.enterNewLastName(LoginConstants.stage_SignupLastName);
	}
	
	@And("^Enter Stage New First Name$")
	public void enterNewFirstName() {
		createStageAccountSteps.enterNewFirstName(LoginConstants.stage_SignupFirstName);
	}
	
	@And("^Click Terms Conditions Checkbox$")
	public void clickTermsConditionsCheckBox() {
		createStageAccountSteps.clickTermsConditionsCheckBox();
	}
	
	@Then("^Click Signup Submit Button$")
	public void clickSignupSubmitButton() {
		createStageAccountSteps.clickSignupSubmitButton();
	}
	
	@Then("^Verify Your Account Has Been Created Title Dashboard$")
	public void verifyYourAccountHasBeenCreatedTitle() throws InterruptedException {
		createStageAccountSteps.verifyYourAccountHasBeenCreatedTitle();
	}
	
	@And("^Enter Stage created username$")
	public void enter_stage_existing_username() {
		createStageAccountSteps.enterCreatedUserNameStep(LoginConstants.stage_SignupEmail);
	}
	
	@And("^Enter Stage created password$")
	public void enter_stage_existing_password() {
		createStageAccountSteps.enterCreatedPasswordStep(LoginConstants.stage_ExistingLoginPassword);
	}
	
	@Then("^Click created Login Button$")
	public void clickLoginButton() {
		createStageAccountSteps.clickLoginButton();
	}
	
	@Then("^Verify Invalid Message$")
	public void verifyInvalidMessage() throws InterruptedException {
		createStageAccountSteps.verifyInvalidMessage();
	}
	
	@Then("^Enter Job Title \"([^\"]*)\"$$")
	public void enterJobTitle(String JobTitle) {
		createStageAccountSteps.enterJobTitle(JobTitle);
	}
	@Then("^Verify \"([^\"]*)\"$")
	public void verifyAccountCreated(String arg) throws IOException, InterruptedException {
		examPurchaseSteps.verifyAccount(arg);
		examPurchaseSteps.verifySelectedProductPage(arg);
	}
	@Then("^Verify Message \"([^\"]*)\"$")
	public void verifyCorporateAccountMessage(String arg) throws IOException, InterruptedException {
		examPurchaseSteps.verifyCorporateAccountMessage(arg);
	}
	
}
