package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class CartPage extends BasePage {

    public WebDriver driver;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removecart;

    @FindBy(id = "shopping_cart_container")
    WebElement verifpanier;

    @FindBy(id = "checkout")
    WebElement checkout;


    public CartPage(WebDriver driver) {
        super(driver);
        //this.driver=driver;
        // PageFactory.initElements(driver,this);
    }

    public void removetocart() {
        Assert.assertTrue(driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed());
        removecart.click();
    }

    public void verifierpanier() {
        verifpanier.click();

    }

    public void appuicheckout() {
        checkout.click();

    }
}