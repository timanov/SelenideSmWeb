package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By loginFIeld = By.xpath("//*[@id=\"normal_login_username\"]");
    private final By passwordField = By.xpath("//*[@id=\"normal_login_password\"]");
    private final By buttonEnter= By.xpath("//*[@id=\"normal_login\"]/button");
    private String login = "";
    private String password = "";

    public LoginPage inputLogin(String login) {
        log.info("Вводим пароль");
        driver.findElement(loginFIeld).sendKeys(login);
        delay(1000);

        return this;
    }

    public LoginPage inputPassword(String password) {
        log.info("Вводим пароль");
        driver.findElement(passwordField).sendKeys(password);
        delay(1000);

        return this;
    }

    public LoginPage clickLoginBtn() {
        log.info("Нажимаем кнопку [Войти]");
        driver.findElement(buttonEnter).click();
        delay(1000);

        return this;
    }
}
