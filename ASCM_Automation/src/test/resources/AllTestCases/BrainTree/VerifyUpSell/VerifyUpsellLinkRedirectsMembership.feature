Feature: Verify-Upcell-Link-Redirects-Membership
  Scenario: Verify-Upcell-Link-Redirects-Membership
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Enter New Email "email"
    Then Enter New Password "Testing1"
    Then Enter First Name "Automation"
    Then Enter Last Name "qa"
    Then Click Ceck Term
    Then Enter Job Title "QA"
    Then Click Submit
    Then Click Login Button
    Then Enter username "email"
    Then Enter password "Testing1"
    And Click submit
    Then Go to Cart
    Then Empty The Cart
    Then Click Learning And Development Top Navigation
   	Then Click CLTD
    Then Click LS Exam Pre Add To Card
    Then Verify Membership Upcell CTA Text
    Then Click On Upgrade Now
    Then Verify "ASCM Membership" Page
    
    