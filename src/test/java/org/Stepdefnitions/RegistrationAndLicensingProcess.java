package org.Stepdefnitions;

import java.time.Duration;

import org.POM.Commitee_Feedback;
import org.POM.Compliance_User;
import org.POM.Finance_user;
import org.POM.R_LUserApprove;
import org.Uttility.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class RegistrationAndLicensingProcess
 extends Baseclass {
	public static R_LUserApprove r=new R_LUserApprove();
	public static Commitee_Feedback c = new Commitee_Feedback();
	public static Finance_user f=new Finance_user();
	public static Compliance_User a = new Compliance_User();
	
	@Given("The user has to Navigate to the IHC login page")
	public void the_user_has_to_navigate_to_the_ihc_login_page() {
		url("https://202.131.99.210:83/ihc/login");
		
	}
	@When("The user has to login with a valid user credential for Finance user")
	public void the_user_has_to_login_with_a_valid_user_credential_for_finance_user() {
	sendkeys(f.getUsername(), "pvihang@trellissoft.ai");
	sendkeys(f.getPassword(), "Admin@Trellis@@2022$$");
	click(f.getLoginbtn());
	}
	@When("The user has to click the action of the eye icon for the required user to be approved")
	public void the_user_has_to_click_the_action_of_the_eye_icon_for_the_required_user_to_be_approved() {
		click(f.getAction());
	}
	@When("The user has to select Approved from the dropdownMenuReference")
	public void the_user_has_to_select_approved_from_the_dropdown_menu_reference() {
		click(r.getDropdownMenu());
		click(f.getApprove());
		
	}
	@When("The user has to give feedback and update the status of the request")
	public void the_user_has_to_give_feedback_and_update_the_status_of_the_request() {
		sendkeys(f.getStatusfeedback(), "Payment Approved");
		click(f.getUpdateStatusOfRequest());
		
		
		 
	}
	@Then("The user has to verify Whether the Successfully approved")
	public void the_user_has_to_verify_whether_the_successfully_approved() {
		Assert.assertEquals("Verify the Approved the Payment", "Success", f.getVerifysuccess().getText());
		click(f.getOkbtn());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("The user has to login with a valid user crential for R&L user")
	public void the_user_has_to_login_with_a_valid_user_crential_for_r_l_user() {
		sendkeys(r.getUsername(), "Sara.Ali.Mohammed.Mustafa");
		sendkeys(r.getPassword(), "Admin@Trellis@@2022$$");
		click(r.getLoginbtn());
		
		Assert.assertEquals("Verify The User", "R&L Member", r.getVerifyusername().getText());
		
	}
	@When("The user has to click the  Registration\\/Renewal dropdown and click the Request List")
	public void the_user_has_to_click_the_registration_renewal_dropdown_and_click_the_request_list() {
		click(r.getRegistrationrenewaldropdown());
		click(r.getRequestlist());
	}
	@When("The user has to select Approved from the dropdownMenu")
	public void the_user_has_to_select_approved_from_the_dropdown_menu() {
		click(r.getDropdownMenu());
		click(r.getReviewCompleted());
		
	}
	@When("The user has to give feedback and update the status of the request for the Organization")
	public void the_user_has_to_give_feedback_and_update_the_status_of_the_request_for_the_organization() {
		sendkeys(r.getStatusfeedback(), "Review Completed");
		click(r.getUpdate());
		
		
	}
	@When("The user has to verify Whether the Successfully approved Organization Application")
	public void the_user_has_to_verify_whether_the_successfully_approved_organization_application() {
		Assert.assertEquals("Verify The R&L memeber Apporved", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());
	}
	@Then("The user has to create one meeting and verify the meeting is created or not")
	public void the_user_has_to_create_one_meeting_and_verify_the_meeting_is_created_or_not() {
		click(r.getSceduleMeeting());
		sendkeys(r.getSubject(), "Application review");
		sendkeys(r.getMeetingLocation(),"dubai");
		click(r.getMeetingDate());
		click(r.getMeetingDateselect());
		click(r.getMeetingTime());
		loop(7, r.getTime());
		click(r.getInviteAttendees());
		click(r.getInviteAttendeesselect());
		click(r.getSavebtn());
		Assert.assertEquals("Verify the Sucessfully Meeting created", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());
	}
	
	
	
	
	
	
	@When("The user has to login with a valid user crential for Committee Feedback user")
	public void the_user_has_to_login_with_a_valid_user_crential_for_committee_feedback_user() {
		sendkeys(c.getUsername(), "gmhaske@trellissoft.ai");
		sendkeys(c.getPassword(), "Admin@Trellis@@2022$$");
		click(c.getLoginbtn());
		Assert.assertEquals("Verify The User", "Committee Feedback", c.getVerifyusername().getText());
		
	}
	@When("The user has to click the Feedback Tab Approve the meeting and give the remark")
	public void the_user_has_to_click_the_feedback_tab_approve_the_meeting_and_give_the_remark() {
		click(c.getFeedbacktab());
		
		selectption("bytext", c.getFeedbackStatus(), "Approve");
		sendkeys(c.getRemark(), "Approved");
		click(c.getSubmitbtn());
	}
	@When("The user has to  verify the meeting is approved or not")
	public void the_user_has_to_verify_the_meeting_is_approved_or_not() {
		Assert.assertEquals("Verify The R&L memeber Apporved", "Success", c.getVerifysuccess().getText());
		click(c.getOkbtn());
		click(c.getUsericon());
		click(c.getLogout());
		
	}
	@Then("The user has to login to R&L member again to close the meeting")
	public void the_user_has_to_login_to_r_l_member_again_to_close_the_meeting() {
		
		sendkeys(r.getUsername(), "Sara.Ali.Mohammed.Mustafa");
		sendkeys(r.getPassword(), "Admin@Trellis@@2022$$");
		click(r.getLoginbtn());
		Assert.assertEquals("Verify The User", "R&L Member", r.getVerifyusername().getText());
		click(r.getRegistrationrenewaldropdown());
		click(r.getRequestlist());
		click(r.getActions());
		click(r.getFeedbacktab());
		selectption("bytext", r.getMeetingstatus(), "Close");
		sendkeys(r.getRNLRemark(), "remark");
		sendkeys(r.getRNLRecomendation(), "Recomendation");
		sendkeys(r.getRNLConclusion(), "conclusion");
		click(r.getRNLsavebtn());
		Assert.assertEquals("Verify the Sucessfully Meeting close", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());

	}
	
	
	
	
	
	
	@When("The user has to login with a valid user crential for	Compliance User Approval")
	public void the_user_has_to_login_with_a_valid_user_crential_for_compliance_user_approval() {
		sendkeys(a.getUsername(),"Compliance@mailinator.com");
		sendkeys(a.getPassword(), "User@Trellis@@2022$$");
		click(a.getLoginbtn());
		Assert.assertEquals("Verify The User", "Compliance Verification", a.getVerifyusername().getText());
		
	}
	@Then("The user has go to the feedback tab for give Compliance feedback and verify it")
	public void the_user_has_go_to_the_feedback_tab_for_give_compliance_feedback_and_verify_it() {
		click(a.getFeedbacktab());
		selectption("bytext", a.getBussinessActivityDetails(),"Medium");
		selectption("bytext", a.getCompanyFormationStructure(), "Medium");
		selectption("bytext", a.getPropertyType(), "Medium");
		selectption("bytext", a.getGeographicRisk(), "Medium");
		click(a.getTotalRisk());
		click(a.getTotalriskselect());
		sendkeys(a.getComment(), "Risk is Medium");
		click(a.getSubmit());
		
	}


	
	
	


}
