Feature: example test cases


  Scenario: User login as central approver of CDA project
    Given User is on LogIn page
    When User enters "soudi@yahoo.com" into Username field
    And User enters "12skdh3" into Password field
    And User Click LogIn button
    And User Login Successfully

    Scenario: Click login
    Given user click to save button
    