package testNGWEB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;

public class RunClass {

    private static final String CURRENT_DIR = System.getProperty("user.dir");

    public static FirefoxOptions firefoxOptions() {
        System.setProperty("webdriver.gecko.driver", CURRENT_DIR + "\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();

        profile.setPreference("network.proxy.type", 0);
        options.setProfile(profile);
        return options;
    }
    WebDriver driver = new FirefoxDriver(firefoxOptions());

    @AfterTest
    public void QuitDriver() {
        driver.quit();
    }
}