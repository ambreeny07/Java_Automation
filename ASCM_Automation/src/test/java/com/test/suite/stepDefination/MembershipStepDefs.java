package com.test.suite.stepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.ascm.pages.CheckoutConstants;
import com.ascm.pages.LoginConstants;
import com.ascm.pages.LoginPage;
import com.test.suite.testSteps.MembershipSteps;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MembershipStepDefs {

	@Steps

	MembershipSteps membershipSteps;

	@Then("^Go to Membership Page$")
	public void go_to_Membership_Page() {
		membershipSteps.goMembershipPageStep();
	}
	
	@Then("^Go to Previous Page$")
	public void go_to_PreviousPage() {
		membershipSteps.goToPreviousPageStep();
	}
	
	@Then("^Go to Cart$")
	public void go_to_Cart_Page() {
		membershipSteps.goCartPageStep();
	}
	
	@Then("^Click Become a Memeber$")
	public void clickOnBecomeAMember() throws InterruptedException {
		membershipSteps.clickOnBecomeAMember();
	}
	@Then("^Get Membership Amount$")
	public void getCurrentMembership() throws InterruptedException {
		membershipSteps.getCurrentMembership();
	}
	
	
	@Then("^Verify Membership Value is Updated \"([^\"]*)\"$")
	public void verifyMembershipValue(String ar1) throws InterruptedException {
		membershipSteps.verifyMembershipValue(ar1);
	}
	
	
	
	@Then("^Click On Add Local Membership Partner$")
	public void clickOnAddLocalMembershipPartner() throws InterruptedException {
		membershipSteps.clickOnAddLocalMembershipPartner();
	}
	
	@Then("^Verify \"([^\"]*)\" Toggle \"([^\"]*)\"$")
	public void verifyToggle(String arg1 , String arg2) throws InterruptedException {
		membershipSteps.verifyToggle(arg1,arg2);
	}
	
	@Then("^Verify \"([^\"]*)\" Membership is Selected")
	public void verifyMembershipTypeSelectedPage(String arg1) throws InterruptedException {
		membershipSteps.verifyMembershipTypeSelectedPage(arg1);
	}
	
	
	
	@Then("^Verify \"([^\"]*)\" is visible$")
	public void verifyToggleHeading(String arg) throws InterruptedException {
		membershipSteps.verifyToggleHeading(arg);
	}
	
	@Then("^Verify \"([^\"]*)\" Page$")
	public void verifyPage(String arg) throws IOException, InterruptedException {
		membershipSteps.verifyPage(arg);
	}
	
	@Then("^Verify \"([^\"]*)\" Membership Type$")
	public void verifyMembershipType(String arg) throws IOException, InterruptedException {
		membershipSteps.verifyMembershipType(arg);
	}
	
	@Then("^Verify Membership \"([^\"]*)\" \"([^\"]*)\" is visible$")
	public void verifyMembershipVisible(String arg , String arg1) throws InterruptedException {
		membershipSteps.verifyMembershipVisible(arg, arg1);
	}
	
	@Then("^Click On Membership \"([^\"]*)\"$")
	public void verifyMembershiptypes(String arg) throws InterruptedException {
		membershipSteps.verifyMembershipTypes(arg);
	}
	
	
	@Then("^Enter Membership Postal Code$")
	public void EnterMembershipPostalCode() throws InterruptedException {
		membershipSteps.enterMembershipPostalCode();
	}
	@Then("^Click On Search Chapter Button$")
	public void clickOnSearchChapterButton() throws InterruptedException {
		membershipSteps.clickOnSearchChapterButton();
	}
	
	
	
	@Then("^Select Core North American membership$")
	public void select_Core_North_American_membership() {
		
		membershipSteps.clickCoreMembershipStep();
	}
	
	@Then("^Click On Student Discount Type$")
	public void ClickOnStudentDiscountType() {
		membershipSteps.clickOnStudentDiscountType();
	}

	@Then("^Select Plus North America membership$")
	public void select_Plus_North_America_membership() throws InterruptedException {
		membershipSteps.selectNorthAmericaPlusMembershipStep();
	}

	@Then("^Select Core International membership$")
	public void select_Core_International_membership() {
		membershipSteps.selectCoreIntMembershipStep();
	}

	@Then("^Select Plus International membership$")
	public void select_Plus_International_membership() {
		membershipSteps.selectPlustIntMembershipStep();
	}

	@Then("^Select an international country$")
	public void select_a_international_country() throws InterruptedException {
		Thread.sleep(2000);
		membershipSteps.selectInternationalCountryStep();
	}

	@Then("^Click Purchase ASCM membership$")
	public void click_Purchase_ASCM_membership() throws InterruptedException{
		Thread.sleep(2000);
		membershipSteps.clickOnPurchaseMembershipButton();
	}

	@Then("^Select Payment Monthly$")
	public void select_Payment_Monthly() throws InterruptedException {
		membershipSteps.coreMonthlyPriceStep();
	}

	@Then("^Select Payment Annual$")
	public void select_Payment_Annual() throws InterruptedException {
		membershipSteps.clickCoreAnnualPriceStep();
	}

	@Then("^Select Chapter Country$")
	public void select_Chapter_Country() throws InterruptedException {
		membershipSteps.selectChapterCountryStep();
	}

	@Then("^Search by Chapter zip Code \"([^\"]*)\"$")
	public void search_by_Chapter_zip_Code(String arg1) {
		membershipSteps.searchByChapterZipCodeStep(arg1);
	}

	@Then("^Click Find Partner button$")
	public void click_Find_Partner_button() throws InterruptedException {
		membershipSteps.clickFindPartnerButtonStep();
	}

	@Then("^Select a Chapter$")
	public void select_a_Chapter() throws InterruptedException {
		membershipSteps.selectChapterStep();
	}

	@Then("^Click Agreement Checkbox$")
	public void click_Agreement_Checkbox() throws InterruptedException {
		membershipSteps.clickAgreementCheckboxStep();
	}
	
	@Then("^Click Certificate Upgrade Checkbox$")
	public void click_Certificate_Upgrade_Checkbox_Step() throws InterruptedException {
		membershipSteps.clickCertificateUpgradeCheckboxStep();
	}
	
	@Then("^Click Skip Membership Chapter$")
	public void click_Skip_Membership_Button_Step() throws InterruptedException {
		membershipSteps.clickSkipMembershipButtonStep();
	}
	@Then("^Click Monthly Membership$")
	public void click_Monthly_Membership_Button_Step() throws InterruptedException {
		membershipSteps.clickMonthlyMembershipButtonStep();
	}
	
	

	@Then("^Click Add To Cart button$")
	public void click_Add_To_Cart_button() throws InterruptedException {
		membershipSteps.clickAddToCartButtonStep();
	}

	@Then("^Uncheck auto renew checkbox$")
	public void uncheck_auto_renew_checkbox() {
		membershipSteps.clickAutoRenewCheckboxStep();
	}
	@Then("^Select Na Country Drop Down$")
	public void click_Na_Country_DropDown() {
		membershipSteps.clickNaCountryDropDownStep();
	}
	@Then("^Select Discount Membership Based on Career Level$")
	public void selectDiscountMembership() throws InterruptedException {
		membershipSteps.selectDiscountMembership(CheckoutConstants.DISCOUNTMEMBERSHIPCARRERLEVEL);
	}
	@Then("^Select Discount Membership Country$")
	public void selectCountryMembership() throws InterruptedException {
		membershipSteps.selectCountryMembership(CheckoutConstants.DISCOUNTMEMBERSHIPCOUNTRY);
	}
	@Then("^Checked Full Time Student$")
	public void checkFullTimeStudent() throws InterruptedException {
		membershipSteps.checkFullTimeStudent();
	}
	@Then("^Select Membership Discount Country$")
	public void selectCountry() throws InterruptedException {
		membershipSteps.selectCountry(CheckoutConstants.MEMBERSHIPCOUNTRY);
	}
	
	@Then("^Select International Membership Discount Country$")
	public void selectInternationalCountry() throws InterruptedException {
		membershipSteps.selectCountry(CheckoutConstants.INTERNATIONALMEMBERSHIPCOUNTRY);
	}
	
	@Then("^Empty The Cart$")
	public void deleteAllExistingOrders() throws InterruptedException {
		membershipSteps.deleteAllExistingOrders();
	}
	
	@Then("^Adding Certificate$")
	public void addingCertificate() throws InterruptedException {
		
	}
	@Then("^Removing Certificate$")
	public void removingCertificate() throws InterruptedException {
		
	}
	
	
	@Then("^Fill in the following fields for MemberShip Discount Form$")
	public void membershipDiscountForm(DataTable table) throws InterruptedException {
		 List<Map<String, String>> rows = table.asMaps(String.class, String.class);
		    
		    for (Map<String, String> columns : rows) {
		    	setmembershipDiscountForm(columns.get("Field"), columns.get("Value"));
		    }
	}

	private void setmembershipDiscountForm(String field1, String value1) throws InterruptedException {
		if(field1.equalsIgnoreCase("University")) {
			membershipSteps.enterUniversity(CheckoutConstants.MEMBERSHIPUNIVERSITY);
		}else if(field1.equalsIgnoreCase("Graduation Month")) {
			membershipSteps.selectGradMonth(CheckoutConstants.MEMBERSHIPGRADMONTH);
		}else if(field1.equalsIgnoreCase("Graduation Year")) {
			membershipSteps.selectGradYear(CheckoutConstants.MEMBERSHIPGRADYEAR);
		}else if(field1.equalsIgnoreCase("Enter First Name")) {
			membershipSteps.enterFirstName(CheckoutConstants.MEMBERSHIPFIRSTNAME);
		}else if(field1.equalsIgnoreCase("Enter Last Name")) {
			membershipSteps.enterLastName(CheckoutConstants.MEMBERSHIPLASTNAME);
		}else if(field1.equalsIgnoreCase("Enter Email")) {
			membershipSteps.enterEmail(CheckoutConstants.MEMBERSHIPEMAIL);
		}else if(field1.equalsIgnoreCase("Dob Month")) {
			membershipSteps.selectDobMonth(CheckoutConstants.MEMBERSHIPDOBMONTH);
		}else if(field1.equalsIgnoreCase("Dob Day")) {
			membershipSteps.selectDobDay(CheckoutConstants.MEMBERSHIPDOBDATE);
		}else if(field1.equalsIgnoreCase("Dob Year")) {
			membershipSteps.selectDobYear(CheckoutConstants.MEMBERSHIPDOBYEAR);
		}
//		switch (field1) {
//		case "University":
//			membershipSteps.enterUniversity(CheckoutConstants.MEMBERSHIPUNIVERSITY);
//			
//			break;
//
//		case "Graduation Month":
//			membershipSteps.selectGradMonth(CheckoutConstants.MEMBERSHIPGRADMONTH);
//			
//			break;
//
//		case "Graduation Year":
//			membershipSteps.selectGradYear(CheckoutConstants.MEMBERSHIPGRADYEAR);
//			break;
//
//		case "Enter First Name":
//			membershipSteps.enterFirstName(CheckoutConstants.MEMBERSHIPFIRSTNAME);
//			break;
//		case "Enter Last Name":
//			membershipSteps.enterLastName(CheckoutConstants.MEMBERSHIPLASTNAME);
//			break;
//		case "Enter Email":
//			membershipSteps.enterEmail(CheckoutConstants.MEMBERSHIPEMAIL);
//			break;
//		 case "Dob Month":
//			 membershipSteps.selectDobMonth(CheckoutConstants.MEMBERSHIPDOBMONTH);
//				break;
//		 case "Dob Day":
//			 membershipSteps.selectDobDay(CheckoutConstants.MEMBERSHIPDOBDATE);
//				
//				break;
//		
//	   case "Dob Year":
//		 membershipSteps.selectDobYear(CheckoutConstants.MEMBERSHIPDOBYEAR);
//			
//			break;
//	   }
  
		
		

	}
	@Then("^Click On Check Button$")
	public void checkButton() throws InterruptedException {
		membershipSteps.checkButton();
	}
	@Then("^Click Verify Student Status Button$")
	public void clickVerifyStudentStatusButton() throws InterruptedException {
		membershipSteps.clickVerifyStudentStatusButton();
	}
	
	
	@Then("^Click On Close Button$")
	public void closeButton() throws InterruptedException {
		membershipSteps.closeButton();
	}
	@Then("^Fill in the following fields for MemberShip Discount Form For International$")
	public void membershipDiscountFormForInternational(DataTable table) throws InterruptedException {
		
		 List<Map<String, String>> rows = table.asMaps(String.class, String.class);
		    
		    for (Map<String, String> columns : rows) {
		    	setmembershipDiscountFormForInternational(columns.get("Field"), columns.get("Value"));
		    }
		
	}

	private void setmembershipDiscountFormForInternational(String field1, String value1) throws InterruptedException {
		
		if(field1.equalsIgnoreCase("University")) {
			membershipSteps.enterUniversity(CheckoutConstants.MEMBERSHIPUNIVERSITYINT);
		}else if(field1.equalsIgnoreCase("Graduation Month")) {
			membershipSteps.selectGradMonth(CheckoutConstants.MEMBERSHIPGRADMONTHINT);
		}else if(field1.equalsIgnoreCase("Graduation Year")) {
			membershipSteps.selectGradYear(CheckoutConstants.MEMBERSHIPGRADYEARINT);
		}else if(field1.equalsIgnoreCase("Enter First Name")) {
			membershipSteps.enterFirstName(CheckoutConstants.MEMBERSHIPFIRSTNAMEINT);
		}else if(field1.equalsIgnoreCase("Enter Last Name")) {
			membershipSteps.enterLastName(CheckoutConstants.MEMBERSHIPLASTNAMEINT);
		}else if(field1.equalsIgnoreCase("Enter Email")) {
			membershipSteps.enterEmail(CheckoutConstants.MEMBERSHIPEMAILINT);
		}else if(field1.equalsIgnoreCase("Dob Month")) {
			membershipSteps.selectDobMonth(CheckoutConstants.MEMBERSHIPDOBMONTHINT);
		}else if(field1.equalsIgnoreCase("Dob Day")) {
			membershipSteps.selectDobDay(CheckoutConstants.MEMBERSHIPDOBDATEINT);
		}else if(field1.equalsIgnoreCase("Dob Year")) {
			membershipSteps.selectDobYear(CheckoutConstants.MEMBERSHIPDOBYEARINT);
		}
		
		
		
//		switch (field1) {
//		case "University":
//			membershipSteps.enterUniversity(CheckoutConstants.MEMBERSHIPUNIVERSITYINT);
//			
//			break;
//
//		case "Graduation Month":
//			membershipSteps.selectGradMonth(CheckoutConstants.MEMBERSHIPGRADMONTHINT);
//			
//			break;
//
//		case "Graduation Year":
//			membershipSteps.selectGradYear(CheckoutConstants.MEMBERSHIPGRADYEARINT);
//			break;
//
//		case "Enter First Name":
//			membershipSteps.enterFirstName(CheckoutConstants.MEMBERSHIPFIRSTNAMEINT);
//			break;
//		case "Enter Last Name":
//			membershipSteps.enterLastName(CheckoutConstants.MEMBERSHIPLASTNAMEINT);
//			break;
//		case "Enter Email":
//			membershipSteps.enterEmail(CheckoutConstants.MEMBERSHIPEMAILINT);
//			break;
//		 case "Dob Month":
//			 membershipSteps.selectDobMonth(CheckoutConstants.MEMBERSHIPDOBMONTHINT);
//				break;
//		 case "Dob Day":
//			 membershipSteps.selectDobDay(CheckoutConstants.MEMBERSHIPDOBDATEINT);
//				
//				break;
//		
//	   case "Dob Year":
//		 membershipSteps.selectDobYear(CheckoutConstants.MEMBERSHIPDOBYEARINT);
//			
//			break;
//	   }
  
		
		

	}

}
