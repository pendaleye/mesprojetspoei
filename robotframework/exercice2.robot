*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${monURL}        https://the-internet.herokuapp.com/iframe


*** Test Cases ***
test site
        Open Browser       ${monURL}        chrome
        Page Should Contain    Your content goes here
        Input Text    //*[contains(text(),'Your content goes here')]    robotframework
