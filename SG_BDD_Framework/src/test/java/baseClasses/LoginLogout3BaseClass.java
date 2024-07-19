package baseClasses;

import driver.CucumberTestRunner;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginLogout3BaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, String appURL, String pageTitle){
        try{
            Assert.assertTrue(appDep.navigateURL(oBrowser, appURL, pageTitle));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyUserNameSetSuccessful(WebDriver oBrowser, String userName){
        try{
            Assert.assertTrue(appInd.setObject(oBrowser, LoginPage.obj_UserName_Edit, userName));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyUserNameSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyUserNameSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyPasswordSetSuccessful(WebDriver oBrowser, String password){
        try{
            Assert.assertTrue(appInd.setObject(oBrowser, LoginPage.obj_Password_Edit, password));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyLoginToActiTimeWasSuccessful(WebDriver oBrowser, String homePageTitle){
        try{
            boolean blnRes = appInd.verifyText(oBrowser, HomePage.obj_HomePage_Title, "Text", homePageTitle);
            if(blnRes) {
                //Handle the shortcut window
                if(appInd.verifyOptionalElementPresent(oBrowser, HomePage.obj_ShortCut_Window)){
                    Assert.assertTrue(appInd.clickObject(oBrowser, HomePage.obj_ShortBy_Close_Button));
                }
                return true;
            }else return false;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyLoginToActiTimeWasSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyLoginToActiTimeWasSuccessful()' method. " + e);
            return false;
        }
    }
}
