
Feature: Achat d'un produit
  Background: Je suis sur la page panier
    Given l'utilisateur est sur la page de connexion
    When il saisit le username "standard_user" et le mot de passe "secret_sauce"
    And il est redirigé vers la page d'accueil
    And je clique sur le bouton Add to cart pour ajouter un produit
    And je clique sur la panier pour vérifier l'article
    Then je regarde que l'élément est présent
  @checkout
  Scenario Outline: Utilisateur doit renseigner ses informations et acheter un produit
    Given Je clique sur le bouton CheckOut
    When Je saisis le firstname <Firstname>,le lastname <lastname> et le code postal <code postal> et je continue
    And Je clique sur le bouton finish


    Examples:
      |Firstname|lastname|code postal|
      |"Pend"| "Lee"|"92120 "|
      |"Noella"| "ba"|"95420"|

