package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HomePage extends BasePage {
    public static final By MENU_HOME_LINK = By.xpath("//span[@class='slds-truncate'][text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(BASE_URL + "/lightning/page/home");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        log.debug("Убеждаемся, что перешли на страницу https://ivc3.lightning.force.com/lightning/page/home");
        return isExist(MENU_HOME_LINK);
    }
}