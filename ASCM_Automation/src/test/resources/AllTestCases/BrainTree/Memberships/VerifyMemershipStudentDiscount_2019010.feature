Feature: Student-Discount-Membership-with-login-2019010
  Scenario: Student-Discount-Membership-with-login-2019010
    Given Go To Login Page
    Then Enter Legacy username "2019010"
    Then Enter Legacy password "Qa1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go to Membership Page
    Then Verify Membership "type" "Discount" is visible
    Then Verify Membership "type" "Student" is visible
    Then Verify Membership "since" "11/15/2021" is visible
    Then Verify Membership "expires" "11/14/2022" is visible