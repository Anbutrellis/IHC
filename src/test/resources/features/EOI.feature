Feature: Expression of Interest (EOI) Form Submission
    @1
    @Regression
  Scenario: User submits EOI form successfully as the Branch of Humanitarian organization
    Given the user is on the EOI form page
    When the user selects Company Type as Branch of Humanitarian organization
    And the user provides the following Applicant Details         
    And the user enters a brief description of proposed activities    
    And the user describes the services or products offered and how the business operates with the authority  
    And the user accepts the terms and conditions
    Then the user clicks on the Submit button
    @2
 Scenario: User submits EOI form successfully as the Branch of commercial company
    Given the user is on the EOI form page
    When the user selects Company Type as Branch of commercial company
    And the user provides the following Applicant Details         
    And the user enters a brief description of proposed activities    
    And the user describes the services or products offered and how the business operates with the authority  
    And the user accepts the terms and conditions
    Then the user clicks on the Submit button
    @3  
Scenario: User submits EOI form successfully as the Commercial company FZ-LLC (Individual)
    Given the user is on the EOI form page
    When the user selects Company Type as Commercial company FZ-LLC (Individual)
    And the user provides the following Applicant Details for Commercial        
    And the user enters a brief description of proposed activities    
    And the user describes the services or products offered and how the business operates with the authority  
    And the user accepts the terms and conditions
    Then the user clicks on the Submit button
    @4
    Scenario: User submits EOI form successfully as the Commercial company FZ-LLC (Corporate)
    Given the user is on the EOI form page
    When the user selects Company Type as Commercial company FZ-LLC (Corporate)
    And the user provides the following Applicant Details for Commercial      
    And the user enters a brief description of proposed activities    
    And the user describes the services or products offered and how the business operates with the authority  
    And the user accepts the terms and conditions
    Then the user clicks on the Submit button