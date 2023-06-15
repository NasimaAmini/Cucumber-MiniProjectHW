Feature: BlazeDemo Purchase Page Functionality

  Scenario Outline: Verify User able to purchase flight ticket
    Given User navigates to BlazeDemo Purchase Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<fullName>"
    And User enters Address "<address>"
    And User enters city "<city>"
    And User etners state "<state>"
    And User etners zip Code "<zip Code>"
    And User selects card Type "<card Type>"
    And User enters credit Card Number "<credit Card Number>"
    And User etners month "<month>"
    And User etners year "<year>"
    And User etners name on Card "<name on Card>"
    And User clicks remember me check
    And User clicks purchase Flight button
    Then User verifies success message "<message>"

    Examples: 
      | fullName     | address      | city     | state | zip Code | card Type       | credit Card Number | month | year | name on Card | message                            |
      | Nasima Amini | 123 drive st | ABC city | VA    |    12345 | American Express |       123456789122 |     5 | 2021 | Nasima Amini | Thank you for your purchase today! |