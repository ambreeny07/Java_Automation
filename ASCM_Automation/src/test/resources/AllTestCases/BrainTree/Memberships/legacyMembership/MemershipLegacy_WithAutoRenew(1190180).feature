Feature: Legacy-Membership-with-auto-renew-with-login-1190180
  Scenario: Legacy-Membership-with-auto-renew-with-login-1190180
    Given Go To Login Page
    Then Enter Legacy username "1190180"
    Then Enter Legacy password "Qa1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go to Membership Page
    Then Verify "base membership" is visible
    Then Verify "base membership" Toggle "off"
    Then Verify "certificate upgrade" is visible
    Then Verify "certificate upgrade" Toggle "off"
    Then Verify "chapter" is visible
    Then Verify "chapter" Toggle "off"
