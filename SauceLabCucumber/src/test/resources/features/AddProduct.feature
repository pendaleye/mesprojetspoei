Feature: Ajouter un produit au panier

  Background: Connexion utilisateur
    Given l'utilisateur est sur la page de connexion
    When il saisit le username "standard_user" et le mot de passe "secret_sauce"
    Then il est redirigé vers la page d'accueil

  @ajoutproduit
  Scenario: Ajout d'un produit
    Given je clique sur le bouton Add to cart pour ajouter un produit
    When je clique sur la panier pour vérifier l'article
    And je regarde que l'élément est présent



