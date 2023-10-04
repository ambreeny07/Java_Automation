package com.test.suite.testSteps;

import com.ascm.pages.LaunchApplication;
import com.ascm.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class SupplyChainCertificatesSteps {
	LoginPage loginPage;
	LaunchApplication launchApplication;

	@Step
	public void goToSupplyChainPage() {
		launchApplication.goToSupplyChainPage();
	}
	
}
