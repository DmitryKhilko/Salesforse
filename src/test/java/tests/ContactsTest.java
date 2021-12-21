package tests;

import models.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContactsTest extends BaseTest {
    @Test(description = "Создание нового контакта  с валидными параметрами", priority = 3)
    public void contactCreation() {
        loginPage
                .open()
                .login("dmitrykhilko-qyxj@force.com", "12qwasXZ");
        boolean isContactsModalOpen = contactsListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isContactsModalOpen, "Диалоговое окно создания нового контакта не открылось");

        Contact contact = new Contact(
                "4-5657", "Mr.", "Ivan", "Ivanov", "+375293584541",
                "TestAccountName", "ivanov@email.com", "Title", "Piter Petrov",
                "ул.Кальварийская, 1", "г. Минск", "Московский район", "222222",
                "РБ", "ул.Ленина, 21В", "г. Берёза", "Брестская область",
                "333333", "РБ", "4-5543", "отдел продаж", "2-1067",
                "On Site", "2-8898", "2/11/1973", "4-4041", "Olga Sidorova",
                "Текст описания контакта");
        boolean isDetailsPageOpen = contactsModalPage
                .create(contact)
                .isPageOpen();
        assertTrue(isDetailsPageOpen, "Страница ContactsDetails не открылась");

        assertEquals(contactsDetailsPage.getFieldValueByNameFN("Name"), contact.getName(), "Имя контакта не сохранилось");
        assertEquals(contactsDetailsPage.getFieldValueByNameS("Account Name"), contact.getAccountName(), "Имя аккаунта не сохранилось");
        assertEquals(contactsDetailsPage.getFieldValueByNameFT("Title"), contact.getTitle(), "Заголовок не сохранился");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Phone"), contact.getPhone(), "Телефон не сохранился");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Mobile"), contact.getMobile(), "Мобильный телефон не сохранился");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Email"), contact.getEmail(), "Электронная почта не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameS("Reports To"), contact.getReportsTo(), "Информация о подотчетности не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Mailing Address"), contact.getMailingAddress(), "Информация почтовом адресе не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Other Address"), contact.getOtherAddress(), "Информация об ином адресе не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Fax"), contact.getFax(), "Информация о факсе не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Home Phone"), contact.getHomePhone(), "Информация о домашнем телефоне не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Other Phone"), contact.getOtherPhone(), "Информация об ином телефоне не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameA("Asst. Phone"), contact.getAsstPhone(), "Информация о телефоне ассистента не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameFT("Assistant"), contact.getAssistant(), "Информация об ассистенте не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameFT("Description"), contact.getDescription(), "Описание контакта не сохранилось");
        assertEquals(contactsDetailsPage.getFieldValueByNameFT("Department"), contact.getDepartment(), "Информация о подразделении клиента не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameFT("Lead Source"), contact.getLeadSource(), "Информация об источнике информации не сохранилась");
        assertEquals(contactsDetailsPage.getFieldValueByNameFT("Birthdate"), contact.getBirthdate(), "Информация о дне рождения контакта не сохранилась");
    }
}
