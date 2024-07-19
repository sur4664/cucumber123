Feature: Automated login and logout related test cases

  @Regression @SmokeTest
  Scenario: Verify login with valid credentials works as expected
    Given Verify the URL "appURL" is loaded properly with proper title "actiTIME - Login"
    And User enter the valid username "userName"
    And user enter the valid password "password"
    And User click on Login button
    Then Verify login to application is successful


