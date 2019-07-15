@End-To-End
  Feature: 3.15

    Scenario: Teacher create Quiz and assign it to single student. Student completes Quiz. Teacher get submission
      Given I navigate to "login" obj_page
      Then I login as a "teacher"
      And I click on Quizzes obj_page
      And I create new quiz
      And I verify new quiz is created
      And I assign question to single student
      Then I logout
      Then I login as a "student"
      And I complete Quiz as a student
      Then I logout
      Then I login as a "teacher"
      And I verify a student submit assignments


