/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Features.AuthenticationPage;
import Features.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Gf63
 */
public class AuthTest extends SuperTestNG{
    
    static   AuthenticationPage authPage;

    
 @Test(priority = 1)
    public static void clickSigninButton() {
        Reporter.log("click the sign in btn.........");
      authPage=  homepage.redirectToAuthPage();
    }

//    checks if not registerd user can login to the system
    @Test(priority = 2)
    public static void checkIfCanLogin() {
        Reporter.log("checks if not registerd user can login to the system");
         authPage = homepage.redirectToAuthPage();
         authPage.login();
        Assert.assertNotSame(authPage.getAlertLabelText(),"There is 1 error Authentication failed.");
    }
}
