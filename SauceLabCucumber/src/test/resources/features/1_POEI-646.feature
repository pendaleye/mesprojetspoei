Feature: Connexion avec des identifiants valides

  @POEI2-646
  Scenario Outline: Connexion avec des identifiants valides
    Given l'utilisateur est sur la page de connexion
    When il saisit le username <username> et le mot de passe <mdp>
    Then il est redirigé vers la page d'accueil

    Examples:
      |username|mdp|
      |"standard_user"| "secret_sauce"|
      |"standard_use"| "secret_sauc"|
