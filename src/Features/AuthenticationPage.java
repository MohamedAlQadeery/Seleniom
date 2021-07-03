/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Gf63
 */
public class AuthenticationPage {

    private WebDriver driver;

    @FindBy(xpath = Locators.Locators.EMAIL_INPUT)
    private WebElement email_input;
    @FindBy(xpath = Locators.Locators.PASSWORD_INPUT)
    private WebElement password_input;

     @FindBy(xpath = Locators.Locators.SIGNIN_BUTTON)
    private WebElement signin_btn;
    
        @FindBy(xpath = Locators.Locators.ALERT_LABEL)
     	private WebElement AlertLabel;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login() {
        email_input.sendKeys("test@test.com");
        password_input.sendKeys("123123123");

       signin_btn.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public String getAlertLabelText() {
		return AlertLabel.getText();
	}
}
