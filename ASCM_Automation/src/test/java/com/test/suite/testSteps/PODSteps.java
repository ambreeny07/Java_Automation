package com.test.suite.testSteps;

import org.springframework.beans.factory.annotation.Autowired;
import com.ascm.pages.PODPage;
import net.thucydides.core.annotations.Step;

public class PODSteps {
	@Autowired
	PODPage podPage;
	
	@Step
	public void clickPOD() throws InterruptedException {
		podPage.clickPOD();
	}
	@Step
	public void clickIndividualPOD() throws InterruptedException {
		podPage.clickIndividualPOD();
	}
	@Step
	public void clickManagingOpertionPOD() throws InterruptedException {
		podPage.clickManagingOpertionPOD();
	}
	
	@Step
	public void clickSupplyChainPrinciplesFoundation() throws InterruptedException {
		podPage.clickSupplyChainPrinciplesFoundation();
	}
	
	@Step
	public void clickDistributionandLogisticsPOD() throws InterruptedException {
		podPage.clickDistributionandLogisticsPOD();
	}

	@Step
	public void selectBillingCompany(String company) throws InterruptedException {
		podPage.selectBillingCountry(company);
	}
	@Step
	public void enterFirstName(String firstName) throws InterruptedException {
		podPage.enterFirstName(firstName);
	}
	@Step
	public void enterLastName(String lastName) throws InterruptedException {
		podPage.enterLastName(lastName);
	}
	@Step
	public void enterBillingZipCodeStep(String billingZipCode) {
		podPage.enterBillingZipCode(billingZipCode);
	}
	@Step
	public void enterBillingAddress1(String address) throws InterruptedException {
		podPage.enterBillingAddress1(address);
	}
	@Step
	public void enterBillingCity(String city) {
		podPage.enterBillingCity(city);
	}
	@Step
	public void enterBillingState(String state) {
		podPage.enterBillingState(state);
	}
	
}
