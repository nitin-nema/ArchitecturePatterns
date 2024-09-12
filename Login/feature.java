// Login.feature
//Gherkin-like syntax
Feature: User Login

Scenario: Successful login
Given a user with username "admin" and password "admin123"
When the user tries to log in
Then the login should be successful

Scenario: Failed login with incorrect password
Given a user with username "admin" and password "wrongpass"
When the user tries to log in
Then the login should fail
