
package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.namespace.QName;

public class Formulaire {
    public WebDriver driver;

    @FindBy(id="first-name")
    WebElement firstname;
    @FindBy(id="last-name")
    WebElement lastname;
    @FindBy(id="postal-code")
    WebElement postalcode;
    @FindBy(id="continue")
    WebElement idcontinue;
    @FindBy(id="finish")
    WebElement finish;

//constructeur
    public Formulaire(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void remplirformulaire(String userfirst,String userlast,String userpostal){
        firstname.sendKeys(userfirst);
        lastname.sendKeys(userlast);
        postalcode.sendKeys(userpostal);
        idcontinue.click();

    }

    public void finir(){
        finish.click();
    }

}
