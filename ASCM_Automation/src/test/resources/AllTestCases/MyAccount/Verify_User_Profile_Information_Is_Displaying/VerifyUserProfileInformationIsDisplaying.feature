Feature: Verify-User-Profile-Information-Is-Displaying
Scenario: Verify-User-Profile-Information-Is-Displaying
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Click On Login Icon
    Then Enter My Account Member Username
    Then Enter My Account Member Password
    And  Click submit
    Then Verify Dashboard
    Then Verify ACSM Id Value
    Then Verify UserName Value
    Then Verify First Name Value
    Then Verify Last Name Value
    Then Verify Email Address Value
    Then Verify Home Address Value
    
