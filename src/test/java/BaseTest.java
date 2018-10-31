import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;
import tools.DriversFactory;
import java.net.MalformedURLException;

public class BaseTest {

    @Parameters("BrowserName")
    @BeforeClass
    public void setUp(@Optional String browserName) throws InstantiationException, MalformedURLException {
        (new DriversFactory()).setWebDriver(browserName);
    }

    @AfterClass
    public void tearDown(){
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        WebDriverRunner.closeWebDriver();
    }
}
