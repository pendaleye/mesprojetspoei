package Exercicesuploaddraganddropiframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class GestionElementsDynamiques {

    WebDriver driver = new ChromeDriver();

    @Test

    public void GestionDynamiques() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
       //explicit
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Add')]")));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'It's gone!')]"));
        Assert.assertTrue(element.isDisplayed());

        //cliquer sur add
        driver.findElement(By.xpath("//button[text()='Add']")).click();

        //WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
        //wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Remove')]")));

        WebElement element2 = driver.findElement(By.xpath("//*[contains(text(),'Remove')]"));
        Assert.assertTrue(element2.isDisplayed());


    }

}
