Feature: Create a new account

Scenario: Home page default login
Given User is on landing page
When User put his email to create a new account
And User fill all the mandatory fields
Then New Account is created