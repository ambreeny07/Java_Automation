package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" },
features = {"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseBrainTreeWithPromoCode/CLTDFirstExamAttempWithLoginBT.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreeCC/CLTDFirstExamAttempBT.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreeCC/CPIMFirstExamAttempPart1BT.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreeCC/CPIMFirstExamAttempPart2BT.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreeCC/CSCPFirstExamAttemptBT.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreePP/CLTDFirstExamAttempBTPP.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreePP/CPIMFirstExamAttempPart1BTPP.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreePP/CPIMFirstExamAttempPart2BTPP.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithLoginBrainTreePP/CSCPFirstExamAttemptBTPP.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithoutLoginBrainTreeCC/CLTDFirstAttempWithoutLoginBTCC.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithoutLoginBrainTreeCC/CPIMPart1WithoutLoginBTCC.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithoutLoginBrainTreeCC/CPIMPart2WithoutLoginBTCC.feature",
		"src/test/resources/AllTestCases/BrainTree/ExamPurchase/ExamPurchaseWithoutLoginBrainTreeCC/CSCPFirstAttempWithoutLoginBTCC.feature"},
glue = {"com.test.suite.stepDefination","AppHooks"})
public class ExamPurchaseSmokeTest {

}
