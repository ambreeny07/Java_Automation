package com.test.suite.cucumbertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" },
features = {"src/test/resources/AllTestCases/BrainTree/Memberships/VerifyMemershipStudentDiscount(2019010).feature"},
glue = {"com.test.suite.stepDefination","AppHooks"})
public class MemershipStudentDiscount_2019010 {

}
