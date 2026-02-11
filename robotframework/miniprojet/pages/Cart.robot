
*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${CART_ICON}        css=.shopping_cart_link
${CART_ITEMS}       css=.cart_item
${CHECKOUT_BTN}     id=checkout

*** Keywords ***
Ouvrir Le Panier
    Click Element    ${CART_ICON}

Vérifier Que Le Panier Contient
    [Arguments]    ${expected}
    ${count}=    Get Element Count    ${CART_ITEMS}
    Should Be Equal As Integers    ${count}    ${expected}

Lancer Le Checkout
    Click Button    ${CHECKOUT_BTN}
