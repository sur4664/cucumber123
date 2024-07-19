package stepDefinitions;

import driver.CucumberTestRunner;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class LoginLogout2StepDefinition extends CucumberTestRunner {
    @Given("Verify the URL is loaded properly with proper title")
    public void verifyTheURLIsLoadedProperlyWithProperTitle(DataTable dataTable) {
        Assert.assertTrue(loginLogout2BaseClass.verifyURLLoadedSuccessful(oBrowser, dataTable));
    }

    @And("User enter the valid username")
    public void userEnterTheValidUsername(DataTable dataTable) {
        Assert.assertTrue(loginLogout2BaseClass.verifyUserNameSetSuccessful(oBrowser, dataTable));
    }

    @And("user enter the valid password")
    public void userEnterTheValidPassword(DataTable dataTable) {
        Assert.assertTrue(loginLogout2BaseClass.verifyPasswordSetSuccessful(oBrowser, dataTable));
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        Assert.assertTrue(appInd.clickObject(oBrowser, LoginPage.obj_Login_Button));
    }

    @Then("Verify login to actiTime application is successful")
    public void verifyLoginToActiTimeApplicationIsSuccessful(DataTable dataTable) {
        Assert.assertTrue(loginLogout2BaseClass.verifyLoginToActiTimeWasSuccessful(oBrowser, dataTable));
    }
}
