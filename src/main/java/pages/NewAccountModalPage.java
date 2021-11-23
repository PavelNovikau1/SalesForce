package pages;

import elements.InputField;
import elements.TextAreaForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends HeaderPage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEW_ACCOUNT_URL = "https://qaonl.lightning.force.com/lightning/o/Account/new";
    public static final String SAVE_BUTTON_XPATH = "//*[contains(@class,'forceActionButton')]//*[text()='Save']";

    public void createNewAccount(String accountName, String webSite, String description) {
        openPage(NEW_ACCOUNT_URL);
        new InputField(driver, "Account Name").writeTextOnTheInputField(accountName);
        new InputField(driver, "Website").writeTextOnTheInputField(webSite);
        new TextAreaForm(driver, "Description").writeTextInTheTextAreaField(description);
        clickSave();
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
