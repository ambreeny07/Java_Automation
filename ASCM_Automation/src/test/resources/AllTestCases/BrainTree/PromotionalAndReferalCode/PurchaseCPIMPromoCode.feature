Feature: Purchase-CPIM-PromoCode
  Scenario: Purchase-CPIM-PromoCode
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
   	Then Click CPIM
    Then Click Bundle Add To Card
    Then Click Skip Membership Chapter
#     Then select Country
#    Then Enter Post Code
#    Then Search Postal Code
#    Then Select Item
#    Then Add Selected Item
    Then Click Bundle Aggress Button
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
    Then Click Shipping Method  
    Then Click Next Payment Information button
    Then Click same as billing button
    Then Choose a "PayPal" brain tree plan to pay
    Then Click Next Review button
    Then Click Place Order button
    Then Get ReferenceCode