*** Settings ***
Resource          ../resources/navigateur.robot
Resource          ../pages/login.robot
Resource          ../pages/Product.robot
Resource          ../pages/Cart.robot

*** Test Cases ***
Ajout D Un Produit Au Panier
    Ouvrir Le Navigateur
    Se Connecter Avec Les Identifiants    standard_user    secret_sauce
    Ajouter Le Premier Produit Au Panier
   