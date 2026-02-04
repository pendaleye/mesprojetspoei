import base.BaseTest;
import org.example.Formulaire;
import org.example.PanierPage;
import org.example.LoginPage;
import org.example.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class FormulaireTest extends BaseTest {

    @Test
    public void FormulaireTest() {
        SetUp();
        LoginPage loginPage = new LoginPage(driver);//pour la connexion
        loginPage.login("standard_user", "secret_sauce");

        //j'ajoute un produit a ma carte
        ProductsPage productsPage = new ProductsPage(driver);//pour l ajout de carte
        productsPage.addtocart();

        // je remplis le panier
        PanierPage panierPage = new PanierPage(driver);
        panierPage.verifierpanier();  //pour cliquer sur le panier
        panierPage.appuicheckout();

        //je remplis le formulaire
        Formulaire formulaire = new Formulaire(driver);
        formulaire.remplirformulaire("penda","leye","93100");
        //verfier le mot present
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Checkout: Overview')]"));
        Assert.assertTrue(element.isDisplayed());
       // Assert.assertTrue(driver.findElement(By.id("sauce-labs-backpack")).isDisplayed());
        // cliquer sur finir
        formulaire.finir();

        //verifier merci pour!

        String message2 = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your order !')]")).getText();
        Assert.assertEquals("Thank you for your order", message2);

    }

}