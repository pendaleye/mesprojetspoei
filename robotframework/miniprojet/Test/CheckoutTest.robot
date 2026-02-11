*** Settings ***
Resource          ../resources/navigateur.robot
Resource          ../pages/login.robot
Resource          ../pages/Product.robot
Resource          ../pages/Cart.robot
Resource          ../pages/Checkout.robot


*** Test Cases ***
Finalisation De Commande
    [Tags]    POEI2-1041
    Ouvrir Le Navigateur
    Ouvrir La Page De Login
    Se Connecter Avec Les Identifiants    standard_user    secret_sauce
    Ajouter Le Premier Produit Au Panier
    Ouvrir Le Panier
    Lancer Le Checkout
    Remplir Les Informations Client    Penda    Diallo    92000
    Continuer Le Checkout
    Finaliser La Commande
    