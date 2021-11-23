package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputField {

    WebDriver driver;
    String label;

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    private static final String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor:" +
            ":div[contains(@class,'uiInput')]//input";

    public void writeTextOnTheInputField(String text) {
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }
}