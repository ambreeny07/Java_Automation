package com.test.suite.stepDefination;

import com.test.suite.testSteps.ConferenceRegistrationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ConferenceRegistartionStepDefs {

	@Steps
	ConferenceRegistrationSteps conferenceRegistrationSteps;
	
	@Given("^Go To Conference Registration$")
	public void GoToProcurrement() {
		conferenceRegistrationSteps.launchConferenceRegistartionStep();
	}
	@Then("^Click on Virtue Box$")
	public void clickOnVirtueBox() {
		conferenceRegistrationSteps.clickOnVirtueBox();
	}
	
	@Then("^Click on Next Button$")
	public void clickOnNext() {
		conferenceRegistrationSteps.clickOnNextButton();
	}
	
	@Then("^Select Salutation$")
	public void selectSalutation() {
		conferenceRegistrationSteps.selectSalutation();
	}
	
	@Then("^Enter Organization Name \"([^\"]*)\"$")
	public void enterOrgName(String name) {
		conferenceRegistrationSteps.enterOrganizationName(name);
	}
	
	@Then("^Enter Job title \"([^\"]*)\"$")
	public void enterJob(String name) {
		conferenceRegistrationSteps.enterJobTitle(name);
	}
	
	@Then("^Select Gender Female$")
	public void selectGenter() {
		conferenceRegistrationSteps.selectGenderFemale();
	}
	
	@Then("^Select Age$")
	public void selectAge() {
		conferenceRegistrationSteps.selectAge();
	}
	
	@Then("^Enter Emergency Contact Name \"([^\"]*)\"$")
	public void enterEmergencyName(String name) {
		conferenceRegistrationSteps.enterEmergencyContactName(name);
	}
	
	@Then("^Enter Emergency Contact Number \"([^\"]*)\"$")
	public void enterEmergencyNumber(String name) {
		conferenceRegistrationSteps.enterEmergencyContactNumber(name);
	}
	
	@Then("^Click on add to cart button$")
	public void addToCart() {
		conferenceRegistrationSteps.clickOnAddToCart();
	}
	
	@Then("^Select region \"([^\"]*)\"$")
	public void selectRegion(String region) {
		conferenceRegistrationSteps.selectRegion(region);
	}
	
	@Then("^Check Terms checkbox$")
	public void checkTheTerms() {
		conferenceRegistrationSteps.checkTheTermsCheckBox();
	}
	
	@Then("^Check Add to Cart Terms$")
	public void checkAddToCartTerms() {
		conferenceRegistrationSteps.checkAddToCartTerms();
	}
	
	@Then("^Check Add to Cart Terms For Virtue$")
	public void checkAddToCartTermsForVirtue() {
		conferenceRegistrationSteps.checkAddToCartTermsForVirtue();
	}
	
	
	@Then("^Click on select chapter$")
	public void clickOnSelectChapter() {
		conferenceRegistrationSteps.clickOnSelectChapter();
	}
	
	@Then("^Validate Summary$")
	public void verifyHotelBlockDiscount() {
		conferenceRegistrationSteps.validateSummary();
	}
	
	
	@Then("^Click on back button$")
	public void clickOnBackButton() {
		conferenceRegistrationSteps.clickOnBackButton();
	}
	
	@Then("^Click on Hotel Stay CheckBox$")
	public void clickOnCbHotelStay() {
		conferenceRegistrationSteps.clickOnCbHotelStay();
	}
	
	@Then("^Click on Chapter Discount CheckBox$")
	public void clickOnCbChapterDiscount() {
		conferenceRegistrationSteps.clickOnCbChapterDiscount();
	}
	
	@Then("^Click on First Time Discount CheckBox$")
	public void clickOnCbFirstTimeDiscount() {
		conferenceRegistrationSteps.clickOnCbFirstTimeDiscount();
	}
	
	@Then("^Click on Federal Government Employee Discount Show More Details$")
	public void clickOnShowMore() {
		conferenceRegistrationSteps.clickOnShowMore();
	}
	
	@Then("^Click on Federal Government Employee Discount Checkbox$")
	public void clickOnCDFedDisc() {
		conferenceRegistrationSteps.clickOnCDFedDiscount();
	}
	
	@Then("^Select Dietary Need$")
	public void selectMeals() {
		conferenceRegistrationSteps.selectMeals();
	}
	
	@Then("^Check Add Guest on my Registration checkbox$")
	public void clickoNAddGuest() {
		conferenceRegistrationSteps.cbAddGuest();
	}
	
	@Then("^Enter Guest Details$")
	public void enterGuestDetails() {
		conferenceRegistrationSteps.enterGuestDetails();
	}
	
	
	@Then("^Validate order summary$")
	public void validateOrderSummary() {
		conferenceRegistrationSteps.validateOrderSummery();
	}
	
	
}
