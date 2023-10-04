Feature: Verify-the-membership-shows-correct-expire-date
  Scenario: Verify-the-membership-shows-correct-expire-date
    Given Go To Login Page
    Then Enter Legacy username "ambreeninfo2022@email.com"
    Then Enter Legacy password "Test1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go to Membership Page
    Then Verify Membership "type" "Annual" is visible
    Then Verify Membership "expires" "9/11/2023" is visible
    


    