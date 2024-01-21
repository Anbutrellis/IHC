Feature: Expression of Interest (EOI) Form Submission

  Scenario: User submits EOI form successfully
    Given the user is on the EOI form page
    When the user selects Company Type
    And the user provides the following Applicant Details         
    And the user enters a brief description of proposed activities    
    And the user describes the services or products offered and how the business operates with the authority  
    And the user accepts the terms and conditions
    Then the user clicks on the Submit button
     

  Scenario: User cancels EOI form submission
    Given the user is on the EOI form page
    When the user decides to cancel the submission
    And the user clicks on the Cancel button
    Then the system should navigate to the home page

  Scenario: Incomplete EOI form submission
    Given the user is on the EOI form page
    When the user submits the form with incomplete information
    Then the system should display an error message
    
