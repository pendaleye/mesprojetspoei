package Exercicesuploaddraganddropiframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static base.BaseTest.logger;

public class UploadTest {
    WebDriver driver = new ChromeDriver();

  //  @FindBy(id="file-upload") On ne peut pas utiliser ca car on a pas de page factory

    @Test

    public void uploadfichier(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileupload=driver.findElement(By.id("file-upload"));
       // Thread.sleep(200);
        fileupload.sendKeys("C:\\Users\\IB\\Desktop\\scrum.odt");
      //  Thread.sleep(200);
        driver.findElement(By.id("file-submit")).click();
        logger.info("coucou");


    }

}
