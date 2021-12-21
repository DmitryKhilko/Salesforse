package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    // Вопрос: Что делать, если в тесте используется несколько разных наборов тестовых данных,
    // как в AccountsTest и ContactsTest?
    // Ответ Коли: Мы передаём в тест String userName, String password.
    //Можем передавать Credentials cred, Account testAccount
    //где Credentials и Account, это объекты классов, которые мы сами придумали и описали.
    @DataProvider (name = "loginData")
    public Object[][] loginData(){
        return new Object[][] {
            {"dmitrykhilko-qyxj@force.com", "12qwasXZ"}
        };
    }

    @Test(description = "Вход в приложение Salesforse с валидными параметрами", priority = 1, dataProvider = "loginData")
    public void login(String userName, String password) {
        boolean isHomePageOpened = loginPage
                .open()
                .login(userName, password)
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
    }
}