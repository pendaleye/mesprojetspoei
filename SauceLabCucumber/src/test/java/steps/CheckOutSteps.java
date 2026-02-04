package steps;
import configuration.Hooks;
import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import configuration.ConfigReader;
import configuration.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static configuration.DriverFactory.driver;
import static org.bouncycastle.cms.RecipientId.password;


public class CheckOutSteps  {

    CheckOutPage checkOutPage = new CheckOutPage(driver);
    FormulairePage formulaire = new FormulairePage(driver);
    public ConfigReader settings = new ConfigReader();


    @When ("Je clique sur le bouton CheckOut")
    public void jecliquesurcheckout(){
        checkOutPage.appuicheckout();  //pour cliquer sur le panier
    }

    @And("Je saisis le firstname {string},le lastname {string} et le code postal {string} et je continue")
    public void jeremplisleformulaire(String user, String pass, String codepostale) {
        formulaire.remplirformulaire(user,pass,codepostale);
    }

    @And("Je clique sur le bouton finish")
    public void jecliquesurfinish(){
        formulaire.finir();
        //String message2 = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your order !')]")).getText();
       // Assert.assertEquals("Thank you for your order", message2);
    }
}
