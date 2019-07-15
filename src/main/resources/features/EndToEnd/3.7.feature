@EndToEnd
Feature: 3.7 Teacher can create Quiz with 3 Textual, 3 Single- Choice, 3 Multiple-Choice question + Show Stopper.
  Scenario: Teacher can create Quiz with 3 Textual, 3 Single- Choice, 3 Multiple-Choice question + Show Stopper.
    Given I navigate to "login" page
    Then I type Email "olgawilson@tonno.ml" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click on Quizzes
    And I push button Create New Quiz
    And I type Quiz title "QA"
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
##    Question 4
#    And I select Single-choice type for Question "Q4"
#    And I type text "four" of Question "four"
#    And I type text in options in Single-Choice question "four"
#    And I select correct answer for question "four"
##    Question 5
#    And I push button Add Question for Question "five"
#    And I select Single-choice type for Question "Q5"
#    And I type text "five" of Question "five"
#    And I type text in options in Single-Choice question "five"
#    And I select correct answer for question "five"
##    Question 6
#    And I push button Add Question for Question "six"
#    And I select Single-choice type for Question "Q6"
#    And I type text "six" of Question "six"
#    And I type text in options in Single-Choice question "five"
#    And I select correct answer for question "five"
#
#
#    And I push button Add Question for Question "seven"
#    And I select Multiple-choice type for Question "Q7"
#    And I type text "seven" of Question "seven"
#    And I push button Add Question for Question "eight"
#    And I select Multiple-choice type for Question "Q8"
#    And I type text "eight" of Question "eight"
#    And I push button Add Question for Question "nine"
#    And I select Multiple-choice type for Question "Q9"
#    And I type text "nine" of Question "nine"
#    And I push button Save
#    Then Quiz "Bugs" saved in List of Quizzes
#    And I click on Quizzes
#    And I select Quiz title "Bugs"
#    And I push button Delete
#    Then Quiz "Bugs" deleted in List of Quizzes
