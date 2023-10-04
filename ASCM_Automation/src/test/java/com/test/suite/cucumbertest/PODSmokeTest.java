package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" },
features = {"src/test/resources/AllTestCases/POD/POC_With_Login_pp/ManagingOpertionPODWithLoginPP.feature",
		"src/test/resources/AllTestCases/POD/POD_With_Login/DistributionAndLogisticsWithLogin.feature",
		"src/test/resources/AllTestCases/POD/POD_With_Login/ManagingOpertionPODWithLogin.feature",
		"src/test/resources/AllTestCases/POD/POD_With_out_Login/DistributionAndLogisticsWithOutLogin.feature",
		"src/test/resources/AllTestCases/POD/POD_With_out_Login/ManagingOpertionPODWithOutLogin.feature"},
glue = {"com.test.suite.stepDefination","AppHooks"})
public class PODSmokeTest {

}
