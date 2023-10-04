package com.test.suite.testSteps;

import com.ascm.pages.ExamPurchagePage;
import com.ascm.pages.LaunchApplication;
import com.ascm.pages.Waits;

import net.thucydides.core.annotations.Step;

public class ExamPurchaseSteps {
	ExamPurchagePage examePurchsePage;
	LaunchApplication launcApplication;
	@Step
	public void clickLearningAndDevelopmentTopNavigation() {
		examePurchsePage.clickLearningAndDevelopmentTopNavigation();
	}

	@Step
	public void clickCPIM() {
		examePurchsePage.clickCPIM();
	}
	@Step
	public void verifySelectedProductPage(String arg) throws InterruptedException {
		examePurchsePage.verifySelectedProductPage(arg);
	}
	@Step
	public void verifyAccount(String arg) throws InterruptedException {
		examePurchsePage.verifySelectedProductPage(arg);
	}
	@Step
	public void verifyCorporateAccountMessage(String arg) throws InterruptedException {
		examePurchsePage.verifyCorporateAccountMessage(arg);
	}
	
	
	@Step
	public void verifySelectedProductAddedInCart(String arg) throws InterruptedException {
		examePurchsePage.verifySelectedProductAddedInCart(arg);
	}
	
	@Step
	public void clickSkipButtonStep() throws InterruptedException {
		examePurchsePage.clickSkipButtonStep();
	}
	
	
	
	
	@Step
	public void verifySelectedCertificatePage(String arg) throws InterruptedException {
		examePurchsePage.verifySelectedCertificatePage(arg);
	}
	
	
	
	
	@Step
	public void clickCSCPNavigation() {
		examePurchsePage.clickCSCPNavigation();
	}
	
	@Step
	public void clickAddToCardExamButton() {
		examePurchsePage.clickAddToCardExamButton();
	}

	@Step
	public void selectCoutryExamRegion(String value) {
		examePurchsePage.selectCoutryExamRegion(value);
	}

	@Step
	public void clickCPIMPart1Step() {
		examePurchsePage.clickCPIMPart1();
	}

	@Step
	public void clickCPIMPart2Step() {
		examePurchsePage.clickCPIMPart2();
	}

	@Step
	public void clickCLTDStep() {
		examePurchsePage.clickCLTDFirstAttempt();
	}
	@Step
	public void clickCLTD() {
		examePurchsePage.clickCLTD();
	}
	@Step
	public void clickWarehouse() {
		examePurchsePage.clickWarehouse();
	}
	
	

	@Step
	public void clickCSCPStep() {
		examePurchsePage.clickCSCP();
	}

	@Step
	public void clickCPIMPart1RetakeStep() {
		examePurchsePage.clickCPIMPart1Retake();
	}
	
	@Step
	public void verifyPurchaseMultipleLinkIsPresent() throws InterruptedException {
		examePurchsePage.verifyPurchaseMultipleLinkIsPresent();
	}

	@Step
	public void clickCPIMPart2RetakeStep() {
		examePurchsePage.clickCPIMPart2Retake();
	}

	@Step
	public void clickCLTDRetakeStep() {
		examePurchsePage.clickCLTDRetake();
	}

	@Step
	public void clickCSCPRetakeStep() {
		examePurchsePage.clickCSCPRetake();
	}

	@Step
	public void clickOKButtonCodeOfEthicsStep() {
		examePurchsePage.clickOKButtonCodeOfEthics();
	}
	@Step
	public void selectCountryStep(String country) {
		examePurchsePage.selectHomeCountry(country);
		}
	@Step
	public void selectBillingCountryStep(String country) throws InterruptedException {
		examePurchsePage.selectBillingCountry(country);
		}
	@Step
	public void enterMailingAddressLine1Step(String billingAddressLine1) throws InterruptedException {
		examePurchsePage.enterMailingAddress1(billingAddressLine1);
	}
	@Step
	public void enterBillingMailingAddressLine1Step(String billingAddressLine1) throws InterruptedException {
		examePurchsePage.enterBillingMailingAddress1(billingAddressLine1);
	}

	@Step
	public void enterMailingcityStep(String billingAddressCity) {
		examePurchsePage.enterMailingCity(billingAddressCity);
	}
	@Step
	public void enterBillingMailingcityStep(String billingAddressCity) {
		examePurchsePage.enterBillingMailingCity(billingAddressCity);
	}
	@Step
	public void enterMailingStateStep(String zip) {
		examePurchsePage.enterMailingState(zip);
	}
	@Step
	public void enterBillingMailingStateStep(String zip) {
		examePurchsePage.enterBillingMailingState(zip);
	}
	@Step
	public void enterCompany(String company) throws InterruptedException {
		examePurchsePage.enterCompany(company);
	}
	@Step
	public void enterBillingCompany(String company) throws InterruptedException {
		examePurchsePage.enterBillingCompany(company);
	}

	@Step
	public void enterMaililingZipCodeStep(String billingZipCode) {
		examePurchsePage.enterMaililingZipCode(billingZipCode);
	}
	@Step
	public void enterBillingMaililingZipCodeStep(String billingZipCode) {
		examePurchsePage.enterBillingMaililingZipCode(billingZipCode);
	}
	@Step
	public void selectCountryType(String companyType) {
		examePurchsePage.selectCountryType(companyType);
	}
	@Step
	public void enterFirstName(String name) {
		examePurchsePage.enterFirstName(name);
	}
	@Step
	public void enterLastName(String name) {
		examePurchsePage.enterLastName(name);
	}
	@Step
	public void selectCountryAreaCode(String companyAreaCode) {
		examePurchsePage.selectCountryAreaCode(companyAreaCode);
	}
	@Step
	public void enterAreaCode(String areaCode) {
		examePurchsePage.enterAreaCode(areaCode);
	}
	@Step
	public void enterPhoneNumber(String phoneNumber) {
		examePurchsePage.enterPhoneNumber(phoneNumber);
	}
	@Step
	public void clickWorkAddressReadioButton() {
		examePurchsePage.clickWOrkAddressReadioButton();
	}
	@Step
	public void clickCreditCardRadioButton() {
		examePurchsePage.clickCreditCardRadioButton();
	}
	@Step
	public void clickCreditBrainTreeCardRadioButton() {
		examePurchsePage.clickCreditCardBrainTreeRadioButton();
	}
	@Step
	public void getOrderNo() throws InterruptedException {
		Waits.wait10Second();
		examePurchsePage.getOrderNo();
	}
	@Step
	public void getReferenceCode() throws InterruptedException {
		examePurchsePage.getReferenceCode();
		Thread.sleep(3000);
	}
	@Step
	public void clickCPIMLsExamPart2() {
		examePurchsePage.clickCPIMLsExamPart2();
	}
	@Step
	public void selectBundleCoutryRegion(String value) {
		examePurchsePage.selectBundleCoutryRegion(value);
	}
	@Step
	public void selectBundleCoutry(String value) throws InterruptedException {
		examePurchsePage.selectBundleCoutry(value);
	}
	@Step
	public void clickBundleAddToCardExamButton() {
		examePurchsePage.clickBundleAddToCardExamButton();
	}
	@Step
	public void verifyMembershipUpcellCTA() {
		examePurchsePage.verifyMembershipUpcellCTA();
	}
	@Step
	public void clickOnUpgradeNowButton() throws InterruptedException {
		examePurchsePage.clickOnUpgradeNowButton();
	}
	@Step
	public void verifyUpgradeCertificateModal() {
		examePurchsePage.verifyUpgradeCertificateModal();
	}
	
	@Step
	public void clickAggressButton() {
		examePurchsePage.clickAggressButton();
	}
	@Step
	public void clickAddSelectedButton() throws InterruptedException {
		examePurchsePage.clickAddSelectedButton();
	}
	
	@Step
	public void clickReturnPolicy() throws InterruptedException {
		examePurchsePage.clickReturnPolicy();
	}
	@Step
	public void verifyReturnPolicyPage() throws InterruptedException {
		examePurchsePage.verifyReturnPolicyPage();
	}
	
	
	@Step
	public void EnterBundlePostCode(String value) {
		examePurchsePage.EnterBundlePostCode(value);
	}
	@Step
	public void clickSearchBundleCode() throws InterruptedException {
		examePurchsePage.clickSearchBundleCode();
	}

	@Step
	public void clickSearchBundle() throws InterruptedException {
		examePurchsePage.clickSearchBundle();
	}
	@Step
	public void clickInternationalChapter() throws InterruptedException {
		examePurchsePage.clickInternationalChapter();
	}
	
	@Step
	public void clickMultipleItemsSteps() throws InterruptedException {
		examePurchsePage.clickMultipleItems();
	}
	
	
	@Step
	public void chooseawaytopay(String value) throws InterruptedException {
		examePurchsePage.chooseBrainTreeWay(value);
	}

}

