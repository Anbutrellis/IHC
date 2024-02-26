Feature: Verify the Functionality of the Registration and Licensing Process



   @7
   @Regression 
  Scenario: Verify The Functionality of the Finance User Approve for Organization user
  
  Given The user has to Navigate to the IHC login page
  When  The user has to login with a valid user credential for Finance user
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has to select Approved from the dropdownMenuReference 
  And 	The user has to give feedback and update the status of the request
  Then 	The user has to verify Whether the Successfully approved 
  
  
  
  @8
  @Regression
  Scenario: Verify The Functionality of the R&L User Approve for Organization user
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to login with a valid user crential for R&L user
  And 	The user has to click the  Registration/Renewal dropdown and click the Request List
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has to select Approved from the dropdownMenu
  And 	The user has to give feedback and update the status of the request for the Organization
  And 	The user has to verify Whether the Successfully approved Organization Application
  Then 	The user has to create one meeting and verify the meeting is created or not
  
  
  
  @9
  @Regression
  Scenario: Verify The Functionality of the Committee Feedback user 
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to login with a valid user crential for Committee Feedback user
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has to click the Feedback Tab Approve the meeting and give the remark 
  And   The user has to  verify the meeting is approved or not
  Then 	The user has to login to R&L member again to close the meeting
  
  
  @10
  @Regression
  Scenario: Verify The Functionality of the	Compliance User Approval
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to login with a valid user crential for	Compliance User 
  And   The user has to click the  Registration/Renewal dropdown and click the Request List
  And 	The user has to click the action of the eye icon for the required user to be approved
  Then 	The user has go to the feedback tab for give Compliance feedback and verify it
  
  
  @11
  @Regression
  Scenario: Verify The Functionality of the Finance Audit User Approval
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to Login with a valid user crential for Finance Audit User
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has go to the click Feedback tab and the Feedback form will be displayed with the number of days left for approval
  And 	The user has to Click on the submit button after you have completed the form and digitally signed your feedback
  Then  The user has to verify the completed the Finance Audit Feedback and able to download the PDF
  
  
  @12
  @Regression
  Scenario: Verify The Functionality of the Registrar User Approval
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to Login with a valid user crential for Registrar User
  And 	The user has to click the  Registration/Renewal dropdown and click the Request List
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has to click Feedback tab able to view the three requests to review National Security Submission, MOFAIC Submission and IACAD Submission will be displayed with the number of days left for approval
  And   The user has to Approve the request for National Security Submission, MOFAIC Submission and IACAD Submission
  Then 	The user has to make the final approval for the Application and give remark for it 
  
  @13
  @Regression 
  Scenario: Verify The Functionality of the Choosing Property by Organization User
  
  Given The user has to Navigate to the Organization login page
  When 	The user has to login with a valid user crential for Organization User
  And 	The user has to go the profile and click Documents
  And 	The user has to upload the required Documents 
  And 	The user has to Click Facility tab and select the required building from the Building drop-down
	And 	The user has to Select the required floor among the grey colored floors and once selected, the floor color will turn green
  Then 	The user has to	Click Add to Cart after selecting one floor after confirm the order
  
  
  