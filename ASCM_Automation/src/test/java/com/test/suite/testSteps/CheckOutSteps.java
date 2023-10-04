package com.test.suite.testSteps;


import com.ascm.pages.CheckOutPage;

import net.thucydides.core.annotations.Step;

public class CheckOutSteps {
	CheckOutPage checkout;

	@Step
	public void clickProceedToCheckOutButtonStep() throws InterruptedException {
		checkout.clickProceedToCheckOutButton();
	}

	@Step
	public void selectHomeCountryStep() {
		checkout.selectHomeCountry();
		}

	// This is for billing information
	@Step
	public void enterBillingFirstNameStep(String billingFirstName) {
		checkout.enterBillingFirstName(billingFirstName);
	}

	@Step
	public void enterBillingLastNameStep(String billingLastName) {
		checkout.enterBillingLastName(billingLastName);
	}

	@Step
	public void enterBillingAddressLine1Step(String billingAddressLine1) {
		checkout.enterBillingAddressLine1(billingAddressLine1);
	}

	@Step
	public void enterBillingcityStep(String billingAddressCity) {
		checkout.enterBillingcity(billingAddressCity);
	}

	@Step
	public void enterBillingStateStep() {
		checkout.enterBillingState();
	}

	public void enterBillingZipCodeStep(String billingZipCode) {
		checkout.enterBillingZipCode(billingZipCode);
	}

	// This is for mailing section
	@Step
	public void enterMailingFirstNameStep(String firstName) throws InterruptedException {
		checkout.enterMailingFirstName(firstName);
	}

	@Step
	public void enterMailingLastNameStep(String lastName) {
		checkout.enterMailingLastName(lastName);
	}

	// North America Address
	@Step
	public void enterMailingAddress1Step(String maillingAddressLine1) {
		checkout.enterMailingAddress1(maillingAddressLine1);
	}

	@Step
	public void enterMailingCityStep(String mailingCityNorthAmerica) {
		checkout.enterMailingCity(mailingCityNorthAmerica);
	}

	@Step
	public void enterMaililingZipCodeStep(String mailingZipNorthAmerica) {
		checkout.enterMaililingZipCode(mailingZipNorthAmerica);
	}

	@Step
	public void selectMailingStateStep(String MAILING_STATE_NORTHAMERICA) {
		checkout.selectMailingState(MAILING_STATE_NORTHAMERICA);
	}

	// International address
	@Step
	public void enterMailingAddressLine1InternationalStep(String maillingAddressLine1International) {
		checkout.enterMailingAddressLine1International(maillingAddressLine1International);
	}

	@Step
	public void enterMailingCityInternationalStep(String mailingCityInternational) {
		checkout.enterMailingCityInternational(mailingCityInternational);
	}

	@Step
	public void selectInternationalCountryStep(String mailingInternationalCountry) {
		checkout.selectInternationalCountry(mailingInternationalCountry);
	}

	@Step
	public void enterMaililingZipCodeInternationalStep(String mailingZipInternational) {
		checkout.enterMaililingZipCodeInternational(mailingZipInternational);
	}

	@Step
	public void enterInternationalStateStep(String internationalState) {
		checkout.enterInternationalState(internationalState);
	}

	/*@Step
	public void enterPhoneNumberInternationalStep(String phoneNum) {
		checkout.enterPhoneNumberInternational(phoneNum);
	}*/
	
	
	//phone number 
	@Step
	public void enterCountryAreaCodeStep(String countryCode) {
		checkout.enterCountryAreaCode(countryCode);
	}

	@Step
	public void enterAreaCodeStep(String areaCode) {
		checkout.enterAreaCode(areaCode);
	}

	@Step
	public void enterPhoneNumberStep(String phoneNum) {
		checkout.enterPhoneNumber(phoneNum);

	}

	@Step
	public void clickNextPaymentButtonStep() {
		checkout.clickNextPaymentButton();
	}
	@Step
	public void clickContinueButtonStep() throws InterruptedException {
		checkout.clickContinueButton();
	}

	@Step
	public void clickFirstAddressRadioButtonStep() {
		checkout.clickFirstAddressRadioButton();
	}

	@Step
	public void clickSelectAddressButtonStep() {
		checkout.clickSelectAddressButton();
	}

	@Step
	public void clickSameAsBillingButtonStep() {
		checkout.clickSameAsBillingButton();
	}

	@Step
	public void typeCardnameStep(String cardName) {
		checkout.typeCardname(cardName);
	}

	@Step
	public void enterPaymentCardStep(String cardNumber) {
		checkout.enterPaymentCard(cardNumber);
	}

	@Step
	public void enterCreditCardSecutiryCodeStep(String securityCode) {
		checkout.enterCreditCardSecutiryCode(securityCode);
	}

	@Step
	public void selectCreditCardExpirationMonthStep(String expirationMonth) {
		checkout.selectCreditCardExpirationMonth(expirationMonth);
	}

	@Step
	public void selectCreditCardExpirationYearStep(String expirationYear) {
		checkout.selectCreditCardExpirationYear(expirationYear);
	}

	@Step
	public void clickNextReviwButtonStep() throws InterruptedException {
		checkout.clickNextReviwButton();
	}
	

	@Step
	public void clickPlaceOrderButtonStep() {
		checkout.clickPlaceOrderButton();
	}
	@Step
	public void clickCheckButtonStep() {
		checkout.clickCheckButton();
	}

	// Wire transfer
	@Step
	public void clickShippingMethodRadioButtonStep() {
		checkout.clickShippingMethodRadioButton();
	}
	@Step
	public void ClickNextButtonStep() {
		checkout.ClickNextButton();
	}
	@Step
	public void ClickLSExamPreAddToCardButtonStep() throws InterruptedException {
		checkout.ClickLSExamPreAddToCardButton();
	}
	@Step
	public void clickOnPayPalButtonStep() {
		checkout.clickOnPayPalButton();
	}
	@Step
	public void clickPayPalLoginStep() {
		checkout.clickOnPayPalLogin();
	}

	/*
//	 * @Step public void clickPayPalLoginButtonStep() {
//	 * checkout.clickPayPalLoginButton(); }
//	 */

	@Step
	public void enterPayPalUserNameStep(String userName) {
		checkout.enterPayPalUserName(userName);
	}

	@Step
	public void enterPayPalPasswordStep(String password) {
		checkout.enterPayPalPassword(password);
	}

	@Step
	public void clickPayPalLoginButtonStep() {
		checkout.clickPayPalLoginButton();
	}
	@Step
	public void clickPayPalPayNowButtonStep() throws InterruptedException {
		checkout.clickPayPalPayNowButton();
	}
	@Step
	public void clickPrmoCodeApplyStep() throws InterruptedException {
		checkout.clickPrmoCodeApply();
	}
	@Step
	public void enterPromoCodeStep(String promoCode) throws InterruptedException {
		checkout.enterPromoCode(promoCode);
	}
	@Step
	public void clickAcceptCookiesStep() {
		checkout.clickAcceptCookies();
	}
	@Step
	public void getPromoDiscountValueStep() {
		checkout.getPromoDiscountValue();
	}
	

	@Step
	public void enterBrainTreeCreditCardNoStep(String cardNumber) {
		checkout.enterCardCardNoForBrainTree(cardNumber);
	}

	@Step
	public void enterBrainTreeCreditCardCVVStep(String securityCode) {
		checkout.enterCardCardCVVForBrainTree(securityCode);
	}
	@Step
	public void enterBrainTreeCreditExpirationStep(String expire) {
		checkout.enterCardCardExpirationForBrainTree(expire);
	}
	@Step
	public void enterBrainTreeCreditPostalCodeStep(String postalCode) {
		checkout.enterCardCardPostalCodeForBrainTree(postalCode);
	}
}
