package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownFindContacts {

    // Account Name (TestAccountName), Reports To (Piter Petrov)
    String dropdownLocator = "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-grouped-combobox//input";
    String optionLocator = "//span[text()='%s']";

    WebDriver driver;
    String label;

    public DropDownFindContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Выбираем пункт '%s' из раскрывающегося списка '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}