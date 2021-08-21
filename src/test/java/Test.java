import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
   // properties prop;

  //  @Test
    void openBrowser(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/ext-files/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


    }
}
