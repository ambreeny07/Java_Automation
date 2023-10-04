package com.test.suite.testSteps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.ascm.pages.LaunchApplication;
import com.ascm.pages.MembershipPage;

import net.thucydides.core.annotations.Step;

public class MembershipSteps {
	MembershipPage membershipPage;

	LaunchApplication launchApplication;

	@Step
	public void goMembershipPageStep() {
		launchApplication.goToMembershipPage();
	}
	@Step
	public void goToPreviousPageStep() {
		launchApplication.goToPreviousPage();
	}
	
	
	@Step
	public void goCartPageStep() {
		launchApplication.goToCartPage();
	}
	
	@Step
	public void clickOnBecomeAMember() throws InterruptedException {
		membershipPage.clickOnBecomeAMember();
	}
	
	@Step
	public void getCurrentMembershipValue() throws InterruptedException {
		membershipPage.clickOnBecomeAMember();
	}
	
	@Step
	public void getCurrentMembership() throws InterruptedException {
		membershipPage.getCurrentMembership();
	}
	
	@Step
	public void verifyMembershipValue(String ar1) throws InterruptedException {
		membershipPage.verifyMembershipValue(ar1);
	}
	
	
	
	@Step
	public void verifyMembershipTypeSelectedPage(String arg) throws InterruptedException {
		membershipPage.verifyMembershipTypeSelectedPage(arg);
	}
	
	
	
	
	@Step
	public void clickOnAddLocalMembershipPartner() throws InterruptedException {
		membershipPage.clickOnAddLocalMembershipPartner();
	}
	
	@Step
	public void verifyToggle(String arg1 , String arg2) throws InterruptedException {
		membershipPage.verifyToggle(arg1,arg2);
	}
	
	@Step
	public void verifyToggleHeading(String arg1) throws InterruptedException {
		membershipPage.verifyToggleHeading(arg1);
	}
	
	@Step
	public void verifyPage(String arg1) throws InterruptedException {
		membershipPage.verifyPage(arg1);
	}
	@Step
	public void verifyMembershipType(String arg1) throws InterruptedException {
		membershipPage.verifyMembershipType(arg1);
	}
	
	
	@Step
	public void verifyMembershipVisible(String arg1,String arg2) throws InterruptedException {
		membershipPage.verifyMembershipVisible(arg1,arg2);
	}
	
	@Step
	public void verifyMembershipTypes(String arg1) throws InterruptedException {
		membershipPage.verifyMembershipTypes(arg1);
	}
	
	
	
	@Step
	public void enterMembershipPostalCode() throws InterruptedException {
		membershipPage.enterMembershipPostalCode();
	}
	@Step
	public void clickOnSearchChapterButton() throws InterruptedException {
		membershipPage.clickOnSearchChapterButton();
	}
	
	
	@Step
	public void clickCoreMembershipStep() {
		membershipPage.clickCoreMembership();
	}
	
	@Step
	public void clickOnStudentDiscountType() {
		membershipPage.clickOnStudentDiscountType();
	}

	
	@Step
	public void selectNorthAmericaPlusMembershipStep() throws InterruptedException {
		membershipPage.selectNorthAmericaPlusMembership();
	}

	@Step
	public void selectCoreIntMembershipStep() {
		membershipPage.selectCoreIntMembership();
	}

	@Step
	public void selectPlustIntMembershipStep() {
		membershipPage.selectPlustIntMembership();
	}

	@Step
	public void selectInternationalCountryStep() throws InterruptedException {
		membershipPage.selectInternationalCountry();
	}

	@Step
	public void clickOnPurchaseMembershipButton() throws InterruptedException {
		membershipPage.clickOnPurchaseMembershipButton();
	}

	@Step
	public void clickCoreAnnualPriceStep() throws InterruptedException {
		membershipPage.clickCoreAnnualPrice();
	}

	@Step
	public void coreMonthlyPriceStep() throws InterruptedException {
		membershipPage.coreMonthlyPrice();
	}

	@Step
	public void selectChapterCountryStep() throws InterruptedException {
		membershipPage.selectChapterCountry();
	}

	@Step
	public void searchByChapterZipCodeStep(String ZipCode) {
		membershipPage.searchByChapterZipCode(ZipCode);
	}

	@Step
	public void clickFindPartnerButtonStep() throws InterruptedException {
		membershipPage.clickFindPartnerButton();
	}

	@Step
	public void selectChapterStep() throws InterruptedException {
		membershipPage.selectChapter();
	}

	@Step
	public void clickAgreementCheckboxStep() throws InterruptedException {
		membershipPage.clickAgreementCheckbox();
	}
	
	@Step
	public void clickCertificateUpgradeCheckboxStep() throws InterruptedException {
		membershipPage.clickCertificateUpgradeCheckbox();
	}
	
	@Step
	public void clickSkipMembershipButtonStep() throws InterruptedException {
		membershipPage.clickSkipMembershipButton();
	}
	
	@Step
	public void clickMonthlyMembershipButtonStep() throws InterruptedException {
		membershipPage.clickMonthlyMembershipButton();
	}
	
	
	

	@Step
	public void clickAddToCartButtonStep() throws InterruptedException {
		membershipPage.clickAddToCartButton();
	}
	@Step
	public void clickVerifyStudentStatusButton() {
		membershipPage.clickVerifyStudentStatusButton();
	}

	@Step
	public void clickAutoRenewCheckboxStep() {
		membershipPage.clickAutoRenewCheckbox();
	}

	@Step
	public void clickNaCountryDropDownStep() {
		membershipPage.clickNaCountryDropDown();
	}
	
	
	
	@Step
	public void selectDiscountMembership(String value) throws InterruptedException {
		membershipPage.selectDiscountMembership(value);
	}
	
	@Step
	public void selectCountryMembership(String value) throws InterruptedException {
		membershipPage.selectCountryMembership(value);
	}
	
	
	@Step
	public void checkFullTimeStudent() throws InterruptedException {
		membershipPage.checkFullTimeStudent();
	}
	
	@Step
	public void selectCountry(String value) throws InterruptedException {
		membershipPage.selectCountry(value);
	}
	
	@Step
	public void deleteAllExistingOrders() throws InterruptedException {
		membershipPage.deleteAllExistingOrders();
	}
	
	
	@Step
	public void enterUniversity(String value) throws InterruptedException {
		membershipPage.enterUniversity(value);
	}
	@Step
	public void selectGradMonth(String value) throws InterruptedException {
		membershipPage.selectGradMonth(value);
	}
	@Step
	public void selectGradYear(String value) throws InterruptedException {
		membershipPage.selectGradYear(value);
	}
	@Step
	public void enterFirstName(String value) throws InterruptedException {
		membershipPage.enterFirstName(value);
	}
	@Step
	public void enterLastName(String value) throws InterruptedException {
		membershipPage.enterLastName(value);
	}
	@Step
	public void enterEmail(String value) throws InterruptedException {
		membershipPage.enterEmail(value);
	}
	@Step
	public void selectDobMonth(String value) throws InterruptedException {
		membershipPage.selectDobMonth(value);
	}
	@Step
	public void selectDobDay(String value) throws InterruptedException {
		membershipPage.selectDobDay(value);
	}
	@Step
	public void selectDobYear(String value) throws InterruptedException {
		membershipPage.selectDobYear(value);
	}
	
	@Step
	public void checkButton() throws InterruptedException {
		membershipPage.checkButton();
	}
	@Step
	public void closeButton() throws InterruptedException {
		membershipPage.closeButton();
	}
}
