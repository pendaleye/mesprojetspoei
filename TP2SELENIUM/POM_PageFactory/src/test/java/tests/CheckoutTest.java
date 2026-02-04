package tests;

import base.BaseTest;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;

import java.util.List;
import java.util.Map;


public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckoutProcess() {
        // Authentification
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Map<String,String> formLogIn = Map.of("Username", "standard_user","Password","secret_sauce");
        fillForm(formLogIn);
        clickOnButton("login");
        //loginPage.login("standard_user", "secret_sauce");

        // Ajouter un produit au panier
        String nameOfProduct = "Sauce Labs Onesie";
        productsPage.cliqueOnAddCartButton(nameOfProduct);

        // Vérifier que le produit a été ajouté
        productsPage.goToCart();
        cartPage.checkProduct(nameOfProduct);

        //Click sur Checkout
        clickOnButton("checkout");
        //Remplir le formulaire de checkout
        //checkoutPage.fillCheckoutForm("toto", "tata", "75000");
        //clickOnButton("continue");

        Map<String, String> mapForm = Map.of("First Name", "toto", "Last Name", "tata", "Zip/Postal Code", "75000");
        fillForm(mapForm);
        clickOnButton("continue");
    }
}