package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test(description = "Вход в приложение Salesforse с валидными параметрами", priority = 1)
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("dmitrykhilko-qyxj@force.com", "12qwasXZ")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
    }
}