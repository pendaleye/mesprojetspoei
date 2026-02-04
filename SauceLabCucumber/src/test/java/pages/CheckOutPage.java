package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class CheckOutPage extends BasePage {

    public WebDriver driver;
    @FindBy(id = "checkout")
    WebElement checkout;


    public CheckOutPage(WebDriver driver) {
        super(driver);
        //this.driver=driver;
        // PageFactory.initElements(driver,this);
    }

    public void appuicheckout() {
//        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Checkout')]"));
      //  Assert.assertTrue(element.isDisplayed());
        checkout.click();

    }
}