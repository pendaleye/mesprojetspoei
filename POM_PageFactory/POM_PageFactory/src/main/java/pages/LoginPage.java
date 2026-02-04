package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the login page of the application.
 */
public class LoginPage {
    public WebDriver driver;
    @FindBy(id = "user-name")
    WebElement usernameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMessage;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * cette methode permet de se connecter à l'application en utilisant le nom d'utilisateur et le mot de passe fournis.
     * @param username the username to be entered
     * @param password the password to be entered
     */
    public void login(String username, String password) {
        loginButton.click();
    }

    public WebElement getChampsAuthetification(String champName){
        return driver.findElement(By.xpath("//*[contains(@placeholder, '"+champName+"')]"));
    }

    /**
     * cette methode permet de vérifier si un message d'erreur est affiché sur la page de connexion.
     * @return true if the error message is displayed, false otherwise
     */
    public boolean isErrorDisplayed() {
        return errorMessage.isDisplayed();
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

}
