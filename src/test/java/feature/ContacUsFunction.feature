Feature: Contac Us page



  Scenario Outline: Verify Sedding message func.
  Given Navigate to aoutomationpractice
  When Click on sing button and enter the username and password"FalcoN"
  Then User should login successfully
  Then Navigaye to contacUsPage
  Then Click on the SubjectHeading options class
  Then Input a message
  |Message|<Userinput>|
  Then Send message
  Then Verify Successfull message

    Examples:
      | Userinput|
      | Msg1 |
      | Msg2 |
      | Msg3 |


