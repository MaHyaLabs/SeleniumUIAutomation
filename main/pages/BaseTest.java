package main.pages;

import main.Util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;

    //Logger log = Logger.getLogger("seleniumautomation");

    public BaseTest(){

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/"
                    + "config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/main/Util/chromedriver.exe");
      //  ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //ChromeDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        Log.info("Selenium Test intialization completed");
        driver.get(prop.getProperty("SauceLabsURL"));
}
}
