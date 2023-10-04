Feature: Verify-Product-Page
Scenario: Verify-Product-Page
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
   	Then Verify "Certified in Logistics, Transportation and Distribution" Product Page
   	Then Click Learning And Development Top Navigation
   	Then Click CPIM
   	Then Verify "Certified in Planning and Inventory Management" Product Page
   	Then Click Learning And Development Top Navigation
   	Then click CSCP
   	Then Verify "Certified Supply Chain Professional" Product Page
   	Then Click Learning And Development Top Navigation 
	Then Click Warehouse
	Then Verify "Supply Chain Warehousing Certificate" Certificate Page
	Given Go To Procurrement
	Then Verify "Supply Chain Procurement Certificate" Certificate Page
