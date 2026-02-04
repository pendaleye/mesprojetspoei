package com.example.automation.steps;
import com.example.automation.pages.HomePage;
import com.example.automation.pages.LoginPage;
import com.example.automation.configuration.ConfigReader;
import com.example.automation.configuration.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.example.automation.pages.Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminSteps {


    @Given("je navigue vers la section \"Admin\"")
    public void clickadmin(String Buttonname) {
       Admin.getbutton(Buttonname);

    }

    @When("j'ajoute un nouvel utilisateur avec les informations suivantes :")
    public void login(String user, String pass) {
        Admin.login(user, pass);
    }

    @Then("l'utilisateur \"test.user\" apparaît dans la liste des utilisateurs")
    public void checkHome() {
        //Assert.assertTrue((test.user).isDisplayed());
    }
}




}
