package steps;

import configuration.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.LoginPage;
import configuration.ConfigReader;
import configuration.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static configuration.DriverFactory.driver;
import static org.bouncycastle.cms.RecipientId.password;


public class LoginSteps {

    LoginPage loginPage = new LoginPage(driver);
    public ConfigReader settings = new ConfigReader();

    @Given("l'utilisateur est sur la page de connexion")
    public void openLogin() {
        String url = settings.getProperty("url");
        loginPage.open(url);
    }

    @When("il saisit le username {string} et le mot de passe {string}")
     public void enterUsernameandpassword(String user, String pass) {
          loginPage.login(user,pass);
        }

    @Then("il est redirigé vers la page d'accueil")
            public void affiche() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Products')]"));
        Assert.assertTrue(element.isDisplayed());
    }
}




