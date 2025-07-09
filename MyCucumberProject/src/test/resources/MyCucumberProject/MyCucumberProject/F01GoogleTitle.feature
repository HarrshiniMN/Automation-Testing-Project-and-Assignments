Feature: Validate Google Title

  Scenario: To validate title of Google
    Given Open Google
    When Read the title
    Then Title should be Google
