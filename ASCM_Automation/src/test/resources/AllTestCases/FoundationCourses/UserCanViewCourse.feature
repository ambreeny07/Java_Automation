Feature: Verify-the-user-is-able-to-view-course-and-download
  Scenario: Verify-the-user-is-able-to-view-course-and-download
    Given Go To Login Page
    Then Enter Legacy username "amyautot1@email.com"
    Then Enter Legacy password "Test1234"
    And Click submit
    Then Click on OK button for cookie
    Then Go To My Account
    Then Click On Download And Courses
    Then Verify Foundation course "Foundations of Inventory Management"
    Then Click On Access Course
    Then Verify Foundation course "Foundations of Inventory Management"
    Then Close the Browser
   
