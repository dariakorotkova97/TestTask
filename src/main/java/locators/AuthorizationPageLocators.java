package locators;

import org.openqa.selenium.By;
/**Локаторы для страницы авторизации*/
public class AuthorizationPageLocators {
    public static final By LOGIN_FIELD = By.xpath("//*[@id='identifierId']");
    public static final By LOGIN_NEXT_BUTTON = By.xpath("//*[@id='identifierNext']");
    public static final By PASSWORD_NEXT_BUTTON = By.xpath("//span[contains(text(),'Далее')]");
    public static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
}
