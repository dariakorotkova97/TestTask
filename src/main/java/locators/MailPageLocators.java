package locators;

import org.openqa.selenium.By;

public class MailPageLocators {
    public static final By SEARCH_FIELD_BY_MAIL = By.name("q");
    public static final By COUNT_LETTERS = By.xpath("//div[@class='aeH']");
    public static final By WRITE_LETTER_BUTTON = By.xpath("//div[@class='z0']/div");
    public static final By RECIPIENT = By.xpath("//textarea[@class='vO']");
    public static final By TOPIC = By.xpath("//input[@class='aoT']");
    public static final By TEXT = By.xpath("//div[@role='textbox']");
    public static final By SEND_LETTER_BUTTON = By.xpath("//tr[@class='btC']//div[@role='button']");

}
