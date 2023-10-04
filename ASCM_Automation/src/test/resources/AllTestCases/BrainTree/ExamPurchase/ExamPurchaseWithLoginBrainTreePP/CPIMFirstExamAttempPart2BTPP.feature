Feature: CPIM Part 2-First Attempt-BrainTree-PP

  Scenario: CPIM Part 2-First Attempt-BrainTree-PP
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
   	Then Click CPIM
    Then Click Add to Cart button for CPIM PartTwo
#    Then Select Exam Region
    Then Exam Add To Card
    Then Click Proceed to Continue button
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
    Then Click Next Payment Information button
    Then Click same as billing button
    Then Choose a "PayPal" brain tree plan to pay
    Then Click Next Review button
    Then Click Place Order button
    Then Get ReferenceCode