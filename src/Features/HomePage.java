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
public  class HomePage {
    private WebDriver driver;
	
	@FindBy(id="search_query_top")
	private WebElement keywordsField;
	
	@FindBy(name="submit_search")
	private WebElement goButton;
	
        @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement href;
        
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

    public HomePage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public SearchResultsPage searchFor(String searchTerm) {
		keywordsField.sendKeys(searchTerm);
		goButton.click();
		
		return PageFactory.initElements(driver, SearchResultsPage.class);
	}

	public static HomePage navigateTo(WebDriver driver) {
		driver.get("http://automationpractice.com/");
		return PageFactory.initElements(driver, HomePage.class);
	}
        
        public  AuthenticationPage redirectToAuthPage() {
                    href.click();
		return PageFactory.initElements(driver, AuthenticationPage.class);
	}


}
