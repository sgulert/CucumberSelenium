@login
Feature: First Feature Tests

  @smoke
  Scenario: SmokeTest
    Given we have number 5
    And we have number 3
    When these numbers are added each other
    Then the result should be 8

    @regression @smoke
    Scenario: RegressionTest
      Given we have number 5
      And we have number 3
      When these numbers are added each other
      Then the result should be 8
