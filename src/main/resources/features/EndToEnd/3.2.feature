@EndToEnd
Feature: 3.2 Create User and change User role to teacher
  Scenario: User can create account and change role to teacher
    Given I navigate to "registration" page
    And I fill out Registration form
    And I push button Register me
    Then I receive message You've been registered
    And I push button "Back to login page"
    And I type Email "vasilypetrov@tonno.ml" on "login" page
    And I type Password "12345" on "login" page
    And I push button Sign in
    And I click Users management
    And select Student from Students List
    And I change user role to teacher
    Then I verify that user role changed to teacher
#    Delete teacher
    And I click Users management
    And I select list of teachers
    And select Teacher from Teachers List
    And I delete Teacher