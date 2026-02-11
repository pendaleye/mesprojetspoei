*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}       https://www.saucedemo.com
${BROWSER}   chrome

*** Keywords ***
Ouvrir Le Navigateur
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window

Fermer Le Navigateur
    Close Browser
