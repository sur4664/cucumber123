Feature: Automated login and logout related test cases

  @Regression @SmokeTest
  Scenario: Verify login with valid credentials works as expected
    Given Verify the URL is loaded properly with proper title
      | appURL                       | appPageTitle     |
      | http://localhost:85/login.do | actiTIME - Login |
    And User enter the valid username
      | userName |
      | admin    |
    And user enter the valid password
      | password |
      | manager  |
    And User clicks on Login button
    Then Verify login to actiTime application is successful
      | HomePageTitle    |
      | Enter Time-Track |


