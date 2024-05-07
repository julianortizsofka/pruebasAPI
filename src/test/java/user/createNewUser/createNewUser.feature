Feature: signup test on api.demoblaze when create a new user

      Scenario: create a new user

        * def randomNomber =
         """
  function(max){ return Math.floor(Math.random() * max) + "" }
  """

        * def user =
        """
            {"username": "Carlos<random>","password": "C<random>"}
        """
        * replace user.random =  randomNomber(100000)

        Given url 'https://api.demoblaze.com/signup'
        And request user
        When method post
        Then status 200
        And match response != {"errorMessage":"This user already exist."}

