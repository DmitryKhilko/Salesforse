package pages;

import elements.DropDownAccounts;
import elements.DropDownFindAccounts;
import elements.InputAccounts;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsModalPage extends BasePage {

    public static final By MODAL_TITLE = By.xpath("//*[contains(@class,'inlineTitle')]");

    public AccountsModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public AccountsDetailsPage create(Account account) {
        new InputAccounts(driver, "Account Name").write(account.getAccountName());
        new DropDownFindAccounts(driver, "Parent Account").selectOptionFind(account.getParentAccount());
        new InputAccounts(driver, "Phone").write(account.getPhone());
        new InputAccounts(driver, "Fax").write(account.getFax());
        new InputAccounts(driver, "Website").write(account.getWebSite());

        new DropDownAccounts(driver, "Type").selectOption(account.getType());
        new DropDownAccounts(driver, "Industry").selectOption(account.getIndustry());
        new InputAccounts(driver, "Employees").write(account.getEmployees());
        new InputAccounts(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new InputAccounts(driver, "Description").writeDescription(account.getDescription());

        new InputAccounts(driver, "Billing Street").writeDescription(account.getBillingStreet());
        new InputAccounts(driver, "Billing City").write(account.getBillingCity());
        new InputAccounts(driver, "Billing State/Province").write(account.getBillingState());
        new InputAccounts(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new InputAccounts(driver, "Billing Country").write(account.getBillingCountry());

        new InputAccounts(driver, "Shipping Street").writeDescription(account.getShippingStreet());
        new InputAccounts(driver, "Shipping City").write(account.getShippingCity());
        new InputAccounts(driver, "Shipping State/Province").write(account.getShippingState());
        new InputAccounts(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new InputAccounts(driver, "Shipping Country").write(account.getShippingCountry());

        return clickSave();
    }

    public AccountsDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsDetailsPage(driver);
    }
}
