package tests;

import base.BaseTest;
import com.aventstack.extentreports.ExtentReports;

import listeners.TestListener;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import java.util.ArrayList;


@Listeners(TestListener.class)
public class LoginTest extends BaseTest {


    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue(productsPage.isProductsPageDisplayed(), "Login failed!");
        ArrayList<String> listId = new ArrayList<>(driver.getWindowHandles());
        listId.get(listId.size()-1);
        driver.switchTo().window(listId.get(listId.size()-1));

    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_user", "wrong_password");
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not displayed!");
    }
}
