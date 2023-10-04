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
import com.test.suite.testSteps.CoporateAccountSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class CorporateAccountDef extends PageObject {

	LaunchApplication launchApplication; 

	@Steps
	CoporateAccountSteps coporateAccountSteps;
	@Steps
	CreateStageAccountsStepDefs createStageAccountSteps;
	
	@Given("^Go To Create Corporate$")
	public void GoToProcurrement() {
		launchApplication.GoToCreateCoporate();
	}
	@Given("^Go To Corporate Login Link$")
	public void GoToCorporateLink() {
		launchApplication.GoToCreateCoporateLoginLink();
	}
	@Then("^Click CheckBox Term And Policy$")
	public void clickCheckTerm() {
		createStageAccountSteps.clickCheckTerm();
	}
	
	
	
	
	@Then("^Fill in the following fields for Corporate Address$")
	public void CorporateAddress(DataTable table) throws InterruptedException {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		for (Map<String, String> columns : rows) {
			setCorporateAddress(columns.get("Field"), columns.get("Value"));
		}
	}
	
	private void setCorporateAddress(String field1, String value1) throws InterruptedException {

		if (field1.equalsIgnoreCase("Country")) {
			coporateAccountSteps.selectCountryStep("222");
		} else if (field1.equalsIgnoreCase("Address")) {
			coporateAccountSteps.enterMailingAddressLine1Step(CheckoutConstants.CORPORATEADDRESS);
		} else if (field1.equalsIgnoreCase("City")) {
			coporateAccountSteps.enterCityStep(CheckoutConstants.CORPORATECITY);
		} else if (field1.equalsIgnoreCase("State")) {
			coporateAccountSteps.enterStateStep(CheckoutConstants.CORPORATESTATE);
		} else if (field1.equalsIgnoreCase("Province")) {
			coporateAccountSteps.enterProvinceStep(CheckoutConstants.CORPORATESTATE);
		} else if (field1.equalsIgnoreCase("PostalCode")) {
			coporateAccountSteps.enterPostalCodeStep(CheckoutConstants.CORPORATEPOSTALCODE);
		} 
	}


	
}
