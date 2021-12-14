package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage extends BasePage {

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }

    public AccountsListPage open() {
        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    public AccountModalPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
}
