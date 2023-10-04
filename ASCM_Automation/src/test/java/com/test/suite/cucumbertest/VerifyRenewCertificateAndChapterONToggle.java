package com.test.suite.cucumbertest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/AllTestCases/BrainTree/Memberships/AnnualMembership/VerifyAutoRenew,CertificateUpgradeAndChapterToggleONWhileCheckingOut.feature" ,
glue= {"com.test.suite.stepDefination"},
monochrome = true, 
plugin = {"pretty","html:target/HtmlReports/report.html",
        "json:target/JSONReports/report.json",
        "junit:target/JunitReports/report.xml"})
public class VerifyRenewCertificateAndChapterONToggle {

}
