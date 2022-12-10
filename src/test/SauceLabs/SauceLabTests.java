package test.SauceLabs;

import main.Util.Log;
import main.pages.BaseTest;
import main.pages.SwagLabs.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLabTests extends BaseTest {

    LoginPage loginPage;

    public SauceLabTests(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }
    @Test(priority=3)
    public void loginTest(){

        loginPage.loginToSauceLabs();
    }

    @Test
    public void testHelloWorld() {
        Log.debug("Sample DEBUG message");
        Log.error("Sample ERROR message");
        Log.info("Sample INFO message");
        Log.warn("Sample WARN message");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
        Log.info("closing browser");
    }

}
