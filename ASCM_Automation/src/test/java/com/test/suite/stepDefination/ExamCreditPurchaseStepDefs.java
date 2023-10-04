package com.test.suite.stepDefination;

import com.test.suite.testSteps.ExamCreditPurchaseSteps;
import io.cucumber.java.en.Then;

import net.thucydides.core.annotations.Steps;

public class ExamCreditPurchaseStepDefs {

	@Steps
	ExamCreditPurchaseSteps examCreditPurchaseSteps;
	
	
	@Then("^Click on Credentials Button$")
	public void clickOnNext() {
		examCreditPurchaseSteps.clickOnCredentials();
	}
	
	@Then("^Click on Exam Button$")
	public void clickOnExamButton() {
		examCreditPurchaseSteps.clickONExamButton();
	}
	
	@Then("^Click on My Account after Login$")
	public void clickOnMyAccount() {
		examCreditPurchaseSteps.clickOnMyAccount();
	}
	
	@Then("^Click on Logout$")
	public void clickOnlogout() {
		examCreditPurchaseSteps.clickOnLogout();
	}
	
	@Then("^Verify My Exam List$")
	public void verifyMyExamList() {
		examCreditPurchaseSteps.verifyMyExamList();
	}
	
	@Then("^Verify Exam Credit Message on Bundle$")
	public void verifyMyExamCreditMessage() {
		examCreditPurchaseSteps.verifyMyExamCreditMessageOnBundle();
	}
	
	@Then("^Click on my account button in Credit Message$")
	public void clickOnMyAccountInCreditMessage() {
		examCreditPurchaseSteps.clickOnMyAccountInCreditMessage();
	}
	
	@Then("^Click on Register For Exam$")
	public void clickOnRegisterForExam() {
		examCreditPurchaseSteps.clickOnRegisterForExam();
	}
	
	@Then("^Enter Address to Register Exam$")
	public void enterAddressToRegisterExam() {
		examCreditPurchaseSteps.enterAddress();
	}
	
	
	
}
