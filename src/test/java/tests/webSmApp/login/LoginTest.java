package tests.webSmApp.login;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static constans.Constant.Urls.TODO_HOME_PAGE;

public class LoginTest extends BaseTest {


    @Test
    public void id1() {
        step1(); //Авторизация
    }


    @Step("1. Авторизация")
    public void step1() {
        basePage.open(TODO_HOME_PAGE);
        loginPage
                .inputLogin("")
                .inputPassword("");
        $(By.name("Войти")).click();
        delay(3000);

    }

}
