package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class YourCartPage extends BaseTest{
    
public WebDriver ldriver;


	public YourCartPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}

    // identification
    
	By addedproduct = By.className("inventory_item_name");
	By continueshopping = By.id("continue-shopping");
    
    
    // Methods

        
    public String addedproduct() {

    	String ap = ldriver.findElement(addedproduct).getText();
		return ap;
    	              
    }
           
    public void continueshopping() {

        ldriver.findElement(continueshopping).click();


    }
    
     
    public void verificationOfAddedProduct(String expectedValue) {
        
        Assert.assertEquals(addedproduct(), expectedValue);
        
        
    }

    
      
}

