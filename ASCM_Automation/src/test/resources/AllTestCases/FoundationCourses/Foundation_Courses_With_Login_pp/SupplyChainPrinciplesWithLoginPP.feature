Feature:  Supply-Chain-Principles-with-login-PP
  Scenario: Supply-Chain-Principles-with-login-PP
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
   	And Go To Foundations Courses
#   	Then Click Individual POD
   	Then Click Supply Chain Principles Foundation
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
    
#    Then Click on PayPal button
#    Then Click Next Review button
    Then Choose a "PayPal" brain tree plan to pay
    Then Click Next Review button
    Then Click Place Order button
#    Then Click Login
#    Then Enter PayPal userName
#    Then Enter PaPal password
#    Then Click Login button
#    Then Click Pay Now button
#    Then Get ReferenceCode