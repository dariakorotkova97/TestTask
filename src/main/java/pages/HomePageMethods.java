package pages;

import io.qameta.allure.Step;
import locators.HomePageLocators;
import tools.ConfigProperties;

import static com.codeborne.selenide.Selenide.*;


public class HomePageMethods extends HomePageLocators{

    @Step("Open the main page of google mail")
    public void openGoogleMailHomePage(){
        open(ConfigProperties.getPropertyValue("url_home"));
    }

    @Step("Press the \"enter\" button")
    public void clickAuthorizationButton(){
        $(AUTHORIZATION_BUTTON).click();
    }
}
