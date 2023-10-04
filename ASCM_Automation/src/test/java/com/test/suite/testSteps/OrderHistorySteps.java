package com.test.suite.testSteps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.ascm.pages.LaunchApplication;
import com.ascm.pages.MembershipPage;
import com.ascm.pages.OrderHistoryPage;

import net.thucydides.core.annotations.Step;

public class OrderHistorySteps {
	OrderHistoryPage orderHistoryPage;
	LaunchApplication launchApplication;

	
	@Step
	public void goToOrderHistory() {
		launchApplication.goToOrderHistory();
	}
	
	@Step
	public void verifyAddress(String arg1, String arg2) throws InterruptedException {
		orderHistoryPage.verifyAddress( arg1,  arg2);
	}
	
	@Step
	public void verifyItemPrice(String arg1, String arg2) throws InterruptedException {
		orderHistoryPage.verifyItemPrice( arg1,  arg2);
	}
	@Step
	public void verifyItemQuantity(String arg1, String arg2) throws InterruptedException {
		orderHistoryPage.verifyItemQuantity( arg1,  arg2);
	}
	@Step
	public void clickOnShowOrderDetails() throws InterruptedException {
		orderHistoryPage.clickOnShowOrderDetails();
	}
	@Step
	public void clickOnDownloadOrderReceipt() throws InterruptedException {
		orderHistoryPage.clickOnDownloadOrderReceipt();
	}
	@Step
	public void verifyTotalBill(String arg1) throws InterruptedException {
		orderHistoryPage.verifyTotalBill( arg1);
	}
	
	
	
	
}
