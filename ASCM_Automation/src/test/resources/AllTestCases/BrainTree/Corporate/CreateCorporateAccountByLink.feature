Feature: Create-Corporate-Account-By-Link
Scenario: Create-Corporate-Account-By-Link
    Given Go To Corporate Login Link
    Then Click Create an Account
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
      | PostalCode       | mailing_postal_code          	  |
      | State			 | mailing_state                       |
  
      
    Then Click CheckBox Term And Policy
    Then Click Submit
    Then Enter username "email"
    Then Enter password "Test1234"
    And Click submit
    Then Verify Message "Your membership request has been submitted and it is in review. Please contact your administrator with any questions."