/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Features.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 *
 * @author Gf63
 */
public class SuperTestNG {
    
        private static WebDriver driver;
       public static HomePage homepage ;


    public SuperTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeSuite
    public static void startDriver() {
        Reporter.log("Call the chrome driver and set the base url");
         System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
       homepage= homepage.navigateTo(driver);


    }


    @AfterSuite
    public static void closeDriver() {
        Reporter.log("Close the chrome driver after all the steps are done");
        driver.close();
    }
}
