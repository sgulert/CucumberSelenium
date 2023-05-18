Feature: First Feature Tests
  Scenario: :First Feature Test1
    Given we have number 5
    And we have number 3
    When these numbers are added each other
    Then the result should be 8