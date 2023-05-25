Feature: navigate the sub category page

  @subCategory
  Scenario Outline: As a User i should be able to navigate sub category page successfully
    Given I am on demoNopcommerce homepage
    When I click on "<Category>" button accordingly
    And I click on "<sub_Category>" button accordingly
    And I should be able to verity i am navigated to related page "<page_url>" successfully
    Then I should be able to verify the page title "<page_title>" accordingly

    Examples:
    |Category|sub_Category|page_url|page_title|
    |Computers|Desktops   |https://demo.nopcommerce.com/desktops|Desktops|
    |Computers|Notebooks |https://demo.nopcommerce.com/notebooks | Notebooks|
    |Computers|Software  |https://demo.nopcommerce.com/software  |Software  |
    |Electronics|Camera & photo|https://demo.nopcommerce.com/camera-photo|Camera & photo|
    |Electronics|Cell phones | https://demo.nopcommerce.com/cell-phones| Cell phones  |
    |Electronics|Others  |https://demo.nopcommerce.com/others      |Others        |
    |Apparel    |Accessories |  https://demo.nopcommerce.com/accessories   | Accessories|
    |Apparel|Shoes |  https://demo.nopcommerce.com/shoes   |  Shoes  |
    |Apparel|Clothing |https://demo.nopcommerce.com/clothing  |Clothing |
