@LogIn
Feature: 2.1 LogIn

  Background:
    Given I navigate to "login" obj_page

  Scenario Outline: LogIn - positive
    Then I fill out "<email>" and "<password>" form the login page
    And I verify the "<password>" is invisible
    And I verify type attribute for password
    And I verify homePage is opened

    Examples:
    |  email                     |  password  |
    |  irinaefimova427@gmail.com |  ir12345   |
    |  IRinaefimova427@gmail.com |  ir12345   |

  Scenario Outline: LogIn - negative (invalid credentials)
    Then I fill out "<email>" and "<password>" form the login page
    And I verify error massage "Authentication failed"
    Examples:
      |  email                       |  password  |
      | irinaefimava427@gmail.com    |  ir123456  |
      | irinaefimva427@gmail.com     |  ir12345   |
      | irinaefimav427@gmail.com     |  123456    |
      | irinaefimava427@gmail.com    |  IR12345   |





