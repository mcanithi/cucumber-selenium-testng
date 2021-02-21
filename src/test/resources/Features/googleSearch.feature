Feature: searches google for ducks
Scenario: searches google for ducks scenario

Given User is on Google HomePage
When search ducks
Then  verify the search result
And close browser
