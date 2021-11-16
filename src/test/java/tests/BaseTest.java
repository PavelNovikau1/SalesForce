package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HeaderPage;
import pages.LoginPage;
import pages.NewAccountModalPage;
import pages.NewCreatedAccountPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    HeaderPage headerPage;
    NewAccountModalPage newAccountModalPage;
    NewCreatedAccountPage newCreatedAccountPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        newCreatedAccountPage = new NewCreatedAccountPage(driver);
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
}
