package pages;

import elements.*;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsModalPage extends BasePage {

    public static final By MODAL_TITLE = By.xpath("//*[contains(@class,'slds-modal__title')]");

    public ContactsModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public ContactsDetailsPage create(Contact contact) {
        new InputContacts(driver, "Phone").write(contact.getPhone());
        new DropDownContacts(driver, "Salutation").selectOption(contact.getSalutation());
        new InputContacts(driver, "First Name").write(contact.getFirstName());
        new InputContacts(driver, "Last Name").write(contact.getLastName());
        new InputContacts(driver, "Mobile").write(contact.getMobile());
        new DropDownFindContacts(driver, "Account Name").selectOption(contact.getAccountName());
        new InputContacts(driver, "Email").write(contact.getEmail());
        new InputContacts(driver, "Title").write(contact.getTitle());
        new DropDownFindContacts(driver, "Reports To").selectOption(contact.getReportsTo());
        new TextareaContacts(driver, "Mailing Street").write(contact.getMailingStreet());
        new InputContacts(driver, "Mailing City").write(contact.getMailingCity());
        new InputContacts(driver, "Mailing State/Province").write(contact.getMailingState());
        new InputContacts(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());
        new InputContacts(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextareaContacts(driver, "Other Street").write(contact.getOtherStreet());
        new InputContacts(driver, "Other City").write(contact.getOtherCity());
        new InputContacts(driver, "Other State/Province").write(contact.getOtherState());
        new InputContacts(driver, "Other Zip/Postal Code").write(contact.getOtherZip());
        new InputContacts(driver, "Other Country").write(contact.getOtherCountry());
        new InputContacts(driver, "Fax").write(contact.getFax());
        new InputContacts(driver, "Department").write(contact.getDepartment());
        new InputContacts(driver, "Home Phone").write(contact.getHomePhone());
        new DropDownContacts(driver, "Lead Source").selectOption(contact.getLeadSource());
        new InputContacts(driver, "Other Phone").write(contact.getOtherPhone());
        new InputContacts(driver, "Birthdate").write(contact.getBirthdate());
        new InputContacts(driver, "Asst. Phone").write(contact.getAsstPhone());
        new InputContacts(driver, "Assistant").write(contact.getAssistant());
        new TextareaContacts(driver, "Description").write(contact.getDescription());

        return clickSave();
    }

    public ContactsDetailsPage clickSave() {
        driver.findElement(SAVE_CONTACT_BUTTON).click();
        return new ContactsDetailsPage(driver);
    }

}
