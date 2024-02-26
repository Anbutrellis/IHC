Feature: Verify the Functionality of the Organization Login
   @5
   @Regression
  Scenario: Successfully Login
  
  Given the User is on the IHC Homepage
  When  the user click on the login button and navigate to login page 
  And   the user enter the vaid crendential on the username and password
  And 	the user click on the Login button and navigate to the password reset popoup
  And   the user reset the password and should be able to see Succesfully 
  Then  the user login with reset password