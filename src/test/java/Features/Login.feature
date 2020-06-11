Feature: Login feature
  Scenario: Valid login
    Given I am on login page
    When I submit a valid login
    Then I am logged