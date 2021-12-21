package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextareaContacts {

    //Mailing Street, Other Street, Description
    String textareaLocator = "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String label;

    public TextareaContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Запись текста '%s' в поле ввода '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).sendKeys(text);
    }
}
