Feature: Verify-auto-renew-certificate-upgrade-and-chapter-toggle-ON-while-checking-out
  Scenario: Verify-auto-renew-certificate-upgrade-and-chapter-toggle-ON-while-checking-out
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
    Then Click Certificate Upgrade Checkbox
    Then Click Agreement Checkbox
    Then Click Add To Cart button
    Then Select Membership Discount Country
    Then Enter Membership Postal Code
    Then Click On Search Chapter Button
    Then Select Item
    Then Add Selected Item
    Then Click Proceed to Continue button
    Then click Work Address Radio Button
    Then Fill in the following fields for international mailing section
      | Field            | Value                      |  
      | company          | mailing_company                    |
      | streetAddress    | mailing_address	                  |
      | City			 | mailing_city                       |
      | State            | mailing_state                      |
      | postalCode       | mailing_postal_code          	  |
      | CountryType      | mailing_country_type      		  |
      | Country Code     | mailing_country_code         	  |
      | Area Code        | mailing_area_code                  |
      | Phone Number     | mailing_phone_no                   |  
    Then Click Next Payment Information button
    Then Click same as billing button
    Then Choose a "Card" brain tree plan to pay
    Then Fill in the following fields for Brain Tree Payment Method section
      | Field           | Value                               |
      | Card Number     | credit_card_no                   	  |
      | Expiration      | credit_card_expiry		      |
       | Security Code   | credit_card_security_code           | 
      | Postal Code       | credit_card_postal_code             |
    Then Click Next Review button
    Then Click Place Order button
    Then Get ReferenceCode
    Then Go to Membership Page
    Then Verify "base membership" is visible
    Then Verify "base membership" Toggle "on"
    Then Verify "certificate upgrade" is visible
    Then Verify "certificate upgrade" Toggle "on"
    Then Verify "chapter" is visible
    Then Verify "chapter" Toggle "on"
