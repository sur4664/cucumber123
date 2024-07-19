package stepDefinitions;

import driver.CucumberTestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class LoginLogout1StepDefinition extends CucumberTestRunner {
    @Then("Verify the URL {string} is loaded properly with proper title {string}")
    public void verifyTheURLIsLoadedProperly(String strURL, String pageTitle) {
        Assert.assertTrue(loginLogout1BaseClass.verifyURLLoadedSuccessful(oBrowser, strURL, pageTitle));
    }

    @And("User enter the valid username {string}")
    public void userEnterTheValidUsername(String userName) {
        Assert.assertTrue(loginLogout1BaseClass.verifyUserNameWasSetSuccessful(oBrowser, propData.get("userName")));
    }

    @And("user enter the valid password {string}")
    public void userEnterTheValidPassword(String password) {
        Assert.assertTrue(loginLogout1BaseClass.verifyPasswordWasSetSuccessful(oBrowser, propData.get("password")));
    }

    @And("User click on Login button")
    public void userClickOnLoginButton() {
        Assert.assertTrue(appInd.clickObject(oBrowser, LoginPage.obj_Login_Button));
    }

    @Then("Verify login to application is successful")
    public void verifyLoginToApplicationIsSuccessful() {
        Assert.assertTrue(loginLogout1BaseClass.verifyLoginWasSuccessful(oBrowser));
    }


}
