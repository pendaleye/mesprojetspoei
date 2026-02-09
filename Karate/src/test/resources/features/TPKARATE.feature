Feature: Tests api

Scenario: test GET
Given url 'https://jsonplaceholder.typicode.com/posts/1'
And method GET
Then status 200
And print response

  Scenario: test PUT
    Given url 'https://jsonplaceholder.typicode.com/posts/4'
    And request {title: 'Poei',body: 'Capgemini groupe' ,userId: 4,}
    And method PUT
    Then status 200
    And print response

  Scenario: Vérifier informations du post 1
    Given url 'https://jsonplaceholder.typicode.com/posts/1'
    When method GET
    Then status 200
    And match response.title == 'sunt aut facere repellat provident occaecati excepturi optio reprehenderit'
    And match response.userId == 1
    And print response

    
  Scenario: Tests avec reutlisation réponse
    Given url 'https://jsonplaceholder.typicode.com/users'
    When method GET
    Then status 200

    * def userId = response[0].id

    Given url 'https://jsonplaceholder.typicode.com/posts'
    And param userId = userId
    When method GET
    Then status 200
    And match each response[*].userId == userId
