package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final String URL = "https://qaonl.lightning.force.com/";
    public static final String LOGIN = "pablotest-t34f@force.com";
    public static final String PASSWORD = "Gq2KPsXekAb*ySd%";
    public static final By LOGIN_BUTTON = By.xpath("//*[@id='Login']");

    public void login(){
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
