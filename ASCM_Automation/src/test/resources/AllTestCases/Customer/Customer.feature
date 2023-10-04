Feature: Customer
  Scenario: Create-Customer
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Enter New Email "email"
    Then Enter New Password "Testing1"
    Then Enter First Name "Automation"
    Then Enter Last Name "qa"
    Then Click Ceck Term
    Then Click Submit
    Then Click Login Button
    Then Enter username "email"
    Then Enter password "Testing1"
    And Click submit
    Then Click on Logout
