
*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${FIRSTNAME_FIELD}     id=first-name
${LASTNAME_FIELD}      id=last-name
${POSTALCODE_FIELD}    id=postal-code
${CONTINUE_BTN}        id=continue
${FINISH_BTN}          id=finish

*** Keywords ***
Remplir Les Informations Client
    [Arguments]    ${firstname}    ${lastname}    ${postalcode}
    Input Text    ${FIRSTNAME_FIELD}    ${firstname}
    Input Text    ${LASTNAME_FIELD}     ${lastname}
    Input Text    ${POSTALCODE_FIELD}   ${postalcode}

Continuer Le Checkout
    Click Button    ${CONTINUE_BTN}

Finaliser La Commande
    Click Button    ${FINISH_BTN}
