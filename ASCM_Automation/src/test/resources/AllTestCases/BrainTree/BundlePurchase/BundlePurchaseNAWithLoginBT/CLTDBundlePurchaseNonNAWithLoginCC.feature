Feature: CLTD-Bundle-NA-with-login-BrainTree-CC
Scenario: CLTD-Bundle-NA-with-login-BrainTree-CC
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
#    Then Select Bundle Country Region
    Then Click Bundle Add To Card
    Then select Country
    Then Enter Post Code
    Then Search Postal Code
    #Updated
    Then Select Item
    #Added new
    Then Add Selected Item
    Then Click Bundle Aggress Button
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
    Then Click Shipping Method  
    Then Click Next Payment Information button
    Then Click same as billing button
    Then Choose a "PayPal" brain tree plan to pay
    Then Click Next Review button
    Then Click Place Order button
    Then Get ReferenceCode