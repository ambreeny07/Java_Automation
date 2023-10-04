package com.ascm.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.ascm.util.SeleniumHelper;

public class LaunchApplication extends SeleniumHelper {

	public LaunchApplication(WebDriver driver) {
		super(driver);
	}

	public void launchApplication() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//		getDriver().get("http://qa.ascm.org");
		getDriver().get("https://stage.ascm.org");

	}


	public void goToMembershipPage() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa.ascm.org/my-account/membership/");
	    getDriver().get("https://stage.ascm.org/my-account/membership/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void goToOrderHistory() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa.ascm.org/my-account/order-history/");
	    getDriver().get("https://stage.ascm.org/my-account/order-history/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	public void goToPreviousPage() {
	    getDriver().navigate().back();
	}
	
	
	public void goToCartPage() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa.ascm.org/shopping-cart/");
	    getDriver().get("https://stage.ascm.org/shopping-cart/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void goToLoginPage() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa-login.ascm.org/");
	    getDriver().get("https://stage-login.ascm.org/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void goToCreateStageAccount() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//		getDriver().get("http://qa.ascm.org/create-account");
		getDriver().get("http://stage.ascm.org/create-account");
		
	}
	
	public void goToLoginAccount() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//		getDriver().get("https://qa.ascm.org/Account/Login/");
		getDriver().get("https://stage.ascm.org/Account/Login/");

	}
	
	public void goToProcurement() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//		getDriver().get("https://qa.ascm.org/procurement-certificate-program/");
		getDriver().get("https://stage.ascm.org/procurement-certificate-program/");

	}
	
	public void goToFoundationsCourses() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//		getDriver().get("https://qa.ascm.org/learning-development/foundations/");
		getDriver().get("https://stage.ascm.org/learning-development/foundations/");

	}
	
	public void goToConferenceRegistration() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//		getDriver().get("https://qa.ascm.org/ascm-connect-annual-conference/registration/");
		getDriver().get("https://stage.ascm.org/ascm-connect-annual-conference/registration/");

	}
	
	public void goToSupplyChainPage() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa.ascm.org/supply-chain-planning-certificate/");
	    getDriver().get("https://stage.ascm.org/supply-chain-planning-certificate/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void goToReferralLink() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("http://qa.ascm.org/?promo=BundleQA&Partner=referalcodeautomation/");
	    getDriver().get("http://stage.ascm.org/?promo=BundleQA&Partner=referalcodeautomation/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void GoToCreateCoporate() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa.ascm.org/create-account-corp-mem/");
	    getDriver().get("https://stage.ascm.org/create-account-corp-mem/");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void GoToCreateCoporateLoginLink() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://www.apics.org/apics-for-business/corporate-membership-request?cvar=3");
	    getDriver().get("https://www.apics.org/apics-for-business/corporate-membership-request?cvar=3");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void GoToMyAccounts() {
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
//	    getDriver().get("https://qa.ascm.org/my-account");
	    getDriver().get("https://stage.ascm.org/my-account");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		getDriver().quit();
	}
	
	
	
	
	
	
	
}
