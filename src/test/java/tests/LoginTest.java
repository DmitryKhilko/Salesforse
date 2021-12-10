package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("dmitrykhilko-qyxj@force.com", "12qwasXZ")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
    }
}