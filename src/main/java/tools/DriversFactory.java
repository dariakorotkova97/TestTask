package tools;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriversFactory {

    public void setWebDriver (String browserName) throws InstantiationException, MalformedURLException {
        if ("chrome".equals(browserName)) {
            RemoteWebDriver driver =new RemoteWebDriver(new URL(ConfigProperties.getPropertyValue("url_hub")),
                    DesiredCapabilities.chrome());
            WebDriverRunner.setWebDriver(driver);
        } else if ("internet explorer".equals(browserName)) {
            RemoteWebDriver driver =new RemoteWebDriver(new URL(ConfigProperties.getPropertyValue("url_hub")),
                    DesiredCapabilities.internetExplorer());
            DesiredCapabilities.internetExplorer().setCapability("requireWindowFocus", true);
            WebDriverRunner.setWebDriver(driver);
        } else {
            throw new InstantiationException("Browser is not instantiated");
        }
    }
}
