Feature: Procurrement Test

  Scenario: Procurrement Test
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
   Given Go To Procurrement
    Then Click Procurrement Add To Cart
    Then Click Proceed to Continue button
      Then Click Next Payment Information button
    Then Fill in the following For Billing Address
      | Field            | Value                      |  
      | country          | USA                        |
      | firstName        | ambreen                    |
      | lastName         | qa                         |
      | streetAddress    | 8430 W Bryn Mawr Ave	      |
      | City			 			 | Chicago                    |
      | State            | IL                         |
      | postalCode       | 60631          			      |
   Then Choose a "Card" brain tree plan to pay
    Then Fill in the following fields for Brain Tree Payment Method section
      | Field           | Value                               |
      | Card Number     | credit_card_no                   	  |
      | Expiration      | credit_card_expiry		      |
       | Security Code   | credit_card_security_code           | 
      | Postal Code       | credit_card_postal_code             |
    Then Click Next Review button
    Then Click Place Order button
    Then Click Go To My Account
    Then Click Course And Download
    Then Click Certification
    Then Click Go To Course
    Then Click Lesson
    Then Click Lesson Fundamentals of Purchasing And Procurement
    Then Commplete Test Of Lesson
#    Then Commplete Test Of Practice
#    Then Commplete Test