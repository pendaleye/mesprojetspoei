
*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${TITLE_PRODUCTS}          xpath=//span[text()="Products"]
${FIRST_ADD_TO_CART_BTN}   xpath=(//button[contains(text(),"Add to cart")])[1]
${CART_BADGE}              css=.shopping_cart_badge

*** Keywords ***
Vérifier Que La Page Produits Est Affichée
    Page Should Contain Element    ${TITLE_PRODUCTS}

Ajouter Le Premier Produit Au Panier
    Click Button    ${FIRST_ADD_TO_CART_BTN}

Vérifier Le Badge Panier
    [Arguments]    ${expected}
    Element Text Should Be    ${CART_BADGE}    ${expected}
