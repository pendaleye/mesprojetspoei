package configuration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import configuration.DriverFactory ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static configuration.DriverFactory.driver;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
    }


    @After
    public void tearDown(Scenario monscenario) throws IOException {
        /*
        if (monscenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("target/screenshots/"+monscenario.getName()+".png");
            FileUtils.copyFile(source, destination);
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            monscenario.attach(screenshot,"image/png", "Failure Screenshot");
        }

         */
        DriverFactory.quitDriver();
    }
}
/*
 TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("target/screenshots/capture.png");
        FileUtils.copyFile(source, destination);
 */