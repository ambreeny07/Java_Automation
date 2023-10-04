package com.ascm.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ascm.util.SeleniumHelper;

import net.serenitybdd.core.pages.WebElementFacade;

public class Waits {
	public static boolean flagWait=true;
	public static void wait1Second() throws InterruptedException {
		if(flagWait)
		Thread.sleep(1000);
	}
	public static void wait5minuts() throws InterruptedException {
		Thread.sleep(300000);
	}
	public static void wait7minuts() throws InterruptedException {
		Thread.sleep(420000);
	}

	public static void wait2Second() throws InterruptedException {
		if(flagWait)
		Thread.sleep(2000);
	}

	public static void wait3Second() throws InterruptedException {
		if(flagWait)
		Thread.sleep(3000);
	}

	public static void wait5Second() throws InterruptedException {
		if(flagWait)
		Thread.sleep(5000);
	}

	public static void wait10Second() throws InterruptedException {
		if(flagWait)
		Thread.sleep(10000);
	}
	public static void waitForElementToBeVisibile(WebElementFacade xpath, WebDriver driver,int time) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfAllElements(xpath));
		
	}
	public static void waitForElementToBeDisplay(WebElementFacade xpath, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfAllElements(xpath));
		
	}
	public static void moveToELement(WebElementFacade xpath, WebDriver driver) {
	
		Actions actions = new Actions(driver);
		actions.moveToElement(xpath);
		actions.perform();
		
	}
	
}
