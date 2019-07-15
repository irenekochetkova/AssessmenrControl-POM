@UserName
Feature: User Name

  Scenario Outline: User name
    Given I navigate to "registration_www" page
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
     | title                  | firstName | lastName | email              | gCode | psw             | confirmPsw   | message                    |
     | Alpha $ Spec char      | Namu123$  | fhdsj    | abc123@gmail.com   | 1234  | applepie        | applepie     |You have been Registered.   |
     | First name field empty |           | fhdsj    | abc123@gmail.com   | 1234  | applepie        | applepie     |This field is required      |
     | Max 254 characters     | ;m;vdmv;dfnm;;242knsv;kns;k@)*&$*^@*^!)^lshgflsblsbsldshf1237101bk1jb2k41g4kh1234vh2k3vkv(&^!)$)!^)!rhrhjhrh432hhlshfshdhfsuhflh;m;vdmv;dfnm;;242knsv;kns;k@)*&$*^@*^!)^lshgflsblsbsldshf1237101bk1jb2k41g4kh1234vh2k3vkv(&^!)$)!^)dlkfnsldnflsdfjs | 2        | abc123@gmail.com   | 1234  | applepie        | applepie     | You have been Registered.|
     | Max 255 characters     | ;m;vdmv;dfnm;;242knsv;kns;k@)*&$*^@*^!)^lshgflsblsbsldshf1237101bk1jb2k41g4kh1234vh2k3vkv(&^!)$)!^)!rhrhjfhrh432hhlshfshdhfsuhflh;m;vdmv;dfnm;;242knsv;kns;kflslfsdlfs23423423lh23h4l23h4l32h4l32h4l3hl32jh4l234j23lkj4l23kj4lk32j4lk2j3lk4jl2k3j4lk32jk2l3j444 | 2        | abc123@gmail.com   | 1234  | applepie        | applepie     | Data too long for column |
     | Min 1 characters       | N         | fhdsj    | abc123@gmail.com   | 1234  | applepie        | applepie     |You have been Registered.   |
     | White spaces are not   | Namu 123$ | fhdsj    | abc123@gmail.com   | 1234  | applepie        | applepie     |Whitespaces are not allowed |
