package com.example.automation.steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.automation.configuration.DriverFactory.driver;
import static com.example.automation.utils.Basetools.waitEnableElementAndClick;

public class ModifSteps {

    @And("je clique sur le bouton modifier de {string}")
    public void jeCliqueSurLeBoutonModifier6(String username) {
        WebElement editButton = driver.findElement(By.xpath("//div[normalize-space() = \""+username+"\"]/following-sibling::div/child::*//i[contains(@class,'pencil')]"));
        editButton.click();
    }

    public void clickOnButton(String buttonName){
        WebElement eltButton = driver.findElement(By.xpath("//button[normalize-space() = \""+buttonName+"\"]"));
        eltButton.click();
    }

    @And("je modifie le champ {string} par la valeur {string}")
    public void jeModifieLeChampsParLaValeur6(String fieldName, String fieldValue) throws InterruptedException {
        WebElement inputField = driver.findElement(By.xpath("//div[normalize-space() = \"" + fieldName + "\"]//following-sibling::div//input"));
        waitEnableElementAndClick(driver, inputField);
        inputField.sendKeys(Keys.CONTROL + "A");
        inputField.sendKeys(Keys.DELETE);
        Thread.sleep(100);
        inputField.sendKeys(fieldValue);
    }


    @And("je clique sur le bouton {string}")
    public void jappuiesurleboutonsave23(String nameBoutton1) {
        clickOnButton(nameBoutton1);
    }

}

