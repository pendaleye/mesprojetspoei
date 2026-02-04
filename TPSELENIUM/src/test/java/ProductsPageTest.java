import base.BaseTest;
import org.example.ProductsPage;
import org.example.LoginPage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest {

    @Test
    public void addcart() {
        SetUp();
        LoginPage loginPage = new LoginPage(driver);//pour la connexion
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(driver);//pour l ajout de carte
        productsPage.addtocart();
        String expectedurl ="https://www.saucedemo.com/inventory.html";

       // Assertions.assertEquals(expectedurl,driver.getCurrentUrl(),"l'url est correcte");

    }

}


//ProductsPage productsPage = new ProductsPage(driver);
//Assert.assertTrue(productsPage.isProductsPageDisplayed(), "Login failed");



/*
        @Test
        public void testInvalidLogin() {
            WebDriver driver = new ChromeDriver();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("invalid_user", "wrongpassword");
            Assert.assertTrue(LoginPage.isErrorDisplayed(), "error message not displayed");
        }
    }
*/


