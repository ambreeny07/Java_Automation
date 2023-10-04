package com.test.suite.stepDefination;

import com.ascm.pages.LoginConstants;
import com.test.suite.testSteps.LoginSteps;
import com.test.suite.testSteps.SupplyChainCertificatesSteps;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class SupplyChainCertificatesDefs {
	@Steps
	SupplyChainCertificatesSteps supplyChain ;

	@Given("^Go To Supply Chain Page$")
	public void goToLoginPage() {
		supplyChain.goToSupplyChainPage();
	}

}
