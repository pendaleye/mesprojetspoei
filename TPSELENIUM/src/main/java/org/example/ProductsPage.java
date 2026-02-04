package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public WebDriver driver;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addcart;

    public ProductsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void addtocart(){
        addcart.click();
    }
    /*
public void ajoutproduit(String nameproduct){
        String formattedProduct = nameproduct.replaceAll(" ","-").toLowerCase();
        WebElement eltaddtocart= driver.findElement(By.xpath("button[contains@id,'add-to-cart'-"+formattedProduct+"')]")).click();

}
*/

}
