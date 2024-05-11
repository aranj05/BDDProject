@PhaseOne    #feature level tagging
Feature: Deals Managment

@SmokeTest
Scenario: Create a new Deals
Given User is logged in
When User created new Deals
 
@RegressionTest 
Scenario: view Deals
Given User is logged in
When User view Deals details

Scenario: Delete Deals
Given User is logged in
When User delete Deals