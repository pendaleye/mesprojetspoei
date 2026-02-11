*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${monURL}        https://www.saucedemo.com/


*** Test Cases ***
Test de connexion OK
    connexion        standard_user        secret_sauce
    verifier l'affichage de la page Product


*** Keywords ***

connexion 
    [Arguments]        ${username}        ${password}
    Open Browser       ${monURL}        chrome
    Input Text        id:user-name    ${username}
    Input Text        id:password     ${password}
    Click Element    id:login-button    


verifier l'affichage de la page Product
     Page Should Contain    Products


