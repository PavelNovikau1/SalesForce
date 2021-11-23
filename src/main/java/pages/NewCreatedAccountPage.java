package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCreatedAccountPage extends NewAccountModalPage{

    public NewCreatedAccountPage(WebDriver driver) {
        super(driver);
    }

    public static final By NEW_ACCOUNTS_TABLE = By.xpath("//*[@class='custom-truncate uiOutputText']");

    public String getNameOfCreatedAccount() {
      return driver.findElement(NEW_ACCOUNTS_TABLE).getText();
    }
}
