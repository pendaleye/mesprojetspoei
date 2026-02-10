Feature: gerener token
  Scenario: token avec notre code et mdp
    Given url 'https://xray.cloud.getxray.app/api/v2/authenticate'
    When request {"client_id": "F2498B97E48E432B8CA9C60B2643F5FE","client_secret": "00842304a949a62fb253162641daf2d466a7d12973a501542f69d7d63af17071"}
    And method post
    Then status 200
    * def token = response
    * print 'MonToken =', token



