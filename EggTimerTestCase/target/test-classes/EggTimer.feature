Feature: Egg Timer Increment

Scenario: Check page load
Given I have URL
When Enter URL on browser
Then Default value on select box is displayed

@test
Scenario: Check timer increament
Given Enter URL
When Remove default value and When enter 25 second and click go
Then Timer start with decrement
