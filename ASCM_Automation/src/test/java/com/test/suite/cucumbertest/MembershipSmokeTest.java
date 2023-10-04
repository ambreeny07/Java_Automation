package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" },
features = {"src/test/resources/AllTestCases/BrainTree/Memberships/MemershipDiscount.feature",
		"src/test/resources/AllTestCases/BrainTree/Membership_Discounted/MemershipRegular.feature"},
glue = {"com.test.suite.stepDefination","AppHooks"})
 public class MembershipSmokeTest {

}
