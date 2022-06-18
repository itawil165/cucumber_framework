@Google
Feature: Google Search Functionality

  @Regression @Integration
  Scenario: Validate Google search
    Given user navigates to "https://www.google.com/"
    When user searches for "Tesla" on Google
    Then user should see "Tesla" in the url
    Then user should see "Tesla" in the title

  @Smoke @Functional
  Scenario: Validate Google search results
    Given user navigates to "https://www.google.com/"
    When user searches for "Apple" on Google
    Then user should see more than 0 results