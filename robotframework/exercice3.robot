
*** Settings ***
Library    SeleniumLibrary
Suite Setup    Open Browser To Login Page
Suite Teardown    Close Browser

*** Variables ***
${URL}        https://the-internet.herokuapp.com/login
${BROWSER}    chrome
${VALID_USER}    tomsmith
${VALID_PWD}     SuperSecretPassword!

*** Test Cases ***
Login valide OK
    Open Browser       ${URL}        chrome
    Login And Check    ${VALID_USER}    ${VALID_PWD}    success

Utilisateur invalide OK
    Login And Check    fakeuser         ${VALID_PWD}    error

Mot de passe invalide OK
    Login And Check    ${VALID_USER}    wrongpassword   error
