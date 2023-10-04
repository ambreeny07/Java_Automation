Feature: Create-Corporate-Account
Scenario: Create-Corporate-Account
    Given Go To Create Corporate
    Then Click on OK button for cookie
    Then Enter New Email "email"
    Then Enter New Password "Test1234"
    Then Enter First Name "Automation"
    Then Enter Last Name "qa"
    Then Enter Company Name "CC"
    Then Enter Job Title "sqa"
    Then click Work Address Radio Button
    Then Fill in the following fields for Corporate Address
      | Field            | Value                      |  
      | Country          | mailing_country                    |
      | Address          | mailing_address                    |
      | City    | mailing_city	                  |
      | State			 | mailing_state                       |
      | Province            | mailing_Province                      |
      | PostalCode       | mailing_postal_code          	  |
    Then Click CheckBox Term And Policy
    Then Click Submit
    Then Verify "Your account has been created."
    Then Click Login Button
    Then Enter username "email"
    Then Enter password "Test1234"
    And Click submit