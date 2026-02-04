package Exercicesuploaddraganddropiframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe {
    WebDriver driver = new ChromeDriver();

    @Test

    public void nested_frames() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        Assert.assertTrue(element.isDisplayed());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");

        driver.switchTo().defaultContent();


    }
}
