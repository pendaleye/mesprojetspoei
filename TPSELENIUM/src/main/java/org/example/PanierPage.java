
package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanierPage {

    public WebDriver driver;
    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removecart;

    @FindBy(id="shopping_cart_container")
    WebElement verifpanier;

    @FindBy(id="checkout")
    WebElement checkout;


    public PanierPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void removetocart(){
        removecart.click();
    }

    public void verifierpanier(){
        verifpanier.click();

    }
    public void appuicheckout(){
        checkout.click();

    }


}