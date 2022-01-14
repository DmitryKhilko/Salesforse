package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class InputAccounts {

    String inputLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    String inputLocatorDescription = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//textarea";

    WebDriver driver;
    String label;

    public InputAccounts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        //System.out.printf("Запись текста '%s' в поле ввода '%s'\n", text, this.label);
        log.debug(String.format("Записываем текст '%s' в поле ввода '%s'", text, this.label));
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }

    public void writeDescription(String text) {
        //System.out.printf("Запись текста '%s' в поле ввода '%s'\n", text, this.label);
        log.debug(String.format("Записываем текст '%s' в поле ввода '%s'", text, this.label));
        driver.findElement(By.xpath(String.format(inputLocatorDescription, this.label))).sendKeys(text);
    }

}
