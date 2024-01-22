@wip
Feature: Login Page
  Scenario Outline: User login with invalid credentials
    Given  user land on website
    When user enter "<userName>" and "<password>"
    And user click "Login"
    Then user validate "Incorrect login or password"
    Examples:
    |userName|password|
    |helpdesk1@cydeo.com |Hello    |
    |melpdesk1@cydeo.com |UserUser |
    |gelpdesk1@cydeo.com |usersUser|
    |                    |        |