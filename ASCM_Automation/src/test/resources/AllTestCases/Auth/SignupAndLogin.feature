Feature: Signup-And_Login 
Scenario: Signup-And_Login 
	Given Launch Create Account 
	Then Click on OK button for cookie 
	Then Click On Login Icon 
	Then Click On Create An Account 
	Then Verify Signup Page Title 
	And Enter Stage New Email Address 
	And Enter Stage New Password 
	And Enter Stage New First Name 
	And Enter Stage New Last Name 
	And Click Terms Conditions Checkbox 
	Then Click Signup Submit Button 
	Then Verify Your Account Has Been Created Title Dashboard 
	Then Click On Login Icon
	And Enter Stage created username
	And Enter Stage created password
	And Click submit
	And Click created Login Button
    Then Verify Dashboard