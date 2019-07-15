@Objects
Feature: User-Password
  Scenario Outline: User - password
    Given I navigate to "login_www" page
    And Click on Register Now button
    And Print "<title>" of test case
    And I type First Name "<firstName>"
    And I type Last Name "<lastName>"
    And I type Email "<email>" on "registration" page
    And I type Group Code "<gCode>"
    And I type Password "<psw>" on "registration" page
    And I type Confirm Password "<confirmPsw>"
    And I push button Register me
    Then Message "<message>" appears
    And Print "<message>" of test case

    Examples:
     |title            | firstName | lastName | email                             | gCode | psw                               | confirmPsw                        | message                 |
     |numeric spec char| Nat       | Kir      | 5sobi.khan_alone0@topfivestars.fun| 123   | aB10!@#$%^&*(){}[]!?.,-_+=;:''~``O| aB10!@#$%^&*(){}[]!?.,-_+=;:''~``O| You have been Registered|
     |min 5 char       | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   | 12345                             | 12345                             | You have been Registered|
     |max 32 char      | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   | stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v  | stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v  | You have been Registered|
     |no whitespaces   | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   | 123^ 5                            | 123^ 5                            | Whitespaces are not allowed|
     |not empty        | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   |                                   |                                   | This field is required|
     |min-1 (4) char   | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   |  1234                             | 1234                              | Too short. Should be at least 5 characters|
     |must match       | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   |  1234567                          | 1234568                           | Entered passwords should match|
#     |max+1 (33) char  | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   | stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v1 | stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v1 | Too long. Should be no more than 32 characters|
#     |only ASCII char  | Natasha   | Kirusheva| 0pola.michellp@fikrinhdyh.cf      | 123   | привет                            | привет                            | Non allowable characters|