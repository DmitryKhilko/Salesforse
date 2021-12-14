package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    String vieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text"; //Account Name, Type
    String vieldCommunicationValue = "//span[@class='test-id__field-label'][text()='%s']/../../..//a"; //Phone, Fax, Website
    String vieldBusinessValue = "//*[@class='test-id__field-label'][text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text"; // Type, Industry
    String vieldDescriptionValue = "//*[@class='test-id__field-label'][text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text"; //Description
    String vieldEmployeesValue = "//span[@class='test-id__field-label'][text()='%s']/ancestor::force-record-layout-item//lightning-formatted-number"; //Employees
    String vieldAnnualRevenueValue = "//span[@class='test-id__field-label'][text()='Annual Revenue']/ancestor::force-record-layout-item//lightning-formatted-text"; //Annual Revenue
    String vieldAdressValue = "//span[text()='%s']/ancestor::force-record-layout-item//a"; // Adress Information

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public String getFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldValue, fieldName))).getText();
    }

    public String getFieldCommunicationValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldCommunicationValue, fieldName))).getText();
    }

    public String getFieldBusinessValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldBusinessValue, fieldName))).getText();
    }

    public String getFieldDescriptionValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldDescriptionValue, fieldName))).getText();
    }

    public String getFieldEmployeesValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldEmployeesValue, fieldName))).getText();
    }

    public String getFieldAnnualRevenueValueByName(String fieldName) {
        String s = driver.findElement(By.xpath(String.format(vieldAnnualRevenueValue, fieldName))).getText();
        //Значение вида $1,000,000 приводим к виду 1000000
        return s.replaceAll("[,$]", "");
    }

    public String getFieldAdressValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(vieldAdressValue, fieldName))).getText();
    }
}

