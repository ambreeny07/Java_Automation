Feature: Warehouse-With-Login-BrainTree-CC 
Scenario: Warehouse-With-Login-BrainTree-CC 
	Given Launch Create Account 
	Then Click on OK button for cookie 
	Then Enter New Email "email" 
	Then Enter New Password "Testing1" 
	Then Enter First Name "Automation" 
	Then Enter Last Name "qa" 
	Then Click Ceck Term 
	Then Enter Job Title "QA"
	Then Click Submit 
	Then Click Login Button 
	Then Enter username "email" 
	Then Enter password "Testing1" 
	And Click submit 
	Then Click Learning And Development Top Navigation 
	Then Click Warehouse 
	Then Click Bundle Add To Card 
	Then Click Proceed to Continue button 
	Then Click Next Payment Information button 
	Then Fill in the following fields for warehouse mailing section 
		| Field            | Value                      |  	
		| country          | mailing_country                    |
		| company          | mailing_company                    |
		| streetAddress    | mailing_address	                  |
		| City			 | mailing_city                       |	
		| postalCode       | mailing_postal_code          	  |
		| FirstName      | MAILING_FIRST_NAME      		  |
		| LastName     | MAILING_LAST_NAME         	  |
		| State            | mailing_state                      |
		
		
		
		
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
