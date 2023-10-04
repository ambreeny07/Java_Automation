Feature: Discount-Membership-with-login
  Scenario: Discount-Membership-with-login
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
    Then Click On Student Discount Type
    Then Click Agreement Checkbox
    Then Click Add To Cart button
    Then Select Discount Membership Country

    Then Fill in the following fields for MemberShip Discount Form For International
     | Field            | Value                      |  
      | University          | mailing_country                    |
      | Graduation Year    | mailing_address	                  |
       | Graduation Month          | mailing_company                    |
      | Enter First Name			 | mailing_city                       |
      | Enter Last Name            | mailing_state                      |
      | Enter Email       | mailing_postal_code          	  |
      | Dob Month     | mailing_country_type      		  |
      | Dob Day     | mailing_country_code         	  |
      | Dob Year        | mailing_area_code                  |  
    
    Then Click Verify Student Status Button
    Then Click Proceed to Continue button
    Then Select Membership Discount Country
    Then Enter Membership Postal Code
    Then Click On Search Chapter Button
    Then Select Item
    Then Add Selected Item
#    Then Click On Check Button
#    Then Click On Close Button
#    Then Click Agreement Checkbox
#    Then Click Add To Cart button
    
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
    Then Click Next Review button
    Then Click Place Order button
    Then Get ReferenceCode
