package baseClasses;

import driver.CucumberTestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginLogout1BaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, String strURL, String pageTitle){
        try{
            Assert.assertTrue(appDep.navigateURL(oBrowser, propData.get(strURL), pageTitle));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyUserNameWasSetSuccessful(WebDriver oBrowser, String userName){
        try{
            Assert.assertTrue(appInd.setObject(oBrowser, LoginPage.obj_UserName_Edit, userName));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyUserNameWasSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyUserNameWasSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyPasswordWasSetSuccessful(WebDriver oBrowser, String password){
        try{
            Assert.assertTrue(appInd.setObject(oBrowser, LoginPage.obj_Password_Edit, password));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyLoginWasSuccessful(WebDriver oBrowser){
        try{
            boolean blnRes = appInd.verifyText(oBrowser, HomePage.obj_HomePage_Title, "Text", "Enter Time-Track");
            if(blnRes) {
                //Handle the shortcut window
                if(appInd.verifyOptionalElementPresent(oBrowser, HomePage.obj_ShortCut_Window)){
                    Assert.assertTrue(appInd.clickObject(oBrowser, HomePage.obj_ShortBy_Close_Button));
                }
                return true;
            }else return false;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }
    }
}
