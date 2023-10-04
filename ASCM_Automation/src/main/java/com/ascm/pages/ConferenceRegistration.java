package com.ascm.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.ascm.util.SeleniumHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConferenceRegistration  extends SeleniumHelper {
	
	public ConferenceRegistration(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[@class='conference-registration-container-wizard-step-boxes-box']")
	WebElementFacade conferenceRegistrationVirtue;
	
	@FindBy(xpath = "(//button[contains(@class,'conference-registration-container-wizard-step-buttons-button')])[last()]")
	WebElementFacade conferenceRegistrationNextPage;
	
	@FindBy(xpath = "//select[@name='Salutation']")
	WebElementFacade selectSalutation;
	
	@FindBy(xpath = "//select[@name='Salutation']/option[@value='miss']")
	WebElementFacade selectSalutationValue;
	
	
	@FindBy(xpath = "//input[@name='Organization']")
	WebElementFacade inputOrganizaton;
	
	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElementFacade inputJobTitle;
	
	@FindBy(xpath = "//label/span[text()='Female']")
	WebElementFacade btnGenderFemale;
	
	@FindBy(xpath = "//select[@name='Age']")
	WebElementFacade selectAge;
	
	@FindBy(xpath = "//select[@name='Age']/option[@value='21-25']")
	WebElementFacade selectAge21to25;
	
	@FindBy(xpath = "//input[@name='EmergencyName']")
	WebElementFacade emergencyContactName;
	
	@FindBy(xpath = "//input[@name='EmergencyPhone']")
	WebElementFacade emergencyContactNumber;
	

	@FindBy(xpath = "(//span[contains(text(),'Add To Cart')])[1]")
	WebElementFacade addToCartButton;
	
	@FindBy(xpath ="//select[@name='MembershipRegion']")
	WebElementFacade selectRegion;
	
	@FindBy(xpath="//label[@for='cb-member-terms']")
	WebElementFacade checkBoxTerms;
	
	@FindBy(xpath = "//label[@for='cb-release-waiver']")
	WebElementFacade releaseWaiwerCheckBox;
	
	@FindBy(xpath = "//label[@for='cb-agree-terms']")
	WebElementFacade ascmConnectTermCheckBox;
	
	@FindBy(xpath = "//a[text()='Select Chapter']")
	WebElementFacade btnSelectChapter;
	
	@FindBy(xpath = "//button[contains(text(),'Back')]")
	WebElementFacade btnBack;
	
	@FindBy(xpath = "conference-registration-container-wizard-step-summary-row-text")
	WebElementFacade hotelBlockDiscount;
	
	@FindBy(xpath = "//div[@class='conference-registration-container-wizard-step-summary-row']")
	List<WebElementFacade> verifySummary;
	
	@FindBy(xpath = "//label[@for='cb-hotel-stay']")
	WebElementFacade cbHotelStay;
	
	@FindBy(xpath = "//label[@for='cb-local-chapter']")
	WebElementFacade cbChapterDiscount;
	
	@FindBy(xpath = "//label[@for='cb-first-time']")
	WebElementFacade cbFirstTime;
	
	@FindBy(xpath = "//label[@for='cb-fed-discount']")
	WebElementFacade cbFedDiscount;
	
	@FindBy(xpath = "//label[@for='cb-meal-vegetarian']")
	WebElementFacade cbMealVegetarian;
	
	@FindBy(xpath = "//label[@for='cb-meal-halal']")
	WebElementFacade cbMealHalal;
	
	@FindBy(xpath = "//label[@for='cb-add-guess']")
	WebElementFacade cbAddGuest;
	
	@FindBy(xpath = "//span[contains(text(),'Show details')]")
	WebElementFacade showMoreDetails;
	
	@FindBy(xpath = "//input[@name='GuestFirstName']")
	WebElementFacade guestFName;
	
	@FindBy(xpath = "//input[@name='GuestLastName']")
	WebElementFacade guestLName;

	@FindBy(xpath = "//input[@name='GuestEmail']")
	WebElementFacade guestEmail;
	
	@FindBy(xpath = "//div[contains(@class,'row mb-2')]")
	List<WebElementFacade> orderSummary;
	
	public void clickOnConferenceVirtue() {
		jsClick(conferenceRegistrationVirtue);
	}
	
	public void clickOnConferenceNextButton() {
		jsClick(conferenceRegistrationNextPage);
	}
	
	public void selectSalutationMiss() {
		jsClick(selectSalutation);
		jsClick(selectSalutationValue);
	}
	
	public void enterOrganization(String org) {
		inputOrganizaton.sendKeys(org);
	}
	
	public void enterJobTitle(String job) {
		inputJobTitle.sendKeys(job);
	}
	
	public void clickOnFemaleGender() {
		jsClick(btnGenderFemale);
	}	
	
	public void selectAge() {
		Select select=new Select(selectAge);
		select.selectByValue("21-25");
	}
	
	public void enterEmergencyContactName(String name) {
		emergencyContactName.sendKeys(name);
	}
	
	public void enterEmergencyContactNumber(String num) {
		emergencyContactNumber.sendKeys(num);
	}
	
	public void clickOnAddToCart() {
		jsClick(addToCartButton);
	}
	
	public void selectRegion(String region) {
		Select select=new Select(selectRegion);
		select.selectByVisibleText(region);
	}
	
	public void checkTheTerms() {
		jsClick(checkBoxTerms);
	}
	
	public void checkAddToCartTerms() {
		jsClick(ascmConnectTermCheckBox);
		jsClick(releaseWaiwerCheckBox);
	}

	public void checkkAddToCartTermsForVirtue() {
		jsClick(ascmConnectTermCheckBox);
	}
	
	
	
	public void clickSelectChapter() {
		jsClick(btnSelectChapter);
	}
	
	public void clickOnBackButton() {
		jsClick(btnBack);
	}
	
	
	public void validateSummary() {
		for (WebElementFacade summary:verifySummary) {
			String text=getElementText(summary);
			text=text.replace("\n", "  ").replace("\r", "  ");
			System.out.println("Summery "+text);
			//Serenity.recordReportData().withTitle(text).andContents(text);
		}
	}
	
	public void clickOnCbHotelStay() {
		try {
			jsClick(cbHotelStay);
		} catch (Exception e) {
		}
		
	}
	
	public void clickOnCbChapterDiscount() {
		try {
			jsClick(cbChapterDiscount);
		} catch (Exception e) {
		}
		
	}
	
	public void clickOnCbFirstTimeDiscount() {
		try {
		jsClick(cbFirstTime);
		} catch (Exception e) {
		}
		
	}
	
	public void clickOnCbFEDDiscount() {
		try {
			jsClick(cbFedDiscount);
		} catch (Exception e) {
		}
		
	}
	
	public void clickOnShowMore() {
		jsClick(showMoreDetails);
	}
	
	public void selectMeals() {
		jsClick(cbMealHalal);
		jsClick(cbMealVegetarian);
	}
	
	public void checkAddAGuest() {
		jsClick(cbAddGuest);
	}
	
	
	public void enterGuestDetails() {
		guestFName.sendKeys("TestFName");
		guestLName.sendKeys("TestLName");
		guestEmail.sendKeys("test@Email.com");
	}
	
	public void validateOrderSummary() {
		for (WebElementFacade summary:orderSummary) {
			String text=getElementText(summary);
			text=text.replace("\n", "  ").replace("\r", "  ");
			System.out.println("Order Summery "+text);
			//Serenity.recordReportData().withTitle(text).andContents(text);
		}
	}
}
