package com.test.suite.testSteps;


import java.awt.AWTException;

import com.ascm.pages.CheckOutPage;
import com.ascm.pages.MyAccountPage;

import net.thucydides.core.annotations.Step;

public class MyAccountSteps {
	MyAccountPage myAccount;

	@Step
	public void verifyACSMIdValue() throws InterruptedException {
		myAccount.verifyACSMIdValue();
	}
	
	@Step
	public void verifyUsernameValue() throws InterruptedException {
		myAccount.verifyUsernameValue();
	}
	
	@Step
	public void verifyFirstNameValue() throws InterruptedException {
		myAccount.verifyFirstNameValue();
	}
	
	@Step
	public void verifyLastNameValue() throws InterruptedException {
		myAccount.verifyLastNameValue();
	}
	
	@Step
	public void verifyEmailAddressValue() throws InterruptedException {
		myAccount.verifyEmailAddressValue();
	}
	
	@Step
	public void verifyHomeAddressValue() throws InterruptedException {
		myAccount.verifyHomeAddressValue();
	}
	
	@Step
	public void verifyMembershipInfoTitle() throws InterruptedException {
		myAccount.verifyMembershipInfoTitle();
	}
	
	@Step
	public void clickSideMenuMembershipButton() throws InterruptedException {
		myAccount.clickSideMenuMembershipButton();
	}
	
	@Step
	public void verifyBecomeAMemberButton() throws InterruptedException {
		myAccount.verifyBecomeAMemberButton();
	}
	
	@Step
	public void enterUsername(String username) {
		myAccount.enterUsername(username);
	}
	
	@Step
	public void enterPassword(String Password) {
		myAccount.enterPassword(Password);
	}
	
	@Step
	public void enterConfirmPassword(String confirmPassword) throws InterruptedException {
		myAccount.enterConfirmPassword(confirmPassword);
	}
	
	@Step
	public void clickResetButton() throws InterruptedException {
		myAccount.clickResetButton();
	}
	
	@Step
	public void clickLogOffButton() throws InterruptedException {
		myAccount.clickLogOffButton();
	}
	
	@Step
	public void clickResetPasswordButton() throws InterruptedException {
		myAccount.clickResetPasswordButton();
	}
	
	@Step
	public void enterCompany(String company) throws InterruptedException {
		myAccount.enterCompany(company);
	}
	
	@Step
	public void selectCountry(String country) throws InterruptedException {
		myAccount.selectCountry(country);
	}

	@Step
	public void selectState(String state) throws InterruptedException {
		myAccount.selectState(state);
	}
	
	@Step
	public void enterCity(String city) throws InterruptedException {
		myAccount.enterCity(city);
	}
	
	@Step
	public void enterZipCode(String zipCode) throws InterruptedException {
		myAccount.enterZipCode(zipCode);
	}
	
	@Step
	public void enterWorkAddress(String workAddress) throws InterruptedException {
		myAccount.enterWorkAddress(workAddress);
	}
	
	@Step
	public void clickOnEditButton() throws InterruptedException {
		myAccount.clickOnEditButton();
	}

	@Step
	public void verifyEditProfilePageTitle() throws InterruptedException {
		myAccount.verifyEditProfilePageTitle();
	}
	
	@Step
	public void clickOnSubmitButton() throws InterruptedException {
		myAccount.clickOnSubmitButton();
	}
	
	@Step
	public void primaryPhoneSelectCountryCode() throws InterruptedException {
		myAccount.primaryPhoneSelectCountryCode();
	}
	
	@Step
	public void enterAreaCode(String areaCode) throws InterruptedException {
		myAccount.enterAreaCode(areaCode);
	}
	
	@Step
	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		myAccount.enterPhoneNumber(phoneNumber);
	}
	
	@Step
	public void clickOnWorkRadioButton() throws InterruptedException {
		myAccount.clickOnWorkRadioButton();
	}
	
	@Step
	public void clickOnSideMenuPaymentMethodsButton() throws InterruptedException {
		myAccount.clickOnSideMenuPaymentMethodsButton();
	}
	
	@Step
	public void verifyNoSavedPaymentMethodsFoundTitle() throws InterruptedException {
		myAccount.verifyNoSavedPaymentMethodsFoundTitle();
	}
	
	@Step
	public void clickOnViewBenefitsLink() throws InterruptedException {
		myAccount.clickOnViewBenefitsLink();
	}
	
	@Step
	public void verifyMemberBenefitsPageTitle() throws InterruptedException {
		myAccount.verifyMemberBenefitsPageTitle();
	}
	
	@Step
	public void verifyPaymentMethodCard() throws InterruptedException {
		myAccount.verifyPaymentMethodCard();
	}
	
	@Step
	public void isEnabledPrintMamberShipCardLink() throws InterruptedException {
		myAccount.isEnabledPrintMamberShipCardLink();
	}
	
}
