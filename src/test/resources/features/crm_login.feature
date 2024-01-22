@wip
Feature: Login Page
  Background:
    Given  user land on website
  Scenario Outline: User login with invalid credentials
    When user enter "<userName>" and "<password>"
    And user click "Login"
    Then user validate "Incorrect login or password"
    Examples:
    |userName|password|
    |helpdesk1@cydeo.com |Hello    |
    |melpdesk1@cydeo.com |UserUser |
    |gelpdesk1@cydeo.com |usersUser|
    |                    |         |
  Scenario: User forgot password
    And user click "Forgot Password"

  Scenario: User login with valid credentials and click checkbox
    When user enter correct credentials
    And user click "checkBox"
    Then user validate checkbox is selected
