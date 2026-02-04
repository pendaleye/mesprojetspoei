package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;

    @FindBy(css = "button[data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;

    @FindBy(css = "a.shopping_cart_link")
    private WebElement cartIcon;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement productsPageTitle;


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void goToCart() {
        cartIcon.click();
    }

    public boolean isProductAdded() {
        return cartIcon.getText().contains("1");
    }

    public boolean isProductsPageDisplayed() {
        try {
            // Vérifie si le titre de la page des produits est affiché
            return productsPageTitle.isDisplayed() && productsPageTitle.getText().equals("Products");
        } catch (Exception e) {
            return false; // Si l'élément n'est pas trouvé, retourne false
        }
    }

    public void cliqueOnAddCartButton(String nameOfProduct){
        String id = nameOfProduct.toLowerCase().replaceAll(" ","-");
        WebElement eltAddToCart = driver.findElement(By.xpath("//button[contains(@id,\"add-to-cart-"+id+"\")]"));
        eltAddToCart.click();
    }
}