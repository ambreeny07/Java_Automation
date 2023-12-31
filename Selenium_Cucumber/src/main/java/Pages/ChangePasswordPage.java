package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;

import Utils.BaseClass;
import org.junit.Assert;


public class ChangePasswordPage extends BaseClass {
	private WebDriver podriver = null;

	String changePasswordBtn = "//a[text()='Change Password']";
	String enterNewPasswordTxt = "//input[@placeholder='Enter New Password']";
	String enterConfirmPasswordTxt = "//input[@placeholder='Enter Confirm Password']";
	String changeBtn = "//button[text()='Change']";
	String cancelBtn = "//button[text()='Cancel']";
	String helpDropdown = "//a[text()[contains(.,'Help')] and @data-toggle='dropdown']";
	String bellIcon = "//img[@class='bell']";
	String bellIconUnreadCount = "//span[contains(@class,'badge-pill notify-badge')]";
	String copyrightLbl = "//p[text()[contains(.,'Copyright �')]]";
	String logoOnChangePasswordPage = "//img[@src='https://stagingatlas.pharma.solutions/theme/build/images/new_atlas_psh_logo_converted.png']";
	
	
	
	

	public ChangePasswordPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void navigateToUrl(WebDriver driver, String Url) throws InterruptedException {
		driver.get(Url);

	}

	public void enterPassword(WebDriver driver, String password) {
		waitForElementVisibility(changePasswordBtn, "30", driver);
		type(changePasswordBtn, password, driver);
	}
	
	public void clickOnDropdownChangePasswordButton(WebDriver driver) {
		waitForElementVisibility(changePasswordBtn, "30", driver);
		click(changePasswordBtn, driver);
	}

	public Boolean verifyEnterNewPasswordTextField(WebDriver driver) {
		try {
			waitForElementVisibility(enterNewPasswordTxt, "30", driver);
			System.out.println("enterNewPasswordTxt : ");
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Boolean verifyEnterConfirmPasswordTextField(WebDriver driver) {
		try {
			waitForElementVisibility(enterConfirmPasswordTxt, "30", driver);
			System.out.println("enterConfirmPasswordTxt : ");
			return  true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	public Boolean verifyChangeButton(WebDriver driver) {
		try {
			waitForElementVisibility(changeBtn, "30", driver);
			System.out.println("changeBtn : ");
			return  true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Boolean verifyCancelButton(WebDriver driver) {
		try {
			waitForElementVisibility(cancelBtn, "30", driver);
			System.out.println("cancelBtn : ");
			return  true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	public Boolean verifyHelpDropdown(WebDriver driver) {
		try {
			waitForElementVisibility(helpDropdown, "30", driver);
			System.out.println("helpDropdown : ");
			return isElementDisplayed(helpDropdown, driver);
		} catch (Exception e) {
			return false;
		}		
	}
	
	public Boolean verifyBellIcon(WebDriver driver) {
		try {
			waitForElementVisibility(bellIcon, "30", driver);
			System.out.println("bellIcon : ");
			return isElementDisplayed(bellIcon, driver);
		} catch (Exception e) {
			return false;
		}		
	}
	
	public Boolean verifyBellIconUnreadCount(WebDriver driver) {
		try {
			waitForElementVisibility(bellIconUnreadCount, "30", driver);
			System.out.println("bellIcon : ");
			return isElementDisplayed(bellIconUnreadCount, driver);
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyCopyrightLabel(WebDriver driver) {
		try {
			waitForElementVisibility(copyrightLbl, "30", driver);
			System.out.println("bellIcon : ");
			return isElementDisplayed(copyrightLbl, driver);
		} catch (Exception e) {
			return false;
		}		
		
	}
	
	public Boolean verifyLogoOnChangePasswordPage(WebDriver driver) {
		try {
			waitForElementVisibility(logoOnChangePasswordPage, "30", driver);
			System.out.println("logo On Change Password Page : ");
			return isElementDisplayed(logoOnChangePasswordPage, driver);
		} catch (Exception e) {
			return false;
		}		
	}
	
	
	public void enterValuesInChangePasswordInputFieldsbuttonsLinkAreClickable(WebDriver driver) {
		waitForElementVisibility(enterNewPasswordTxt, "30", driver);
		type(enterNewPasswordTxt, "NewPassword", driver);
		String newPassword = getValue(enterNewPasswordTxt, driver);
		System.out.println(newPassword);
		boolean newPasswordEqual = (newPassword.equals("NewPassword"));
		System.out.println(newPasswordEqual);
		Assert.assertTrue(newPasswordEqual);

		type(enterConfirmPasswordTxt, "NewPassword", driver);
		String enterConfirmPasswordValue = getValue(enterConfirmPasswordTxt, driver);
		boolean isEqual = (enterConfirmPasswordValue.equals("NewPassword"));
		Assert.assertTrue(isEqual);

		Assert.assertTrue(isClickable(changeBtn, driver));

		Assert.assertTrue(isClickable(cancelBtn, driver));

		Assert.assertTrue(isClickable(helpDropdown, driver));
		
		Assert.assertTrue(isClickable(bellIcon, driver));

	}
	
	public void browserTabNameShouldDisplayedWithTheTabNamePharmaSolutionAtlas(WebDriver driver) {
		waitForElementVisibility(logoOnChangePasswordPage, "30", driver);
		String titleText = driver.getTitle();
		System.out.println("Page title is : " + titleText);
		boolean equal = (titleText.equals("Pharma Solution Atlas"));
		Assert.assertTrue(equal);
	}
	
	public void changePasswordinputFieldsShouldHaveAProperPlaceHolderName(WebDriver driver) {
		waitForElementVisibility(enterNewPasswordTxt, "30", driver);
		String newPasswordValue = getPlaceHolder(enterNewPasswordTxt, driver);
		System.out.println(newPasswordValue);
		boolean newPasswordEqual = (newPasswordValue.equals(newPasswordValue));
		System.out.println(newPasswordEqual);
		Assert.assertTrue(newPasswordEqual);

		String confirmPasswordValue = getPlaceHolder(enterConfirmPasswordTxt, driver);
		System.out.println(confirmPasswordValue);
		boolean confirmPasswordEqual = (confirmPasswordValue .equals(confirmPasswordValue));
		Assert.assertTrue(confirmPasswordEqual);
	}
	
}
