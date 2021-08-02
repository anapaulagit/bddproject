Feature: Youtube Login Validation and Search
In Youtube site
As a valid User
I want to do a search

  Background:
    Given navigate to Youtube page

  @unHappy
  Scenario Outline: Invalid Login Validation
    When I fill in an invalid username <username>
     And I fill in an invalid password <password>
    Then I should get "errorMessage"
    Examples:
      |username                 |password      |
      |"anapaula@gmail.com"     |"abc123"      |
      |"ana.paula2@gmail.com"   |"xyz456"      |

  @happy
  Scenario: Make a search
    When  I search for "Wex inc"
    Then I see a list of videos about Wex




