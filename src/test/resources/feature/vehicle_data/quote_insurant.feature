Feature: Quote Insurance
  The user wants to quote insurance
  The user accesses the insurance quote page

  @issue=1
  Scenario: Successful Quotation
    Given The user is on the insurance quote page and want to quote
    When The user fill in the form Enter Vehicle Data
    And The user fill in the form Enter Insurant Data
    And The user fill in the form Enter Product Data
    And The user fill in the form Select Price Option
    And The user fill in the form Send Quote
    Then The user validates the success message