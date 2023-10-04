package com.test.suite.stepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;


import com.test.suite.testSteps.PODSteps;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class PODStepsDefs {
	@Steps
	PODSteps podSteps; 

	@Then("^Click POD$")
	public void clickPOD() throws IOException, InterruptedException {
		podSteps.clickPOD();
	}
	@Then("^Click Individual POD$")
	public void clickIndividualPOD() throws IOException, InterruptedException {
		podSteps.clickIndividualPOD();
	}
	@Then("^Click Managing Opertion POD$")
	public void clickManagingOpertionPOD() throws IOException, InterruptedException {
		podSteps.clickManagingOpertionPOD();
	}
	
	@Then("^Click Supply Chain Principles Foundation$")
	public void clickSupplyChainPrinciplesFoundation() throws IOException, InterruptedException {
		podSteps.clickSupplyChainPrinciplesFoundation();
	}
	
	@Then("^Click Distribution and Logistics POD$")
	public void clickDistributionandLogisticsPOD() throws IOException, InterruptedException {
		podSteps.clickDistributionandLogisticsPOD();
	}

	@Then("^Fill in the following For Billing Address$")
	public void enterBillingAddressForExam(DataTable table) throws InterruptedException, IOException {
List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	    
	    for (Map<String, String> columns : rows) {
	    	setBillingAddressForExam(columns.get("Field"), columns.get("Value"));
	    }
	}
	private void setBillingAddressForExam(String field,String value) throws InterruptedException {
		if(field.equalsIgnoreCase("country")) {
			podSteps.selectBillingCompany(value);
		}else if(field.equalsIgnoreCase("firstName")) {
			podSteps.enterFirstName(value);
		}else if(field.equalsIgnoreCase("lastName")) {
			podSteps.enterLastName(value);
		}else if(field.equalsIgnoreCase("streetAddress")) {
			podSteps.enterBillingAddress1(value);
		}else if(field.equalsIgnoreCase("City")) {
			podSteps.enterBillingCity(value);
		}else if(field.equalsIgnoreCase("State")) {
			podSteps.enterBillingState(value);
		}else if(field.equalsIgnoreCase("postalCode")) {
			podSteps.enterBillingZipCodeStep(value);
		}
//		switch (field) {
//		case "country":
//			podSteps.selectBillingCompany(value);
//			break;
//		case "firstName":
//			podSteps.enterFirstName(value);
//			break;
//		case "lastName":
//			podSteps.enterLastName(value);
//			break;
//		case "streetAddress":
//			podSteps.enterBillingAddress1(value);
//			break;
//		case "City":
//			podSteps.enterBillingCity(value);
//			break;
//		case "State":
//			podSteps.enterBillingState(value);
//			break;
//
//		case "postalCode":
//			podSteps.enterBillingZipCodeStep(value);
//			break;
//		}
	  

	}
}
