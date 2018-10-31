package pages;

import io.qameta.allure.Step;
import locators.AuthorizationPageLocators;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPageMethods extends AuthorizationPageLocators {

    @Step("Enter login in the input field")
    public void enterLogin(String login){
        $(LOGIN_FIELD).val(login);
    }

    @Step("Click the button next")
    public void clickLoginNextButton(){
        $(LOGIN_NEXT_BUTTON).shouldBe(visible).click();
    }

    @Step("Click the button next")
    public void clickPasswordNextButton() {
        $(PASSWORD_NEXT_BUTTON).shouldBe(visible).click();
    }

    @Step("Enter password in the input field")
    public void enterPassword(String password){
        $(PASSWORD_FIELD).val(password);
    }
}
