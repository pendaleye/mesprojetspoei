package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

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
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
}



