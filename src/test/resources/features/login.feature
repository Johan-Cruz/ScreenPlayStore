Feature: Enter Product Store
  I as a web user
  I want to login
  To check that you enter correctly
  Scenario Outline: LoginUser
    Given I enter the page
    When I log in
      |userName|password|
      |<userName>|<password>|
    Then I see my name on the page
      |userName|
      |Welcome <userName>|
    Examples:
      |userName|password|userName|
      |   joao |  joao1|Welcome joao|
      |  amparo  |   amparo1  |Welcome amparo|
