@All
Feature: Verify_Non_Member_Is_Not_Able_To_View_Membership_Status_Block
Scenario: Verify_Non_Member_Is_Not_Able_To_View_Membership_Status_Block
    Given Launch Create Account
    Then Click on OK button for cookie
    Then Click On Login Icon
    Then Enter My Account Non Member Username
    Then Enter My Account Non Member password
    And  Click submit
    Then Verify Dashboard
    Then Verify ACSM Id Value
    And  Click On Side Menu Membership Button
    And  Verify Become A Member Button
    
