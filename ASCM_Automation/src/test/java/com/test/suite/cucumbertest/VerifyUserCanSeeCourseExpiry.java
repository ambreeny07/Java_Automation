package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/AllTestCases/FoundationCourses/UserCanViewCourseExpiry.feature" ,
glue= {"com.test.suite.stepDefination"},
monochrome = true, 
plugin = {"pretty","html:target/HtmlReports/report.html"})
public class VerifyUserCanSeeCourseExpiry {

}
