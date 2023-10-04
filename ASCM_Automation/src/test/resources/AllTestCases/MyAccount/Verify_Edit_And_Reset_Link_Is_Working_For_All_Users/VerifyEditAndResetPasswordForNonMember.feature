Feature: Verify-Edit-And-Reset-Link-Is-Working-For-Non-Member
@smoke
Scenario: Verify-Edit-And-Reset-Link-Is-Working-For-Non-Member-User
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Click On Login Icon
    Then Enter My Account Non Member Username
    Then Enter My Account Non Member password
    And  Click submit
    Then Verify Dashboard
    Then Click On Reset Password Button
    And  Enter Reset User Name "amyregs30@email.com"
    And  Enter Reset Password "Test1235"
    And  Enter Reset Confirm Password "Test1235"
    Then Click On Reset Button
    Then Verify Dashboard
    Then Click On Reset Password Button
    And  Enter Reset User Name "amyregs30@email.com"
    And  Enter Reset Password "Test1234"
    And  Enter Reset Confirm Password "Test1234"
    Then Click On Reset Button
    Then Verify Dashboard
    And  Click On Edit Button
    Then Verify Edit Profile Page Title
    Then Enter Edit Company Name "CA"
    Then Enter Edit Work Address "8430 W Bryn Mawr Avenue Suite 1000"
    And Select Primary Phone "US & Canada (+1)"
    And Enter Area Code "123"
    Then Enter Phone Number "0036450"
    And Click On Work Radio Button
    Then Select Edit Country "United States"
    Then Enter Edit City Name "Chicago"
    Then Select Edit State "Illinois"
    And  Enter Edit Zip Code "60631"
    Then Click On Submit Button
    Then Verify Dashboard