import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public static Properties prop;

 @BeforeSuite
    void initialization() {
        prop = new Properties();
        try {
            FileInputStream configfile = new FileInputStream(System.getProperty("user.dir") + "/src/main/config/config.properties");
            prop.load(configfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void openBrowser(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/ext-files/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println(prop.getProperty("Name"));

    }
}
