package com.ascm.pages;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import com.ascm.util.SeleniumHelper;
import com.ibm.icu.impl.Assert;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class MembershipPage extends SeleniumHelper {

	public MembershipPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "coreNaSelected")
	WebElementFacade northAmericaCoreMembership;

	@FindBy(id = "plusNaSelected")
	WebElementFacade northAmericaPlusMembership;

	@FindBy(id = "coreIntlSelected")
	WebElementFacade coreInternationalMembership;

	@FindBy(id = "plusIntlSelected")
	WebElementFacade plusInternationalMembership;

	@FindBy(id = "internationalMembership_country")
	WebElementFacade countryDropDown;
	@FindBy(xpath= "//select[@name='country']")
	WebElementFacade naCountryDropDown;

	@FindBy(css = ".btn.btn-secondary")
	WebElementFacade purchaseMembershupButton;

	@FindBy(id = "paymentTermsMonthlySelected")
	WebElementFacade monthlyPrice;

	@FindBy(id = "paymentTermsYearlySelected")
	WebElementFacade annualPrice;

	@FindBy(id = "chapterFinderCountry")
	WebElementFacade selectChapterCountry;

	@FindBy(id = "zipCode")
	WebElementFacade chapterZipCode;

	@FindBy(css = ".btn.btn-primary.mt-1")
	WebElementFacade findParnterButton;

	@FindBy(xpath = "(//button[@type='button'][@class='btn btn-primary'])[position()=1]")
	WebElementFacade selectChapter;

	@FindBy(xpath = "//span[text()='I agree to the ASCM Membership Terms and Conditions']")
	WebElementFacade agreementCheckbBox;
	
	@FindBy(xpath = "//input[@name='membership_terms_agreement']")
	WebElementFacade MemberagreementCheckbBox;
	
	@FindBy(xpath = "//input[@id='membership-upgrade-checkbox']")
	WebElementFacade certificateUpgradeCheckBox;
	
	@FindBy(xpath = "//button[text()='Skip']")
	WebElementFacade skipMembership;
	
	@FindBy(xpath = "//a[@id='membership-period-monthly']")
	WebElementFacade monthlyMembership;
	
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElementFacade SearchChapButton;
	
	@FindBy(xpath = "//div[@id='sid-college-name-item-0']")
	WebElementFacade University;

	
	
	@FindBy(css = ".btn.btn-primary.btn-block.mobile-full.float-right")
	WebElementFacade addToCartButton;

	@FindBy(id = "add-to-cart")
	WebElementFacade addToCartMembershipButton;
	
	@FindBy(xpath = "//a[contains(@class,'add-to-cart')]")
	WebElementFacade addToCartButton1;
	
	@FindBy(xpath = "//*[@id=\"section-auto-renew\"]/div/div/div/div/label/span[2]")
	WebElementFacade autoRenewCheckbox;
	@FindBy(xpath = "//select[@class='form-controls']")
	WebElementFacade selectDiscountMembership;
	@FindBy(xpath = "//select[@id='discount-country']")
	WebElementFacade selectCountryDiscountMembership;
	@FindBy(xpath = "//span[contains(text(),'full-time student')]//..//span[@class='checkmark']")
	WebElementFacade checkFullTimeStudent;
	@FindBy(id = "sid-college-name")
	WebElementFacade enterUniversity;
	@FindBy(id = "student_country")
	WebElementFacade selectCountry;
	@FindBy(xpath = "//select[@name='country']")
	WebElementFacade selectMembershipCountry;
	@FindBy(id = "sid-grad-month")
	WebElementFacade selectGradMonth;
	@FindBy(id = "sid-grad-year")
	WebElementFacade selectGradYear;
	@FindBy(id = "sid-first-name")
	WebElementFacade enterFirstName;
	@FindBy(id = "sid-last-name")
	WebElementFacade enterLastName;
	@FindBy(id = "sid-email")
	WebElementFacade enterEmail;
	@FindBy(id = "sid-birthdate__month")
	WebElementFacade selectDobMonth;
	@FindBy(id = "sid-birthdate-day")
	WebElementFacade selectDobDay;
	@FindBy(id = "sid-birthdate-year")
	WebElementFacade selectDobYear;
	@FindBy(xpath = "//button[contains(text(),'Check')]")
	WebElementFacade checkButton;
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElementFacade closeButton;	
	@FindBy(xpath = "//ul[contains(@class,'header-secondary-nav')]//a[text()='Become a Member']")
	WebElementFacade BecomeaMember;
	@FindBy(xpath = "//div[@class='membership-sidebar-upgrade-price']")
	WebElementFacade membershipCertificateValue;
	@FindBy(xpath = "//p[@id='membership-price-block']")
	WebElementFacade currentMembershipVal;
	@FindBy(xpath = "//p[contains(text(),'Add local membership partner')]")
	WebElementFacade AddLocalMembershipPartner;
	@FindBy(xpath = "//div[@class='chapterSelect-form-zip-input']//input")
	WebElementFacade membershipPatnerPostalCode;
	@FindBy(xpath = "//a[text()='Students']")
	WebElementFacade StudentDiscount;
	@FindBy(xpath = "//button[@aria-labelledby='verify-status-text']")
	WebElementFacade VerifyStudentStatusButton;
	
	@FindBy(xpath = "//h3[@class='myAccount-membership-box-section-mainTitle']//ancestor::div[contains(@class,'myAccount-membership-box-section')]//span")
	WebElementFacade membershipToggle;
	@FindBy(xpath = "//h4[contains(text(),'Certification Upgrade')]//ancestor::div[contains(@class,'myAccount-membership-box-section')]//span")
	WebElementFacade certificateToggle;
	@FindBy(xpath = "//h4[contains(text(),'Local Membership Partner')]//ancestor::div[contains(@class,'myAccount-membership-box-section')]//span")
	WebElementFacade chapterToggle;
	
	@FindBy(xpath = "//h3[@class='myAccount-membership-box-section-mainTitle']")
	WebElementFacade membershipToggleHeading;
	@FindBy(xpath = "//h4[contains(text(),'Certification Upgrade')]")
	WebElementFacade certificateToggleHeading;
	@FindBy(xpath = "//h4[contains(text(),'Local Membership Partner')]")
	WebElementFacade chapterToggleHeading;
	
	
	
	public void clickVerifyStudentStatusButton() {
		
		jsClick(VerifyStudentStatusButton);
	}
	

	public void clickCoreMembership() {
	
		jsClick(northAmericaCoreMembership);
	}
	
	public void clickOnStudentDiscountType() {
		jsClick(StudentDiscount);
	}
	
	public void clickOnBecomeAMember() throws InterruptedException {
		scrollToElement(BecomeaMember);
		try {
			click(BecomeaMember);
		}catch (Exception e) {
			jsClick(BecomeaMember);
		}
		
	}
	
	public void getCurrentMembership() throws InterruptedException {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Waits.wait5Second();
		Waits.waitForElementToBeVisibile(currentMembershipVal, getDriver(), 300);
		LoginConstants.Membershipvalue = Double.valueOf(getElementText(currentMembershipVal).replace("$", "").replace("+", ""));
		//Serenity.recordReportData().withTitle("Current Membership Value").andContents(String.valueOf(LoginConstants.Membershipvalue));
	}
	
	public void verifyMembershipValue(String CertificateAdded) throws InterruptedException {
		
		moveTo(By.xpath("//div[@class='membership-sidebar-upgrade-price']"));
		Waits.wait2Second();
		Double Value =Double.valueOf(getElementText(membershipCertificateValue).replace("$", "").replace("+", ""));
		Double currentValue =Double.valueOf(getElementText(currentMembershipVal).replace("$", "").replace("+", ""));
		
		System.out.println("Membership Value Before Adding Certificate: "+LoginConstants.Membershipvalue);
		System.out.println("Membership Value After Adding Certificate: "+Value);
		System.out.println("Current Membership Value: "+currentValue);
		if(CertificateAdded.equalsIgnoreCase("CertificateAdded")) {
			Assert.assrt(LoginConstants.Membershipvalue<(currentValue));
		}else {
			Assert.assrt(LoginConstants.Membershipvalue.equals(currentValue));
		}
			
	}
	
	
	
	public void clickOnAddLocalMembershipPartner() throws InterruptedException {
		scrollToElement(AddLocalMembershipPartner);
		try {
			click(AddLocalMembershipPartner);
		}catch (Exception e) {
			jsClick(AddLocalMembershipPartner);
		}
		
	}
	
	public void verifyToggle(String type , String toggle) throws InterruptedException {
		String onColorCode = "rgba(130, 195, 65, 1)";
		String offColorCode = "rgba(207, 212, 216, 1)";
		if(type.toLowerCase().equalsIgnoreCase("base membership")) {
			String colorCode =  membershipToggle.getCssValue("background-color");			
			if(toggle.toLowerCase().equalsIgnoreCase("on")) {
				Assert.assrt(colorCode.equalsIgnoreCase(onColorCode));
			}else if (toggle.toLowerCase().equalsIgnoreCase("off")) {
				Assert.assrt(colorCode.equalsIgnoreCase(offColorCode));
			}
		}else if(type.toLowerCase().equalsIgnoreCase("certificate upgrade")) {
			String colorCode =  certificateToggle.getCssValue("background-color");
			System.out.println(colorCode);
			if(toggle.toLowerCase().equalsIgnoreCase("on")) {
				Assert.assrt(colorCode.equalsIgnoreCase(onColorCode));
			}else if (toggle.toLowerCase().equalsIgnoreCase("off")) {
				Assert.assrt(colorCode.equalsIgnoreCase(offColorCode));
			}
			
		}else if(type.toLowerCase().equalsIgnoreCase("chapter")) {
			String colorCode =  chapterToggle.getCssValue("background-color");
			System.out.println(colorCode);
			if(toggle.toLowerCase().equalsIgnoreCase("on")) {
				Assert.assrt(colorCode.equalsIgnoreCase(onColorCode));
			}else if (toggle.toLowerCase().equalsIgnoreCase("off")) {
				Assert.assrt(colorCode.equalsIgnoreCase(offColorCode));
			}
			
		}
		
	}
	
	public void verifyToggleHeading(String type) throws InterruptedException {
		if(type.toLowerCase().equalsIgnoreCase("base membership")) {			
				Assert.assrt(membershipToggleHeading.isPresent());
		}else if(type.toLowerCase().equalsIgnoreCase("certificate upgrade")) {
			Assert.assrt(certificateToggleHeading.isPresent());
			
		}else if(type.toLowerCase().equalsIgnoreCase("chapter")) {
			Assert.assrt(chapterToggleHeading.isPresent());
			
		}
		
	}
	public void verifyPage(String type) throws InterruptedException {
		Waits.wait5Second();
		WebElement element =getDriver().findElement(By.xpath("//h3[contains(text(),'"+type+"')]"));
		moveTo(By.xpath("//h3[contains(text(),'"+type+"')]"));
		Assert.assrt(element.isDisplayed());
		
	}
	
	
	
	public void verifyMembershipType(String type) throws InterruptedException {
		Waits.wait5Second();
		java.util.List<WebElement> element =getDriver().findElements(By.xpath("//div[text()='"+type+"']"));
		Assert.assrt(element.size()>0);
	}
	
	
	
	
	public void verifyMembershipVisible(String type, String value) throws InterruptedException {
		if(type.toLowerCase().equalsIgnoreCase("type")) {			
				Assert.assrt(getDriver().findElement(By.xpath("//h3[text()='Membership Info']//parent::div//div[contains(text(),'"+value+"')]")).isDisplayed());
		}else if(type.toLowerCase().equalsIgnoreCase("since")) {
			Assert.assrt(getDriver().findElement(By.xpath("//li[text()='"+value+"']")).isDisplayed());
			
		}else if(type.toLowerCase().equalsIgnoreCase("expires")) {
			Assert.assrt(getDriver().findElement(By.xpath("//li[text()='"+value+"']")).isDisplayed());
			
		}
		
	}
	
	public void verifyMembershipTypes(String type) throws InterruptedException {
		WebElement element = getDriver().findElement(By.xpath("//a[text()='"+type+"']"));
		waitFor(element);
		try {
			click(element);
		}catch (Exception e) {
			jsClick(element);
		}
	}
	
	public void verifyMembershipTypeSelectedPage(String type) throws InterruptedException {
		Waits.wait10Second();
		Select select = new Select(getDriver().findElement(By.xpath("//div[@id='discount-select']//select")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.print("\n\n\nVal:"+defaultItem);
		Assert.assrt(defaultItem.contains(type));
		
	}
	
	
	public void enterMembershipPostalCode() {
		typeInto(membershipPatnerPostalCode, "60631");
	}
	
	public void clickOnSearchChapterButton() {
		jsClick(SearchChapButton);
	}

	
	
	public void selectNorthAmericaPlusMembership() throws InterruptedException {
		jsClick(northAmericaPlusMembership);
		Waits.wait3Second();
	}

	public void selectCoreIntMembership() {
		
		jsClick(coreInternationalMembership);
	}

	public void selectPlustIntMembership() {
		jsClick(plusInternationalMembership);
	}

	public void selectInternationalCountry() throws InterruptedException {
		Waits.wait3Second();
		Waits.waitForElementToBeVisibile(countryDropDown, getDriver(), 10);
		Waits.wait3Second();
		selectByValue(countryDropDown, "Bangladesh");
		Waits.wait5Second();
	}

	public void clickOnPurchaseMembershipButton() throws InterruptedException{
		Waits.wait3Second();
		jsClick(purchaseMembershupButton);
	}

	public void coreMonthlyPrice() throws InterruptedException {
		Waits.wait3Second();
		jsClick(monthlyPrice);
	}

	public void clickCoreAnnualPrice() throws InterruptedException {
		Waits.wait3Second();
		jsClick(annualPrice);
	}

	public void selectChapterCountry() throws InterruptedException {
		Waits.wait3Second();
		Select obj = new Select(selectChapterCountry);
		obj.selectByValue("United States");
	}

	public void searchByChapterZipCode(String ZipCode) {
		typeInto(chapterZipCode, ZipCode);
	}

	public void clickFindPartnerButton() throws InterruptedException {
		Waits.wait3Second();
		findParnterButton.sendKeys(Keys.ENTER);
	}

	public void selectChapter() throws InterruptedException {
		Waits.wait3Second();
		jsClick(selectChapter);
	}

	public void clickAgreementCheckbox() throws InterruptedException {
		Waits.wait3Second();
		try {
			jsClick(MemberagreementCheckbBox);
		}catch (Exception e) {
			jsClick(agreementCheckbBox);
		}
	}
	public void clickCertificateUpgradeCheckbox() throws InterruptedException {
		Waits.wait3Second();
		try {
			jsClick(certificateUpgradeCheckBox);
		}catch (Exception e) {
			jsClick(certificateUpgradeCheckBox);
		}
	}
	public void clickSkipMembershipButton() throws InterruptedException {
		Waits.wait3Second();
		try {
			jsClick(skipMembership);
		}catch (Exception e) {
			jsClick(skipMembership);
		}
	}
	
	public void clickMonthlyMembershipButton() throws InterruptedException {
		Waits.wait3Second();
		try {
			jsClick(monthlyMembership);
		}catch (Exception e) {
			jsClick(monthlyMembership);
		}
	}
	
	
	

	public void clickAddToCartButton() throws InterruptedException {
		Waits.wait3Second();
		try {
			try {
				moveTo(By.id("add-to-cart"));
				jsClick(addToCartMembershipButton);
			}catch (Exception e) {
				moveTo(By.xpath("//a[contains(@class,'add-to-cart')]"));
				jsClick(addToCartButton1);
			}
			
		}catch (Exception e) {
			jsClick(addToCartButton);
		}
		
	}

	public void clickAutoRenewCheckbox() {
		jsClick(autoRenewCheckbox);
	}
	public void clickNaCountryDropDown() {
		jsClick(naCountryDropDown);
	}
	public void selectDiscountMembership(String value) throws InterruptedException{
		Waits.wait3Second();
		selectByVisibleText(selectDiscountMembership,value);
	}
	public void selectCountryMembership(String value) throws InterruptedException{
		Waits.wait3Second();
		selectByVisibleText(selectCountryDiscountMembership,value);
	}
	
	

	public void checkFullTimeStudent() throws InterruptedException {
		Waits.wait3Second();
		click(checkFullTimeStudent);
	}
	public void selectCountry(String value) throws InterruptedException{
		Waits.wait3Second();
		try {
			selectByValue(selectMembershipCountry,value);
			
		}catch (Exception e) {
			selectByValue(selectCountry,value);
		}
		
		
	}
	
	public void deleteAllExistingOrders() throws InterruptedException{
	
		
		java.util.List<WebElement> ele =  getDriver().findElements(By.xpath("//div[contains(@class,'cart-item-remove')]"));
		for(WebElement element : ele) {
			Waits.wait3Second();
			try {
				click(element);
			}catch (Exception e) {
				jsClick(element);
				
			}
		}
		
		
	}
	
	
	
	public void enterUniversity(String FirstName) {
//		SendValueByJS(enterUniversity,"value", FirstName);
		typeInto(enterUniversity, FirstName);
		jsClick(University);
	}
	
	public void selectGradMonth(String value) throws InterruptedException {
		selectByValue(selectGradMonth,value);
	}
	public void selectGradYear(String value) throws InterruptedException {
		selectByValue(selectGradYear,value);
	}
	
	public void enterFirstName(String FirstName) {
		typeInto(enterFirstName, FirstName);
	}
	public void enterLastName(String LastName) {
		typeInto(enterLastName, LastName);
	}
	public void enterEmail(String email) {
		typeInto(enterEmail, email);
	}
	public void selectDobMonth(String value) throws InterruptedException {
//		SendValueByJS(selectDobMonth,"value", value);
		typeInto(selectDobMonth,value);
	}
	public void selectDobDay(String value) throws InterruptedException {
//		SendValueByJS(selectDobDay,"value", value);
		typeInto(selectDobDay,value);
	}
	public void selectDobYear(String value) throws InterruptedException {
//		SendValueByJS(selectDobYear,"value", value);
		typeInto(selectDobYear,value);
	}
	public void checkButton() throws InterruptedException {
		Waits.wait1Second();
		click(checkButton);
	}
	public void closeButton() throws InterruptedException {
		Waits.wait3Second();
		click(closeButton);
	}
}
