  Feature: Cortijo Web App Test

  Scenario: Test switch autoOff mock
    Given a cortijo web app running
    When I click switch on mock 0.05 minutos
    When I refresh the page
    Then the mock button is off

  Scenario: Test switch on mock
    Given a cortijo web app running
    When I click switch on mock 0.05 minutos
    Then the mock button is on