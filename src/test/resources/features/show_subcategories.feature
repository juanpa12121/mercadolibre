Feature: Show subcategories in the category list
  Me as PO
  I need to show subcategories in the category list
  For the customers can find the products they want

  @successScenario
  Scenario Outline: The subcategories are present
    Given The user is on Mercado Libre page
    When The user clicks on the category <category>
    Then The user should see the subcategories

    Examples:
      | category              |
      | Hogar y Muebles       |
      #| Industrias y Oficinas |