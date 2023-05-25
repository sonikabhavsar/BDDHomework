Feature: hoverOver action
  @hoverOver
    Scenario: As a user i want to able hoverOver action successfully
  Given I am on demoNopcommerce homepage
    When I hover over "Computers" category link
    Then I should able to verify changes that happened after hovering
    When I click on subcategory "Notebooks" link
    Then I should able to successfully navigate to "notebooks" category