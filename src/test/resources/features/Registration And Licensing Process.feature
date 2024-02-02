Feature: Verify the Functionality of the Registration and Licensing Process



   @7 
  Scenario: Verify The Functionality of the Finance User Approve for Organization user
  
  Given The user has to Navigate to the IHC login page
  When  The user has to login with a valid user credential for Finance user
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has to select Approved from the dropdownMenuReference 
  And 	The user has to give feedback and update the status of the request
  Then 	The user has to verify Whether the Successfully approved 
  
  
  
  @8
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
  Scenario: Verify The Functionality of the Committee Feedback user 
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to login with a valid user crential for Committee Feedback user
  And 	The user has to click the action of the eye icon for the required user to be approved
  And 	The user has to click the Feedback Tab Approve the meeting and give the remark 
  And   The user has to  verify the meeting is approved or not
  Then 	The user has to login to R&L member again to close the meeting
  
  
  @10
  Scenario: Verify The Functionality of the	Compliance User Approval
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to login with a valid user crential for	Compliance User Approval
  And   The user has to click the  Registration/Renewal dropdown and click the Request List
  And 	The user has to click the action of the eye icon for the required user to be approved
  Then 	The user has go to the feedback tab for give Compliance feedback and verify it
  
  
  @11
  Scenario: Verify The Functionality of the Finance Audit User Approval
  
  Given The user has to Navigate to the IHC login page
  When 	The user has to Login with a valid user crential for Finance Audit User Approval
  
  
  
  
  
  
  