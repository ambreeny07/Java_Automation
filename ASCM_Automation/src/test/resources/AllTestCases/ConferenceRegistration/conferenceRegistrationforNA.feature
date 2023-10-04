
Feature: Conference-Registration-for-NA

  Scenario:Conference-Registration-for-NA
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
   Given Go To Conference Registration
    Then Click on Next Button
    Then Select Salutation
    Then Enter Organization Name "TestOrg"
    Then Enter Job title "MyJob"
    Then Click on First Time Discount CheckBox
    Then Select Gender Female
    Then Select Age
    Then Click on Next Button
    Then Select region "North America"
    Then Click on select chapter
    Then select Country
    Then Enter Post Code
    Then Search Postal Code
    Then Select Item
    Then Check Terms checkbox
    Then Click on Next Button
    Then Validate Summary
    Then Check Add to Cart Terms For Virtue
    Then Click on add to cart button
    Then Click Proceed to Continue button
     Then Click Next Payment Information button
     Then Validate order summary
     Then click Work Address Radio Button
     Then Fill in the following fields for international mailing section
      | Field            | Value                              |  
      | country          | mailing_country                    |
      | company          | mailing_company                    |
      | streetAddress    | mailing_address	                  |
      | City			 | mailing_city                             |
      | State            | mailing_state                      |
      | postalCode       | mailing_postal_code            	  |
      | CountryType      | mailing_country_type      		      |
      | Country Code     | mailing_country_code         	    |
      | Area Code        | mailing_area_code                  |
      | Phone Number     | mailing_phone_no                   |
    Then Click Next Payment Information button
    Then Click same as billing button
    Then click Credit Card Radio Button
    Then Fill in the following fields for Payment Method section
      | Field           | Value                               |
      | Name on Card    | credit_card_name                    |
      | Card Number     | credit_card_no                   	  |
      | Expiration Month| credit_card_expiry_month			      |
      | Expiration Year | credit_card_expiry_year             |
      | Security Code   | credit_card_security_code           | 
    Then Click Next Review button
    Then Click Place Order button
    Then Get ReferenceCode