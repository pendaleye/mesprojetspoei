package Exercicesuploaddraganddropiframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class AlertsTests {
    WebDriver driver;

    @BeforeMethod
    public void SetUpAlerts(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        options.addArguments("--incognito"); //pour naviguer en privé
        options.setExperimentalOption("prefs",prefs);
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

@Test

public void Accepteralerte(){

  driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    Alert alert = driver.switchTo().alert();
    alert.accept();

    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
   // Alert alert = driver.switchTo().alert();
    alert.dismiss();

    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
    alert.sendKeys("coucou les gens");
    alert.accept();


}












}
