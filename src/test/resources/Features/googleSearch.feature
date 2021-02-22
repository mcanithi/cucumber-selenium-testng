Feature: searches google for ducks
Scenario: searches google for ducks scenario

Given User is on google.com
When search for ducks
Then  verify the search result 
And close browser
