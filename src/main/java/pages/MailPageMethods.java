package pages;

import io.qameta.allure.Step;
import locators.MailPageLocators;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MailPageMethods extends MailPageLocators {

    @Step("Find emails by sender")
    public void findLetter(String name){
        $(SEARCH_FIELD_BY_MAIL).shouldBe(visible).val(name).pressEnter();
    }

    @Step("Get the number of letters from the sender")
    public int giveNumberLetter() throws InterruptedException {
        Thread.sleep(2000);
        String count = $(COUNT_LETTERS).getText();
        for(int i=0; i<count.length(); i++) {
            if(count.charAt(i)>'0' && count.charAt(i)<'9') {
                return Integer.parseInt(count.substring(count.indexOf('з') + 2));
            }
        }
        System.out.println("Нет писем от этого отправителя.");
        return 0;
    }

    @Step("Press the button \"Write a letter\"")
    public void writeLetterButton(){
        $(WRITE_LETTER_BUTTON).click();
    }

    @Step("Enter the sender in the \"To\" field")
    public void enterRecipient(String email) {
        $(RECIPIENT).val(email);
    }

    @Step("Enter the subject of the letter in the field \"Subject\"")
    public void enterTopic(String topic) {
        $(TOPIC).val(topic);
    }

    @Step("Enter the text of the letter in the field \"Text\"")
    public void enterText(String text) {
       $(TEXT).val(text);
    }

    @Step("Click \"Send\"")
    public void clickSendLetterButton(){
        $(SEND_LETTER_BUTTON).click();
    }
}
