*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${CHAMPUSERNAME}        id=user-name
${PASSWORD}        id=password                
${LOGIN_BUTTON}      id=login-button

*** Keywords ***
Ouvrir La Page De Login
    Go To    https://www.saucedemo.com


Se Connecter Avec Les Identifiants

  [Arguments]        ${username}        ${password}
    Input Text        id:user-name    ${username}
    Input Text        id:password     ${password}
    Click Element    id:login-button 

Vérifier Que La Page Produits Est Affichée
    Wait Until Page Contains        Products
    