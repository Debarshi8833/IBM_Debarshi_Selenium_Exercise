package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
		

	}
    // identification
    
      
    By txtUser = By.id("user-name");
    By txtPass = By.id("password");
    By btnLogin = By.id("login-button");
    
    
    // Methods

    public void enterUserName(String username) {

        ldriver.findElement(txtUser).sendKeys(username);

    }

        
    public void enterPassword(String password) {

                ldriver.findElement(txtPass).sendKeys(password);

    }

    
    public void clickLoginButton() {

        ldriver.findElement(btnLogin).click();


    }

    
    public void verificationOfApplicationTitle(String expectedValue) {
        
        Assert.assertEquals(ldriver.getTitle(), expectedValue);
        
        
    }

}

