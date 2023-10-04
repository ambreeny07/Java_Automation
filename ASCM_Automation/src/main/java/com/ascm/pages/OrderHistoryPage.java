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

public class OrderHistoryPage extends SeleniumHelper {

	public OrderHistoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[text()='Show Order Details']")
	WebElementFacade showOrderDetails;
	
	@FindBy(xpath = "//a[text()='Download Order Receipt']")
	WebElementFacade downloadOrderReceipt;
	
	@FindBy(xpath = "//strong[contains(text(),'Total')]//parent::td//following-sibling::td//strong")
	WebElementFacade totalBill;
	
	
	

	
	public void verifyAddress(String addressType , String address) throws InterruptedException {
		if(addressType.equalsIgnoreCase("Ship to")) {
			Waits.wait2Second();
			WebElement element =getDriver().findElement(By.xpath("(//div[@class='address-col']//ul//li[contains(text(),'"+address+"')])[1]"));
			moveTo(By.xpath("(//div[@class='address-col']//ul//li[contains(text(),'"+address+"')])[1]"));
			Assert.assrt(element.isDisplayed());
		}else {
			Waits.wait2Second();
			WebElement element =getDriver().findElement(By.xpath("(//div[@class='address-col']//ul//li[contains(text(),'"+address+"')])[last()]"));
			moveTo(By.xpath("(//div[@class='address-col']//ul//li[contains(text(),'"+address+"')])[last()]"));
			Assert.assrt(element.isDisplayed());
		}
		
		
	}
	
	public void verifyItemQuantity(String quantity , String item) throws InterruptedException {
			Waits.wait2Second();
			WebElement element =getDriver().findElement(By.xpath("//td[contains(text(),'"+item+"')]//following-sibling::td[@class='quantity']"));
			moveTo(By.xpath("//td[contains(text(),'"+item+"')]//following-sibling::td[@class='quantity']"));
			String text= getElementText(element).trim();
			Assert.assrt(text.equalsIgnoreCase(quantity));
	}
	
	public void verifyItemPrice(String price , String item) throws InterruptedException {
		Waits.wait2Second();
		WebElement element =getDriver().findElement(By.xpath("//td[contains(text(),'"+item+"')]//following-sibling::td[@class='price']"));
		moveTo(By.xpath("//td[contains(text(),'"+item+"')]//following-sibling::td[@class='price']"));
		String text= getElementText(element).replace("$", "").trim();
		Assert.assrt(text.equalsIgnoreCase(price));
		
		
	}
	
	public void verifyTotalBill(String bill) throws InterruptedException {
		Waits.wait2Second();
		String text= getElementText(totalBill).replace("$", "").trim();
		Assert.assrt(text.equalsIgnoreCase(bill));
		
	}
	public void clickOnShowOrderDetails() {
		jsClick(showOrderDetails);
	}
	public void clickOnDownloadOrderReceipt() {
		jsClick(downloadOrderReceipt);
	}

	}
