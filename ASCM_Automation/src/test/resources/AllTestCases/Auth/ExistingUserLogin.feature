Feature: Existing-User-Login
Scenario: Existing-User-Login
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Click On Login Icon
    Then Enter Stage Existing username
    Then Enter Stage Existing password
    And Click submit
    Then Verify Dashboard
