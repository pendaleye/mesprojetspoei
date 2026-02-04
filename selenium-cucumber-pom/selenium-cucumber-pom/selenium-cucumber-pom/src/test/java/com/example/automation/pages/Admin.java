package com.example.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin extends BasePage {
//username
        @FindBy(xpath=("//*[contains(@class, 'oxd-input oxd-input--active')]"))
        private WebElement username;
//userrole
        @FindBy(xpath=("//*[contains(@class, 'oxd-select-text oxd-select-text--active')]"))
        private WebElement userrole;
//Employee name

        @FindBy(xpath=("//*[contains(@placeholder, 'Type for hints...')]"))
        private WebElement employeename;

    //userrole
        @FindBy(xpath=("//*[contains(@class, 'oxd-select-text oxd-select-text--active')]"))
        private WebElement status;

        //Appuyer sur le bouton save
        @FindBy(xpath = "//button[contains(@class, 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
        private WebElement save;

        //password
        @FindBy(xpath = "//*[contains(text(), 'Password')]")
        private WebElement password;

        //password confirmé

        @FindBy(xpath = "//*[contains(@class, '')]")
        private WebElement save;



        public Admin(WebDriver driver) {
            super(driver);
        }


        public WebElement getbutton(String Buttonname) {
           // WebDriver driver;
          return driver.findElements(By.xpath("//button[contains(normalize-space(.),'"+Buttonname+"')]/.."));
            loginBtn.click();
        }



}
