package com.ascm.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.checkerframework.common.value.qual.ArrayLen;
import org.codehaus.groovy.ast.stmt.CatchStatement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import com.ascm.util.SeleniumHelper;
import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExamPurchagePage extends SeleniumHelper {
	Waits wait = new Waits();
	CheckoutConstants checkoutConstants;
	// WebElementFacade for shipping information section
	public static final String ID_COUNTRY = "ShippingInfoModel_ShippingAddress_Country";

	public static final String CreditCardRadioButton = "//div[contains(@data-target,'#PayFlow')]//input[@name='SelectedPaymentId']";
	public static final String CreditCardBrainTreeRadioButton = "//div[contains(@data-target,'#Braintree')]//input[@name='SelectedPaymentId']";
	// WebElementFacade for NA Address
	public static final String ID_MAILING_ADDRESS_LINE1 = "ShippingInfoModel_ShippingAddress_Line1";

	public static final String ID_MAILING_CITY = "ShippingInfoModel_ShippingAddress_City";
	public static final String ID_MAILING_ZIP = "ShippingInfoModel_ShippingAddress_ZipCode";

	public static final String ID_MAILING_STATE = "ShippingInfoModel_ShippingAddress_Region-select";
	public static final String ID_MAILING_STATE_For_International = "ShippingInfoModel_ShippingAddress_Region-text";
	public static final String XPATH_COUNTRYTYPE = "//*[@id='ShippingInfoModel_SelectedContactType']";
	public static final String XPATH_COUNTRY_AREA_CODE = "//*[@id='ShippingInfoModel_PhoneNumberCountryCode']";
	public static final String XPATH_COUNTRY_AREA_CODE1 = "//*[@id='ShippingInfoModel_PhoneNumber_CountryCode']";
	
	public static final String WORKADDRESSRADIOBUTTON = "work-address-radio";

	public static final String XPATH_AREA_CODE = "//*[@id='ShippingInfoModel_PhoneNumberAreaCode']";
	public static final String XPATH_AREA_CODE1 = "//*[@id='ShippingInfoModel_PhoneNumber_AreaCode']";
	
	

	public static final String XPATH_PHONE_NUMBER = "//*[@id='ShippingInfoModel_PhoneNumber']";
	public static final String XPATH_PHONE_NUMBER1 = "//*[@id='ShippingInfoModel_PhoneNumber_Number']";
	
	
	public static final String COMPANY = "ShippingInfoModel_ShippingAddress_Company";
	public static final String ORDERNO = "((//section[@class='order-confirmation-intro'])[1]//child::p)[1]";
	public static final String REFERENCECODE = "((//div[@class='order-confirmation'])[1]//child::p)[1]";
	public static final String processCheckoutError = "(//*[@id='processCheckoutError'])[1]";

	public static final String PaypalCheckout = "//span[contains(text(),'Checkout')]//parent::div//parent::div";
	public static final String PaypalCheckout1 = "//div[@data-funding-source='paypal']";
	
	

	public ExamPurchagePage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath = PaypalCheckout)
	WebElementFacade paypalCheckoutButton;

	@FindBy(xpath = PaypalCheckout1)
	WebElementFacade paypalCheckoutButton1;
	
	@FindBy(id = ID_MAILING_STATE_For_International)
	WebElementFacade stateForInternational;

	@FindBy(xpath = processCheckoutError)
	WebElementFacade processCheckoutErrorMessage;
	@FindBy(xpath = ORDERNO)
	WebElementFacade orderNo;
	@FindBy(xpath = REFERENCECODE)
	WebElementFacade referenceCode;
	@FindBy(xpath = CreditCardRadioButton)
	WebElementFacade creditCardRadioButton;
	@FindBy(xpath = CreditCardBrainTreeRadioButton)
	WebElementFacade creditCardBrainTreeRadioButton;
	@FindBy(id = WORKADDRESSRADIOBUTTON)
	WebElementFacade workaddressRadioButton;
	@FindBy(id = "WorkAddress")
	WebElementFacade workaddressRadioButton2;
	@FindBy(id = ID_COUNTRY)
	WebElementFacade selectHomeCountry;
	@FindBy(xpath = "//select[@name='BillingInfoAndPaymentModel.BillingAddress.Country']")
	WebElementFacade selectBillingCountry;
	
	@FindBy(xpath = "//span[@data-select2-id='select2-data-1-v2mk']")
	WebElementFacade CountryContainer;
	
	@FindBy(xpath = "//li[@id='select2-BillingInfoAndPaymentModel_BillingAddress_Country-result-w9fy-USA']")
	WebElementFacade Country;
	
	
	
	
	
	@FindBy(id = COMPANY)
	WebElementFacade enterCOMPANY;
	
	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_Company")
	WebElementFacade enterBillingCOMPANY;

	// WebElementFacade for North America Address
	@FindBy(id = ID_MAILING_ADDRESS_LINE1)
	WebElementFacade mailingAddress1;
	
	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_Line1")
	WebElementFacade BillingmailingAddress1;

	@FindBy(id = ID_MAILING_CITY)
	WebElementFacade mailingCity;
	
	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_City")
	WebElementFacade BillingmailingCity;

	
	@FindBy(id = ID_MAILING_ZIP)
	WebElementFacade mailingZipCode;
	
	@FindBy(xpath = "//input[@name='BillingInfoAndPaymentModel.BillingAddress.ZipCode']")
	WebElementFacade BillingmailingZipCode;
	
	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_FirstName")
	WebElementFacade BillingFirstName;
	
	@FindBy(id = "BillingInfoAndPaymentModel_BillingAddress_LastName")
	WebElementFacade BillingLastName;
	
	

	@FindBy(id = ID_MAILING_STATE)
	WebElementFacade mailingState;
	
	@FindBy(xpath = "//input[@name='BillingInfoAndPaymentModel.BillingAddress.Region']")
	WebElementFacade BillingmailingState;
	
	
	@FindBy(xpath = XPATH_COUNTRYTYPE)
	WebElementFacade select_COUNTRYTYPE;

	// Mailing information
	@FindBy(xpath = XPATH_COUNTRY_AREA_CODE)
	WebElementFacade phoneNumberCountryCode;
	@FindBy(xpath = XPATH_COUNTRY_AREA_CODE1)
	WebElementFacade phoneNumberCountryCode1;

	@FindBy(xpath = XPATH_AREA_CODE)
	WebElementFacade phoneNumberAreaCode;
	@FindBy(xpath = XPATH_AREA_CODE1)
	WebElementFacade phoneNumberAreaCode1;

	@FindBy(xpath = XPATH_PHONE_NUMBER)
	WebElementFacade phoneNumber;
	@FindBy(xpath = XPATH_PHONE_NUMBER1)
	WebElementFacade phoneNumber1;

	@FindBy(xpath = "//span[text()='Learning & Development']")
	WebElementFacade LearningAndDevelopmentNavigation;
	@FindBy(xpath = "//a[text()='CPIM']")
	WebElementFacade CPIM;
	@FindBy(xpath = "//a[text()='CLTD']")
	WebElementFacade CLTD;
	@FindBy(xpath = "//a[text()='Warehousing']")
	WebElementFacade WAREHOUSE;
	@FindBy(xpath = "//a[text()='CSCP']")
	WebElementFacade CSCP;
	@FindBy(id = "exam-region-select")
	WebElementFacade selectCoutryExamRegion;
	@FindBy(xpath = "(//select[@class='region-select'])[2]")
	WebElementFacade selectBundleCoutryRegion;
	@FindBy(xpath = "//select[@name='country']")
	WebElementFacade selectBundleCoutry;
	// First Attempt
	@FindBy(xpath = "//button[contains(@data-product-code,'CPIM-Part-1-First-Attempt')]")
	WebElementFacade CPIMPart1FirstAttempt;

	@FindBy(xpath = "//a[contains(@data-sku,'CPIM-Part-2-First-Attempt-V7')]")
	WebElementFacade CPIMPart2FirstAttempt;
	@FindBy(xpath = "//a[contains(@data-sku,'CPIM-Part-2-Self-Study_Version-7.0')]")
	WebElementFacade CPIMLsExamPart2;

	@FindBy(xpath = "//button[contains(@data-product-code,'CLTD-First-Attempt')]")
	WebElementFacade CLTDFirstAttempt;

	@FindBy(xpath = "//button[contains(@data-product-code,'CSCP-First-Attempt')]")
	WebElementFacade CSCPFirstAttempt;

	// Retake
	@FindBy(xpath = "//button[contains(@data-product-code,'CPIM-Part-1-Retake')]")
	WebElementFacade CPIMPart1Retake;

	@FindBy(xpath = "//button[contains(@data-product-code,'CPIM-Part-2-Retake')]")
	WebElementFacade CPIMPart2Retake;

	@FindBy(xpath = "//button[contains(@data-product-code,'CLTD-Retake')]")
	WebElementFacade CLTDRetake;

	@FindBy(xpath = "//button[contains(@data-product-code,'CSCP-Retake')]")
	WebElementFacade CSCPRetake;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElementFacade CodeOfEthicsButton;
	@FindBy(xpath = "//a[@id='exam-add-to-cart']|//a[@id='exam-login-add-to-cart']")
	WebElementFacade AddToCardButton;
	@FindBy(xpath = "(//a[@class='button button--add-to-cart add-to-cart'])[last()]")
	WebElementFacade BundleAddToCardButton;
	@FindBy(xpath = "(//a[contains(@class,'button button--add-to-cart add-to-cart')])[last()]")
	WebElementFacade WarehousingAddToCardButton;
	@FindBy(xpath = "//a[@id='cart-upsell-button-certupgradeaddtocart']")
	WebElementFacade UpgradeCertificateButton;
	@FindBy(xpath = "//a[contains(text(),'Upgrade now')]")
	WebElementFacade UpgradeCertificateButton2;
	
	
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElementFacade AlreadyMembershipCancelButton;
	@FindBy(xpath = "//div[@class='ASCM_membership_promo_copy']")
	WebElementFacade promoCopyText;
	@FindBy(xpath = "//h3[text()='Certification Upgrade']")
	WebElementFacade upgradeCertificateModal;
	
	@FindBy(xpath = "(//a[contains(text(),'Agree and Continue')])[2]")
	WebElementFacade AggressButton;
	@FindBy(xpath = "//button[text()='Add Selected']")
	WebElementFacade AddSelectedButton;
	
	@FindBy(xpath = "//div[@class='chapterSelect-form-zip-input']//input")
	WebElementFacade BundlePostCode;
	@FindBy(id = "chapterSelect-submit")
	WebElementFacade SearchBundleCode;
	@FindBy(xpath = "(//div[contains(@data-chaptertype,'ASCM')])[1]//div[contains(@class,'title')]")
	WebElementFacade SearchBundle;
	@FindBy(xpath = "(//div[contains(@data-chaptertype,'ASCM')])[2]//div[contains(@class,'title')]")
	WebElementFacade chapter2;
	@FindBy(xpath = "(//div[contains(@data-chaptertype,'ASCM')])[3]//div[contains(@class,'title')]")
	WebElementFacade chapter3;
	
	@FindBy(xpath = "(//div[@class='chapterSelect-results']//div)[1]")
	WebElementFacade internationalChapter;
	
	
	

	@FindBy(xpath = "//*[contains(text(),'North America')]")
	WebElementFacade northAmerica;

	@FindBy(xpath = "//*[contains(text(),'International')]")
	WebElementFacade international;
	
	@FindBy(xpath = "//button[text()='Skip']")
	WebElementFacade skipButton;
	
	@FindBy(xpath = "//div[@class='return-policy']//a")
	WebElementFacade returnPolicy;
	
	@FindBy(xpath = "//h1[text()='APICS Return Policy']")
	WebElementFacade returnPolicyPageHeading;
	
	
	

	public void clickCPIMPart1() {
		jsClick(CPIMPart1FirstAttempt);
	}
	public void clickReturnPolicy() throws InterruptedException {
		Waits.wait3Second();
		Waits.moveToELement(returnPolicy, getDriver());
		jsClick(returnPolicy);
	}
	
	public void verifyReturnPolicyPage() throws InterruptedException {
		Waits.wait3Second();
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		System.out.print("/n/n/nTabs:"+tabs.size());
		getDriver().switchTo().window(tabs.get(1));
		Waits.wait3Second();
		Assert.assrt(returnPolicyPageHeading.isDisplayed());
		getDriver().switchTo().window(tabs.get(1));
		closeTab(1, getDriver());
		Waits.wait3Second();
	}

	public void clickCPIMPart2() {
		jsClick(CPIMPart2FirstAttempt);
	}

	public void clickCLTDFirstAttempt() {
		jsClick(CLTDFirstAttempt);
	}

	public void clickCSCPNavigation() {
		jsClick(CSCP);
	}

	public void clickCSCP() {
		jsClick(CSCPFirstAttempt);
	}

	public void clickCPIMPart1Retake() {
		jsClick(CPIMPart1Retake);
	}

	public void clickCPIMPart2Retake() {
		jsClick(CPIMPart2Retake);
	}

	public void clickCLTDRetake() {
		jsClick(CLTDRetake);
	}

	public void clickCSCPRetake() {
		jsClick(CSCPRetake);
	}

	public void clickOKButtonCodeOfEthics() {
		jsClick(CodeOfEthicsButton);

	}

	public void clickLearningAndDevelopmentTopNavigation() {
		try {
			Waits.wait5Second();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jsClick(LearningAndDevelopmentNavigation);
	}

	public void clickCPIM() {
		jsClick(CPIM);
	}
	
	public void verifySelectedProductPage(String product) throws InterruptedException {
		Waits.wait5Second();
		WebElement element =getDriver().findElement(By.xpath("//h2[contains(text(),'"+product+"')]"));
		moveTo(By.xpath("//h2[contains(text(),'"+product+"')]"));
		Assert.assrt(element.isDisplayed());
	}
	public void verifyCorporateAccountMessage(String text) throws InterruptedException {
		Waits.wait5Second();
		WebElement element =getDriver().findElement(By.xpath("//p[text()='"+text+"']"));
		moveTo(By.xpath("//p[contains(text(),'"+text+"')]"));
		Assert.assrt(element.isDisplayed());
	}
	
	public void verifySelectedProductAddedInCart(String product) throws InterruptedException {
		Waits.wait5Second();
		List<WebElement> element =getDriver().findElements(By.xpath("//h4[contains(text(),'"+product+"')]"));
		Assert.assrt(element.size()>0);
	}
	
	public void verifyPurchaseMultipleLinkIsPresent() throws InterruptedException {
		Waits.wait5Second();
		List<WebElement> element =getDriver().findElements(By.xpath("//span[contains(text(),'To purchase multiple learning')]//a"));
		Assert.assrt(element.size()>0);
	}
	
	
	public void clickSkipButtonStep() throws InterruptedException {
		Waits.wait3Second();
		try {
			jsClick(skipButton);
		}catch (Exception e) {
			jsClick(skipButton);
		}
	}
	
	
	
	
	public void verifySelectedCertificatePage(String product) throws InterruptedException {
		Waits.wait5Second();
		WebElement element =getDriver().findElement(By.xpath("//h3[contains(text(),'"+product+"')]"));
		moveTo(By.xpath("//h3[contains(text(),'"+product+"')]"));
		Assert.assrt(element.isDisplayed());
	}
	
	

	public void clickCLTD() {
		jsClick(CLTD);
	}
	
	public void clickWarehouse() {
		jsClick(WAREHOUSE);
	}

	
	public void selectCoutryExamRegion(String value) {
		// selectByValue(selectCoutryExamRegion, value);
		if (value.contains("1")) {
			jsClick(northAmerica);
		} else {
			jsClick(international);
		}
	}

	public void clickAddToCardExamButton() {
		jsClick(AddToCardButton);
	}

	public void clickWOrkAddressReadioButton() {
//		try {
//			Thread.sleep(40000);
//		} catch (InterruptedException e) {
//			//e.printStackTrace();
//		}
		try {
			Waits.waitForElementToBeDisplay(workaddressRadioButton2, getDriver());
			Waits.waitForElementToBeVisibile(workaddressRadioButton2, getDriver(), 150);
			jsClick(workaddressRadioButton2);
			
		}catch (Exception e) {
			Waits.waitForElementToBeDisplay(workaddressRadioButton, getDriver());
			Waits.waitForElementToBeVisibile(workaddressRadioButton, getDriver(), 150);
			jsClick(workaddressRadioButton);
		}
		
		
	}

	public void selectHomeCountry(String country) {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			selectByValue(selectHomeCountry, country);
		}catch (Exception e) {
			selectByID(selectHomeCountry, 203);
		}
		

	}
	
	public void selectBillingCountry(String country) throws InterruptedException {
		
		try {
			try {
				selectByValue(selectBillingCountry, country);
			}catch (Exception e) {
				selectByID(selectBillingCountry, 17);
			}
			
		}catch (Exception e) {
			
			Waits.wait3Second();
			jsClick(CountryContainer);
			Waits.wait3Second();
			scrollToElement(Country);
			jsClick(Country);
		}
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

	
	
	// North America Address
	public void enterMailingAddress1(String maillingAddressLine1) throws InterruptedException {
		Waits.wait2Second();
		typeInto(mailingAddress1, maillingAddressLine1);
	}
	
	public void enterBillingMailingAddress1(String maillingAddressLine1) throws InterruptedException {
		Waits.wait2Second();
		typeInto(BillingmailingAddress1, maillingAddressLine1);
	}
	
	

	public void enterMailingCity(String mailingCityNorthAmerica) {
		typeInto(mailingCity, mailingCityNorthAmerica);
	}
	
	public void enterBillingMailingCity(String mailingCityNorthAmerica) {
		typeInto(BillingmailingCity, mailingCityNorthAmerica);
	}
	
	

	public void enterMaililingZipCode(String mailingZipNorthAmerica) {
		typeInto(mailingZipCode, mailingZipNorthAmerica);
	}
	
	public void enterBillingMaililingZipCode(String mailingZipNorthAmerica) {
		typeInto(BillingmailingZipCode, mailingZipNorthAmerica);
	}
	public void enterFirstName(String name) {
		typeInto(BillingFirstName, name);
	}
	public void enterLastName(String name) {
		typeInto(BillingLastName, name);
	}
	
	

	public void enterMailingState(String state) {
		try {
			Waits.waitForElementToBeVisibile(mailingState, getDriver(), 5);
			selectByValue(mailingState, state);
		} catch (Exception e) {
			typeInto(stateForInternational, state);
		}

	}
	
	public void enterBillingMailingState(String state) {
		try {
			selectByValue(BillingmailingState, state);
		}catch (Exception e) {
			typeInto(BillingmailingState, state);
		}
		
	}
	
	

	// Phone number
	public void selectCountryAreaCode(String COUNTRY_AREA_CODE) {
		
		try {
			selectByValue(phoneNumberCountryCode1, COUNTRY_AREA_CODE);
		}catch (Exception e) {
			selectByValue(phoneNumberCountryCode, COUNTRY_AREA_CODE);
		}
			
		
		
	}

	public void selectCountryType(String COUNTRY_AREA_CODE) {
		try {
			selectByValue(select_COUNTRYTYPE, COUNTRY_AREA_CODE);
		}catch (Exception e) {
			selectByID(select_COUNTRYTYPE, 2);
		}
		
	}

	public void enterCompany(String company) throws InterruptedException {
		Waits.wait2Second();
		typeInto(enterCOMPANY, company);
		Waits.wait3Second();
		type(enterCOMPANY, company);
	}
	
	public void enterBillingCompany(String company) throws InterruptedException {
		Waits.wait2Second();
		typeInto(enterBillingCOMPANY, company);
		Waits.wait3Second();
		type(enterBillingCOMPANY, company);
	}
	
	

	public void enterAreaCode(String AREA_CODE) {
		try {
			typeInto(phoneNumberAreaCode1, AREA_CODE);
		}catch (Exception e) {
			typeInto(phoneNumberAreaCode, AREA_CODE);
		}
		
	}

	public void enterPhoneNumber(String PHONE_NUMBER) {
		try {
			typeInto(phoneNumber1, CheckoutConstants.PHONE_NUMBER);
		}catch (Exception e) {
			typeInto(phoneNumber, CheckoutConstants.PHONE_NUMBER);
		}
		
	}

	public void clickCreditCardRadioButton() {
		jsClick(creditCardRadioButton);
	}
	public void clickCreditCardBrainTreeRadioButton() {
		jsClick(creditCardBrainTreeRadioButton);
	}

	public void getOrderNo() throws InterruptedException {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (isElementVisible(org.openqa.selenium.By.xpath(processCheckoutError))) {
			moveTo(processCheckoutError);
			Assert.fail(getElementText(processCheckoutErrorMessage));
		} else {
			Waits.waitForElementToBeVisibile(orderNo, getDriver(), 300);
			String text = getElementText(orderNo);
			// Serenity.recordReportData().withTitle("Order No").andContents(text);
		}

	}

	public void getReferenceCode() throws InterruptedException {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (isElementVisible(org.openqa.selenium.By.xpath(processCheckoutError))) {
			moveTo(processCheckoutError);
			Assert.fail(getElementText(processCheckoutErrorMessage));
		} else {
		Waits.wait5Second();
		Waits.waitForElementToBeVisibile(referenceCode, getDriver(), 300);
		String text = getElementText(referenceCode);
		Serenity.recordReportData().withTitle("Reference Code").andContents(text);

		}
	}

	public void clickCPIMLsExamPart2() {
		jsClick(CPIMLsExamPart2);
	}

	public void selectBundleCoutryRegion(String value) {
//		selectByValue(selectBundleCoutryRegion, value);
		if (value.contains("1")) {
			jsClick(northAmerica);
		} else {
			jsClick(international);
		}
	}

	public void selectBundleCoutry(String value) throws InterruptedException {
		Waits.wait3Second();
		selectByVisibleText(selectBundleCoutry, value);

	}

	public void clickBundleAddToCardExamButton() {
		try {
			jsClick(WarehousingAddToCardButton);
		}catch (Exception e) {
			jsClick(BundleAddToCardButton);
		}
		
		
	}
	public void clickOnUpgradeNowButton() throws InterruptedException {
		try {
			Waits.wait3Second();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			waitForElementVisibility(UpgradeCertificateButton2, 10);
			scrollToElement(UpgradeCertificateButton2);
			jsClick(UpgradeCertificateButton2);
		}catch (Exception e) {
			waitForElementVisibility(UpgradeCertificateButton, 10);
			scrollToElement(UpgradeCertificateButton);
			jsClick(UpgradeCertificateButton);
			
		}
			

	}
	
	public void verifyMembershipUpcellCTA() {
		try {
			Waits.wait5Second();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Waits.waitForElementToBeVisibile(promoCopyText, getDriver(), 20);
		Assert.assrt(promoCopyText.isDisplayed());
		
		
	}
	public void verifyUpgradeCertificateModal() {
		try {
			Waits.wait5Second();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assrt(upgradeCertificateModal.isDisplayed());
		
		
	}
	
	

	public void clickAggressButton() {
		jsClick(AggressButton);
	}
	public void clickAddSelectedButton() throws InterruptedException {
		scrollToElement(AddSelectedButton);
		jsClick(AddSelectedButton);
	}
	
	

	public void EnterBundlePostCode(String value) {
		typeInto(BundlePostCode, value);
	}

	public void clickSearchBundleCode() throws InterruptedException {
		Waits.wait3Second();
		jsClick(SearchBundleCode);
	}

	public void clickSearchBundle() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(SearchBundle);
		jsClick(SearchBundle);
		Waits.wait3Second();
	}
	
	public void clickInternationalChapter() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(internationalChapter);
		jsClick(internationalChapter);
		Waits.wait3Second();
	}
	
	
	
	public void clickMultipleItems() throws InterruptedException {
		Waits.wait3Second();
		scrollToElement(SearchBundle);
		jsClick(SearchBundle);
		scrollToElement(chapter2);
		jsClick(chapter2);
		scrollToElement(chapter3);
		jsClick(chapter3);
		Waits.wait3Second();
	}
	
	public void chooseBrainTreeWay(String value) throws InterruptedException {
		try {
			Waits.wait10Second();
			String xpath = "//div[contains(@class,'braintree-methods--active')]";
			WebElement caard =getDriver().findElement(By.xpath(xpath));
			if(caard.isDisplayed()) {
				System.out.print("Card Already Added");
			}
		}catch (Exception e) {
			if(value.contains("Card")) {
				try {
				String locatorString="//div[contains(text(),'"+value+"')]";
				WebElement element=getDriver().findElement(By.xpath(locatorString));
				element.click();
				}catch (Exception e1) {
					jsClick(creditCardBrainTreeRadioButton);
					String locatorString="//div[contains(text(),'"+value+"')]";
					WebElement element=getDriver().findElement(By.xpath(locatorString));
					element.click();
				}
				}
				else {
					String  url=getDriver().getCurrentUrl();
//					if(url.contains("stage")) {
//						try {
//							jsClick(creditCardBrainTreeRadioButton);
//						}catch (Exception e1) {
//							// TODO: handle exception
//						}
//					
//					String locatorString="//div[contains(text(),'"+value+"')]";
//					WebElement element=getDriver().findElement(By.xpath(locatorString));
//					element.click();
//					Waits.wait1Second();
//					try {
//						jsClick(paypalCheckoutButton1);
//					}catch (Exception e1) {
//						jsClick(paypalCheckoutButton);
//					}
//					
//					String windows = getDriver().getWindowHandle(); 
//					System.out.println(windows);
//					getDriver().switchTo().window(windows);
//				}
//			else {
					String locatorString="//div[contains(text(),'"+value+"')]";
					WebElement element=getDriver().findElement(By.xpath(locatorString));
					element.click();
					Waits.wait1Second();
					try {
						getDriver().switchTo().frame(getDriver().findElement(By.xpath("//iframe[@class='zoid-component-frame zoid-visible'][1]")));
					}catch (Exception e1) {
						e1.printStackTrace();
					}
					
//					getDriver().switchTo().frame(0);
					jsClick(paypalCheckoutButton);
					getDriver().switchTo().defaultContent();
					
//					String windows = getDriver().getWindowHandle(); 
//					System.out.println(windows);
//					getDriver().switchTo().window(windows);
					
					String MainWindow=getDriver().getWindowHandle();
					 Set<String> s1=getDriver().getWindowHandles();	
					 Iterator<String> i1=s1.iterator();		
		     		
				        while(i1.hasNext())			
				        {		
				            String ChildWindow=i1.next();		
				            		
				            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
				            {    		
				                 
				                    // Switching to Child window
				            	getDriver().switchTo().window(ChildWindow);	                                                                                                           
				            	getDriver().findElement(By.id("email"))
				                    .sendKeys(checkoutConstants.PAYPALEMAIL);                			
				                    
				            	getDriver().findElement(By.name("btnNext")).click();
				            	Waits.wait3Second();
				            	getDriver().findElement(By.id("password"))
			                    .sendKeys(checkoutConstants.PAYPALPASSWORD); 
				            	getDriver().findElement(By.cssSelector("#btnLogin")).click();
				            	Waits.wait2Second();
				            	getDriver().findElement(By.cssSelector("#acceptAllButton")).click();
				            	WebElement aggreesButton= getDriver().findElement(By.id("consentButton"));
				            	Actions actions = new Actions(getDriver());
				        		actions.moveToElement(aggreesButton);
				        		actions.perform();
				            	aggreesButton.click();
							// Closing the Child Window.
//				            	getDriver().close();		
				            }		
				        }	
				        Thread.sleep(3000);
				        // Switching to Parent window i.e Main Window.
				        getDriver().switchTo().window(MainWindow);				
				    
//				}
					
				}
		}

	}
}
