/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import Features.AuthenticationPage;
import Features.HomePage;
import Features.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Gf63
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    private static WebDriver d = null;
    private static HomePage homePage;
    public static void initChromeDriver() {
        d = new ChromeDriver();

         homePage = HomePage.navigateTo(d);

    }

    public static void searchTest() {
        SearchResultsPage resultsPage = homePage.searchFor("dress");
        System.out.println(resultsPage.getTopResultTitle());
    }

    //checks if not registerd user can login or not
    public static void authTest() {
        AuthenticationPage authPage = homePage.redirectToAuthPage();
        authPage.login();
        System.out.println(authPage.getAlertLabelText());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        initChromeDriver();
        
        //just un comment the method for testing 
//        searchTest();
//        authTest();
        
 
    }

}
