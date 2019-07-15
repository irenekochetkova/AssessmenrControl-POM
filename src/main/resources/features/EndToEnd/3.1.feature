@EndToEnd
Feature: 3.1 Create User
  Scenario: Create Student
    Given I navigate to "login" page
    And I push Register now button
    And I fill out Registration form
    And I push button Register me
    Then I receive message You've been registered
#    delete student account
    And I push button "Back to login page"
    And I type Email "vasilypetrov@tonno.ml" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click Users management
    And select Student from Students List
    And I delete student

