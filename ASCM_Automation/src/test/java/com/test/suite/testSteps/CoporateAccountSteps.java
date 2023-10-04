package com.test.suite.testSteps;


import com.ascm.pages.CheckOutPage;
import com.ascm.pages.CoporateAccountPage;

import net.thucydides.core.annotations.Step;

public class CoporateAccountSteps {
	CoporateAccountPage coporate;

	@Step
	public void selectCountryStep(String text) {
		coporate.selectHomeCountry(text);
		}
	@Step
	public void enterMailingAddressLine1Step(String text) throws InterruptedException {
		coporate.enterAddress(text);
	}
	@Step
	public void enterCityStep(String text) throws InterruptedException {
		coporate.enterCity(text);
	}
	@Step
	public void enterStateStep(String text) throws InterruptedException {
		coporate.enterState(text);
	}
	@Step
	public void enterProvinceStep(String text) throws InterruptedException {
		coporate.enterProvince(text);
	}
	@Step
	public void enterPostalCodeStep(String text) throws InterruptedException {
		coporate.enterPotalCode(text);
	}


}
