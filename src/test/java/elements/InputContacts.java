package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputContacts {

    // Last Name, First Name, Phone, Mobile, Email, Title, Mailing City, Mailing State/Province, Mailing Zip/Postal Code,
    // Mailing Country, Other City, Other State/Province, Other Zip/Postal Code, Other Country, Fax, Department, Home Phone,
    // Other Phone, Birthdate, Asst. Phone, Assistant
    String inputLocator = "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-input//input";

    WebDriver driver;
    String label;

    public InputContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Запись текста '%s' в поле ввода '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }
}