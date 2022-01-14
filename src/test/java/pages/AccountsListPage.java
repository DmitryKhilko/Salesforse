package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
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

    public AccountsModalPage clickNew() {
        log.debug("Открываем диалоговое окно создания нового аккаунта");
        driver.findElement(NEW_BUTTON).click();
        return new AccountsModalPage(driver);
    }
}
