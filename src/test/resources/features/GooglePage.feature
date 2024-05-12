Feature: Google Search Function

@SmokeTest
Scenario: Search Java Tutorial
Given User is on Google home page
When User search Java Tutorial
Then Should display Java Tutorial page

@RegressionTest
Scenario: Search Selenium Tutorial
Given User is on Google home page
When User search Selenium Tutorial
Then Should display Selenium Tutorial page