package com.test.suite.stepDefination;

import java.io.IOException;

import com.test.suite.testSteps.ProcurementSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ProcurrementStepDef {
	@Steps
	ProcurementSteps procurementSteps;
	
	@Given("^Go To Procurrement$")
	public void GoToProcurrement() {
		procurementSteps.launchProcurrementStep();
	}
	
	@And("^Go To Foundations Courses$")
	public void GoToFoundationsCourses() {
		procurementSteps.launchFoundationsCoursesStep();
	}
	
	@And("^Go To My Account$")
	public void GoToMyAccount() {
		procurementSteps.goToMyAccountSteps();
	}
	
	@Then("^Click Procurrement Add To Cart$")
	public void clickAddToCartStepDef() throws IOException, InterruptedException {
		procurementSteps.clickAddToCartStep();
	}
	
	@Then("^Click On Download And Courses$")
	public void clickOnDownloadAndCourses() throws IOException, InterruptedException {
		procurementSteps.clickOnDownloadAndCourses();
	}
	
	@Then("^Click On Access Course$")
	public void clickOnAccessCourse() throws IOException, InterruptedException {
		procurementSteps.clickOnAccessCourse();
	}
	
	@Then("^Verify Foundation course \"([^\"]*)\"$")
	public void verifyFoundationCourse(String ar1) throws InterruptedException {
		procurementSteps.verifyFoundationCourse(ar1);
	}
	
	@Then("^Verify Course Expire Date \"([^\"]*)\"$")
	public void verifyFoundationCourseExpire(String ar1) throws InterruptedException {
		procurementSteps.verifyFoundationCourseExpire(ar1);
	}
	
	
	@Then("^Click Go To My Account$")
	public void clickGoToMyAccountButtonStepDef() throws IOException, InterruptedException {
		procurementSteps.clickGoToMyAccountButtonStep();
	}
	
	@Then("^Click Course And Download$")
	public void clickCourseAndDownloadButtonStepDef() throws IOException, InterruptedException {
		procurementSteps.clickCourseAndDownloadButtonStep();
	}
	
	@Then("^Click Certification$")
	public void clickCertificationButtonStepDef() throws IOException, InterruptedException {
		procurementSteps.clickCertificationButtonStep();
	}
	
	@Then("^Click Go To Course$")
	public void clickGoToCourseStepDef() throws IOException, InterruptedException {
		procurementSteps.clickGoToCourseStep();
	}
	@Then("^Click Lesson$")
	public void clickExamLessonStepDef() throws IOException, InterruptedException {
		procurementSteps.clickExamLessonStep();
	}
	@Then("^Click Lesson Fundamentals of Purchasing And Procurement$")
	public void clicklessonFundamentalsofPurchasingAndProcurementStep() throws IOException, InterruptedException {
		procurementSteps.clicklessonFundamentalsofPurchasingAndProcurementStep();
	}
	
	@Then("^Commplete Test Of Lesson$")
	public void commpleteTestOfLessonStepDef() throws IOException, InterruptedException {
		procurementSteps.commpleteTestOfLessonStep();
	}

	@Then("^Commplete Test Of Practice$")
	public void commpleteTestOfPracticeStepDef() throws IOException, InterruptedException {
		procurementSteps.commpleteTestOfPracticeStep();
	}
	
	@Then("^Commplete Test$")
	public void commpleteTestStepDef() throws IOException, InterruptedException {
		procurementSteps.commpleteTestStep();
	}
}
