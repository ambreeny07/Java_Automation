Feature: Annual_Verify-Purchase-Multiple-Link
  Scenario: Annual_Verify-Purchase-Multiple-Link
    Given Go To Login Page
    Then Enter Legacy username "ambreeninfo6502@email.com"
    Then Enter Legacy password "Test1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go to Membership Page
    Then Verify "Annual" Membership Type
    Then Go to Cart
    Then Empty The Cart
    Then Click Learning And Development Top Navigation
   	Then Click CLTD
    Then Click LS Exam Pre Add To Card
    Then Verifying Purchase Multiple Link Is Present
    
    
    