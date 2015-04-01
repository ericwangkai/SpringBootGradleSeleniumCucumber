Feature: Addition
  As a math idiot
  In order to not feel silly
  I add two numbers

  Scenario Outline: Adding a and b
    Given I have variables <a> and <b>
    When I add them
    Then I display the <sum>
  Examples:
    | a | b | sum |
    | 3 | 4 | 7 |