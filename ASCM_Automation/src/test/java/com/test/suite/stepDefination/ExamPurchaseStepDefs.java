package com.test.suite.stepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import com.ascm.pages.CheckoutConstants;
import com.ascm.pages.Waits;
import com.test.suite.testSteps.ExamPurchaseSteps;
import net.thucydides.core.annotations.Steps;

public class ExamPurchaseStepDefs {
	@Steps
	ExamPurchaseSteps examPurchaseSteps;

	@Then("^Click OK button for Code OF Ethics module$")
	public void click_OK_button_for_Code_OF_Ethics_module() {
		examPurchaseSteps.clickOKButtonCodeOfEthicsStep();
	}

	@Then("^Click Add to Cart button for CPIM PartOne$")
	public void click_Add_to_Cart_button_for_CPIM_PartOne() {
		examPurchaseSteps.clickCPIMPart1Step();
	}

	@Then("^Click Add to Cart button for CPIM PartTwo$")
	public void click_Add_to_Cart_button_for_CPIM_PartTwo() {
		examPurchaseSteps.clickCPIMPart2Step();
	}

	@Then("^Click Add to Cart button for CPIM PartOne-Retake$")
	public void click_Add_to_Cart_button_for_CPIM_PartOne_Retake() {
		examPurchaseSteps.clickCPIMPart1RetakeStep();
	}
	
	@Then("^Verifying Purchase Multiple Link Is Present$")
	public void verify_Purchase_Multiple_Link_Is_Present() throws InterruptedException {
		examPurchaseSteps.verifyPurchaseMultipleLinkIsPresent();
	}
	
	

	@Then("^Click Add to Cart button for CPIM PartTwo-Retake$")
	public void click_Add_to_Cart_button_for_CPIM_PartTwo_Retake() {
		examPurchaseSteps.clickCPIMPart2RetakeStep();
	}

	@Then("^Click Add to Cart button for CLTD-First Attempt$")
	public void click_Add_to_Cart_button_for_CLTD_First_Attempt() {
		examPurchaseSteps.clickCLTDStep();
	}

	@Then("^Click CLTD$")
	public void click_CLTD() {
		examPurchaseSteps.clickCLTD();
	}

	@Then("^Click Warehouse$")
	public void click_Warehouse() {
		examPurchaseSteps.clickWarehouse();
	}

	@Then("^Click Add to Cart button for CLTD-Retake$")
	public void click_Add_to_Cart_button_for_CLTD_Retake() {
		examPurchaseSteps.clickCLTDRetakeStep();
	}

	@Then("^Click Add to Cart button for CSCP-First Attempt$")
	public void click_Add_to_Cart_button_for_CSCP_First_Attempt() {
		examPurchaseSteps.clickCSCPStep();
	}

	@Then("^Click Add to Cart button for SCORP-Retake$")
	public void click_Add_to_Cart_button_for_SCORP_Retake() {

	}

	@Then("^Click Learning And Development Top Navigation$")
	public void clickLearningAndDevelopmentTopNavigation() throws IOException {
		examPurchaseSteps.clickLearningAndDevelopmentTopNavigation();
	}

	@Then("^Click CPIM$")
	public void click_CPIM() throws IOException {
		examPurchaseSteps.clickCPIM();
	}
	
	@Then("^Verify \"([^\"]*)\" Product Page$")
	public void verifySelectedProductPage(String arg) throws IOException, InterruptedException {
		examPurchaseSteps.verifySelectedProductPage(arg);
	}
	
	@Then("^Verify \"([^\"]*)\" Product Is Added In Cart$")
	public void verifySelectedProductAddedInCart(String arg) throws IOException, InterruptedException {
		examPurchaseSteps.verifySelectedProductAddedInCart(arg);
	}
	
	@Then("^Click Skip Chapter$")
	public void click_Skip_Button_Step() throws InterruptedException {
		examPurchaseSteps.clickSkipButtonStep();
	}
	
	@Then("^Verify \"([^\"]*)\" Certificate Page$")
	public void verifySelectedCertificatePage(String arg) throws IOException, InterruptedException {
		examPurchaseSteps.verifySelectedCertificatePage(arg);
	}
	
	

	@Then("^Select Exam Region$")
	public void Select_Coutry_Exam_Region() throws IOException {
		examPurchaseSteps.selectCoutryExamRegion(CheckoutConstants.ExamCountryRegion);
	}

	@Then("^Exam Add To Card$")
	public void click_Add_To_Card_Exam_Button() throws IOException {
		examPurchaseSteps.clickAddToCardExamButton();
	}

	@Then("^Fill in the following For Address$")
	public void enterAddressForExam(DataTable table) throws InterruptedException, IOException {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);
		for (Map<String, String> columns : rows) {
			setAddressForExam(columns.get("Field"), columns.get("Value"));
		}
	}

	private void setAddressForExam(String field, String value) throws InterruptedException {
		if (field.equalsIgnoreCase("country")) {
			examPurchaseSteps.selectCountryStep(value);
		} else if (field.equalsIgnoreCase("company")) {
			examPurchaseSteps.enterCompany(value);
		} else if (field.equalsIgnoreCase("streetAddress")) {
			examPurchaseSteps.enterMailingAddressLine1Step(value);
		} else if (field.equalsIgnoreCase("City")) {
			examPurchaseSteps.enterMailingcityStep(value);
		} else if (field.equalsIgnoreCase("State")) {
			examPurchaseSteps.enterMailingStateStep(value);
		} else if (field.equalsIgnoreCase("postalCode")) {
			examPurchaseSteps.enterMaililingZipCodeStep(value);
		} else if (field.equalsIgnoreCase("CountryType")) {
			examPurchaseSteps.selectCountryType(value);
		} else if (field.equalsIgnoreCase("Country Code")) {
			examPurchaseSteps.selectCountryAreaCode(value);
		} else if (field.equalsIgnoreCase("Area Code")) {
			examPurchaseSteps.enterAreaCode(value);
		} else if (field.equalsIgnoreCase("Phone Number")) {
			examPurchaseSteps.enterPhoneNumber(value);
		}

//		switch (field) {
//		
//
//		case "streetAddress":
//			
//			
//			break;
//		case "City":
//			examPurchaseSteps.enterMailingcityStep(value);
//		
//			break;
//
//		case "State":
//			examPurchaseSteps.enterMailingStateStep(value);
//			break;
//
//		case "postalCode":
//			examPurchaseSteps.enterMaililingZipCodeStep(value);
//			break;
//		case "CountryType":
//			examPurchaseSteps.selectCountryType(value);
//			break;
//		case "Country Code":
//			examPurchaseSteps.selectCountryAreaCode(value);
//			break;
//		 case "Area Code":
//			 examPurchaseSteps.enterAreaCode(value);
//				break;
//		 case "Phone Number":
//			 examPurchaseSteps.enterPhoneNumber(value);
//				
//				break;
//		}

	}

	@Then("^Fill in the following fields for warehouse mailing section$")
	public void warehousingMailingSection(DataTable table) throws InterruptedException {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		for (Map<String, String> columns : rows) {
			setWarehousingMaillingSectionForm(columns.get("Field"), columns.get("Value"));
		}
	}

	private void setWarehousingMaillingSectionForm(String field1, String value1) throws InterruptedException {

		if (field1.equalsIgnoreCase("country")) {
			examPurchaseSteps.selectBillingCountryStep(CheckoutConstants.MAILING_COUNTRY);
		} else if (field1.equalsIgnoreCase("company")) {
			examPurchaseSteps.enterBillingCompany(CheckoutConstants.MAILING_COMPANY);
		} else if (field1.equalsIgnoreCase("streetAddress")) {
			examPurchaseSteps
					.enterBillingMailingAddressLine1Step(CheckoutConstants.MAILING_ADDRESS_LINE1_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("City")) {
			examPurchaseSteps.enterBillingMailingcityStep(CheckoutConstants.MAILING_CITY_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("State")) {
			examPurchaseSteps.enterBillingMailingStateStep(CheckoutConstants.MAILING_STATE_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("postalCode")) {
			examPurchaseSteps.enterBillingMaililingZipCodeStep(CheckoutConstants.MAILING_ZIP_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("FirstName")) {
			examPurchaseSteps.enterFirstName(CheckoutConstants.MAILING_FIRST_NAME);
		} else if (field1.equalsIgnoreCase("LastName")) {
			examPurchaseSteps.enterLastName(CheckoutConstants.MAILING_LAST_NAME);
		}
	}

	@Then("^Fill in the following fields for international mailing section$")
	public void internationalMailingSection(DataTable table) throws InterruptedException {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		for (Map<String, String> columns : rows) {
			setInternationalMaillingSectionForm(columns.get("Field"), columns.get("Value"));
		}
	}

	private void setInternationalMaillingSectionForm(String field1, String value1) throws InterruptedException {

		if (field1.equalsIgnoreCase("country")) {
			examPurchaseSteps.selectCountryStep(CheckoutConstants.MAILING_COUNTRY);
		} else if (field1.equalsIgnoreCase("company")) {
			examPurchaseSteps.enterCompany(CheckoutConstants.MAILING_COMPANY);
		} else if (field1.equalsIgnoreCase("streetAddress")) {
			examPurchaseSteps.enterMailingAddressLine1Step(CheckoutConstants.MAILING_ADDRESS_LINE1_NORTHAMERICA);
		} else if (field1.equalsIgnoreCase("City")) {
			examPurchaseSteps.enterMailingcityStep(CheckoutConstants.MAILING_CITY_NORTHAMERICA);
		} else if (field1.equalsIgnoreCase("State")) {
			examPurchaseSteps.enterMailingStateStep(CheckoutConstants.MAILING_STATE_NORTHAMERICA);
		} else if (field1.equalsIgnoreCase("postalCode")) {
			examPurchaseSteps.enterMaililingZipCodeStep(CheckoutConstants.MAILING_ZIP_NORTHAMERICA);
		} else if (field1.equalsIgnoreCase("CountryType")) {
			examPurchaseSteps.selectCountryType(CheckoutConstants.MAILING_COUNTRY_TYPE);
		} else if (field1.equalsIgnoreCase("Country Code")) {
			examPurchaseSteps.selectCountryAreaCode(CheckoutConstants.MAILING_COUNTRY_CODE);
		} else if (field1.equalsIgnoreCase("Area Code")) {
			examPurchaseSteps.enterAreaCode(CheckoutConstants.AREA_CODE);
		} else if (field1.equalsIgnoreCase("Phone Number")) {
			examPurchaseSteps.enterPhoneNumber(CheckoutConstants.PHONE_NUMBER);
		}

	}
	
	//Los Angeles
	
	@Then("^Fill in the following fields for Los Angeles mailing section$")
	public void LosAngelesMailingSection(DataTable table) throws InterruptedException {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		for (Map<String, String> columns : rows) {
			setInternationalMaillingSectionForm(columns.get("Field"), columns.get("Value"));
		}
	}

	private void setLosAngelesMaillingSectionForm(String field1, String value1) throws InterruptedException {

		if (field1.equalsIgnoreCase("country")) {
			examPurchaseSteps.selectCountryStep(CheckoutConstants.MAILING_COUNTRY_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("company")) {
			examPurchaseSteps.enterCompany(CheckoutConstants.MAILING_COMPANY);
		} else if (field1.equalsIgnoreCase("streetAddress")) {
			examPurchaseSteps.enterMailingAddressLine1Step(CheckoutConstants.MAILING_ADDRESS_LINE1_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("City")) {
			examPurchaseSteps.enterMailingcityStep(CheckoutConstants.MAILING_CITY_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("State")) {
			examPurchaseSteps.enterMailingStateStep(CheckoutConstants.MAILING_STATE_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("postalCode")) {
			examPurchaseSteps.enterMaililingZipCodeStep(CheckoutConstants.MAILING_ZIP_INTERNATIONAL);
		} else if (field1.equalsIgnoreCase("CountryType")) {
			examPurchaseSteps.selectCountryType(CheckoutConstants.MAILING_COUNTRY_TYPE);
		} else if (field1.equalsIgnoreCase("Country Code")) {
			examPurchaseSteps.selectCountryAreaCode(CheckoutConstants.MAILING_COUNTRY_CODE);
		} else if (field1.equalsIgnoreCase("Area Code")) {
			examPurchaseSteps.enterAreaCode(CheckoutConstants.AREA_CODE);
		} else if (field1.equalsIgnoreCase("Phone Number")) {
			examPurchaseSteps.enterPhoneNumber(CheckoutConstants.PHONE_NUMBER);
		}

	}
	

	@Then("^click Work Address Radio Button$")
	public void click_Work_Address_Radio_Button() throws InterruptedException {
		Waits.wait3Second();
		examPurchaseSteps.clickWorkAddressReadioButton();
		;
	}

	@Then("^click Credit Card Radio Button$")
	public void clickCreditCardRadioButton() {
		examPurchaseSteps.clickCreditCardRadioButton();
	}

	@Then("^click Credit Card Brain Tree Radio Button$")
	public void clickCreditCardBrainTreeRadioButton() {
		examPurchaseSteps.clickCreditBrainTreeCardRadioButton();
	}

	@Then("^Get OrderNo$")
	public void getOrderNo() throws InterruptedException {
		examPurchaseSteps.getOrderNo();
	}

	@Then("^Get ReferenceCode$")
	public void getReferenceCode() throws InterruptedException {
		examPurchaseSteps.getReferenceCode();
	}

	@Then("^click CSCP$")
	public void clickCSCPNavigation() throws InterruptedException {
		examPurchaseSteps.clickCSCPNavigation();
	}

	@Then("^click CPIM LsExam Part2$")
	public void clickCPIMLsExamPart2() throws InterruptedException {
		examPurchaseSteps.clickCPIMLsExamPart2();
	}

	@Then("^Select Bundle Country Region$")
	public void Select_Bundle_Coutry_Region() throws IOException {
		examPurchaseSteps.selectBundleCoutryRegion(CheckoutConstants.BundleCountryRegion);
	}

	@Then("^select Country$")
	public void Select_Bundle_Coutry() throws IOException, InterruptedException {
		examPurchaseSteps.selectBundleCoutry("United States");
	}

	@Then("^Click Bundle Aggress Button$")
	public void click_Aggres_Button() throws IOException {
		examPurchaseSteps.clickAggressButton();
	}

	@Then("^Click Bundle Add To Card$")
	public void click_Bundle_Add_To_Card_Exam_Button() throws IOException {
		examPurchaseSteps.clickBundleAddToCardExamButton();
	}
	@Then("^Verify Membership Upcell CTA Text$")
	public void verify_Membership_Upcell_CTA() throws IOException {
		examPurchaseSteps.verifyMembershipUpcellCTA();
	}
	
	@Then("^Click On Upgrade Now$")
	public void clickOnUpgradeNowButton() throws IOException, InterruptedException {
		examPurchaseSteps.clickOnUpgradeNowButton();
	}
	@Then("^Verify Upgrade Certificate Modal$")
	public void verifyUpgradeCertificateModal() throws IOException {
		examPurchaseSteps.verifyUpgradeCertificateModal();
	}

	@Then("^Enter Post Code$")
	public void EnterBundlePostCode() throws IOException {
		examPurchaseSteps.EnterBundlePostCode(CheckoutConstants.MAILING_ZIP_NORTHAMERICA);
	}
	
	@Then("^Verify Return Policy Page$")
	public void verifyReturnPolicyPage() throws IOException, InterruptedException {
		examPurchaseSteps.verifyReturnPolicyPage();
	}

	@Then("^Click Return Policy$")
	public void clickReturnPolicy() throws IOException, InterruptedException {
		examPurchaseSteps.clickReturnPolicy();
	}

	@Then("^Search Postal Code$")
	public void clickSearchBundleCode() throws IOException, InterruptedException {
		examPurchaseSteps.clickSearchBundleCode();
	}

	@Then("^Select Item$")
	public void clickSearchBundle() throws IOException, InterruptedException {
		examPurchaseSteps.clickSearchBundle();
	}
	@Then("^Select International Item$")
	public void clickInternationalChapter() throws IOException, InterruptedException {
		examPurchaseSteps.clickInternationalChapter();
	}
	
	
	
	@Then("^Select Multiple Item$")
	public void click_Multiple_Items() throws IOException, InterruptedException {
		examPurchaseSteps.clickMultipleItemsSteps();
	}

	@Then("^Add Selected Item$")
	public void clickAddSelectedButton() throws IOException, InterruptedException {
		examPurchaseSteps.clickAddSelectedButton();
	}

	@Then("^Choose a \"([^\"]*)\" brain tree plan to pay$")
	public void chooseawaytopay(String value) throws InterruptedException {
		examPurchaseSteps.chooseawaytopay(value);
	}
}
