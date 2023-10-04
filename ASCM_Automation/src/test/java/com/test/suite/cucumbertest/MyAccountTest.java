package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = {
		"src/test/resources/AllTestCases/MyAccount/Verify_The_Print_Membership_Card-Link_Is_Working_For_Membership_Users/VerifyThePrintMembershipCardLinkIsWorkingForMembershipUsers.feature"
		},
//tags = "@smoke",
glue = {"com.test.suite.stepDefination","AppHooks"},
plugin = { "pretty", "html:target/cucumber-html-report" }
)

public class MyAccountTest {

}
