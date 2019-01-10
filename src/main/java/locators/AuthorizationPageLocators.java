package locators;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class AuthorizationPageLocators {
    public static final By LOGIN_FIELD = xpath("//*[@id='identifierId']");
    public static final By LOGIN_NEXT_BUTTON = xpath("//*[@id='identifierNext']");
    public static final By PASSWORD_NEXT_BUTTON = xpath("//span[contains(text(),'Далее')]");
    public static final By PASSWORD_FIELD = xpath("//input[@name='password']");
}
