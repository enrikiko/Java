  Feature: Cortijo Web App Test

  Scenario: Test switch on/off mock
    Given a cortijo web app running
    When I click switch on mock
    Then the mock button is on