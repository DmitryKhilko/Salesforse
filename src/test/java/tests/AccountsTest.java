package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountsTest extends BaseTest {
    @Test
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
                "TestAccountName", "", "2-1067", "2-1033", "www.onliner.by",
                "Investor", "Banking", "30", "1000000", "Описание фирмы",
                "ул. Маяковского, 15", "г. Минск", "Московский", "222222",
                "РБ", "ул. Маяковского, 15", "г. Минск", "Московский",
                "222222", "РБ");


        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        assertTrue(isDetailsPageOpen, "Страница Details не открылась");

        assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "Имя аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Phone"), account.getPhone(), "Телефон аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Fax"), account.getFax(), "Факс аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldCommunicationValueByName("Website"), account.getWebSite(), "Сайт аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldBusinessValueByName("Type"), account.getType(), "Тип аккаунта не сохранился");
        assertEquals(accountDetailsPage.getFieldBusinessValueByName("Industry"), account.getIndustry(), "Отрасль деятельности не сохранилась");
        assertEquals(accountDetailsPage.getFieldDescriptionValueByName("Description"), account.getDescription(), "Описание аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldEmployeesValueByName("Employees"), account.getEmployees(), "Количество сотрудников аккаунта не сохранилось");
        assertEquals(accountDetailsPage.getFieldAnnualRevenueValueByName("Annual Revenue"), account.getAnnualRevenue(), "Сумма годового дохода не сохранилась");
        assertEquals(accountDetailsPage.getFieldAdressValueByName("Billing Address"), account.getBillingAddress(), "Адрес для выставления счета сохранился неверно");
        assertEquals(accountDetailsPage.getFieldAdressValueByName("Shipping Address"), account.getShippingAddress(), "Адрес для доставки сохранился неверно");
    }
}
