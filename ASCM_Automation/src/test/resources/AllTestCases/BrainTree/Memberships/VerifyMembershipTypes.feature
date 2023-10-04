Feature: Verify-Membership-Types-with-login
  Scenario: Verify-Membership-Types-with-login
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
    Then Go to Membership Page
    Then Click Become a Memeber
    Then Click On Membership "Students"
    Then Verify "Student" Membership is Selected
    Then Go to Previous Page
    Then Click On Membership "Recent Graduates"
    Then Verify "Recent Graduate" Membership is Selected
    Then Go to Previous Page
    Then Click On Membership "Academic"
    Then Verify "Academic" Membership is Selected
    Then Go to Previous Page
    Then Click On Membership "Federal Employee"
    Then Verify "Federal Employee" Membership is Selected
    Then Go to Previous Page
    Then Click On Membership "Active Duty Military"
    Then Verify "Active Duty Military" Membership is Selected
    Then Go to Previous Page
    Then Click On Membership "Unemployed"
    Then Verify "Unemployed" Membership is Selected
    Then Go to Previous Page
    