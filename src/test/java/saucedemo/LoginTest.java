package saucedemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    
    
    @Test
    public void verifyLoginFeature() throws Exception {
        
        Thread.sleep(3000);
        //before login application title should be
        log.info("before login application title should be " + driver.getTitle());
        lp.verificationOfApplicationTitle("Swag Labs");
        
        log.info("enter userName");
        lp.enterUserName(conf.get_saucedemo_User());
        log.info("enter password");
        lp.enterPassword(conf.get_saucedemo_Pass());
        log.info("click on login button");
        lp.clickLoginButton();
        
        
        Thread.sleep(3000);
        
    }

}