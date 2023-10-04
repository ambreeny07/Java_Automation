package com.test.suite.testSteps;

import org.springframework.beans.factory.annotation.Autowired;

import com.ascm.pages.LaunchApplication;
import com.ascm.pages.ProcurementPage;

import net.thucydides.core.annotations.Step;


public class ProcurementSteps {
	@Autowired
	ProcurementPage procurementPage;
	LaunchApplication launchApplication;
	@Step
	public void launchProcurrementStep() {
		launchApplication.goToProcurement();
	}
	
	public void launchFoundationsCoursesStep() {
		launchApplication.goToFoundationsCourses();
	}
	
	public void goToMyAccountSteps() {
		launchApplication.GoToMyAccounts();
	}
	
	@Step
	public void clickAddToCartStep() throws InterruptedException {
		procurementPage.clickAddToCartButton();
	}
	@Step
	public void clickOnDownloadAndCourses() throws InterruptedException {
		procurementPage.clickOnDownloadAndCourses();
	}
	@Step
	public void clickOnAccessCourse() throws InterruptedException {
		procurementPage.clickOnAccessCourse();
	}
	@Step
	public void verifyFoundationCourse(String arg1) throws InterruptedException {
		procurementPage.verifyFoundationCourse(arg1);
	}
	@Step
	public void verifyFoundationCourseExpire(String arg1) throws InterruptedException {
		procurementPage.verifyFoundationCourseExpire(arg1);
	}
	
	@Step
	public void clickGoToMyAccountButtonStep() throws InterruptedException {
		procurementPage.clickGoToMyAccountButton();
	}
	@Step
	public void clickCourseAndDownloadButtonStep() throws InterruptedException {
		procurementPage.clickCourseAndDownloadButton();
	}
	@Step
	public void clickCertificationButtonStep() throws InterruptedException {
		procurementPage.clickCertificationButton();
	}
	@Step
	public void clickGoToCourseStep() throws InterruptedException {
		procurementPage.clickGoToCourse();
	}
	
	@Step
	public void clickExamLessonStep() throws InterruptedException {
		procurementPage.clickExamLesson();
	}
	
	
	@Step
	public void clicklessonFundamentalsofPurchasingAndProcurementStep() throws InterruptedException {
		procurementPage.clicklessonFundamentalsofPurchasingAndProcurement();
	}
	
	@Step
	public void commpleteTestOfLessonStep() throws InterruptedException {
		procurementPage.commpleteTestOfLesson();
	}

	@Step
	public void commpleteTestOfPracticeStep() throws InterruptedException {
		procurementPage.commpleteTestOfPractice();
	}
	
	@Step
	public void commpleteTestStep() throws InterruptedException {
		procurementPage.completeTest();
	}
	
}
