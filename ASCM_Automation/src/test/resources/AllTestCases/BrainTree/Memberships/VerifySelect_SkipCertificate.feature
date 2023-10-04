Feature: Verify-Select-Skip-Certificate-Membership
  Scenario: Verify-Select-Skip-Certificate-Membership
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
    Then Get Membership Amount
    Then Adding Certificate
    Then Click Certificate Upgrade Checkbox
    Then Verify Membership Value is Updated "CertificateAdded"
    Then Removing Certificate
    Then Click Certificate Upgrade Checkbox
    Then Verify Membership Value is Updated "CertificateNotAdded"
    Then Click Agreement Checkbox
    Then Click Add To Cart button
    
