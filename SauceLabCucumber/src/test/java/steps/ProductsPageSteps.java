package steps;
import configuration.Hooks;
import pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.LoginPage;
import configuration.ConfigReader;
import configuration.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;

import java.util.List;

import static configuration.DriverFactory.driver;
import static org.bouncycastle.cms.RecipientId.password;


public class ProductsPageSteps  {

    ProductsPage productsPage = new ProductsPage(driver);
    CartPage panierPage = new CartPage(driver);
    public ConfigReader settings = new ConfigReader();

    @Given("je clique sur le bouton Add to cart pour ajouter un produit")
    public void addtocart() {
        productsPage.addtocart();
    }
    @When ("je clique sur la panier pour vérifier l'article")
            public void jevrifielepanier(){
        panierPage.verifierpanier();  //pour cliquer sur le panier
    }

    @And("je regarde que l'élément est présent")
    public void jelislarticle(){
        Assert.assertTrue(driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed());

    }



    // Assert.assertTrue(driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed());
    //  panierPage.removetocart();//exo1

}
