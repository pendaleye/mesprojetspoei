package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class CartPage {
    WebDriver driver;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(xpath = "//div[contains(@class,\"cart_item_label\")]")
    public List<WebElement> cartItems;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkProduct(String nameOfProduct){
        WebElement eltProduct = driver.findElement(By.xpath("//div[contains(text(),\""+nameOfProduct+"\")]"));
        Assert.isTrue(eltProduct.isDisplayed(), "Le produit est bien dans le panier !");
    }

    public void removeProduct(String productName){
        String id = productName.toLowerCase().replaceAll(" ","-");
        WebElement eltARemove = driver.findElement(By.xpath("//button[contains(@id,\"remove-"+id+"\")]"));
        eltARemove.click();
    }

    public void checkIfCartIsEmpty(){
        long start = System.currentTimeMillis();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        try {
            WebElement elt = driver.findElement(By.xpath("//div[contains(@class,\"cart_item_label\")]"));
            wait.until(ExpectedConditions.invisibilityOf(elt));
        }catch(Exception e){
            e.printStackTrace();
        }
        //wait.until(d -> cartItems.size() == 0);

        //Assert.isTrue(cartItems.size() == 0, "Le panier est vide !");
        System.out.println("Durée d'attente : " + (System.currentTimeMillis() - start) + " ms");
    }
}