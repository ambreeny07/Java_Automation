package com.test.suite.stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ascm.pages.CheckoutConstants;
import com.ascm.pages.ExamPurchagePage;
import com.ascm.pages.LaunchApplication;
import com.ascm.pages.Waits;
import com.test.suite.testSteps.CheckOutSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class CheckOutStepDefs extends PageObject {

	CheckoutConstants checkoutConstants;
	LaunchApplication launchApplication;

	@Steps
	CheckOutSteps checkOutSteps;

	@Then("^Click Proceed to Continue button$")
	public void click_Proceed_to_Continue_button() throws InterruptedException {
		checkOutSteps.clickProceedToCheckOutButtonStep();
	}

	@Then("^Select Home  country$")
	public void select_Home_country() throws InterruptedException {
		Thread.sleep(300);
		checkOutSteps.selectHomeCountryStep();

	}
	@Then("^Go with Referral Link$")
	public void goWithReferralLink() throws InterruptedException {
		Thread.sleep(300);
		launchApplication.goToReferralLink();

	}
	
	@Then("^Close the Browser$")
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(300);
		launchApplication.closeBrowser();

	}
	
	

	// This is for billing section
	@Then("^Enter billing first name \"([^\"]*)\"$")
	public void enter_billing_first_name(String arg1) {
		checkOutSteps.enterBillingFirstNameStep(arg1);
	}

	@Then("^Enter billing last name \"([^\"]*)\"$")
	public void enter_billing_last_name(String arg1) {
		checkOutSteps.enterBillingLastNameStep(arg1);
	}

	@Then("^Enter billing city name \"([^\"]*)\"$")
	public void enter_billing_city_name(String arg1) {
		checkOutSteps.enterBillingcityStep(arg1);
	}

	@Then("^Enter Address line (\\d+) \"([^\"]*)\"$")
	public void enter_Address_line(int arg1, String arg2) {
		checkOutSteps.enterBillingAddressLine1Step(arg2);
	}

	@Then("^Enter billing State$")
	public void enter_billing_State() {
		checkOutSteps.enterBillingStateStep();
	}

	@Then("^Enter Billing zip code \"([^\"]*)\"$")
	public void enter_Billing_zip_code(String arg1) {
		checkOutSteps.enterBillingZipCodeStep(arg1);
	}

	@Then("^Click Next Payment Information button$")
	public void click_next_payment_button() throws InterruptedException {
		checkOutSteps.clickContinueButtonStep();
	}

	@Then("^Click same as billing button$")
	public void click_same_as_billing_button() {
		checkOutSteps.clickSameAsBillingButtonStep();
	}

	@Then("^Fill in the following fields for Payment Method section$")
	public void PaymentMethodSection(DataTable table) {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		for (Map<String, String> columns : rows) {
			setPaymentMethodSectionForm(columns.get("Field"), columns.get("Value"));
		}
	}

	private void setPaymentMethodSectionForm(String field, String value) {
		if (field.equalsIgnoreCase("Name on Card")) {
			checkOutSteps.typeCardnameStep(CheckoutConstants.CC_NAME);
		} else if (field.equalsIgnoreCase("Card Number")) {
			checkOutSteps.enterPaymentCardStep(CheckoutConstants.CC_NUMBER);
		} else if (field.equalsIgnoreCase("Security Code")) {
			checkOutSteps.enterCreditCardSecutiryCodeStep(CheckoutConstants.CC_SECURITY_CODE);
		} else if (field.equalsIgnoreCase("Expiration Month")) {
			checkOutSteps.selectCreditCardExpirationMonthStep(CheckoutConstants.CC_EXPIRATION_MONTH);
		} else if (field.equalsIgnoreCase("Expiration Year")) {
			checkOutSteps.selectCreditCardExpirationYearStep(CheckoutConstants.CC_EXPIRATION_YEAR);
		}
//		switch (field) {
//		case "Name on Card":
//			checkOutSteps.typeCardnameStep(CheckoutConstants.CC_NAME);
//			break;
//
//		case "Card Number":
//			checkOutSteps.enterPaymentCardStep(CheckoutConstants.CC_NUMBER);
//			break;
//
//		case "Security Code":
//			checkOutSteps.enterCreditCardSecutiryCodeStep(CheckoutConstants.CC_SECURITY_CODE);
//			break;
//
//		case "Expiration Month":
//			checkOutSteps.selectCreditCardExpirationMonthStep(CheckoutConstants.CC_EXPIRATION_MONTH);
//			break;
//
//		case "Expiration Year":
//			checkOutSteps.selectCreditCardExpirationYearStep(CheckoutConstants.CC_EXPIRATION_YEAR);
//			break;
//		}
	}

	@Then("^Click Next Review button$")
	public void click_Next_Reviw_button() throws InterruptedException {
		checkOutSteps.clickNextReviwButtonStep();
	}

	@Then("^Click Place Order button$")
	public void click_Place_Order_button() {
		checkOutSteps.clickPlaceOrderButtonStep();
	}

	@Then("^Click first address radio button$")
	public void click_first_address_radio_button() {
		checkOutSteps.clickFirstAddressRadioButtonStep();
	}

	@Then("^Click Select Address button$")
	public void click_Select_Address_button() {
		checkOutSteps.clickSelectAddressButtonStep();

	}

	@Then("^Click Shipping Method$")
	public void clickShippingMethodRadioButtonn() {
		checkOutSteps.clickShippingMethodRadioButtonStep();
	}

	@Then("^Click Next Button$")
	public void click_next_Button() {
		checkOutSteps.ClickNextButtonStep();

	}

	@Then("^Click LS Exam Pre Add To Card$")
	public void Click_LS_Exam_Pre_AddToCard_Button() throws InterruptedException {
		checkOutSteps.ClickLSExamPreAddToCardButtonStep();
	}

	@Then("^Click on PayPal button$")
	public void click_on_PayPal_radio_button() {
		checkOutSteps.clickOnPayPalButtonStep();

	}

	@Then("^Click Login$")
	public void click_PayPal_Login_button() {
		checkOutSteps.clickPayPalLoginStep();
	}

	@Then("^Enter PayPal userName")
	public void enter_PayPal_userName() {
		checkOutSteps.enterPayPalUserNameStep(checkoutConstants.PAYPALEMAIL);
	}

	@Then("^Enter PaPal password")
	public void enter_PaPal_password() {
		checkOutSteps.enterPayPalPasswordStep(checkoutConstants.PAYPALPASSWORD);
	}

	@Then("^Click Login button$")
	public void click_Login_button() {
		checkOutSteps.clickPayPalLoginButtonStep();
	}

	@Then("^Click Pay Now button$")
	public void click_Pay_Now_button() throws InterruptedException {
		checkOutSteps.clickPayPalPayNowButtonStep();
	}

	@Then("^Click Accept Cookies$")
	public void click_Accept_Cookies_button() {
		checkOutSteps.clickAcceptCookiesStep();
	}

	// PromoCode
	@Then("^Enter Promo Code")
	public void enter_promo_code_step() throws InterruptedException {
		checkOutSteps.enterPromoCodeStep(checkoutConstants.PROMOCODE);
	}

	@Then("^Click Promo Code Apply$")
	public void click_promo_code_apply_step() throws InterruptedException {
		checkOutSteps.clickPrmoCodeApplyStep();
	}

	@Then("^Get Promo Discount Amount$")
	public void get_promo_discount_value() {
		checkOutSteps.getPromoDiscountValueStep();
	}

	@Then("^Fill in the following fields for Brain Tree Payment Method section$")
	public void BrainTreePaymentMethodSection(DataTable table) throws InterruptedException {
		try {
			Waits.wait10Second();
			String xpath = "//div[contains(@class,'braintree-methods--active')]";
			WebElement caard = getDriver().findElement(By.xpath(xpath));
			if (caard.isDisplayed()) {
				System.out.print("Card Already Present");
			}
		}catch (Exception e) {
			List<Map<String, String>> rows = table.asMaps(String.class, String.class);

			for (Map<String, String> columns : rows) {
				setBrainTreePaymentMethodSectionForm(columns.get("Field"), columns.get("Value"));
			}
		}
		

	}


	private void setBrainTreePaymentMethodSectionForm(String field, String value) {
		if (field.equalsIgnoreCase("Card Number")) {
			checkOutSteps.enterBrainTreeCreditCardNoStep(CheckoutConstants.CC_NUMBER);
		} else if (field.equalsIgnoreCase("Security Code")) {
			checkOutSteps.enterBrainTreeCreditCardCVVStep(CheckoutConstants.CC_SECURITY_CODE);
		} else if (field.equalsIgnoreCase("Expiration")) {
			checkOutSteps.enterBrainTreeCreditExpirationStep(CheckoutConstants.CC_BRAIN_TREE_EXPIRATION);
		} else if (field.equalsIgnoreCase("Postal Code")) {
			checkOutSteps.enterBrainTreeCreditPostalCodeStep(CheckoutConstants.CC_BRAIN_TREE_POSTAL_CODE);
		}
//		switch (field) {
//		case "Card Number":
//			checkOutSteps.enterBrainTreeCreditCardNoStep(CheckoutConstants.CC_NUMBER);
//			break;
//
//		case "Security Code":
//			checkOutSteps.enterBrainTreeCreditCardCVVStep(CheckoutConstants.CC_SECURITY_CODE);
//			break;
//
//		case "Expiration":
//			checkOutSteps.enterBrainTreeCreditExpirationStep(CheckoutConstants.CC_BRAIN_TREE_EXPIRATION);
//			break;
//
//		case "Postal Code":
//			checkOutSteps.enterBrainTreeCreditPostalCodeStep(CheckoutConstants.CC_BRAIN_TREE_POSTAL_CODE);
//			break;
//		}
	}
}
