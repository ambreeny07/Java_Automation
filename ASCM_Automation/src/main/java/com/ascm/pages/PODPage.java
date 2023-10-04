package com.ascm.pages;

import org.openqa.selenium.WebDriver;

import com.ascm.util.SeleniumHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class PODPage extends SeleniumHelper{
	public static final String ID_Billing_COUNTRY = "BillingInfoAndPaymentModel_BillingAddress_Country";
	
	public static final String ID_Billing_FIRSTNAME = "BillingInfoAndPaymentModel_BillingAddress_FirstName";
	public static final String ID_Billing_LASTNAME = "BillingInfoAndPaymentModel_BillingAddress_LastName";
	public static final String ID_Billing_MAILING_ADDRESS_LINE1 = "BillingInfoAndPaymentModel_BillingAddress_Line1";
	public static final String ID_Billing_CITY = "BillingInfoAndPaymentModel_BillingAddress_City";
	public static final String ID_Billing_STATE = "BillingInfoAndPaymentModel_BillingAddress_Region-text";
	public static final String ID_Billing_ZIP = "BillingInfoAndPaymentModel_BillingAddress_ZipCode";
	public static final String ID_MAILING_STATE_For_International="ShippingInfoModel_ShippingAddress_Region-text";
	public static final String ID_Billing_State_NA="BillingInfoAndPaymentModel_BillingAddress_Region-select";
		

	public PODPage(WebDriver driver) {
		super(driver);
	
	}
	
	//POD
	@FindBy(xpath ="//a[text()='Principles on Demand']")
	WebElementFacade POD;
	@FindBy(xpath ="//a[contains(text(),'products/principles-on-demand')]")
	WebElementFacade IndividualPOD;
	@FindBy(xpath ="//button[contains(@data-product-code,'Basics-of-Managing-Operations')]")
	WebElementFacade ManagingOpertionPOD;
	@FindBy(xpath ="//button[contains(@data-product-code,'Basics-of-Distribution-and-Logistics')]")
	WebElementFacade DistributionandLogisticsPOD;
	@FindBy(xpath ="//button[contains(@data-product-code,'Basics-of-Manufacturing-Management')]")
	WebElementFacade ManufacturingManagementPOD;	
	@FindBy(xpath ="//a[@data-product-name='Introduction to Supply Chain Principles']")
	WebElementFacade SupplyChainPrinciplesFoundation;
	
	
	//billing
		@FindBy(id = ID_Billing_COUNTRY )
		WebElementFacade selectBillingCountry;
		@FindBy(id = ID_Billing_FIRSTNAME)
		WebElementFacade enter_Billing_FirstName;
		@FindBy(id = ID_Billing_LASTNAME)
		WebElementFacade enter_Billing_LASTName;
		@FindBy(id = ID_Billing_MAILING_ADDRESS_LINE1)
		WebElementFacade billingAddress1;
		@FindBy(id = ID_Billing_CITY)
		WebElementFacade billingCity;
		@FindBy(id = ID_Billing_ZIP)
		WebElementFacade billingZipCode;

		@FindBy(id = ID_Billing_STATE)
		WebElementFacade billingState;
		@FindBy(id = ID_MAILING_STATE_For_International)
		WebElementFacade stateForInternational;
		@FindBy(id = ID_Billing_State_NA)
		WebElementFacade BillingStateForNA;
	

	
	
	public void clickPOD() throws InterruptedException {
		Waits.wait3Second();
		click(POD);
	}
	public void clickManagingOpertionPOD() throws InterruptedException {
		Waits.wait10Second();
		Waits.waitForElementToBeVisibile(ManagingOpertionPOD, getDriver(), 30);
		Waits.moveToELement(ManagingOpertionPOD, getDriver());
		click(ManagingOpertionPOD);
	}
	
	public void clickSupplyChainPrinciplesFoundation() throws InterruptedException {
		Waits.wait10Second();
		Waits.waitForElementToBeVisibile(SupplyChainPrinciplesFoundation, getDriver(), 30);
		Waits.moveToELement(SupplyChainPrinciplesFoundation, getDriver());
		click(SupplyChainPrinciplesFoundation);
	}
	
	public void clickIndividualPOD() throws InterruptedException {
		Waits.wait3Second();
		click(IndividualPOD);
	}
	public void clickDistributionandLogisticsPOD() throws InterruptedException {
		Waits.wait3Second();
		Waits.waitForElementToBeVisibile(DistributionandLogisticsPOD, getDriver(), 30);
		Waits.moveToELement(DistributionandLogisticsPOD, getDriver());
	
		click(DistributionandLogisticsPOD);
	}

	public void selectBillingCountry(String country) throws InterruptedException {
		Waits.wait3Second();
		selectByValue(selectBillingCountry,country);
		
	}
	public void enterFirstName(String fisrtName) throws InterruptedException {
		Waits.wait2Second();
		typeInto(enter_Billing_FirstName, fisrtName);
	}
	public void enterLastName(String lastName) throws InterruptedException {
		Waits.wait2Second();
		typeInto(enter_Billing_LASTName, lastName);
	}


	// North America Address
	public void enterBillingAddress1(String maillingAddressLine1) throws InterruptedException {
		Waits.wait2Second();
		typeInto(billingAddress1, maillingAddressLine1);
	}

	public void enterBillingCity(String mailingCityNorthAmerica) {
		typeInto(billingCity, mailingCityNorthAmerica);
	}

	public void enterBillingZipCode(String mailingZipNorthAmerica) {
		typeInto(billingZipCode, mailingZipNorthAmerica);
	}
	public void enterBillingState(String state) {
		try {
			Waits.waitForElementToBeVisibile(BillingStateForNA, getDriver(),5);
		selectByValue(BillingStateForNA, state);
 	}
		catch (Exception e) {
			typeInto(stateForInternational,state);
		}
	
	}

}
