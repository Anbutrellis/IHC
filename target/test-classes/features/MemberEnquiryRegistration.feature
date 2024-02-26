Feature: Verify the Functionality of the Member Enquiry Registration

    @6
    @Regression
  Scenario: Verify The Registration process of Member Enquiry Details 
  
  Given The user have login with vaild credential organization user
  When The user navigate to the registration & renewel steps
  And The user have to choose the How did you here about us options
  And The user have to choose the formation type and it display the requried documents
  And The user have to upload the requried documents for company branch
  And The user have to fill the requried fields in the Business plan 
  And The user have to fill the requried fields in the Company Information
  And The user have to select the Business Activities
  And The user have to select the types of facility and choose office space Requirement 
  And The user have to select the employment visa requirements at Sum of the office space like per visa 10 Sq.m 
  And The user have to fill the UBO information in the UBO form
  And The user have to fil the Manager details 
  And The user have to fill the Nature of Business
  And The user have to validate the Application details
  And The user have to done the payment
  Then The user have to validate the Application submitted successfully
  
  