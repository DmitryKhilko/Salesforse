package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DropDownFindAccounts {

    String dropdownLocator = "//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input"; //Parent Account
    String optionLocator = "//div[@title='%s']"; //TestAccountNameParent

    WebDriver driver;
    String label;

    public DropDownFindAccounts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOptionFind(String option) {
        //System.out.printf("Выбираем пункт '%s' из раскрывающегося списка '%s'\n", option, this.label);
        log.debug(String.format("Выбираем пункт '%s' из раскрывающегося списка '%s'", option, this.label));
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
