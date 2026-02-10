Feature: Karateremontee

	#Karateremontee
	@POEI2-858 @penda1
	Scenario: Karateremontee
		Given url 'https://restful-booker.herokuapp.com/booking'
		    When method GET
		    Then status 200
		    And match response != '[]'

  Scenario: token avec notre code et mdp
    Given url 'https://xray.cloud.getxray.app/api/v2/authenticate'
    When request {"client_id": "F2498B97E48E432B8CA9C60B2643F5FE","client_secret": "00842304a949a62fb253162641daf2d466a7d12973a501542f69d7d63af17071"}
    And method post
    Then status 200
    * def token = response
    * print 'MonToken =', token


  Scenario: envoyer le  Json
    * def envoi = read('file:target/surefire-reports/src.test.resources.features.1_POEI2-858.json')
    Given url 'https://xray.cloud.getxray.app/api/v2/import/execution/cucumber'
    And header Authorization = 'Bearer ' + token
    And header Content-Type = 'application/json'
    And request envoi
    When method post
    Then status 200
