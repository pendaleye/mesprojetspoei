*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${monURL}        https://the-internet.herokuapp.com/dynamic_loading/1 


*** Test Cases ***
ouverture page
        Open Browser       ${monURL}        chrome
        Click Element    xpath=//button[text()='Start']
        Wait Until Page Contains     Hello World !
          
