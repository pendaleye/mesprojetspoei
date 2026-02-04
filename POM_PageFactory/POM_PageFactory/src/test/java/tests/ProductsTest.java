package tests;

import base.BaseTest;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

@Listeners(TestListener.class)
public class ProductsTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        // Authentification
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Ajouter un produit au panier
        String nameOfProduct = "Sauce Labs Onesie";
        productsPage.cliqueOnAddCartButton(nameOfProduct);

        // Vérifier que le produit a été ajouté
        productsPage.goToCart();
        cartPage.checkProduct(nameOfProduct);

        //Supprimer le produit du panier
        cartPage.removeProduct(nameOfProduct);
        //Vérifier que le produit a été supprimé
        cartPage.checkIfCartIsEmpty();
    }

}
