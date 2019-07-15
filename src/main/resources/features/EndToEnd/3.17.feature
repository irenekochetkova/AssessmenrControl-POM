Feature: 3.17 Teacher creates 3 quizzes and assign it to single student. Student finds all the assigned 3 Quizzes.
  Scenario: Teacher creates 3 quizzes and assign it to single student. Student finds all the assigned 3 Quizzes.
    Given I navigate to "login" page
    Then I maximize window
    And I type Email "olgawilson@tonno.ml" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click on Quizzes
    #First quiz
    And I push button Create New Quiz
    And I type Quiz title "Testing (automation)"
    #First question
    And I push button Add Question for Question "one"
    And I select Textual type for Question "Q1"
    And I type text "What is Integration Testing?" of Question "one"
    And I click on Show-Stopper question for question "Q1"
    And I choose "10" points for question "Q1"
    #Second question
    And I push button Add Question for Question "two"
    And I select Single-choice type for Question "Q2"
    And I type text "Which of the following is a major task of test planning?" of Question "two"
    And I type text in options in Single-Choice question "two"
    And I select correct answer for Single question "two"
    And I click on Include Other text area option for question "Q2"
    #Third question
    And I push button Add Question for Question "three"
    And I select Multiple-choice type for Question "Q3"
    And I type text "Which is true - The black box tester" of Question "three"
    And I push button Add Option for Question "Q3"
    And I type text in options in Multiple question "three"
    And I select correct answer for Multiple question "three"
    And I choose "7" points for question "Q3"
    And I push button Save
    #Second quiz
    And I push button Create New Quiz
    And I type Quiz title "Testing types (automation)"
    #First question
    And I push button Add Question for Question "one"
    And I select Textual type for Question "Q1"
    And I type text "What is compatibility testing?" of Question "one"
    And I click on Show-Stopper question for question "Q1"
    And I choose "10" points for question "Q1"
    #Second question
    And I push button Add Question for Question "two"
    And I select Textual type for Question "Q2"
    And I type text "Define User Acceptance Testing" of Question "two"
    And I choose "10" points for question "Q2"
    And I push button Save
    #Third quiz
    And I push button Create New Quiz
    And I type Quiz title "Bugs (automation)"
    #First question
    And I push button Add Question for Question "one"
    And I select Textual type for Question "Q1"
    And I type text "Name 3 levels of bug priority" of Question "one"
    And I choose "6" points for question "Q1"
    #Second question
    And I push button Add Question for Question "two"
    And I select Textual type for Question "Q2"
    And I type text "Why do you need to write a bug report?" of Question "two"
    And I click on Show-Stopper question for question "Q2"
    And I push button Save
    #Assignments
    And I click on Assignments
    And I push button Create New Assignment
    And I select Quiz title "Testing (automation)"
    And I select student name "Peter Petrov" for Give Assignment
    And I push button Give Assignment
    And I push button Create New Assignment
    And I select Quiz title "Testing types (automation)"
    And I select student name "Peter Petrov" for Give Assignment
    And I push button Give Assignment
    And I push button Create New Assignment
    And I select Quiz title "Bugs (automation)"
    And I select student name "Peter Petrov" for Give Assignment
    And I push button Give Assignment
    And I push button Log Out
    #Delete 3 assignments and 3 quizzes
    And I type Email "smiranymah@hitachirail.gq" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click on My Assignments
    And assignment "Testing (automation)" should be displayed
    And assignment "Testing types (automation)" should be displayed
    And assignment "Bugs (automation)" should be displayed
    And I push button Log Out
    And I type Email "olgawilson@tonno.ml" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    #Delete 3 assignments
    And I click on Assignments
    And I delete assignment name "Bugs (automation)"
    And I delete assignment name "Testing (automation)"
    And I delete assignment name "Testing types (automation)"
    #Delete 3 Quizzes
    And I click on Quizzes
    And I delete quiz name "Bugs (automation)"
    And I delete quiz name "Testing (automation)"
    And I delete quiz name "Testing types (automation)"