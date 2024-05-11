@PhaseOne   #feature level tagging

Feature: Contacts Managment

@SmokeTest @RegressionTest
Scenario: Create a new Contact
Given User is logged in
When User created new Contact

@RegressionTest
Scenario: view Contact
Given User is logged in
When User view Contact details

Scenario: Delete Contact
Given User is logged in
When User delete Contact
 