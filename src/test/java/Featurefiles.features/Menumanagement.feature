Feature: Menu management

  Scenario: Add a menu item
    Given I have a menu item "Cucumber Sandwich" with price 20
    When I add the menu item
    Then Menu item should be added