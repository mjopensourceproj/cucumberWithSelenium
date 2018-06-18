Feature: Verify Seleniumhq
  verify selenium hq home page

  Scenario: Open selenium hq page and verify Dowload page
    Given User navigates to selenium hq page
    When User click on Download page
    And User navigates to Download page
    Then User verifies Download version

  Scenario: Open selenium hq page and verify Projects page(failure scenario)
    Given User navigates to selenium hq page
    When User click on Download page
    And User navigates to Projects page
    Then User verifies Download version

  Scenario: Open selenium hq page and Verify Documentation page
    Given User navigates to selenium hq page
    When User click on Download page
    And User navigates to Download page
    Then User verifies Download version
