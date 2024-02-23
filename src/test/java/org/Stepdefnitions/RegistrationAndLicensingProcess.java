package org.Stepdefnitions;

import org.POM.Choosing_Property;
import org.POM.Commitee_Feedback;
import org.POM.Compliance_User;
import org.POM.Finance_Audit;
import org.POM.Finance_user;
import org.POM.R_LUserApprove;
import org.POM.Registrar_User;
import org.Uttility.Baseclass;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class RegistrationAndLicensingProcess extends Baseclass {
	public static R_LUserApprove r = new R_LUserApprove();
	public static Commitee_Feedback c = new Commitee_Feedback();
	public static Finance_user f = new Finance_user();
	public static Compliance_User a = new Compliance_User();
	public static Finance_Audit b = new Finance_Audit();
	public static Registrar_User d = new Registrar_User();
	public static Choosing_Property e = new Choosing_Property();

	@Given("The user has to Navigate to the IHC login page")
	public void the_user_has_to_navigate_to_the_ihc_login_page() {
		url(Getdata("IHCurl"));

	}

	@When("The user has to login with a valid user credential for Finance user")
	public void the_user_has_to_login_with_a_valid_user_credential_for_finance_user() {
		sendkeys(f.getUsername(), Getdata("financeusername"));
		sendkeys(f.getPassword(), Getdata("financepwd"));
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
		sendkeys(r.getUsername(), Getdata("R&Lusername"));
		sendkeys(r.getPassword(), Getdata("R&Lpwd"));
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
//		click(r.getDropdownMenu());
//		click(r.getReviewCompleted());

	}

	@When("The user has to give feedback and update the status of the request for the Organization")
	public void the_user_has_to_give_feedback_and_update_the_status_of_the_request_for_the_organization() {
//		sendkeys(r.getStatusfeedback(), "Review Completed");
//		click(r.getUpdate());

	}

	@When("The user has to verify Whether the Successfully approved Organization Application")
	public void the_user_has_to_verify_whether_the_successfully_approved_organization_application() {
//		Assert.assertEquals("Verify The R&L memeber Apporved", "Success", r.getVerifysuccess().getText());
//		click(r.getOkbtn());
	}

	@Then("The user has to create one meeting and verify the meeting is created or not")
	public void the_user_has_to_create_one_meeting_and_verify_the_meeting_is_created_or_not() {
		click(r.getSceduleMeeting());
		sendkeys(r.getSubject(), "Application review");
		sendkeys(r.getMeetingLocation(), "dubai");
		click(r.getMeetingDate());
		click(r.getMeetingDateselect());
		click(r.getMeetingTime());
		setDefaultTimeUsingJQuery(r.getMeetingTime(), "10:35");
		click(r.getInviteAttendees());
		click(r.getInviteAttendeesselect());
		click(r.getSavebtn());
		Assert.assertEquals("Verify the Sucessfully Meeting created", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());
	}

	@When("The user has to login with a valid user crential for Committee Feedback user")
	public void the_user_has_to_login_with_a_valid_user_crential_for_committee_feedback_user() {
		sendkeys(c.getUsername(), Getdata("Commiteeusername"));
		sendkeys(c.getPassword(), Getdata("Commiteepwd"));
		click(c.getLoginbtn());
		Assert.assertEquals("Verify The User", "Committee Feedback", c.getVerifyusername().getText());

	}

	@When("The user has to click the Feedback Tab Approve the meeting and give the remark")
	public void the_user_has_to_click_the_feedback_tab_approve_the_meeting_and_give_the_remark() {
//		click(c.getFeedbacktab());
//
//		selectption("bytext", c.getFeedbackStatus(), "Approve");
//		sendkeys(c.getRemark(), "Approved");
//		click(c.getSubmitbtn());
	}

	@When("The user has to  verify the meeting is approved or not")
	public void the_user_has_to_verify_the_meeting_is_approved_or_not() {
//		Assert.assertEquals("Verify The R&L memeber Apporved", "Success", c.getVerifysuccess().getText());
//		click(c.getOkbtn());
		click(c.getUsericon());
		click(c.getLogout());

	}

	@Then("The user has to login to R&L member again to close the meeting")
	public void the_user_has_to_login_to_r_l_member_again_to_close_the_meeting() {

		sendkeys(r.getUsername(), Getdata("R&Lusername"));
		sendkeys(r.getPassword(), Getdata("R&Lpwd"));
		click(r.getLoginbtn());
		Assert.assertEquals("Verify The User", "R&L Member", r.getVerifyusername().getText());
		click(r.getRegistrationrenewaldropdown());
		click(r.getRequestlist());
		click(r.getActions());
		sleep(2000);
		click(r.getFeedbacktab());
		selectption("bytext", r.getMeetingstatus(), "Close");
		sendkeys(r.getRNLRecomendation(), "Recomendation");
		sendkeys(r.getRNLConclusion(), "conclusion");
		click(r.getRNLsavebtn());
		Assert.assertEquals("Verify the Sucessfully Meeting close", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());

	}

	@When("The user has to login with a valid user crential for	Compliance User")
	public void the_user_has_to_login_with_a_valid_user_crential_for_compliance_user_approval() {
		sendkeys(a.getUsername(), Getdata("Complianceusername"));
		sendkeys(a.getPassword(), Getdata("Compliancepwd"));
		click(a.getLoginbtn());
		Assert.assertEquals("Verify The User", "Compliance Verification", a.getVerifyusername().getText());

	}

	@Then("The user has go to the feedback tab for give Compliance feedback and verify it")
	public void the_user_has_go_to_the_feedback_tab_for_give_compliance_feedback_and_verify_it() {
		click(a.getFeedbacktab());
		selectption("bytext", a.getBussinessActivityDetails(), "Medium");
		selectption("bytext", a.getCompanyFormationStructure(), "Medium");
		selectption("bytext", a.getPropertyType(), "Medium");
		selectption("bytext", a.getGeographicRisk(), "Medium");
		click(a.getTotalRisk());
		click(a.getTotalriskselect());
		sendkeys(a.getComment(), "Risk is Medium");
		click(a.getSubmit());
		Assert.assertEquals("Verify the Sucessfully ", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());

	}

	@When("The user has to Login with a valid user crential for Finance Audit User")
	public void the_user_has_to_login_with_a_valid_user_crential_for_finance_audit_user_approval() {
		sendkeys(b.getUsername(), Getdata("FinanceAuditusername"));
		sendkeys(b.getPassword(), Getdata("FinanceAuditpwd"));
		click(b.getLoginbtn());
		Assert.assertEquals("Verify The User", "Finance Audit Review", b.getVerifyusername().getText());

	}

	@When("The user has go to the click Feedback tab and the Feedback form will be displayed with the number of days left for approval")
	public void the_user_has_go_to_the_click_feedback_tab_and_the_feedback_form_will_be_displayed_with_the_number_of_days_left_for_approval() {

		click(b.getFeedbacktab());
		Assert.assertFalse(b.getExpirydate().isDisplayed());
	}

	@When("The user has to Click on the submit button after you have completed the form and digitally signed your feedback")
	public void the_user_has_to_click_on_the_submit_button_after_you_have_completed_the_form_and_digitally_signed_your_feedback() {
		click(b.getStartDate());
		click(b.getFinancialStatementStartdate());
		sendkeys(b.getEndDate(), "02/23/2025");
		
		sendkeys(b.getExaminedBy(), "Finance Audit User");
		sendkeys(b.getTotalassets(), "3000");
		sendkeys(b.getTotalliabilities(), "1000");
		sendkeys(b.getCashAndBankBalances(), "1000");
		sendkeys(b.getTotalincome(), "1000");
		sendkeys(b.getTotalexpenses(), "500");
		sendkeys(b.getDebtEquityRatio(), "23");
		sendkeys(b.getCurrentRatio(), "30");
		sendkeys(b.getAssetTurnoverRatio(), "20");
		sendkeys(b.getViabilityRatio(), "10");
		sendkeys(b.getSavingsRatio(), "5");
		sendkeys(b.getProgramEfficiencyRatio(), "5");
		click(b.getParagraph());
		sendkeys(b.getParagraph(), "Review of Financial Report");
		sendkeys(b.getFinalComment(), "Finalcomment");
		Actions a = new Actions(driver);
		a.moveToElement(b.getSignaturepad()).click().perform();
		click(b.getSignaturepad());
		click(b.getSubmitbtn());
		click(b.getOkbtn());

	}

	@Then("The user has to verify the completed the Finance Audit Feedback and able to download the PDF")
	public void the_user_has_to_verify_the_completed_the_finance_audit_feedback_and_able_to_download_the_pdf() {
		Assert.assertEquals("Verify the Sucessfully Finance Audit Feedback ", " Completed", b.getCompleted().getText());
		click(b.getPdfdownload());
	}

	@When("The user has to Login with a valid user crential for Registrar User")
	public void the_user_has_to_login_with_a_valid_user_crential_for_registrar_user() {
		sendkeys(d.getUsername(), Getdata("Registrarusername"));
		sendkeys(d.getPassword(), Getdata("Registrarpwd"));
		click(d.getLoginbtn());
		Assert.assertEquals("Verify The User", "Registrar", b.getVerifyusername().getText());

	}

	@When("The user has to click Feedback tab able to view the three requests to review National Security Submission, MOFAIC Submission and IACAD Submission will be displayed with the number of days left for approval")
	public void the_user_has_to_click_feedback_tab_able_to_view_the_three_requests_to_review_national_security_submission_mofaic_submission_and_iacad_submission_will_be_displayed_with_the_number_of_days_left_for_approval() {
		sleep(3000);
		Actionclass("movetoelementclick", d.getFeedbacktab());

	}

	@When("The user has to Approve the request for National Security Submission, MOFAIC Submission and IACAD Submission")
	public void the_user_has_to_approve_the_request_for_national_security_submission_mofaic_submission_and_iacad_submission() {
		click(d.getBtnNsStatus());
		click(d.getReviewCompleted().get(1));
		sendkeys(d.getBtnNSecuritysubmit(), "Review Completed");
		click(d.getBtnMofaicStatus());
		click(d.getReviewCompleted().get(2));
		sendkeys(d.getBtnMofaicsubmit(), "Review Completed");
		click(d.getBtnIacadStatus());
		click(d.getReviewCompleted().get(3));
		sendkeys(d.getBtnIacadsubmit(), "Review Completed");

	}

	@Then("The user has to make the final approval for the Application and give remark for it")
	public void the_user_has_to_make_the_final_approval_for_the_application_and_give_remark_for_it() {
		click(d.getFinalapprove());
		click(d.getReviewCompleted().get(0));
		sendkeys(d.getStatusfeedback(), "Review Completed");
		click(d.getUpdate());
		Assert.assertEquals("Verify the Sucessfully Approval", "Success", r.getVerifysuccess().getText());
		click(r.getOkbtn());

	}

	@Given("The user has to Navigate to the Organization login page")
	public void the_user_has_to_navigate_to_the_organization_login_page() {
		url(Getdata("url"));
		click(e.getLogin());
	}

	@When("The user has to login with a valid user crential for Organization User")
	public void the_user_has_to_login_with_a_valid_user_crential_for_organization_user() {
		sendkeys(e.getUsername(), Getdata("email"));
		sendkeys(e.getPassword(), Getdata("newpwd"));
		click(e.getLoginbtn());
		Assert.assertEquals("Verify The User", "Organization User", b.getVerifyusername().getText());

	}

	@When("The user has to go the profile and click Documents")
	public void the_user_has_to_go_the_profile_and_click_documents() {
		click(e.getProfile());
		click(e.getDocuments());
	}

	@When("The user has to upload the required Documents")
	public void the_user_has_to_upload_the_required_documents() {
		sendkeys(e.getDocument1(), Getdata("pdf"));
		sendkeys(e.getDocument2(), Getdata("pdf"));
		sendkeys(e.getDocument3(), Getdata("pdf"));
		sendkeys(e.getDocument4(), Getdata("pdf"));
		sendkeys(e.getDocument5(), Getdata("pdf"));
		sendkeys(e.getDocument6(), Getdata("pdf"));
		sendkeys(e.getDocument7(), Getdata("pdf"));
		sendkeys(e.getDocument8(), Getdata("pdf"));
		sendkeys(e.getDocument9(), Getdata("pdf"));
		sendkeys(e.getDocument10(), Getdata("pdf"));
		click(e.getSavebtn());
		Assert.assertEquals("Verify the Sucessfully Approval", "Success", e.getVerifysuccess().getText());
		click(e.getOkbtn());

	}

	@When("The user has to Click Facility tab and select the required building from the Building drop-down")
	public void the_user_has_to_click_facility_tab_and_select_the_required_building_from_the_building_drop_down() {

	}

	@When("The user has to Select the required floor among the grey colored floors and once selected, the floor color will turn green")
	public void the_user_has_to_select_the_required_floor_among_the_grey_colored_floors_and_once_selected_the_floor_color_will_turn_green() {
	}

	@Then("The user has to	Click Add to Cart after selecting one floor after confirm the order")
	public void the_user_has_to_click_add_to_cart_after_selecting_one_floor_after_confirm_the_order() {
	}

}
