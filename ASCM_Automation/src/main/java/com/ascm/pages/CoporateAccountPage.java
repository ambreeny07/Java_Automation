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

public class CoporateAccountPage extends SeleniumHelper {
	JavascriptExecutor executor = (JavascriptExecutor) getDriver();
	CheckoutConstants checkoutConstans;

	public CoporateAccountPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//div[text()='Promotional Discount']//..//h4")
	WebElementFacade PromoDiscountValue;
	@FindBy(xpath = "//select[contains(@name,'CountryCodeID')]")
	WebElementFacade selectHomeCountry;
	@FindBy(id = "Address1")
	WebElementFacade corporateAddress;
	@FindBy(id = "City")
	WebElementFacade corporateCity;
	@FindBy(xpath = "//select[@id='State']")
	WebElementFacade corporateState;
	@FindBy(id = "Zip")
	WebElementFacade corporatePostalCode;
	@FindBy(xpath = "//select[@id='State']")
	WebElementFacade corporateProvince;
	
	
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
	
	public void enterAddress(String text) {
		
		typeInto(corporateAddress, text);
	}
	public void enterCity(String text) {
		
		typeInto(corporateCity, text);
	}
	public void enterState(String text) {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			selectByValue(corporateState, text);
		}catch (Exception e) {
			typeInto(corporateState, text);
		}
		
		
	}
	public void enterPotalCode(String text) {
		
		typeInto(corporatePostalCode, text);
	}
	public void enterProvince(String country) {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			selectByValue(corporateProvince, country);
		}catch (Exception e) {
			selectByID(corporateProvince, 203);
		}
		

	}
	
	
	
}
