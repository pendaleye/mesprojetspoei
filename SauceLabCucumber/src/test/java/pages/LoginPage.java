
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginPage extends BasePage {

    public WebDriver driver;
    @FindBy(id="user-name")
    WebElement usernameInput;
    @FindBy(id="password")
    WebElement passwordInput;
    @FindBy(id="login-button")
    WebElement loginButton;
    @FindBy(xpath="//h3[@data-test='error']")
    WebElement errorMessage;
    public LoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void open(String url) {
        driver.get(url);
    }
    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();


    }
/*
    public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size() > 0;
    }
    */

}

