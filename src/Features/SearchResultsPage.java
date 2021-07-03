/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Gf63
 */
public class SearchResultsPage {
    private WebDriver driver;
	
	@FindBy(xpath = Locators.Locators.TOP_RESULT_TITLE)
	private WebElement topResultTitle;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTopResultTitle() {
		return topResultTitle.getText();
	}
}
