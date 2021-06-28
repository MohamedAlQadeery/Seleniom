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

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email_input;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement password_input;

     @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement signin_btn;
    
        @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]")
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
