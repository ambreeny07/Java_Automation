Feature: Order-Confirmation
  Scenario: Order-Confirmation
    Given Go To Login Page
    Then Enter Legacy username "ambreeninfoo1@email.com"
    Then Enter Legacy password "Test1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go To Order History
    Then Click On Show Order Details
    Then Verify "Ship to" Address Contains "Ambreen Qa"
    Then Verify "Ship to" Address Contains "8430 W Bryn Mawr Avenue Suite 1000"
    Then Verify "Ship to" Address Contains "Chicago, IL 60631"
    Then Verify "Ship to" Address Contains "United States"
    Then Verify "Bill to" Address Contains "Ambreen Qa"
    Then Verify "Bill to" Address Contains "8430 W Bryn Mawr Avenue Suite 1000"
    Then Verify "Bill to" Address Contains "Chicago, IL 60631"
    Then Verify "Bill to" Address Contains "United States"
    Then Verify "1" Quantity Of "ASCM Membership"
    Then Verify "1" Quantity Of "Certification Upgrade"
    Then Verify "1" Quantity Of "Chicago Chapter Membership"
    Then Verify "99.00" Price Of "ASCM Membership"
    Then Verify "100.00" Price Of "Certification Upgrade"
    Then Verify "21.00" Price Of "Chicago Chapter Membership"
    Then Verify Total Bill Is "220.00"
   
