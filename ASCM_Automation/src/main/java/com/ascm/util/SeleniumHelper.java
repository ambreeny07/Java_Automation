package com.ascm.util;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class SeleniumHelper extends PageObject {
	WebDriverWait wait;
	JavascriptExecutor executor = (JavascriptExecutor) getDriver();

	public SeleniumHelper(WebDriver driver) {
		super(driver);
	}

	public void click(WebElement element) {
		element.click();
	}
	public void isEnabled(WebElement element) {
		element.isEnabled();
	}
	
	public void waitForElementVisibility(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void jsClick(WebElementFacade element) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		executor.executeScript("arguments[0].click();", element);
	}
	public static void closeTab(int index, WebDriver driver) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(index));
		driver.close();
		driver.switchTo().window(tabs2.get(index - 1));

	}
	public void jsClick(WebElement element) {
		
		executor.executeScript("arguments[0].click();", element);
	}

	public void SendValueByJS(WebElementFacade element,String attributename, String Value) {
				executor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
						element,  
						attributename,
						Value );
	}
	
	
	public static void typeInto(WebElementFacade element, String value) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		
		element.clear();
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
			System.out.println("Entered :" + value);
			element.sendKeys(value);
		}catch (Exception e) {
			element.sendKeys(value);
		}
	}
	public static void type(WebElementFacade element, String value) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		element.clear();
		element.sendKeys(value);
		
	}

	public void sendKeys(WebElementFacade element, String value) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		element.clear();
		element.sendKeys(value);
	}

	public void sendEnterKey(WebElementFacade element) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		element.sendKeys(Keys.ENTER);
	}

	public void selectByValue(WebElementFacade element, String value) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		Select obj = new Select(element);
		obj.selectByValue(value);
	}
	public void selectByID(WebElementFacade element, int value) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		Select obj = new Select(element);
		obj.selectByIndex(value);
	}

	public void selectByVisibleText(WebElementFacade element, String value) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		Select obj = new Select(element);
		obj.selectByVisibleText(value);
	}
	
	
	public void selectCountry(WebElementFacade element,String country) {
		element.withTimeoutOf(60, TimeUnit.SECONDS).waitUntilPresent();
		Select select = new Select(element);
		select.selectByValue(country);
	}
	
	
	public void verifyText(WebElement element, String expectedText) {
		String actualText = element.getText();
		if (actualText.equals(expectedText)) {
			System.out.println("Value Matches");
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	public String getElementText(WebElement element) {
		return element.getText().trim();
	}
	public void scrollToElement(WebElementFacade element) throws InterruptedException {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element);
		actions.perform();
	}
	public void scrollToBottom() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
}