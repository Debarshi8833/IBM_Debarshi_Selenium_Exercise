package saucedemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {

	public WebDriver driver;
	public ReadConfig conf;
	public Logger log;
	public LoginPage lp;
	public ProductPage pp;
	

    @BeforeTest
    public void launchApp() throws Exception {

        log = Logger.getLogger("SauceDemo Application Module");
        PropertyConfigurator.configure(".\\testData\\log4j.properties");

        log.info("launching application");
        // System.out.println("launching application");

        // create an Object on ReadConfig file
        conf = new ReadConfig();
        
        log.info("Application URL: " + conf.get_saucedemo_URL());

        driver = WebDriverManager.chromedriver().create();
        driver.get(conf.get_saucedemo_URL());
        log.info("Application launched successfully into chrome browser " + conf.get_saucedemo_URL());
        
        driver.manage().window().maximize();


        
        lp = new LoginPage(driver);
        pp = new ProductPage (driver);

    }

    @AfterTest
    public void closeApp() throws Exception {

        Thread.sleep(5000);
        driver.close();
        log.info("closing application");
        // System.out.println("closing application");
    }

}
