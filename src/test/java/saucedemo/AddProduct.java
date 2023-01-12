package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test 
public class AddProduct extends BaseTest{
    
    
     public void verifyAddProduct() throws Exception {
        
        Thread.sleep(3000);
        log.info("Before login application title is " + driver.getTitle());
        lp.verificationOfApplicationTitle("Swag Labs");
        log.info("enter userName");
        lp.enterUserName(conf.get_saucedemo_User());
        log.info("enter password");
        lp.enterPassword(conf.get_saucedemo_Pass());
        log.info("click on login button");
        lp.clickLoginButton();
        Thread.sleep(3000);
        log.info("After login The Default Flter Dropdown is " + pp.filtervalue());
        pp.verificationOfDefaultFilter("NAME (A TO Z)");
        // log.info("The Default Filter Dropdown is " + pp.filtervalue());
        log.info("Select First Product");
        pp.addfirstproduct();
        Thread.sleep(2000);
        log.info("Cart Value is: " + pp.cartvalue());
        log.info("Select Last Product");
        pp.addlastproduct();     
        Thread.sleep(2000);
        log.info("Cart Value is: " + pp.cartvalue());
        log.info("Remove First Product");
        pp.removefirstproduct();
        Thread.sleep(2000);
        log.info("Cart Value is: " + pp.cartvalue());
                
    }

}