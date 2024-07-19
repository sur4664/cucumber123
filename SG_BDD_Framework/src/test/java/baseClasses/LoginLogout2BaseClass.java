package baseClasses;

import driver.CucumberTestRunner;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginLogout2BaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appDep.navigateURL(oBrowser, input.get(0).get("appURL"), input.get(0).get("appPageTitle")));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyUserNameSetSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appInd.setObject(oBrowser, LoginPage.obj_UserName_Edit, input.get(0).get("userName")));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyUserNameSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyUserNameSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyPasswordSetSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appInd.setObject(oBrowser, LoginPage.obj_Password_Edit, input.get(0).get("password")));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyLoginToActiTimeWasSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            boolean blnRes = appInd.verifyText(oBrowser, HomePage.obj_HomePage_Title, "Text", input.get(0).get("HomePageTitle"));
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
