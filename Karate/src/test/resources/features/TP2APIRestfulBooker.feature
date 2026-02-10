Feature: TEST API BOOKING
@booking
  Scenario: Exercice1 recupérer données
    Given url 'https://restful-booker.herokuapp.com/booking'
    When method GET
    Then status 200
    And match response != '[]'


 Scenario: Exercice2 recuperer réservation par ID
    Given url 'https://restful-booker.herokuapp.com/booking/1'
    When method GET
    Then status 200
   * match response.firstname == '#present'
   * match response.lastname == '#present'
   * match response.totalprice == '#present'


  Scenario: Creation reservation
    * def body =
    """
    {
      "firstname": "Pierre",
      "lastname": "Martin",
      "totalprice": 150,
      "depositpaid": true,
      "bookingdates": {
        "checkin": "2024-05-01",
        "checkout": "2024-05-05"
      },
      "additionalneeds": "Petit déjeuner"
    }
    """
    Given url 'https://restful-booker.herokuapp.com/booking'
    And request body
    When method post
    Then status 200
    And match response.bookingid == '#number'






