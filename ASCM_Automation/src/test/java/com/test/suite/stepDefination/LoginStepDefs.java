package com.test.suite.stepDefination;

import com.ascm.pages.LoginConstants;
import com.test.suite.testSteps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefs {
	@Steps
	LoginSteps loginSteps;

	@Given("^Launch Application$")
	public void launch_Application() {
		loginSteps.launchApplicationStep();
	}
	@Given("^Go To Login Page$")
	public void goToLoginPage() {
		loginSteps.goToLoginPage();
	}

	@Then("^Click on OK button for cookie$")
	public void click_on_OK_button_for_cookie() {
		loginSteps.clickOnCookieStep();
	}

	@Then("^Click login$")
	public void click_login() {
		loginSteps.clickLoginStep();
	}

	@Then("^Enter username \"([^\"]*)\"$")
	public void enter_username(String arg1) {
		loginSteps.enterUserNameStep(LoginConstants.LoginEmail);
	}
	
	
	
	@Then("^Enter Legacy username$")
	public void enter_Legacy_username() {
		loginSteps.enterUserNameStep(LoginConstants.LegacyLoginEmail);
	}
	@Then("^Enter Legacy username \"([^\"]*)\"$")
	public void enterLegacyUsername(String arg1) {
		loginSteps.enterUserNameStep(arg1);
	}
	@Then("^Enter Legacy password \"([^\"]*)\"$")
	public void enterLegacyPassword(String arg1) {
		loginSteps.enterPasswordStep(arg1);
	}

	@Then("^Enter password \"([^\"]*)\"$")
	public void enter_password(String arg1) {
		loginSteps.enterPasswordStep(LoginConstants.LoginPassword);
	}
	@Then("^Enter Qa Existing username$")
	public void enter_qa_existing_username() {
		loginSteps.enterUserNameStep(LoginConstants.qa_ExistingLoginEmail);
	}
	
	@Then("^Enter Qa Existing password$")
	public void enter_qa_existing_password() {
		loginSteps.enterPasswordStep(LoginConstants.qa_ExistingLoginPassword);
	}
	
	@Then("^Enter Stage Existing username$")
	public void enter_stage_existing_username() {
		loginSteps.enterUserNameStep(LoginConstants.stage_ExistingLoginEmail);
	}
	
	@Then("^Enter Stage Existing password$")
	public void enter_stage_existing_password() {
		loginSteps.enterPasswordStep(LoginConstants.stage_ExistingLoginPassword);
	}
	
	@Then("^Enter Legacy password$")
	public void enter_Legacy_password() {
		loginSteps.enterPasswordStep(LoginConstants.LegacyLoginPassword);
	}

	@Then("^Click submit$")
	public void click_submit() {
		loginSteps.clickSubmitButtonStep();
	}

	@Then("^Verify the error message \"([^\"]*)\" for \"([^\"]*)\"$")
	public void errorMessageValidation(String arg1, String arg2) {
		if (arg2.equals("BlankPassword")) {
			loginSteps.requiredPasswordStep(arg1);
		} else if (arg2.equals("BlankUserName")) {
			loginSteps.requiredUserNameStep(arg1);
		} else if (arg2.equals("InvalidUserNamePassword")) {
			loginSteps.invalidLoginStep(arg1);
		}
	}
	
	@Then("^Enter Stage incorrect username$")
	public void enter_stage_Incorrect_username() {
		loginSteps.enterIncorrectUserNameStep(LoginConstants.stage_IncorrectLoginEmail);
	}
	
	@Then("^Enter Stage incorrect password$")
	public void enter_stage_Incorrect_password() {
		loginSteps.enterIncorrectPasswordStep(LoginConstants.stage_IncorrectLoginPassword);
	}

	@Then("^Enter My Account Member Username$")
	public void enter_my_account_Member_username() {
		loginSteps.enterUserNameStep(LoginConstants.stage_MyAccountMemberLoginEmail);
	}
	
	@Then("^Enter My Account Member Password$")
	public void enter_my_account_Member_password() {
		loginSteps.enterPasswordStep(LoginConstants.stage_ExistingLoginPassword);
	}
	
	@Then("^Enter My Account Non Member Username$")
	public void enter_my_account_non_Member_username() {
		loginSteps.enterUserNameStep(LoginConstants.stage_MyAccountNonMemberLoginEmail);
	}
	
	@Then("^Enter My Account Non Member password$")
	public void enter_my_account_non_Member_password() {
		loginSteps.enterPasswordStep(LoginConstants.stage_MyAccountNonMemberLoginPassword);
	}
	
	@Then("^Enter My Account Member Reset Password$")
	public void enter_my_account_Member_Reset_password() {
		loginSteps.enterPasswordStep(LoginConstants.resetLoginPassword);
	}
}
