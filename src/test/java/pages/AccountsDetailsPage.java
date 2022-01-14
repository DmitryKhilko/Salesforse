package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountsDetailsPage extends BasePage {

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    String vieldValue = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text"; //Type, Industry, Account Name, Description, Annual Revenue
    String vieldParentAccount = "//span[text()='Parent Account']/../../div[@class='slds-form-element__control']//a/slot/slot/span"; //Parent Account
    String vieldCommunicationValue = "//span[@class='test-id__field-label'][text()='%s']/../../..//a"; //Phone, Fax, Website
    String vieldEmployeesValue = "//span[@class='test-id__field-label'][text()='%s']/ancestor::force-record-layout-item//lightning-formatted-number"; //Employees
    String vieldAdressValue = "//span[text()='%s']/ancestor::force-record-layout-item//a"; // Adress Information

    public AccountsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.debug("Переходим на страницу AccountsDetailsPage");
        driver.findElement(DETAILS_LINK).click();
        return isExist(DETAILS_LINK);
    }

    public String getFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldValue, fieldName))).getText();
    }

    public String getFieldParentAccountByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldParentAccount, fieldName))).getText();
    }

    public String getFieldCommunicationValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldCommunicationValue, fieldName))).getText();
    }

    public String getFieldEmployeesValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldEmployeesValue, fieldName))).getText();
    }

//    public String getFieldAnnualRevenueValueByName(String fieldName) {
//        String s = driver.findElement(By.xpath(String.format(vieldValue, fieldName))).getText();
//        //Значение вида $1,000,000 приводим к виду 1000000
//        return s.replaceAll("[,$]", "");
//    }

    public String getFieldAdressValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldAdressValue, fieldName))).getText();
    }
}

