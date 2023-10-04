package com.ascm.pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ascm.util.SeleniumHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExamCreditPurchaseProcess extends SeleniumHelper{
	
	public ExamCreditPurchaseProcess(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[text()='Credentials']")
	WebElementFacade btnCredentials;
	
	@FindBy(xpath = "//a[@data-click-action='Exams']")
	WebElementFacade btnExam;
	
	@FindBy(xpath = "//span[@class='header-logoutToggle']")
	WebElementFacade toggleMyAccount;
	
	@FindBy(xpath = "//a[text()='My Account']")
	WebElementFacade liMyAccount;
	
	@FindBy(xpath = "(//button[text()='Log Out'])[1]")
	WebElementFacade liLogout;
	
	@FindBy(xpath = "//label[text()='Credit Status']")
	WebElementFacade labelCreditStatusListItem;
	
	@FindBy(xpath = "//div[@class='pricing-blocks-block-creditmsg']")
	WebElementFacade creditMessageOnBundle;
	
	@FindBy(xpath = "//div[@class='pricing-blocks-block-creditmsg']/a")
	WebElementFacade btnMyAccountOnCreditMessageOnBundle;
	
	@FindBy(xpath = "//a[contains(text(),'Register for Your Exam')]")
	WebElementFacade btnRegisterForExam;
	
	@FindBy(id = "Company")
	WebElementFacade company;
	
	@FindBy(xpath = "(//*[contains(@class,'hasCountrySelect')])[last()]")
	WebElementFacade countryDiv;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElementFacade inputCountryRegionSearch;
	
	@FindBy(xpath = "(//li)[last()]")
	WebElementFacade country;
	
	
	@FindBy(xpath = "//select[@id='Country']")
	WebElementFacade countrySelect;
	
	
	
	
	
	@FindBy(id = "Line1")
	WebElementFacade addressLine1;
	
	@FindBy(id = "City")
	WebElementFacade city;
	
	@FindBy(id = "Region-select")
	WebElementFacade state;
	
	@FindBy(id = "ZipCode")
	WebElementFacade zipCode;
	
	@FindBy(xpath  = "//button[contains(text(),'Register')]")
	WebElementFacade btnRegister;
	
	public void clickOnCredentialsButton() {
		jsClick(btnCredentials);
	}
	
	public void clickOnExamButton() {
		jsClick(btnExam);
	}

	public void clickOnMyAccount() {
		jsClick(toggleMyAccount);
		jsClick(liMyAccount);
		
	}
	
	public void clickOnLogout() {
		jsClick(toggleMyAccount);
		jsClick(liLogout);
		
	}
	
	public void verifyMyExamList() {
		isElementVisible(By.xpath("//label[text()='Credit Status']"));
	}
	
	public void verifyCreditMessageIsDisplaying() {
		try {
			if (creditMessageOnBundle.isDisplayed()) {
			System.out.println("Credit message displaying");
		}
		} catch (Exception e) {
		}
		
	}
	
	public void clickOnMyAccountInCreditMessage() {
		jsClick(btnMyAccountOnCreditMessageOnBundle);
	}
	
	public void clickOnRegisterExam() {
		jsClick(btnRegisterForExam);
		
	}
	
	public void enterAddress() {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.getElementById('Country').setAttribute('aria-hidden', 'false')");
			Waits.wait10Second();
			selectByVisibleText(countrySelect, "United States");
//			jsClick(countryDiv);
//			
//			typeInto(inputCountryRegionSearch, "countrySelect");
//			jsClick(country);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Waits.waitForElementToBeVisibile(countrySelect, getDriver(),5);
			selectByValue(countrySelect,  "United States");
	
		}
		catch (Exception e) {
			//typeInto(state,CheckoutConstants.MAILING_STATE_NORTHAMERICA);
		}
		
		
		typeInto(company, CheckoutConstants.MAILING_COMPANY);
		
		typeInto(addressLine1, CheckoutConstants.MAILING_ADDRESS_LINE1_NORTHAMERICA);
		
		typeInto(city, CheckoutConstants.MAILING_CITY_NORTHAMERICA);
		
		typeInto(zipCode, CheckoutConstants.MAILING_ZIP_NORTHAMERICA);
		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.getElementById('Country').setAttribute('aria-hidden', 'false')");
			Waits.wait10Second();
			Waits.waitForElementToBeVisibile(state, getDriver(),5);
			selectByValue(state, CheckoutConstants.MAILING_STATE_NORTHAMERICA);
	
		}
		catch (Exception e) {
			typeInto(state,CheckoutConstants.MAILING_STATE_NORTHAMERICA);
		}
		
		//jsClick(btnRegister);
	}
}
