package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected AccountsListPage accountsListPage;
    protected AccountsModalPage accountModalPage;
    protected AccountsDetailsPage accountDetailsPage;
    protected ContactsListPage contactsListPage;
    protected ContactsModalPage contactsModalPage;
    protected ContactsDetailsPage contactsDetailsPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless"); // Хром запущен без UI. Тесты ускоряются и становятся более стабильными
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountsListPage = new AccountsListPage(driver);
        accountModalPage = new AccountsModalPage(driver);
        accountDetailsPage = new AccountsDetailsPage(driver);
        contactsListPage = new ContactsListPage(driver);
        contactsModalPage = new ContactsModalPage(driver);
        contactsDetailsPage = new ContactsDetailsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}