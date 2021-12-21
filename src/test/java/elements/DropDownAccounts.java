package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownAccounts {
    String dropdownLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]/div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class,'visible')]//a[text()='%s']";


    WebDriver driver;
    String label;

    public DropDownAccounts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Выбираем пункт '%s' из раскрывающегося списка '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
