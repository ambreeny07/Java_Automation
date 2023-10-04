Feature: Legacy-Membership-with-auto-renew-with-login-1880880
  Scenario: Legacy-Membership-with-auto-renew-with-login-1880880
    Given Go To Login Page
    Then Enter Legacy username "1880880"
    Then Enter Legacy password "Qa1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go to Membership Page
    Then Verify "base membership" is visible
    Then Verify "base membership" Toggle "on"
    Then Verify "chapter" is visible
    Then Verify "chapter" Toggle "on"
