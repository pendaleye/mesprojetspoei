package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage{

    public WebDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addcart;

    public ProductsPage(WebDriver driver) {
        super(driver);
       // this.driver = driver;
        //PageFactory.initElements(driver, this);
    }

    public void addtocart() {
        addcart.click();
    }
}