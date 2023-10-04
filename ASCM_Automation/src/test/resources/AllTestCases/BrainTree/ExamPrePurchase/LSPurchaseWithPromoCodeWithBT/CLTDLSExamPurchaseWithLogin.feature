Feature: CLTD-LS-Exam-Purchase-With-Login-PC
  Scenario: CLTD-LS-Exam-Purchase-With-Login-PC
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
   	Then Click Learning And Development Top Navigation
   	Then Click CLTD
    Then Click LS Exam Pre Add To Card
    Then Enter Promo Code
    Then Click Promo Code Apply
    Then Click Proceed to Continue button
    Then Get Promo Discount Amount
    Then click Work Address Radio Button
    Then Fill in the following For Address
      | Field            | Value                      |  
      | country          | USA                        |
      | company          | CC                         |
      | streetAddress    | 8430 W Bryn Mawr Ave	      |
      | City			 | Chicago                    |
      | State            | IL                         |
      | postalCode       | 60631          			  |
      | CountryType      | Work        				  |
      | Country Code     | 1         		          |
      | Area Code        | 452                 	      |
      | Phone Number     | 3667788                    | 
#    Then Click Shipping Method   
    
    Then Click Shipping Method
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