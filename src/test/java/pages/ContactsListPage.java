package pages;

import org.openqa.selenium.WebDriver;

public class ContactsListPage extends BasePage {

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }

    public ContactsListPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/list?filterName=Recent");
        return this;
    }

    public ContactsModalPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new ContactsModalPage(driver);
    }
}
