import base.BaseTest;
import org.example.LoginPage;

import org.testng.annotations.Test;

//public class LoginTest {
    //@Listeners(TestListener.class)
     public class LoginTest extends BaseTest {

    @Test
    public void testsuccessfullogin() {
        SetUp();
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

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


