package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseTest {
    public WebDriver driver;
    public String browser = ConfigReader.getProperty("browser");
    public String baseUrl = ConfigReader.getProperty("url");
    public int timeWait = Integer.parseInt(ConfigReader.getProperty("implicitWait"));
    public Map<String, String> prefs = new HashMap<>();

    @BeforeMethod
    public void setUp() {
        switch (browser.toLowerCase()) {
            case "chrome":
                // Ensuite, passe ces options à ton WebDriver
                ChromeOptions options = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("profile.default_content_setting_values.notifications", 2);
                prefs.put("credentials_enable_service", false);
                prefs.put("profile.password_manager_enabled", false);
                prefs.put("profile.default_content_settings.popups", 0);
                options.addArguments("--incognito");
                options.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(options);
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(timeWait));
        driver.get(baseUrl);
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void clickOnButton(String nameOfButton) {
        driver.findElement(By.xpath("//*[self::input or self::button][contains(@id,\"" + nameOfButton + "\")]")).click();
    }

    public void fillForm(Map<String, String> mapForm){
        for (Map.Entry<String, String> elt : mapForm.entrySet()) {
            driver.findElement(By.xpath("//input[contains(@placeholder,\"" + elt.getKey() + "\")]")).sendKeys(elt.getValue());
        }
    }
}
