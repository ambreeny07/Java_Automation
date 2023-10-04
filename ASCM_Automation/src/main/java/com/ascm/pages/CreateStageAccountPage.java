package com.ascm.pages;

import org.openqa.selenium.WebDriver;

import com.ascm.util.SeleniumHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateStageAccountPage extends SeleniumHelper {
	public CreateStageAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//input[@id='Email']|//input[@id='ShippingInfoModel_Email'])[1]")
	static WebElementFacade EmailField;

	@FindBy(xpath = "//input[@id='Password']|//input[@id='ShippingInfoModel_Password']")
	WebElementFacade PasswordField;

	@FindBy(xpath = "//input[@id='ConfirmPassword']|//input[@id='ShippingInfoModel_ConfirmPassword']")
	WebElementFacade ConfirmPassword;
	@FindBy(xpath = "//input[@id='FirstName']|//input[@id='createAccount-firstName']")
	WebElementFacade FirstNameField;

	@FindBy(xpath = "//input[@id='LastName']|//input[@id='createAccount-lastName']")
	WebElementFacade LastName;
	@FindBy(id = "Terms")
	WebElementFacade CheckTerm;
	@FindBy(xpath = "//a[text()='Create an Account']")
	WebElementFacade createAnAccount;
	@FindBy(id = "Privacy")
	WebElementFacade CheckPrivacy;

	@FindBy(xpath = "//span[text()='Welcome to your ASCM Account!']")
	WebElementFacade DashBoardHeading;
	@FindBy(xpath = "//*[@type='submit']")
	WebElementFacade submitButton;
	@FindBy(xpath = "//a[text()='Agree and Continue']")
	WebElementFacade aggreeAndContinueButton;
	@FindBy(xpath = "//button[text()='Log In']")
	WebElementFacade loginButton;
	@FindBy(xpath = "//a[text()='here']  | //*[contains(@class,'create-account-login-group-field-text-link')]")
	WebElementFacade clickHereLink;
	@FindBy(xpath = "//input[@data-msg-required='Please agree to the ASCM Online Privacy Policy.']")
	WebElementFacade agreeAccountCheckout;
	@FindBy(id = "existEmailAddressErrorMessage")
	WebElementFacade EmailFieldError;
	@FindBy(xpath = "//li[contains(@class,'header-secondary-nav-item-icon--user')]//a")
	WebElementFacade LoginIcon;
	@FindBy(xpath = "//a[text()='Create an Account']")
	WebElementFacade createAnAccountBtn;
	@FindBy(xpath = "//h5[text()='Account Information']")
	WebElementFacade signupPageTitle;
	@FindBy(xpath = "//input[@name='PersonEntity.Email']")
	WebElementFacade emailAddressTxt;
	@FindBy(xpath = "//input[@name='Password']")
	WebElementFacade passwordTxt;
	@FindBy(xpath = "//input[@name='PersonEntity.FirstName']")
	WebElementFacade firstNameTxt;
	@FindBy(xpath = "//input[@name='PersonEntity.LastName']")
	WebElementFacade lastNameTxt;
	@FindBy(xpath = "//input[@id='Terms']")
	WebElementFacade termsConditionsCheckBox;
	@FindBy(xpath = "//button[@class='button']")
	WebElementFacade submitBtn;
	@FindBy(xpath = "//h2[text()='Your account has been created.']")
	WebElementFacade YourAccountHasBeenCreatedTitle;
	@FindBy(id = "Username")
	WebElementFacade userName;
	@FindBy(id = "Password")
	WebElementFacade password;
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElementFacade loginBtn;
	@FindBy(xpath = "//li[text()='Invalid login attempt.']")
	WebElementFacade InvalidMessage;
	@FindBy(xpath = "//input[@id='JobTitle']")
	WebElementFacade jobTitleTxt;
	@FindBy(xpath = "//input[@id='Company']")
	WebElementFacade companyNameTxt;
	

	public static void enterEmail(String value) {
		typeInto(EmailField, value);
	}

	public void ConfirmPassword(String value) {
		typeInto(ConfirmPassword, value);
	}

	public void enterPassword(String value) {
		typeInto(PasswordField, value);
	}

	public void enterFirstName(String value) {
		typeInto(FirstNameField, value);
	}

	public void enterLastName(String value) {
		typeInto(LastName, value);
	}

	public void clickCheckTerm() {
		click(CheckTerm);
		try {
			click(CheckPrivacy);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickCreateanAccount() {
		jsClick(createAnAccount);
	}
	
	

	public void clickSubmitButton() {
		try {
			click(submitButton);
		} catch (Exception e) {
			jsClick(submitButton);
		}

		try {
			click(aggreeAndContinueButton);
		} catch (Exception e) {

		}
	}

	public void verifyDashboard() throws InterruptedException {
		waitForElementVisibility(DashBoardHeading, 20);
	}

	public void click_on_login_icon() {
		try {
			click(LoginIcon);
		} catch (Exception e) {
			jsClick(LoginIcon);
		}
	}

	public void clickLogInButton() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		click(loginButton);
	}

	public void clickHereLink() {
		click(clickHereLink);
	}

	public void clickAgreeAccountCheckout() {
		click(agreeAccountCheckout);
	}

	public void click_on_create_an_account() {
		try {
			click(createAnAccountBtn);
		} catch (Exception e) {
			jsClick(createAnAccountBtn);
		}
	}

	public void verifySignupPageTitle() throws InterruptedException {
		waitForElementVisibility(signupPageTitle, 20);

	}

	public void enterEmailAddress(String emailAddress) {
		typeInto(emailAddressTxt, emailAddress);
	}

	public void enterNewPassword(String password) {
		typeInto(passwordTxt, password);
	}

	public void enterNewFirstName(String firstName) {
		typeInto(firstNameTxt, firstName);
	}

	public void enterNewLastName(String lastName) {
		typeInto(lastNameTxt, lastName);
	}

	public void clickSignupSubmitButton() {
		try {
			click(submitBtn);
		} catch (Exception e) {
			jsClick(submitBtn);
		}
	}

	public void clickTermsConditionsCheckBox() {
		try {
			click(termsConditionsCheckBox);
		} catch (Exception e) {
			jsClick(termsConditionsCheckBox);
		}
	}

	public void verifyYourAccountHasBeenCreatedTitle() throws InterruptedException {
		waitForElementVisibility(YourAccountHasBeenCreatedTitle, 30);
	}

	public void enterCreatedUserName(String value) {
		typeInto(userName, value);
	}

	public void enterJobTitle(String value) {
		typeInto(jobTitleTxt, value);
	}
	public void enterCompanyName(String value) {
		typeInto(companyNameTxt, value);
	}
	
	public void enterCreatedPassword(String value) {
		typeInto(password, value);
	}
	
	public void clickLoginButton() {
		try {
			click(loginBtn);
		} catch (Exception e) {
			jsClick(loginBtn);
		}
	}
	
	public void verifyInvalidMessage() throws InterruptedException {
		waitForElementVisibility(InvalidMessage, 20);
	}
}
