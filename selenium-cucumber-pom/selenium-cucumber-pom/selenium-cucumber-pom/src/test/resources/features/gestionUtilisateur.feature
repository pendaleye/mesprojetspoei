Feature: Gestion des utilisateurs dans la section Admin
  En tant qu'administrateur
  Je veux pouvoir gérer les utilisateurs
  Afin d'assurer le bon fonctionnement du système

  Scenario: Ajouter un utilisateur
     Given je suis connecté en tant qu'utilisateur
     And je navigue vers la section "Admin"
     When j'ajoute un nouvel utilisateur avec les informations suivantes :
     Then l'utilisateur "test.user" apparaît dans la liste des utilisateurs


    Scenario: Modifier un utilisateur
      Given Je suis sur la page Admin
      When je modifie l'utilisateur "test.user" avec les informations suivantes :
      Then les informations de l'utilisateur "test.user" sont mises à jour


    Scenario: Supprimer un utilisateur
        Given Je clique sur l'utilisateur
        When je supprime l'utilisateur "test.user"
        Then l'utilisateur "test.user" n'apparaît plus dans la liste des utilisateurs
