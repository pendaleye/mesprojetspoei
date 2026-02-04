import base.BaseTest;
import org.example.PanierPage;
import org.example.LoginPage;
import org.example.ProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class PanierPageTest extends BaseTest {

    @Test
    public void addremovecart() {
        SetUp();
        LoginPage loginPage = new LoginPage(driver);//pour la connexion
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);//pour l ajout de carte
        productsPage.addtocart();

        PanierPage panierPage = new PanierPage(driver);
        panierPage.verifierpanier();  //pour cliquer sur le panier

       // Assert.assertTrue(driver.findElement(By.id("sauce-labs-backpack")).isDisplayed());
      //  panierPage.removetocart();//exo1
        panierPage.appuicheckout();

        //String expectedurl ="https://www.saucedemo.com/inventory.html";

    }

}