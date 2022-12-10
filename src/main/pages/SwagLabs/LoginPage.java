package main.pages.SwagLabs;

import main.Util.Log;
import main.pages.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {

    @FindBy(xpath = ".//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath = ".//input[@id='password']")
    WebElement password;

    @FindBy(xpath = ".//input[@id='login-button']")
    WebElement submitBtn;

    @FindBy(xpath = ".//select[@class='product_sort_container']")
    WebElement cartLogo;



    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void loginToSauceLabs(){
        Log.info("logging into the saucelabs");
      username.sendKeys(prop.getProperty("username"));
      Log.info("entered the username");
      password.sendKeys(prop.getProperty("password"));
      submitBtn.click();
      System.out.println(driver.getTitle());
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//select[@class='product_sort_container']")));
      Log.info("Successfully logged in");
}
    }
