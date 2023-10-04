Feature: Verify-user-is-not-able-to-view-expired-course
  Scenario: Verify-user-is-not-able-to-view-expired-course
    Given Go To Login Page
    Then Enter Legacy username "amyautot1@email.com"
    Then Enter Legacy password "Test1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go To My Account
    Then Click On Download And Courses
    Then Verify Foundation course "Foundations of Inventory Management"
    Then Verify Course Expire Date "9/5/2023"
    Then Close the Browser
   
