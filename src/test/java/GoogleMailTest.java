import org.testng.annotations.*;
import pages.AuthorizationPageMethods;
import pages.HomePageMethods;
import pages.MailPageMethods;
import tools.ConfigProperties;


public class GoogleMailTest extends BaseTest{

    private HomePageMethods homePage;
    private AuthorizationPageMethods authorizationPage;
    private MailPageMethods mailPage;

    @BeforeMethod
    public void setUpMethods(){
        homePage = new HomePageMethods();
        authorizationPage = new AuthorizationPageMethods();
        mailPage = new MailPageMethods();
    }

    @Test(priority = 0, description="Open Google mail and send an email with the information found.")
    public void sendEmail() throws InterruptedException {
        homePage.openGoogleMailHomePage();
        homePage.clickAuthorizationButton();
        authorizationPage.enterLogin(ConfigProperties.getPropertyValue("login"));
        authorizationPage.clickLoginNextButton();
        authorizationPage.enterPassword(ConfigProperties.getPropertyValue("password"));
        authorizationPage.clickPasswordNextButton();
        mailPage.findLetter(ConfigProperties.getPropertyValue("recipient"));
        int numberLetters = mailPage.giveNumberLetter();
        mailPage.writeLetterButton();
        mailPage.enterRecipient(ConfigProperties.getPropertyValue("login_recipient"));
        mailPage.enterTopic(ConfigProperties.getPropertyValue("topic"));
        mailPage.enterText(ConfigProperties.getPropertyValue("text") + numberLetters);
        //mailPage.clickSendLetterButton();
    }

}
