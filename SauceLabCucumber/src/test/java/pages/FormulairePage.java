package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FormulairePage extends BasePage {


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

    public FormulairePage(WebDriver driver) {
        super(driver);
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
