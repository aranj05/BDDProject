@PhaseTwo   #feature level tagging

Feature: Tasks Managment

@SmokeTest
Scenario: Create a new Tasks
Given User is logged in
When User created new Tasks

@RegressionTest 
Scenario: view Tasks
Given User is logged in
When User view Tasks details

Scenario: Delete Tasks
Given User is logged in
When User delete Tasks