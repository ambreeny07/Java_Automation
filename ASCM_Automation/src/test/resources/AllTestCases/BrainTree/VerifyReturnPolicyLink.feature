Feature: Verify-Return-Policy-Link
Scenario: Verify-Return-Policy-Link
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Enter New Email "email"
    Then Enter New Password "Test1234"
    Then Enter First Name "Automation"
    Then Enter Last Name "qa"
    Then Click Ceck Term
    Then Click Submit
    Then Click Login Button
    Then Enter username "email"
    Then Enter password "Test1234"
    And Click submit
    Then Go to Cart
    Then Empty The Cart
   	Then Click Learning And Development Top Navigation
   	Then Click CLTD
   	Then Click Bundle Add To Card
   	Then Click Skip Chapter
    Then Click Bundle Aggress Button
    Then Click Return Policy
    Then Verify Return Policy Page
   	