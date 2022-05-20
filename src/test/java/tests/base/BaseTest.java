package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.login.LoginPage;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);

    public void delay(int timeout) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

