package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" },
features = {"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseNonNAWithLoginBT/CLTDBundlePurchaseNonNAWithLoginCC.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseNonNAWithLoginBT/CPIMBundlePurchaseNonNA.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseNonNAWithLoginBT/CSCPBundlePurchaseNonNA.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseNonNAWithoutLoginBT/CLTDBundlePurchaseNonNAWithoutLoginCC.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseNonNAWithoutLoginBT/CPIMBundlePurchaseNonNAWithoutLoginCC.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseNonNAWithoutLoginBT/CSCPBundlePurchaseNonNAWithoutLoginCC.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithBrainTreeWithPromoCode/CLTDBundlePurchaseWithLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithBrainTreeWithPromoCode/CLTDBundlePurchaseWithoutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithLoginBrainTree/CLTDBundlePurchaseWithLoginBT.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithLoginBrainTree/CPIMBundlePurchaseWithLoginBT.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithLoginBrainTree/CSCPBundlePurchaseWithLoginBT.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithoutLoginBrainTree/CLTDBundlePurchaseWithOutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithoutLoginBrainTree/CPIMBundlePurchaseWithoutLogin.feature",
		"src/test/resources/AllTestCases/BrainTree/BundlePurchase/BundlePurchaseWithoutLoginBrainTree/CSCPBundlePurchaseWithoutLogin.feature"},
glue = {"com.test.suite.stepDefination","AppHooks"})
public class BundlePurchaseSmokeTest {

}
