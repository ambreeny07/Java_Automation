package com.test.suite.stepDefination;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ascm.pages.CheckoutConstants;
import com.ascm.pages.ExamPurchagePage;
import com.ascm.pages.LoginConstants;
import com.ascm.pages.Waits;
import com.test.suite.testSteps.CheckOutSteps;
import com.test.suite.testSteps.MyAccountSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class MyAccountStepDefs extends PageObject {

	@Steps
	MyAccountSteps myAccountSteps;

	@Then("^Verify ACSM Id Value$")
	public void verifyDashboard() throws InterruptedException {
		myAccountSteps.verifyACSMIdValue();
	}

	@Then("^Verify UserName Value$")
	public void verifyUsernameValue() throws InterruptedException {
		myAccountSteps.verifyUsernameValue();
	}

	@Then("^Verify First Name Value$")
	public void verifyFirstNameValue() throws InterruptedException {
		myAccountSteps.verifyFirstNameValue();
	}

	@Then("^Verify Last Name Value$")
	public void verifyLastNameValue() throws InterruptedException {
		myAccountSteps.verifyLastNameValue();
	}

	@Then("^Verify Email Address Value$")
	public void verifyEmailAddressValue() throws InterruptedException {
		myAccountSteps.verifyEmailAddressValue();
	}

	@Then("^Verify Home Address Value$")
	public void verifyHomeAddressValue() throws InterruptedException {
		myAccountSteps.verifyHomeAddressValue();
	}

	@Then("^Verify Membership Info Title$")
	public void verifyMembershipInfoTitle() throws InterruptedException {
		myAccountSteps.verifyMembershipInfoTitle();
	}

	@And("^Click On Side Menu Membership Button$")
	public void clickSideMenuMembershipButton() throws InterruptedException {
		myAccountSteps.clickSideMenuMembershipButton();
	}
	
	@Then("^Verify Become A Member Button$")
	public void verifyBecomeAMemberButton() throws InterruptedException {
		myAccountSteps.verifyBecomeAMemberButton();
	}
	
	@And("^Enter Reset User Name \"([^\"]*)\"$")
	public void enterUsername(String username) {
		myAccountSteps.enterUsername(username);
	}
	
	@And("^Enter Reset Password \"([^\"]*)\"$")
	public void enterPassword(String password) {
		myAccountSteps.enterPassword(password);
	}
	
	@And("^Enter Reset Confirm Password \"([^\"]*)\"$")
	public void enterConfirmPassword(String confirmPassword) throws InterruptedException {
		myAccountSteps.enterConfirmPassword(confirmPassword);
	}
	
	@And("^Click On Reset Password Button$")
	public void clickResetPasswordButton() throws InterruptedException {
		myAccountSteps.clickResetPasswordButton();
	}
	
	@Then("^Click On Reset Button$")
	public void clickResetButton() throws InterruptedException {
		myAccountSteps.clickResetButton();
	}
	
	@And("^Click On LogOff Button$")
	public void clickLogOffButton() throws InterruptedException {
		myAccountSteps.clickLogOffButton();
	}
	
	@And("^Enter Edit Company Name \"([^\"]*)\"$")
	public void enterCompany(String company) throws InterruptedException {
		myAccountSteps.enterCompany(company);
	}
	
	@And("^Select Edit Country \"([^\"]*)\"$")
	public void selectCountry(String country) throws InterruptedException {
		myAccountSteps.selectCountry(country);
	}
	
	@And("^Select Edit State \"([^\"]*)\"$")
	public void selectState(String State) throws InterruptedException {
		myAccountSteps.selectState(State);
	}
	
	@And("^Enter Edit City Name \"([^\"]*)\"$")
	public void enterCity(String city) throws InterruptedException {
		myAccountSteps.enterCity(city);
	}
	
	@And("^Enter Edit Zip Code \"([^\"]*)\"$")
	public void enterZipCode(String zipCode) throws InterruptedException {
		myAccountSteps.enterZipCode(zipCode);
	}
	
	@And("^Enter Edit Work Address \"([^\"]*)\"$")
	public void enterWorkAddress(String workAddress) throws InterruptedException {
		myAccountSteps.enterWorkAddress(workAddress);
	}
	
	@And("^Click On Edit Button$")
	public void clickOnEditButton() throws InterruptedException {
		myAccountSteps.clickOnEditButton();
	}
	
	@Then("^Verify Edit Profile Page Title$")
	public void verifyEditProfilePageTitle() throws InterruptedException {
		myAccountSteps.verifyEditProfilePageTitle();
	}
	
	@And("^Click On Submit Button$")
	public void clickOnSubmitButton() throws InterruptedException {
		myAccountSteps.clickOnSubmitButton();
	}
	
	@And("^Select Primary Phone \"([^\"]*)\"$")
	public void primaryPhoneSelectCountryCode(String primaryPhone) throws InterruptedException {
		myAccountSteps.primaryPhoneSelectCountryCode();
	}
	
	@And("^Click On Work Radio Button$")
	public void clickOnWorkRadioButton() throws InterruptedException {
		myAccountSteps.clickOnWorkRadioButton();
	}
	
	@And("^Enter Area Code \"([^\"]*)\"$")
	public void enterAreaCode(String areaCode) throws InterruptedException {
		myAccountSteps.enterAreaCode(areaCode);
	}
	
	@Then("^Enter Phone Number \"([^\"]*)\"$")
	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		myAccountSteps.enterPhoneNumber(phoneNumber);
	}
	
	@And("^Click On Side Menu Payment Methods Button$")
	public void clickOnSideMenuPaymentMethodsButton() throws InterruptedException {
		myAccountSteps.clickOnSideMenuPaymentMethodsButton();
	}
	
	@Then("^Verify No Saved Payment Methods Found Message$")
	public void verifyNoSavedPaymentMethodsFoundMessage() throws InterruptedException {
		myAccountSteps.verifyNoSavedPaymentMethodsFoundTitle();
	}
	
	@Then("^Click On View Benefits Link$")
	public void clickOnViewBenefitsLink() throws InterruptedException {
		myAccountSteps.clickOnViewBenefitsLink();
	}
	
	@And("^Verify Member Benefits Page Title$")
	public void verifyMemberBenefitsPageTitle() throws InterruptedException {
		myAccountSteps.verifyMemberBenefitsPageTitle();
	}
	
	@Then("^Verify Payment Method Card$")
	public void verifyPaymentMethodCard() throws InterruptedException, AWTException {
		myAccountSteps.verifyPaymentMethodCard();
	}
	
	@Then("^Verify Print Mamber Ship Card Link is Enabled$")
	public void clickOnPrintMamberShipCardLink() throws InterruptedException {
		myAccountSteps.isEnabledPrintMamberShipCardLink();
	}
}
