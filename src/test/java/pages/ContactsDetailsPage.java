package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsDetailsPage extends BasePage {

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    // Phone, Mobile, Fax, Home Phone, Other Phone, Asst. Phone, Email, Mailing Address, Other Address
    String outputALocator = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[text()='%s']/ancestor::force-record-layout-item//a";
    // Account Name, Reports To
    String outputSLocator = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[text()='%s']/ancestor::force-record-layout-item//a//span";
    //Name
    String outputFNLocator = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-name";
    // Assistant, Department, Lead Source, Birthdate, Title, Description, Type
    String outputFTLocator = "//div[@class='windowViewMode-normal oneContent active lafPageHost']//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public String getFieldValueByNameA(String fieldName) {
        return driver.findElement(By.xpath(String.format(outputALocator, fieldName))).getText();
    }

    public String getFieldValueByNameS(String fieldName) {
        return driver.findElement(By.xpath(String.format(outputSLocator, fieldName))).getText();
    }

    public String getFieldValueByNameFN(String fieldName) {
        return driver.findElement(By.xpath(String.format(outputFNLocator, fieldName))).getText();
    }

    public String getFieldValueByNameFT(String fieldName) {
        return driver.findElement(By.xpath(String.format(outputFTLocator, fieldName))).getText();
    }
}
