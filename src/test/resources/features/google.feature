@Google
Feature: Google Search Functionality

  Background:
    Given user navigates to "https://www.google.com/"

  @Regression @Integration
  Scenario: Validate Google search
    When user searches for "Tesla" on Google
    Then user should see "Tesla" in the url
    Then user should see "Tesla" in the title

  @Smoke @Functional
  Scenario: Validate Google search results
    When user searches for "Apple" on Google
    Then user should see more than 0 results