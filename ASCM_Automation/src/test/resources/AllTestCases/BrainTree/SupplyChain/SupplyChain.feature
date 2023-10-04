Feature: Supply-Chain-With-Login
  Scenario: Supply-Chain-With-Login
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
    Then Go To Supply Chain Page
    Then Click Add To Cart button
    Then Click Proceed to Continue button
    Then Click Proceed to Continue button
    Then Fill in the following For Billing Address
      | Field            | Value                      |  
      | country          | USA                        |
      | firstName          | ambreen                        |
      | lastName          | qa                        |
      | streetAddress    | 8430 W Bryn Mawr Ave	      |
      | City			 | Chicago                    |
      | State            | IL                         |
      | postalCode       | 60631          			  |
    
    
    Then Choose a "Card" brain tree plan to pay
    Then Fill in the following fields for Brain Tree Payment Method section
      | Field           | Value                               |
      | Card Number     | credit_card_no                   	  |
      | Expiration      | credit_card_expiry		      |
       | Security Code   | credit_card_security_code           | 
      | Postal Code       | credit_card_postal_code             |
    Then Click Next Review button
    Then Click Place Order button
    Then Get OrderNo
    Then Get ReferenceCode
