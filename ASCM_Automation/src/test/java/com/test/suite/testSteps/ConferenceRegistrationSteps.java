package com.test.suite.testSteps;

import org.springframework.beans.factory.annotation.Autowired;

import com.ascm.pages.ConferenceRegistration;
import com.ascm.pages.LaunchApplication;

import net.thucydides.core.annotations.Step;

public class ConferenceRegistrationSteps {
	
	
	@Autowired
	ConferenceRegistration conferenceRegistration;
	LaunchApplication launchApplication;
	@Step
	public void launchConferenceRegistartionStep() {
		launchApplication.goToConferenceRegistration();
	}
	@Step
	public void clickOnVirtueBox() {
		conferenceRegistration.clickOnConferenceVirtue();
	}
	
	@Step
	public void clickOnNextButton() {
		conferenceRegistration.clickOnConferenceNextButton();
	}
	
	@Step
	public void selectSalutation() {
		conferenceRegistration.selectSalutationMiss();
	}
	
	@Step
	public void enterOrganizationName(String org) {
		conferenceRegistration.enterOrganization(org);
	}
	
	@Step
	public void enterJobTitle(String Job) {
		conferenceRegistration.enterJobTitle(Job);
	}
	
	@Step
	public void selectGenderFemale() {
		conferenceRegistration.clickOnFemaleGender();
	}
	
	@Step
	public void selectAge() {
		conferenceRegistration.selectAge();
	}
	
	@Step
	public void enterEmergencyContactNumber(String num) {
		conferenceRegistration.enterEmergencyContactNumber(num);
	}
	
	@Step
	public void enterEmergencyContactName(String name) {
		conferenceRegistration.enterEmergencyContactName(name);
	}
	
	//click on next
	//click on next
	
	@Step
	public void clickOnAddToCart() {
		conferenceRegistration.clickOnAddToCart();
	}
	
	@Step
	public void selectRegion(String region) {
		conferenceRegistration.selectRegion(region);
	}
	
	@Step
	public void checkTheTermsCheckBox() {
		conferenceRegistration.checkTheTerms();
	}
	
	@Step
	public void checkAddToCartTerms() {
		conferenceRegistration.checkAddToCartTerms();
	}
	
	@Step
	public void checkAddToCartTermsForVirtue() {
		conferenceRegistration.checkkAddToCartTermsForVirtue();
	}
	
	@Step
	public void clickOnSelectChapter() {
		conferenceRegistration.clickSelectChapter();
	}
	
	@Step
	public void clickOnBackButton() {
		conferenceRegistration.clickOnBackButton();
	}
	
	@Step
	public void validateSummary() {
		conferenceRegistration.validateSummary();
	}

	
	@Step
	public void clickOnCbHotelStay() {
		conferenceRegistration.clickOnCbHotelStay();
	}
	
	@Step
	public void clickOnCbChapterDiscount() {
		conferenceRegistration.clickOnCbChapterDiscount();
	}
	
	@Step
	public void clickOnCbFirstTimeDiscount() {
		conferenceRegistration.clickOnCbFirstTimeDiscount();
	}
	
	@Step
	public void clickOnShowMore() {
		conferenceRegistration.clickOnShowMore();
	}
	
	@Step
	public void clickOnCDFedDiscount() {
		conferenceRegistration.clickOnCbFEDDiscount();
	}
	
	@Step
	public void selectMeals() {
		conferenceRegistration.selectMeals();
	}
	
	@Step
	public void cbAddGuest() {
		conferenceRegistration.checkAddAGuest();
	}
	
	@Step
	public void enterGuestDetails() {
		conferenceRegistration.enterGuestDetails();
	}
	
	@Step
	public void validateOrderSummery() {
		conferenceRegistration.validateOrderSummary();
	}
	
}
