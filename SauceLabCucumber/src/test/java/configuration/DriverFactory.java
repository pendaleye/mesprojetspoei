// src/test/java/com/example/automation/configuration/DriverFactory.java
package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.net.URL;
//import java.net.m
public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("profile.default_content_settings.popups", 0);
            options.addArguments("--incognito");
            options.setExperimentalOption("prefs", prefs);
           // driver = new ChromeDriver(options);
            //configuration selenium grid au lieu du chrome
            EdgeOptions options1= new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
            ChromeOptions options2 = new ChromeOptions();

        try {
            driver = new RemoteWebDriver(new URL("http://172.16.14.110:4444/wd/hub"),options2);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
