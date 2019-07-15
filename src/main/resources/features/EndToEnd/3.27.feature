Feature: Teacher assign 2 Quizzes for student and Student pass them.
  Teacher changes student role to teacher then back to student. History of taken Quizzes saved
  Scenario: End-to-end 3.27
    Given I navigate to "login" page
    Then I type Email "yk29@bacninhmail.us" on "login" page
    And I type Password "yk123456789" on "login" page
    And I push button Sign in
    And I click on Assignments
    And I push button create new assignment
    And I select "Assign1" from assignment list for first quiz
    And I select student from dropdownlist
    And I push button Give Assignment
    And I push button create new assignment
    And I select "Assign2" from assignment list for second quiz
    And I select student from dropdownlist
    And I push button Give Assignment
    And I push button Log Out
    And I push button Log Out submit
    Then I navigate to "login" page
# Sign in with student account
    Then I type Email "iumasankarghu@mnage-ctrl-aplex.com" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click on My Assignments
    And I push button Go to Assessment for first quiz
    And I type text "one" for Question first quiz
    And I push button Submit My Answers
    And I push button go for submit
    And I push button Go to Assessment for second quiz
    And I type text "two" for Question for second quiz
    And I push button Submit My Answers
    And I push button go for submit
    And I push button Log Out
    And I push button Log Out submit
    Then I navigate to "login" page
    # Sign in with teacher account
    Then I type Email "yk29@bacninhmail.us" on "login" page
    And I type Password "yk123456789" on "login" page
    And I push button Sign in
    And I click on Submission
    And I push button Grade for first quiz
    And I push Total Points Button "five" times
    And I push button Grade Save
    And I push button Grade for second quiz
    And I push Total Points Button "Four" times
    And I push button Grade Save
    And I click on Home
    # navigate home page and wait 2 second
    And I click on User's Management
    And I select assigned student
    And I push button review for first quiz
    And I push button Grade Save
    And I push button Options
    And I click on Change user's Role
    And I click on Change Role
    And I push button Log Out
    And I push button Log Out submit
    Then I type Email "yk29@bacninhmail.us" on "login" page
    And I type Password "yk123456789" on "login" page
    And I push button Sign in
    And I click on User's Management
    And I reselect assigned student
    And I push button Options
    And I click on Change user's Role
    And I click on Change Role
    And I push button Log Out
    And I push button Log Out submit


#NOTE: CODE write based on quiz ID , its better to update quiz Id for each run.

  #QUIZ ID'S for next automation test :23471,23470,23469,23468,23467,23466,23465,23464,







