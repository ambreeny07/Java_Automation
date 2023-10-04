package com.test.suite.cucumbertest;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" }, features = {
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithLoginBT/CLTDLSExamPurchaseCC.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithLoginBT/CPIMPart1LsExamPurchase.feature",

		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithLoginBT/CPIMPart2LsExamPurchase.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithLoginBT/CSCPLsExamPurchase.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithOutLoginBT/CLTDLSExamPurchaseCCWithoutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithOutLoginBT/CPIMPart1LsExamPurchaseWithOutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithOutLoginBT/CPIMPart2LsExamPurchaseWithOutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithOutLoginBT/CSCPLSExamPurchaseWithOutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithPromoCodeWithBT/CLTDLSExamPurchaseWithLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPrePurchase/LSPurchaseWithPromoCodeWithBT/CLTDLSExamPurchaseWithoutLogin.feature" }, glue = {
				"com.test.suite.stepDefination", "AppHooks" })
public class LSExamPurchaseSmokeTest {

}
