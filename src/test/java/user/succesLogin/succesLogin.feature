Feature: signup test on api.demoblaze when create a user already

  Scenario: create a new user
    * def user =
        """
            {
                "username": "Andres6781",
                "password": "1234567890"

             }
        """
    Given url 'https://api.demoblaze.com/login'
    And request user
    When method post
    Then status 200
    And match response contains any  "Auth_token"