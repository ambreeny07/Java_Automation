package com.ascm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import com.ascm.util.SeleniumHelper;
import com.ascm.util.Utility;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class CheckOutPage extends SeleniumHelper {
	JavascriptExecutor executor = (JavascriptExecutor) getDriver();
	CheckoutConstants checkoutConstans;

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	// WebElementFacade for first and last name on Account section
	public static final String ID_FIRSTNAME = "createAccount-firstName";
	public static final String ID_LASTNAME = "createAccount-lastName";
	public static final String ID_MAILING_EMAIL = "ShippingInfoModel_Email";
	public static final String ID_MAILING_PASSWORD = "ShippingInfoModel_Password";
	public static final String ID_MAILING_CONFIRM_PASSWORD = "ShippingInfoModel_ConfirmPassword";
	public static final String XPATH_NEXT_PAYMENT_BUTTON = "//button[@class='btn btn-primary full']";
	public static final String XPATH_CONTINUE_BUTTON = "(//button[@class='btn btn-primary full'])[2]";
	public static final String XPATH_Next_Button = "(//button[@class='btn btn-primary full'])[1]";
	
	public static final String GROUNDFEDEXEXPRESS = "b43b8b5b-23be-4701-adc1-eaae9c6c87cb";
	public static final String FEDEXINTERNATIONAL = "0f609d0f-2604-4157-aa6c-3c1bafdda0f7";
	
	// WebElementFacade for shipping information section -HOME
	public static final String ID_Home_COUNTRY = "ShippingInfoModel_ShippingAddress_HomeCountry";

	// WebElementFacade for NA Address
	public static final String ID_MAILING_ADDRESS_LINE1 = "ShippingInfoModel_ShippingAddress_HomeAddressLine1";
	
	public static final String ID_MAILING_CITY = "ShippingInfoModel_ShippingAddress_HomeCity";
	public static final String ID_MAILING_ZIP = "ShippingInfoModel_ShippingAddress_HomeZipCode";
	public static final String ID_MAILING_STATE = "//select[@id='ShippingInfoModel_ShippingAddress_HomeState-text']";

	public static final String ID_MAILING_INTERNATIONAL_COUNTRY = "ShippingInfoModel_ShippingAddress_Country";
	public static final String ID_MAILING_INTERNATIONAL_STATE = "ShippingInfoModel_ShippingAddress_HomeState-text";

	//public static final String ID_MAILING_EMAIL = "ShippingInfoModel_Email";

	// PHONE NUMBER

	public static final String XPATH_COUNTRY_AREA_CODE = "//*[@id='ShippingInfoModel_PhoneNumberCountryCode']";

	public static final String XPATH_AREA_CODE = "//*[@id='ShippingInfoModel_PhoneNumberAreaCode']";

	public static final String XPATH_PHONE_NUMBER = "//*[@id='ShippingInfoModel_PhoneNumber']";

	
	// WebElementFacade for address validation modal
	public static final String ID_SECOND_ADDRESS_RADIO_BUTTON = "address";
	public static final String XPATH_SELECT_ADDRESS_BUTTON = "//button[@class='btn btn-primary']";
	public static final String CREDIT_CARD_RADIO_BUTTON="(//input[@name='SelectedPaymentId'])[1]";
	// WebElementFacade for billing section
	public static final String XPATH_SAME_AS_BILLING_RADIO_BUTTON = "//input[@type='checkbox'] [@novalidate='novalidate']";

	// WebElementFacade for Payment section
	public static final String ID_NAME_ON_CREDIT_CARD = "BillingInfoAndPaymentModel_CreditCard_CreditCardName";
	public static final String ID_CREDIT_CARD_NUMBER = "BillingInfoAndPaymentModel_CreditCard_CreditCardNumber";
	public static final String ID_CREDIT_CARD_SECURITY_CODE = "BillingInfoAndPaymentModel_CreditCard_CreditCardSecurityCode";
	public static final String ID_CREDIT_CARD_EXPIRATION_MONTH = "BillingInfoAndPaymentModel_CreditCard_ExpirationMonth";
	public static final String ID_CREDIT_CARD_EXPIRATION_YEAR = "BillingInfoAndPaymentModel_CreditCard_ExpirationYear";
	public static final String XPATH_NEXT_REVIEW_BUTTON = "//button[contains(text(),'Next: Review Order')] | (//span[contains(text(),'Next: Review Order')]//..)[1]";
	public static final String ID_PLACE_ORDER_BUTTON = "place-order-button";
	public static final String LINKTEXT_PROCEED_TO_CHECKOUT_BUTTON = "Proceed to Checkout";
	public static final String LSEXAMPREPADDTOCARD = "(//a[contains(text(),'Add to Cart')])[1]";
	
	//Web Element for Brain Tree
	public static final String XPATH_CREDIT_CARD_NUMBER_BAIN_TREE= "//input[@id='credit-card-number']";
	public static final String ID_CREDIT_CARD_SECURITY_CODE_BAIN_TREE = "cvv";
	public static final String ID_CREDIT_CARD_EXPIRATION_BRAIN_TREE = "expiration";
	public static final String ID_CREDIT_CARD_POSTAL_CODE_BAIN_TREE = "postal-code";
	
	@FindBy(linkText = LINKTEXT_PROCEED_TO_CHECKOUT_BUTTON)
	WebElementFacade proceedToCheckOutButton;
	@FindBy(xpath = "//span[text()='Continue']//parent::button")
	WebElementFacade ContinueButton;
	// WebElementFacade for first and last name on Account (Step1)
	@FindBy(id = ID_FIRSTNAME)
	WebElementFacade mailingFirstName;
	@FindBy(id = ID_LASTNAME)
	WebElementFacade mailingLastName;
	
	@FindBy(id = ID_MAILING_EMAIL)
	WebElementFacade mailingEmail;
	
	@FindBy(id = ID_MAILING_PASSWORD)
    WebElementFacade mailingPassword;
	
	@FindBy(id = ID_MAILING_CONFIRM_PASSWORD)
	WebElementFacade confirmPassword;

	//WebElementFacade for shipping Information section- Home ( step2)
	@FindBy(id = ID_Home_COUNTRY)
	WebElementFacade selectHomeCountry;
	
	
	
	// WebElementFacade for North America Address
	@FindBy(id = ID_MAILING_ADDRESS_LINE1)
	WebElementFacade mailingAddress1;

	@FindBy(id = ID_MAILING_CITY)
	WebElementFacade mailingCity;

	@FindBy(id = ID_MAILING_ZIP)
	WebElementFacade mailingZipCode;

	@FindBy(xpath = ID_MAILING_STATE)
	WebElementFacade mailingState;

	// WebElementFacade for international address
	@FindBy(id = ID_MAILING_INTERNATIONAL_COUNTRY)
	WebElementFacade internationalCountry;

	@FindBy(id = ID_MAILING_INTERNATIONAL_STATE)
	WebElementFacade internationalStateName;



	// Mailing information
	@FindBy(xpath = XPATH_COUNTRY_AREA_CODE)
	WebElementFacade phoneNumberCountryCode;

	@FindBy(xpath = XPATH_AREA_CODE)
	WebElementFacade phoneNumberAreaCode;

	@FindBy(xpath = XPATH_PHONE_NUMBER)
	WebElementFacade phoneNumber;


	@FindBy(xpath = XPATH_NEXT_PAYMENT_BUTTON)
	WebElementFacade nextPaymentButton;
	@FindBy(xpath = XPATH_CONTINUE_BUTTON)
	WebElementFacade continueButton;

	// WebElementFacade for address validation modal
	@FindBy(id = ID_SECOND_ADDRESS_RADIO_BUTTON)
	WebElementFacade secondAddressRadioButton;
	
	@FindBy(xpath = CREDIT_CARD_RADIO_BUTTON)
	WebElementFacade creditCardRadioButton;

	@FindBy(xpath = XPATH_SELECT_ADDRESS_BUTTON)
	WebElementFacade selectAddressButton;

	// WebElementFacade for billing section
	@FindBy(xpath = XPATH_SAME_AS_BILLING_RADIO_BUTTON)
	WebElementFacade sameAsBillingButton;

	// WebElementFacade for Payment section
	@FindBy(id = ID_NAME_ON_CREDIT_CARD)
	WebElementFacade cardOnName;

	@FindBy(id = ID_CREDIT_CARD_NUMBER)
	WebElementFacade creditCardNumber;

	@FindBy(id = ID_CREDIT_CARD_SECURITY_CODE)
	WebElementFacade creditCardSecutiryCode;

	@FindBy(id = ID_CREDIT_CARD_EXPIRATION_MONTH)
	WebElementFacade creditCardExpirationMonth;

	@FindBy(id = ID_CREDIT_CARD_EXPIRATION_YEAR)
	WebElementFacade creditCardExpirationYear;

	@FindBy(xpath = XPATH_NEXT_REVIEW_BUTTON)
	WebElementFacade nextReviewButton;

	@FindBy(id = ID_PLACE_ORDER_BUTTON)
	WebElementFacade placeOrderButton;

	@FindBy(id = ID_PLACE_ORDER_BUTTON)
	List<WebElementFacade> placeOrderButtonWait;
	@FindBy(xpath = XPATH_Next_Button)
	WebElementFacade nextButton;
	@FindBy(id = "existEmailAddressErrorMessage")
	WebElementFacade EmailFieldError;

	@FindBy(xpath = "//div[@class='braintree-option braintree-option__paypal']")
	WebElementFacade payPalButton;

	@FindBy(css = ".css-ltr-1m7plzc-button-Button")
	WebElementFacade paypal_Login;

	@FindBy(css = "#btnLogin")
	WebElementFacade paypal_Login_button;

	@FindBy(xpath = "//input[@id='email']")
	WebElementFacade payPal_userName;

	@FindBy(xpath = "//input[@id='password']")
	WebElementFacade payPal_password;

	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElementFacade payPal_SignIn_Button;

	// @FindBy(id = "confirmButtonTop")
	@FindBy(xpath = "//button[@id='acceptAllButton']")
	WebElementFacade paypalAcceptCookiesButton;
	@FindBy(id = "payment-submit-btn")
	WebElementFacade payPal_PayNow_Button;
	@FindBy(id = "acceptAllButton")
	WebElementFacade acceptCookies;
	// webelement for billing section
	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_FirstName")
	WebElementFacade billingAddress_FirstName;

	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_LastName")
	WebElementFacade billingAddress_LastName;

	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_Line1")
	WebElementFacade billingAddress_Line1;

	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_City")
	WebElementFacade billingAddress_City;

	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_Region-select")
	WebElementFacade billingAddress_State;

	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_ZipCode")
	WebElementFacade billingAddress_ZipCode;

	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_Country")
	WebElementFacade internationalBillingAddress_Country;

	@FindBy(id = "spinner")
	WebElementFacade paymentLoad;

	@FindBy(css = ".progress-bar.animated-progress-bar.bg-success")
	WebElementFacade paymentLoad_orderSubmit;

	@FindBy(xpath = "//h1[contains(text(),'Page could not be loaded')]")
	WebElementFacade paymentFailureMessage;

	@FindBy(xpath = "//h1[contains(text(),'Thank You')]")
	WebElementFacade thankYouMessage;

	@FindBy(xpath = "//input[@value ='36b977a5-40f0-4e94-bde8-51efaf1687ae']")
	WebElementFacade check;
	@FindBy(id = GROUNDFEDEXEXPRESS)
	WebElementFacade GroundFedExpress;
	@FindBy(id = FEDEXINTERNATIONAL)
	WebElementFacade FedexInternational;
	@FindBy(xpath = LSEXAMPREPADDTOCARD)
	WebElementFacade LSExamPreAddToCard;
	
	
	@FindBy(xpath = "(//input[@name='address'])[2]")
	WebElementFacade validAddressRadioButton;
	@FindBy(xpath = "//button[text()='Select Address']")
	WebElementFacade SelectAddress ;
	@FindBy(xpath = "//button[text()='I understand'] | //button[text()='I understand']")
	WebElementFacade UnderstandButton;
	
	

	
	
	@FindBy(xpath = "//input[@id='validAddress']//parent::label")
	WebElementFacade validAddress;
	
	@FindBy(xpath = "//button[text()='Select Address']")
	WebElementFacade selectAddresButton;

	@FindBy(xpath = "//input[@id='promo-code']")
	WebElementFacade PromoCode;
	@FindBy(xpath = "//input[@id='promo-code']//..//span[text()='Apply']")
	WebElementFacade PromoCodeApply;
	@FindBy(xpath = "//div[text()='Promotional Discount']//..//h4")
	WebElementFacade PromoDiscountValue;
	
	@FindBy(xpath = XPATH_CREDIT_CARD_NUMBER_BAIN_TREE)
	WebElementFacade CreditCardNoBrainTree;
	@FindBy(id = ID_CREDIT_CARD_SECURITY_CODE_BAIN_TREE)
	WebElementFacade CreditCardCVVBrainTree;
	@FindBy(id = ID_CREDIT_CARD_EXPIRATION_BRAIN_TREE)
	WebElementFacade CreditCardExpirationBrainTree;
	@FindBy(id = ID_CREDIT_CARD_POSTAL_CODE_BAIN_TREE)
	WebElementFacade CreditCardPostalCodeBrainTree;
	public void enterCardCardNoForBrainTree(String creditCardNo) {
		getDriver().switchTo().frame("braintree-hosted-field-number");
		typeInto(CreditCardNoBrainTree, creditCardNo);
	}
	public void enterCardCardCVVForBrainTree(String creditCardCVV) {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("braintree-hosted-field-cvv");
		typeInto(CreditCardCVVBrainTree, creditCardCVV);
	}
	public void enterCardCardExpirationForBrainTree(String creditCardExpiration) {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("braintree-hosted-field-expirationDate");	
		typeInto(CreditCardExpirationBrainTree, creditCardExpiration);
	}
	public void enterCardCardPostalCodeForBrainTree(String creditCardPostalCode) {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame("braintree-hosted-field-postalCode");
		typeInto(CreditCardPostalCodeBrainTree, creditCardPostalCode);
		getDriver().switchTo().defaultContent();
	}
	public void clickProceedToCheckOutButton() throws InterruptedException {
		Waits.wait10Second();
		try {
			Waits.moveToELement(proceedToCheckOutButton, getDriver());
			jsClick(proceedToCheckOutButton);
		}catch (Exception e) {
			Waits.moveToELement(ContinueButton, getDriver());
			jsClick(ContinueButton);
		}
		
	}
	
	

	public void selectHomeCountry() {
		try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		selectByValue(selectHomeCountry,"IND");
		
	}

	public void enterBillingFirstName(String billingFirstName) {
		typeInto(billingAddress_FirstName, billingFirstName);
	}

	public void enterBillingLastName(String billingLastName) {
		typeInto(billingAddress_LastName, billingLastName);
	}

	public void enterBillingAddressLine1(String billingAddressLine1) {
		typeInto(billingAddress_Line1, billingAddressLine1);
	}

	public void enterBillingcity(String billingAddressCity) {
		typeInto(billingAddress_City, billingAddressCity);
	}

	public void enterBillingState() {
		selectByValue(billingAddress_State, CheckoutConstants.MAILING_STATE_NORTHAMERICA);
	}

	public void enterBillingZipCode(String billingZipCode) {
		typeInto(billingAddress_ZipCode, billingZipCode);
	}

	// This is for mailing information
	public void enterMailingFirstName(String firstName) throws InterruptedException {
		Thread.sleep(100);
		typeInto(mailingFirstName, firstName);
	}

	public void enterMailingLastName(String lastName) {
		typeInto(mailingLastName, lastName);
	}

	// North America Address
	public void enterMailingAddress1(String maillingAddressLine1) {
		typeInto(mailingAddress1, maillingAddressLine1);
	}

	public void enterMailingCity(String mailingCityNorthAmerica) {
		typeInto(mailingCity, mailingCityNorthAmerica);
	}

	public void enterMaililingZipCode(String mailingZipNorthAmerica) {
		typeInto(mailingZipCode, mailingZipNorthAmerica);
	}

	public void selectMailingState(String MAILING_STATE_NORTHAMERICA) {
		selectByValue(mailingState, CheckoutConstants.MAILING_STATE_NORTHAMERICA);
	}

	// Phone number
	public void enterCountryAreaCode(String COUNTRY_AREA_CODE) {
		selectByValue(phoneNumberCountryCode, CheckoutConstants.COUNTRY_AREA_CODE);
	}

	public void enterAreaCode(String AREA_CODE) {
		typeInto(phoneNumberAreaCode, CheckoutConstants.AREA_CODE);
	}

	public void enterPhoneNumber(String PHONE_NUMBER) {
		typeInto(phoneNumber, CheckoutConstants.PHONE_NUMBER);
	}

	// International address
	public void enterMailingAddressLine1International(String maillingAddressLine1International) {

		typeInto(mailingAddress1, maillingAddressLine1International);
	}

	public void enterMailingCityInternational(String mailingCityInternational) {
		typeInto(mailingCity, mailingCityInternational);
	}

	public void selectInternationalCountry(String mailingInternationalCountry) {
		selectByValue(internationalCountry, CheckoutConstants.MAILING_COUNTRY_INTERNATIONAL);
	}

	public void enterMaililingZipCodeInternational(String mailingZipInternational) {
		typeInto(mailingZipCode, mailingZipInternational);
	}

	public void enterInternationalState(String internationalState) {
		typeInto(internationalStateName, internationalState);
	}
	public void clickNextPaymentButton() {
		jsClick(nextPaymentButton);
	}
	public void clickContinueButton() throws InterruptedException {
		Waits.wait5Second();
		  try {
			  jsClick(continueButton);
				
				if(validAddressRadioButton.isDisplayed()) {
					Waits.wait3Second();
				jsClick(validAddressRadioButton);
				Waits.wait3Second();
				jsClick(SelectAddress);
				Waits.wait3Second();		
				}
				else {
					jsClick(UnderstandButton);
				}
			}
			catch (Exception e) {
			}
		  try {
			  Waits.wait3Second();
			  jsClick(validAddress);
			  Waits.wait3Second();
			  jsClick(selectAddresButton);
		  }catch (Exception e) {
			// TODO: handle exception
		}
		  try {
			  jsClick(UnderstandButton);
		  }catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clickFirstAddressRadioButton() {
		jsClick(secondAddressRadioButton);
	}

	public void clickCreditCardRadioButton() {
		jsClick(creditCardRadioButton);
	}

	public void clickSelectAddressButton() {
		jsClick(selectAddressButton);
	}

	public void clickSameAsBillingButton() {
		jsClick(sameAsBillingButton);
	}

	public void typeCardname(String cardName) {
		typeInto(cardOnName, cardName);
	}

	public void enterPaymentCard(String cardNumber) {
		typeInto(creditCardNumber, cardNumber);
	}

	public void enterCreditCardSecutiryCode(String securityCode) {
		typeInto(creditCardSecutiryCode, securityCode);
	}

	public void selectCreditCardExpirationMonth(String expirationMonth) {
		selectByValue(creditCardExpirationMonth, CheckoutConstants.CC_EXPIRATION_MONTH);
	}

	public void selectCreditCardExpirationYear(String expirationYear) {
		selectByValue(creditCardExpirationYear, CheckoutConstants.CC_EXPIRATION_YEAR);
	}

	public void clickNextReviwButton() throws InterruptedException {
		Waits.wait2Second();
		sendEnterKey(nextReviewButton);
		try {
			Waits.wait3Second();
			jsClick(validAddressRadioButton);
			Waits.wait3Second();
			jsClick(SelectAddress);
			Waits.wait3Second();
		}catch (Exception e) {
			try {
				jsClick(UnderstandButton);
				
			}catch (Exception u) {
			}
		}
	}

	public void clickPlaceOrderButton() {
		try {
		Waits.waitForElementToBeVisibile(placeOrderButton, getDriver(),20);
		click(placeOrderButton);
		Waits.wait5Second();
		}
		catch (Exception e) {
			try {
				jsClick(placeOrderButton);
			}catch (Exception e1) {
				click(placeOrderButton);
			}
			
			
		}
		
	}

	public void clickCheckButton() {
		jsClick(check);
	}

	public void ClickNextButton() {
		try {
			jsClick(nextButton);
		}catch (Exception e) {
			jsClick(nextButton);
		}
		
		try {
			Waits.wait2Second();
			
			if(EmailFieldError.isDisplayed()) {
				Waits.wait1Second();
				int randomNo=Utility.randomNo(6000,7000);
				String email="Automation3"+randomNo+"@gmail.com";
				Waits.wait1Second();
				CreateStageAccountPage.enterEmail(email);
				LoginConstants.LoginEmail=email;
				Waits.wait1Second();
				click(nextButton);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void ClickLSExamPreAddToCardButton() throws InterruptedException {
		Waits.moveToELement(LSExamPreAddToCard, getDriver());
		Waits.wait2Second();
		jsClick(LSExamPreAddToCard);
	}
	
	  public void clickShippingMethodRadioButton() {
		  try {
			  try { 
				  Waits.waitForElementToBeVisibile(GroundFedExpress, getDriver(),5);
				  click(GroundFedExpress);
		        
			  } catch (Exception e) {
				  click(FedexInternational);   
			}
		  }catch (Exception e) {
			// TODO: handle exception
		}
		  
	    }
	  public void clickOnPayPalButton() {
			jsClick(payPalButton);
		}
	  public void clickOnPayPalLogin() {
		  Waits.waitForElementToBeVisibile(paypal_Login, getDriver(), 200);
			jsClick(paypal_Login);
		}
	  

		public void enterPayPalUserName(String userName) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			typeInto(payPal_userName, userName);
		}

		public void enterPayPalPassword(String password) {
			typeInto(payPal_password, password);
		}

		public void clickPayPalLoginButton() {
			jsClick(paypal_Login_button);

		}
		public void clickPayPalPayNowButton() throws InterruptedException {
			Waits.wait10Second();
			Thread.sleep(10000);
			if (isElementVisible(By.xpath("//button[@id='acceptAllButton']"))) {
				jsClick(paypalAcceptCookiesButton);
			}
			Waits.moveToELement(payPal_PayNow_Button,getDriver());
			Waits.waitForElementToBeVisibile(payPal_PayNow_Button, getDriver(), 5000);
			click(payPal_PayNow_Button);

		}
		public void clickAcceptCookies() {
			Waits.waitForElementToBeVisibile(acceptCookies, getDriver(), 3000);
			jsClick(acceptCookies);

		}
		public void enterPromoCode(String promoCode) throws InterruptedException {
			Waits.wait2Second();
			Thread.sleep(3000);
			Waits.waitForElementToBeDisplay(PromoCode, getDriver());
			Waits.moveToELement(PromoCode, getDriver());
			Waits.waitForElementToBeVisibile(PromoCode, getDriver(), 3000);
			typeInto(PromoCode, promoCode);
			Waits.wait2Second();
			jsClick(PromoCodeApply);
			Waits.wait2Second();
			Waits.wait2Second();
			Waits.wait2Second();
			if(isElementVisible(By.xpath("//span[text()='Please insert a promo code.']"))) {
				Waits.wait2Second();
				Thread.sleep(3000);
				Waits.waitForElementToBeDisplay(PromoCode, getDriver());
				Waits.moveToELement(PromoCode, getDriver());
				Waits.waitForElementToBeVisibile(PromoCode, getDriver(), 3000);
				typeInto(PromoCode, promoCode);
				Waits.wait2Second();
				jsClick(PromoCodeApply);
			}else {
				
			}
			
			
		}

		public void clickPrmoCodeApply() throws InterruptedException {
//			Waits.wait2Second();
//			jsClick(PromoCodeApply);
//			Waits.wait2Second();

		}
		public void getPromoDiscountValue()  {
			Waits.waitForElementToBeDisplay(PromoDiscountValue, getDriver());
			getElementText(PromoDiscountValue);		
		}

}
