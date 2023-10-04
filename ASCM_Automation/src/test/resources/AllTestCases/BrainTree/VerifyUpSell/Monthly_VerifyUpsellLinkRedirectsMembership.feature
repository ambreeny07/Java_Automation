Feature: Verify-Upcell-Link-Redirects-Membership
  Scenario: Verify-Upcell-Link-Redirects-Membership
    Given Go To Login Page
    Then Enter Legacy username "ambreeninfo6501@email.com"
    Then Enter Legacy password "Test1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go to Membership Page
    Then Verify "Monthly" Membership Type
    Then Go to Cart
    Then Empty The Cart
    Then Click Learning And Development Top Navigation
   	Then Click CLTD
    Then Click LS Exam Pre Add To Card
    Then Click On Upgrade Now
    Then Verify "Membership Info" Page
    
    