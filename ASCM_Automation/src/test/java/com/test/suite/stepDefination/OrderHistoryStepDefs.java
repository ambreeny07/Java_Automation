package com.test.suite.stepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.ascm.pages.CheckoutConstants;
import com.ascm.pages.LoginConstants;
import com.ascm.pages.LoginPage;
import com.test.suite.testSteps.OrderHistorySteps;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class OrderHistoryStepDefs {

	@Steps

	OrderHistorySteps OrderHistorySteps;

	@Then("^Go To Order History$")
	public void go_to_Order_History() {
		OrderHistorySteps.goToOrderHistory();
	}
	
	
	@Then("^Verify \"([^\"]*)\" Address Contains \"([^\"]*)\"$")
	public void verifyAddress(String arg1 , String arg2) throws InterruptedException {
		OrderHistorySteps.verifyAddress(arg1,arg2);
	}
	
	
	@Then("^Verify \"([^\"]*)\" Quantity Of \"([^\"]*)\"$")
	public void verifyItemQuantity(String arg1 , String arg2) throws InterruptedException {
		OrderHistorySteps.verifyItemQuantity(arg1,arg2);
	}
	
	@Then("^Click On Show Order Details$")
	public void clickOnShowOrderDetails() throws InterruptedException {
		OrderHistorySteps.clickOnShowOrderDetails();
	}
	
	@Then("^Click On Download Order Receipt$")
	public void clickOnDownloadOrderReceipt() throws InterruptedException {
		OrderHistorySteps.clickOnDownloadOrderReceipt();
	}
	
	@Then("^Verify \"([^\"]*)\" Price Of \"([^\"]*)\"$")
	public void verifyItemPrice(String arg1 , String arg2) throws InterruptedException {
		OrderHistorySteps.verifyItemPrice(arg1,arg2);
	}
	
	@Then("^Verify Total Bill Is \"([^\"]*)\"$")
	public void verifyTotalBill(String arg1) throws InterruptedException {
		OrderHistorySteps.verifyTotalBill(arg1);
	}
	
	
	
	
}
