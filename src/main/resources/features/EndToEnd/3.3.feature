@EndToEnd
Feature: 3.3 Teacher can create Quiz with 5 textual questions
  Scenario: Teacher can create Quiz with 5 textual questions
    Given I navigate to "login" page
    Then I type Email "qa.sofi@gmail.com" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click on Quizzes
    And I push button Create New Quiz
    And I type Quiz title "Name"
    And I push button Add Question for Question "one"
    And I select Textual type for Question "Q1"
    And I type text "one" of Question "one"
    And I push button Add Question for Question "two"
    And I select Textual type for Question "Q2"
    And I type text "two" of Question "two"
    And I push button Add Question for Question "three"
    And I select Textual type for Question "Q3"
    And I type text "three" of Question "three"
    And I push button Add Question for Question "four"
    And I select Textual type for Question "Q4"
    And I type text "four" of Question "four"
    And I push button Add Question for Question "five"
    And I select Textual type for Question "Q5"
    And I type text "five" of Question "five"
    And I push button Save
    #need to be verification from this step
    #Then Quiz "Name" saved in List of Quizzes
    And I click on Quizzes
    And I delete quiz name "Name"