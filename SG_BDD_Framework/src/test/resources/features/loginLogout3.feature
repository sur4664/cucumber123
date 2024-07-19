Feature: Automated login and logout related test cases

  @Regression @SmokeTest @ExampleTest
  Scenario Outline: Verify login with valid credentials works as expected
    Given Verify the URL "<appURL>" is loaded successful with proper title "<PageTitle>"
    And User enters the valid username "<userName>"
    And user enters the valid password "<password>"
    And User click on Login button in actiTime
    Then Verify login to application is successful using "<homePageTitle>"

    Examples:
      | appURL                       | PageTitle        | userName | password | homePageTitle    |
      | http://localhost:85/login.do | actiTIME - Login | admin    | manager  | Enter Time-Track |
      | http://localhost:85/login.do | actiTIME - Login | sgtester | Mercury  | Enter Time-Track |
      | http://localhost:85/login.do | actiTIME - Login | sgtester | Mercury  | Enter Time-Track |


