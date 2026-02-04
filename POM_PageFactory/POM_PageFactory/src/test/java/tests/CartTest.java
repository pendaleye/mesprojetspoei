package tests;

import base.BaseTest;
import listeners.TestListener;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;

import java.awt.*;
import java.awt.event.KeyEvent;


public class CartTest extends BaseTest {

    @Test
    public void testCheckoutButtonExists() throws AWTException {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        productsPage.addToCart();
        productsPage.goToCart();

        Assert.assertTrue(cartPage.checkoutButton.isDisplayed(), "Checkout button is not displayed");
    }


}