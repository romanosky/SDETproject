Feature: Shopping

Scenario: User sign in
Given User is on landing page
When User login into application with username and password
When User select the product
When User continue with checkout
When User validates the address
When User validates the shipping method
When User validates proceed with the payment
When User confirms the order
Then User complete the process