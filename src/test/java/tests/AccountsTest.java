package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Log4j2
public class AccountsTest extends BaseTest {

    @Test(description = "Создание нового аккаунта  с валидными параметрами", priority = 2)
    public void accountCreation() {
        log.info("Старт теста accountCreation");
        loginPage
                .open()
                .login("dmitrykhilko-ulle@force.com", "12qwasXZ");
        boolean isAccountModalOpen = accountsListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isAccountModalOpen, "Диалоговое окно создания нового аккаунта не открылось");

        Account account = AccountFactory.get("TestParent", "Investor", "Banking", "30", "Описание фирмы");

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        assertTrue(isDetailsPageOpen, "Страница Details не открылась");

        log.debug("Проверяем, сохранился ли созданный аккаунт");
        assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "Имя аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldParentAccountByName("Parent Account"), account.getParentAccount(), "Имя родительского аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Phone"), account.getPhone(), "Телефон аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Website"), account.getWebSite(), "Сайт аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "Тип аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(), "Отрасль деятельности не сохранилась");
        assertEquals(accountDetailsPage.getFieldValueByName("Description"), account.getDescription(), "Описание аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldEmployeesValueByName("Employees"), account.getEmployees(), "Количество сотрудников аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldAdressValueByName("Billing Address"), account.getBillingAddress(), "Адрес для выставления счета сохранился неверно");
        assertEquals(accountDetailsPage.getFieldAdressValueByName("Shipping Address"), account.getShippingAddress(), "Адрес для доставки сохранился неверно");
        log.info("Завершение теста accountCreation");
    }
}
