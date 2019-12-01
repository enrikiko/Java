  Feature: Is it Friday yet?
    Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is "Friday"
    When I ask whether it's "Friday" yet
    Then Assert day

  Scenario: Simple comparation
    Given two number 21 1
    When compare these numbers
    Then assert these numbers are not equals

  Scenario: Simple comparation2
    Given two number 1 1
    When compare these numbers
    Then assert these numbers are equals