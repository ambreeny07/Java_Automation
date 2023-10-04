package com.test.suite.testSteps;

import org.springframework.beans.factory.annotation.Autowired;
import com.ascm.pages.ExamCreditPurchaseProcess;
import net.thucydides.core.annotations.Step;

public class ExamCreditPurchaseSteps {
	
	@Autowired
	ExamCreditPurchaseProcess examCreditPurchaseProcess;
	@Step
	public void clickOnCredentials() {
		examCreditPurchaseProcess.clickOnCredentialsButton();
	}
	
	@Step
	public void clickONExamButton() {
		examCreditPurchaseProcess.clickOnExamButton();
	}
	
	@Step
	public void clickOnMyAccount() {
		examCreditPurchaseProcess.clickOnMyAccount();
	}
	
	@Step
	public void clickOnLogout() {
		examCreditPurchaseProcess.clickOnLogout();
	}
	
	@Step
	public void verifyMyExamList() {
		examCreditPurchaseProcess.verifyMyExamList();
	}
	
	@Step
	public void verifyMyExamCreditMessageOnBundle() {
		examCreditPurchaseProcess.verifyCreditMessageIsDisplaying();
	}
	
	@Step
	public void clickOnMyAccountInCreditMessage() {
		examCreditPurchaseProcess.clickOnMyAccountInCreditMessage();
	}
	
	@Step
	public void clickOnRegisterForExam() {
		examCreditPurchaseProcess.clickOnRegisterExam();
	}
	
	@Step
	public void enterAddress() {
		examCreditPurchaseProcess.enterAddress();
	}
}
