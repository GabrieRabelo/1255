Feature: Letter Counter
  This feature counts letter of a string

Scenario: Two repeated Letters
  Given a letter counter
  When I enter the following string "Computers account for only 5% of the country's commercial electricity consumption."
  Then the most frequent letter should be "co"

Scenario: No repeated Letters
  Given a letter counter
  When I enter the following string "input"
  Then the most frequent letter should be "inptu"