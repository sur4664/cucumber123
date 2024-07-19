package stepDefinitions;

import driver.CucumberTestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class LoginLogout3StepDefinition extends CucumberTestRunner {
    @Given("Verify the URL {string} is loaded successful with proper title {string}")
    public void verifyTheURLIsLoadedSuccessfulWithProperTitle(String appURL, String pageTitle) {
        Assert.assertTrue(loginLogout3BaseClass.verifyURLLoadedSuccessful(oBrowser, appURL, pageTitle));
    }

    @And("User enters the valid username {string}")
    public void userEntersTheValidUsername(String userName) {
        Assert.assertTrue(loginLogout3BaseClass.verifyUserNameSetSuccessful(oBrowser, userName));
    }

    @And("user enters the valid password {string}")
    public void userEntersTheValidPassword(String password) {
        Assert.assertTrue(loginLogout3BaseClass.verifyPasswordSetSuccessful(oBrowser, password));
    }

    @And("User click on Login button in actiTime")
    public void userClickOnLoginButtonInActiTime() {
       Assert.assertTrue(appInd.clickObject(oBrowser, LoginPage.obj_Login_Button));
    }

    @Then("Verify login to application is successful using {string}")
    public void verifyLoginToApplicationIsSuccessfulUsing(String homePageTitle) {
        Assert.assertTrue(loginLogout3BaseClass.verifyLoginToActiTimeWasSuccessful(oBrowser, homePageTitle));
    }
}
