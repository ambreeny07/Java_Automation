Feature: Supply-Chain-Principles-with-out-login-CC 
Scenario: Supply-Chain-Principles-with-out-login-CC 
	Given Launch Application 
	Then Click on OK button for cookie 
	Then Click Learning And Development Top Navigation 
	And Go To Foundations Courses
	#   	Then Click Individual POD
	Then Click Supply Chain Principles Foundation 
	Then Click Proceed to Continue button 
	Then Enter First Name "Automation" 
	Then Enter Last Name "qa" 
	Then Enter New Email "email" 
	Then Enter New Password "Testing1" 
	Then Click Agree Account Checkout 
	Then Click Next Button 
	Then Click Next Payment Information button 
	Then Fill in the following For Billing Address 
		| Field            | Value                      |  
		| country          | USA                        |
		| firstName          | ambreen                        |
		| lastName          | qa                        |
		| streetAddress    | 8430 W Bryn Mawr Ave	      |
		| City			 | Chicago                    |
		| State            | IL                         |
		| postalCode       | 60631          			  |
		
	Then Choose a "Card" brain tree plan to pay 
	Then Fill in the following fields for Brain Tree Payment Method section 
		| Field           | Value                               |
		| Card Number     | credit_card_no                   	  |
		| Expiration      | credit_card_expiry		      |
		| Security Code   | credit_card_security_code           | 
		| Postal Code       | credit_card_postal_code             |
	Then Click Next Review button 
	Then Click Place Order button 
	Then Get ReferenceCode