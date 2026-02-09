package configuration;

import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import configuration.DriverFactory ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.ExportResults;
import steps.ImportResultsToXray;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import static configuration.DriverFactory.driver;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
    }
//ON GERE LES CLES ICI
    @BeforeAll
    //POUR L EXPORT DEPUIS XRAY
    public static void exportXray() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, InterruptedException {
        ExportResults.downloadFeatureFiles("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJiNmNhZGQwNS1lMzQxLTNmMTctYjU1Zi00OTM0MTI4MWQ4MmEiLCJhY2NvdW50SWQiOiI3MTIwMjA6OTM0MDYxMjItM2Y2Yi00YTQ4LWJiMTUtNTMyMzc3MzBmYmI4IiwiaXNYZWEiOmZhbHNlLCJpYXQiOjE3NzAzOTQ4MDIsImV4cCI6MTc3MDQ4MTIwMiwiYXVkIjoiRjI0OThCOTdFNDhFNDMyQjhDQTlDNjBCMjY0M0Y1RkUiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiJGMjQ5OEI5N0U0OEU0MzJCOENBOUM2MEIyNjQzRjVGRSJ9.4gN_y7_Vn7iwf1m6VWlybSUuMkXKcNTD1rODgl-n9Ds", "POEI2-646");
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


    //@AfterClass
    /* POUR L IMPORT VERS XRAY
    public static void importXray()throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, InterruptedException {
        ImportResultsToXray.MAJJSON();
    }
*/

}


/* POUR PRENDRE DES SCREESHOOTS
 TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("target/screenshots/capture.png");
        FileUtils.copyFile(source, destination);
 */