Feature: User Login Function

#Scenario: valid Login - first way__data pass through Step def file
#Given User is on Login page
#When User enter credentials
#Then Should display Success Msg

#Scenario: valid Login - Second way__data pass through feature file
#Given User is on Login page
#When User enter "tomsmith" and "SuperSecretPassword!"
#Then Should display Success Msg

#Scenario Outline: valid Login - Thirs way__use more than one test data
#Given User is on Login page
#When User enter "<username>" and "<password>"
#Then Should display Success Msg

#Examples:

#| username | password |
#| tomsmith | SuperSecretPassword! |
#| testUser1 | Welcome123 |


#Scenario Outline: valid Login - Fourth way__passing data at step level
#Given User is on Login page
#When User enter credentials
#		| tomsmith | SuperSecretPassword! |
#Then Should display Success Msg


Scenario Outline: valid Login - Fifth way__passing data at step level as Key value pare
Given User is on Login page
When User enter credentials
		| username | password |
		| tomsmith | SuperSecretPassword! |
Then Should display Success Msg


