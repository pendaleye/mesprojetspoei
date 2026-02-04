package Exercicesuploaddraganddropiframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragAndDrop {

    WebDriver driver = new ChromeDriver();

    @Test

    public void Dragdrop() {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        // draggable


    }

}
