package tests;

import models.Account;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountsTest extends BaseTest {

    @Test(description = "Создание нового аккаунта  с валидными параметрами", priority = 2)
    public void accountCreation() {
        loginPage
                .open()
                .login("dmitrykhilko-qyxj@force.com", "12qwasXZ");
        boolean isAccountModalOpen = accountsListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isAccountModalOpen, "Диалоговое окно создания нового аккаунта не открылось");

        Account account = new Account(
                "TestAccountName", "TestParent", "2-1067", "2-1033", "www.onliner.by",
                "Investor", "Banking", "30", "1000000", "Описание фирмы",
                "ул. Маяковского, 15", "г. Минск", "Московский", "222222",
                "РБ", "ул. Маяковского, 15", "г. Минск", "Московский",
                "222222", "РБ");

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        assertTrue(isDetailsPageOpen, "Страница Details не открылась");

        assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "Имя аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldParentAccountByName("Parent Account"), account.getParentAccount(), "Имя родительского аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Phone"), account.getPhone(), "Телефон аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Fax"), account.getFax(), "Факс аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Website"), account.getWebSite(), "Сайт аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "Тип аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(), "Отрасль деятельности не сохранилась");
        assertEquals(accountDetailsPage.getFieldValueByName("Description"), account.getDescription(), "Описание аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldEmployeesValueByName("Employees"), account.getEmployees(), "Количество сотрудников аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldAnnualRevenueValueByName("Annual Revenue"), account.getAnnualRevenue(), "Сумма годового дохода не сохранилась");
        assertEquals(accountDetailsPage.getFieldAdressValueByName("Billing Address"), account.getBillingAddress(), "Адрес для выставления счета сохранился неверно");
        assertEquals(accountDetailsPage.getFieldAdressValueByName("Shipping Address"), account.getShippingAddress(), "Адрес для доставки сохранился неверно");
    }
}
