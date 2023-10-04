Feature: Login

  Scenario: Step_1_As a user i enter valid Atlas URL
    Given Visit the app url
    When I see login page title
    
    
    Scenario: Step_2_As a user i validate the following items Logo Input fields buttons and Link
    Given Visit the app url
    When I see login page title
    Then I enter values in input fields and buttons and Link should be clickable
    Then I see logo and background image
    And I see browser tab name should be login
    And I see input fields should have a proper placeholder name
    
    Scenario: Step_5_As a user i logged out from the application and redirected to Login screen
    Given Visit the app url
    When I see login page title
    Then I see user name text field
    Then I see password text field
    And I see login button
    And I see cancel button
    Then I see login assistance link
    And I enter user name "qaautomation@pharma.solutions"
    And I enter password "WGqb6xmV#1"
    Then I click on login button
    And I see atlas main page
    Then I click on profile name drop down
    Then I click on logout option
    And I see login page title 
    
    