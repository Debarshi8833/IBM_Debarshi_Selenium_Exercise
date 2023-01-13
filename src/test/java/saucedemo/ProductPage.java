package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProductPage extends BaseTest{
    
public WebDriver ldriver;
public String ele;


	public ProductPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}

    // identification
    
	By addedproduct = By.className("inventory_item_name");
    By filter = By.xpath("//span[@class='active_option']");  
    By firstproduct = By.id("add-to-cart-sauce-labs-backpack");
    By lastproduct = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By cartvalue = By.xpath("//span[@class='shopping_cart_badge']");
    By cart = By.className("shopping_cart_link");
    By removefirstproduct = By.id("remove-sauce-labs-backpack");
	By continueshopping = By.id("continue-shopping");
	    
    
    // Methods
	
	public String filtervalue() {

    	String fil = ldriver.findElement(filter).getText();
		return fil;
    	              
    }
    
    public String addedproduct() {

    	String ap = ldriver.findElement(addedproduct).getText();
		return ap;
    	              
    }
           
    public void addfirstproduct() {

        ldriver.findElement(firstproduct).click();


    }
    
    public void addlastproduct() {

        ldriver.findElement(lastproduct).click();

    }
    
    public String cartvalue() {

    	String ele = ldriver.findElement(cartvalue).getText();
		return ele;
    	              
    }
    
    public void removefirstproduct() {

        ldriver.findElement(removefirstproduct).click();

    }
    
    public void cart() {

        ldriver.findElement(cart).click();

    }
    
        
    public void verificationOfDefaultFilter(String expectedValue) {
        
        Assert.assertEquals(filtervalue(), expectedValue);
        
        
    }
    
    public void verificationOfAddedProduct(String expectedValue) {
        
        Assert.assertEquals(addedproduct(), expectedValue);
        
        
    }

    
      
}

