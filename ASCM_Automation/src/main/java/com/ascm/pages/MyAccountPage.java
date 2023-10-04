package com.ascm.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ascm.util.SeleniumHelper;
import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends SeleniumHelper {
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//td[text()='ASCM ID']/following-sibling::td")
	WebElementFacade ascmIdValue;

	@FindBy(xpath = "//td[text()='Username']/following-sibling::td")
	WebElementFacade userameValue;

	@FindBy(xpath = "//td[text()='First Name']/following-sibling::td")
	WebElementFacade firstNameValue;

	@FindBy(xpath = "//td[text()='Last Name']/following-sibling::td")
	WebElementFacade lastNameValue;

	@FindBy(xpath = "//td[text()='Email Address']/following-sibling::td")
	WebElementFacade emailAddressValue;

	@FindBy(xpath = "//td[text()='Home Address']/following-sibling::td")
	WebElementFacade homeAddressValue;

	@FindBy(xpath = "//li[@class='myAccount-nav-list-item']/a[text()='Membership']")
	WebElementFacade sideMenuMembershipBtn;

	@FindBy(xpath = "//h3[@class='myAccount-membership-box-section-mainTitle']")
	WebElementFacade MembershipInfoTitle;

	@FindBy(xpath = "//a[@class='button myAccount-membership-noAccount-button']")
	WebElementFacade becomeAMemberBtn;

	@FindBy(xpath = "//a[text()='Reset Password']")
	WebElementFacade resetPasswordBtn;

	@FindBy(xpath = "//input[@id='Email']")
	WebElementFacade usernameTxt;

	@FindBy(xpath = "//input[@id='Password']")
	WebElementFacade passwordTxt;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElementFacade confirmPasswordTxt;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElementFacade resetBtn;

	@FindBy(xpath = "//a[text()='Log off']")
	WebElementFacade logOffBtn;

	@FindBy(xpath = "//a[@class='edit-link']")
	WebElementFacade editBtn;

	@FindBy(xpath = "//h2[text()='Edit Profile']")
	WebElementFacade editProfileTitle;

	@FindBy(xpath = "//input[@id='Company']")
	WebElementFacade companyTxt;

	@FindBy(xpath = "//input[@id='WorkAddressLine1']")
	WebElementFacade workAddressTxt;

	@FindBy(xpath = "//span[@id='select2-PersonEntity_CountryCodeID-container']")
	WebElementFacade selectCountry;

	@FindBy(xpath = "//span[@id='select2-PersonEntity_CountryCodeID-container']/following-sibling::span")
	WebElementFacade selectCountryArrowBtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElementFacade selectCountrySearch;

	@FindBy(xpath = "//li[text()='United States']")
	WebElementFacade selectCountrySearchUnitedStates;

	@FindBy(xpath = "//input[@id='WorkCity']")
	WebElementFacade cityTxt;

	@FindBy(xpath = "//select[@id='PersonEntity_State-select']")
	WebElementFacade selectState;

	@FindBy(xpath = "(//option[@value='IL'])[1]")
	WebElementFacade selectStateOption;

	@FindBy(xpath = "//input[@id='WorkZipCode']")
	WebElementFacade zipCodeTxt;

	@FindBy(xpath = "(//input[@value='Submit'])[last()]")
	WebElementFacade submitBtn;

	@FindBy(xpath = "//select[@id='PrimaryPhoneCountryCode']")
	WebElementFacade primaryPhoneSelectBtn;

	@FindBy(xpath = "(//option[text()='US & Canada (+1)'])[1]")
	WebElementFacade primaryPhoneOptionUsAndCanada;

	@FindBy(xpath = "//input[@id='PrimaryPhoneAreaCode']")
	WebElementFacade areaCodeTxt;

	@FindBy(xpath = "//input[@id='PrimaryPhoneNumber']")
	WebElementFacade phoneNumberTxt;

	@FindBy(xpath = "//input[@id='PrimaryPhoneTypeWork']")
	WebElementFacade TypeWorkRadioBtn;

	@FindBy(xpath = "//li[@class='myAccount-nav-list-item']/a[text()='Payment Methods']")
	WebElementFacade sideMenuPaymentMethodsBtn;

	@FindBy(xpath = "//p[text()='No saved payment methods found.']")
	WebElementFacade noSavedPaymentMethodsFoundTitle;
	
	@FindBy(xpath = "//a[text()='View Benefits']")
	WebElementFacade viewBenefitsLink;
	
	@FindBy(xpath = "//h1[text()='Member Benefits']")
	WebElementFacade memberBenefitsPageTitle;
	
	@FindBy(xpath = "(//div[@class='payment-block-module-logo'])[1]")
	WebElementFacade paymentMethodCard;
	
	@FindBy(xpath = "//a[@id='print-card-trigger']")
	WebElementFacade printMamberShipCardLink;
	
	@FindBy(xpath = "//embed[@type='application/x-google-chrome-pdf']")
	WebElementFacade mamberShipCardInPrint;
	
	

	// Below are methods for login page

	public void verifyACSMIdValue() throws InterruptedException {
		scrollToBottom();
		waitForElementVisibility(ascmIdValue, 20);
	}

	public void verifyUsernameValue() throws InterruptedException {
//		waitForElementVisibility(userameValue, 20);
		scrollToElement(userameValue);
		Waits.waitForElementToBeVisibile(userameValue, getDriver(), 300);
		String text = getElementText(userameValue);
		Serenity.recordReportData().withTitle(LoginConstants.stage_MyAccountMemberLoginEmail).andContents(text);
	}

	public void verifyFirstNameValue() throws InterruptedException {

		waitForElementVisibility(firstNameValue, 20);
	}

	public void verifyLastNameValue() throws InterruptedException {

		waitForElementVisibility(lastNameValue, 20);
	}

	public void verifyEmailAddressValue() throws InterruptedException {

//		waitForElementVisibility(emailAddressValue, 20);
		Waits.waitForElementToBeVisibile(emailAddressValue, getDriver(), 300);
		String text = getElementText(emailAddressValue);
		Serenity.recordReportData().withTitle(LoginConstants.stage_MyAccountMemberLoginEmail).andContents(text);
	}

	public void verifyHomeAddressValue() throws InterruptedException {
		waitForElementVisibility(homeAddressValue, 20);
	}

	public void verifyMembershipInfoTitle() throws InterruptedException {
		waitForElementVisibility(MembershipInfoTitle, 20);
	}

	public void verifyBecomeAMemberButton() throws InterruptedException {
		waitForElementVisibility(becomeAMemberBtn, 20);
	}

	public void clickSideMenuMembershipButton() throws InterruptedException {
		Waits.wait3Second();
		try {
			click(sideMenuMembershipBtn);
		} catch (Exception e) {
			jsClick(sideMenuMembershipBtn);
		}
	}

	public void enterUsername(String username) {
		typeInto(usernameTxt, username);
	}

	public void enterPassword(String password) {
		typeInto(passwordTxt, password);
	}

	public void enterConfirmPassword(String confirmPassword) throws InterruptedException {
//		scrollToElement(confirmPasswordTxt);
		scrollToBottom();
		Waits.wait3Second();
		typeInto(confirmPasswordTxt, confirmPassword);
	}

	public void clickResetButton() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(resetBtn);
		try {
			jsClick(resetBtn);
		} catch (Exception e) {
			jsClick(resetBtn);
		}
		Waits.wait3Second();
		Waits.wait3Second();
	}

	public void clickLogOffButton() throws InterruptedException {
		Waits.wait3Second();
		try {
			jsClick(logOffBtn);
		} catch (Exception e) {
			jsClick(logOffBtn);
		}
	}

	public void clickResetPasswordButton() throws InterruptedException {
		Waits.wait3Second();
		scrollToBottom();
		Waits.wait3Second();
		try {
			jsClick(resetPasswordBtn);
		} catch (Exception e) {
			jsClick(resetPasswordBtn);
		}
	}

	public void selectCountry(String country) throws InterruptedException {
		scrollToElement(selectCountry);
		Waits.wait3Second();
		try {
			click(selectCountryArrowBtn);
		} catch (Exception e) {
			jsClick(selectCountryArrowBtn);
		}
		Waits.wait3Second();
		typeInto(selectCountrySearch, country);
		Waits.wait3Second();
		scrollToElement(selectCountrySearchUnitedStates);
		try {
			click(selectCountrySearchUnitedStates);
		} catch (Exception e) {
			jsClick(selectCountrySearchUnitedStates);
		}
	}

	public void selectState(String state) throws InterruptedException {
		scrollToElement(zipCodeTxt);
		Waits.wait3Second();
		try {
			click(selectState);
		} catch (Exception e) {
			jsClick(selectState);
		}
		Waits.wait3Second();
		try {
			click(selectStateOption);
		} catch (Exception e) {
			jsClick(selectStateOption);
		}
	}

	public void enterCity(String city) throws InterruptedException {
		scrollToElement(cityTxt);
		typeInto(cityTxt, city);
	}

	public void enterZipCode(String zipCode) throws InterruptedException {
		scrollToElement(zipCodeTxt);
		typeInto(zipCodeTxt, zipCode);
	}

	public void clickOnSubmitButton() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(submitBtn);
		Waits.wait3Second();
		try {
			jsClick(submitBtn);
		} catch (Exception e) {
			jsClick(submitBtn);
		}
	}

	public void enterCompany(String company) throws InterruptedException {
		scrollToElement(companyTxt);
		typeInto(companyTxt, company);
	}

	public void enterWorkAddress(String workAddress) throws InterruptedException {
		scrollToElement(workAddressTxt);
		typeInto(workAddressTxt, workAddress);
	}

	public void clickOnEditButton() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(editBtn);
		try {
			jsClick(editBtn);
		} catch (Exception e) {
			jsClick(editBtn);
		}
	}

	public void verifyEditProfilePageTitle() throws InterruptedException {
		waitForElementVisibility(editProfileTitle, 20);
	}

	public void primaryPhoneSelectCountryCode() throws InterruptedException {
		scrollToElement(primaryPhoneSelectBtn);
		Waits.wait3Second();
		try {
			click(primaryPhoneSelectBtn);
		} catch (Exception e) {
			jsClick(primaryPhoneSelectBtn);
		}
		Waits.wait3Second();
		try {
			click(primaryPhoneOptionUsAndCanada);
		} catch (Exception e) {
			jsClick(primaryPhoneOptionUsAndCanada);
		}
	}

	public void clickOnWorkRadioButton() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(TypeWorkRadioBtn);
		try {
			click(TypeWorkRadioBtn);
		} catch (Exception e) {
			jsClick(TypeWorkRadioBtn);
		}
	}

	public void enterAreaCode(String areaCode) throws InterruptedException {
		scrollToElement(areaCodeTxt);
		typeInto(areaCodeTxt, areaCode);
	}

	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		scrollToElement(phoneNumberTxt);
		typeInto(phoneNumberTxt, phoneNumber);
	}

	public void clickOnSideMenuPaymentMethodsButton() throws InterruptedException {
		Waits.wait3Second();
		try {
			click(sideMenuPaymentMethodsBtn);
		} catch (Exception e) {
			jsClick(sideMenuPaymentMethodsBtn);
		}
	}

	public void verifyNoSavedPaymentMethodsFoundTitle() throws InterruptedException {
		waitForElementVisibility(noSavedPaymentMethodsFoundTitle, 20);
	}
	
	public void clickOnViewBenefitsLink() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(viewBenefitsLink);
		try {
			click(viewBenefitsLink);
		} catch (Exception e) {
			jsClick(viewBenefitsLink);
		}
	}
	
	public void verifyMemberBenefitsPageTitle() throws InterruptedException {
		waitForElementVisibility(memberBenefitsPageTitle, 20);
	}
	
	public void verifyPaymentMethodCard() throws InterruptedException {
		waitForElementVisibility(paymentMethodCard, 20);
	}

	public void isEnabledPrintMamberShipCardLink() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(printMamberShipCardLink);
		isEnabled(printMamberShipCardLink);
	}
	
}