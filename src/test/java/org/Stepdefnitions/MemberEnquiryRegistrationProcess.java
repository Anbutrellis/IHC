package org.Stepdefnitions;

import org.POM.MemberEnquiryRegistration;
import org.Uttility.Baseclass;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class MemberEnquiryRegistrationProcess extends Baseclass{
	public static MemberEnquiryRegistration r=new MemberEnquiryRegistration();
	@Given("The user have login with vaild credential organization user")
	public void the_user_have_login_with_vaild_credential_organization_user() throws InterruptedException {
		url(Getdata("url"));
		click(r.getLogin());
		sendkeys(r.getUsername(), Getdata("email"));
		sendkeys(r.getPassword(), Getdata("newpwd"));
		click(r.getLoginbtn());
		
	}
	@When("The user navigate to the registration & renewel steps")
	public void the_user_navigate_to_the_registration_renewel_steps() {
		Assert.assertEquals("Verify the user navigate to the registration page", Getdata("registration"), r.getRegistration_renewal().getText());
	    
	}
	@When("The user have to choose the How did you here about us options")
	public void the_user_have_to_choose_the_how_did_you_here_about_us_options() {
//		click(r.getOptions());
//		click(r.getNext1());
	}
	@When("The user have to choose the formation type and it display the requried documents")
	public void the_user_have_to_choose_the_formation_type_and_it_display_the_requried_documents() {
		//click(r.getFormationtype());
	//	click(r.getNext2());
	}
	@When("The user have to upload the requried documents for company branch")
	public void the_user_have_to_upload_the_requried_documents_for_company_branch() {
//		Assert.assertEquals("Verify the company name", Getdata("companyname"), getattribute(r.getCompanyname()));
//		sendkeys(r.getDocuments1(), Getdata("pdf"));
//		sendkeys(r.getDocuments2(), Getdata("pdf"));
//		sendkeys(r.getDocuments3(), Getdata("pdf"));
//		sendkeys(r.getDocuments4(),Getdata("pdf"));
//		sendkeys(r.getDocuments5(), Getdata("pdf"));
//		sendkeys(r.getDocuments6(), Getdata("pdf"));
//		sendkeys(r.getDocuments7(), Getdata("pdf"));
//		sendkeys(r.getDocuments8(), Getdata("pdf"));
//		sendkeys(r.getDocuments9(), Getdata("pdf"));
//		sendkeys(r.getDocuments10(), Getdata("pdf"));
		
	}
	@When("The user have to fill the requried fields in the Business plan")
	public void the_user_have_to_fill_the_requried_fields_in_the_business_plan() {
//		click(r.getBusinesstab());
//		sendkeys(r.getExecutiveSummary(), "Executive Summary");
//		sendkeys(r.getVisionAndMision(), "Vision & Mission");
//		sendkeys(r.getActivitiesOrServices(), "The Activities/Services");
//		click(r.getSDGs());
//		selectption("byvalue", r.getSDGDetails(), "3");
//		sendkeys(r.getActivityDetails(), "Activity Details");
//		click(r.getSavebtn());
//		click(r.getCountryselect());
//		click(r.getCountry1());
//		click(r.getCountry2());
//		click(r.getCountry3());
//		sendkeys(r.getStrategicAlliances(), "Strategic Alliances");
//		sendkeys(r.getVendors(), "Vendors");
//		sendkeys(r.getTeamDetails(), "Team");
//		sendkeys(r.getProfessionalSupport(), "Professional Support");
//		sendkeys(r.getFundRaising(), "Fundraising");
//		sendkeys(r.getBoardOfAdvisors(), "Board Of Advisors");
//		sendkeys(r.getAssumptions(), "Assumptions");
//		sendkeys(r.getFinancialPlan(), "Financial Plan – Budget");
//	sendkeys(r.getAnnexesupload(), Getdata("pdf"));
	//click(r.getNext3());
		
	}
	@When("The user have to fill the requried fields in the Company Information")
	public void the_user_have_to_fill_the_requried_fields_in_the_company_information() {
//		sendkeys(r.getNoOfExistingBranches(),"3");
//		click(r.getLocationofexistingbranches());
//		click(r.getExistingbranch1());
//		click(r.getExistingbranch2());
//		click(r.getExistingbranch3());
//		click(r.getParentcmp());
//		click(r.getParentcmpselect());
	//	click(r.getNext4());
		
	}
	@When("The user have to select the Business Activities")
	public void the_user_have_to_select_the_business_activities() {
//		click(r.getCompanyActivity());
//		click(r.getCompanyActivitychoices1());
//		click(r.getCompanyActivitychoices2());
//		click(r.getCompanyActivitychoices3());
//		click(r.getNext5());
	}
	@When("The user have to select the types of facility and choose office space Requirement")
	public void the_user_have_to_select_the_types_of_facility_and_choose_office_space_requirement() {
//		click(r.getOfficespace());
//		sendkeys(r.getInitialOfficeRequirement(), "280");
//	sendkeys(r.getInitialWarehouseRequirement(), "650");
//		click(r.getNext6());
	}
	@When("The user have to select the employment visa requirements at Sum of the office space like per visa {int} Sq.m")
	public void the_user_have_to_select_the_employment_visa_requirements_at_sum_of_the_office_space_like_per_visa_sq_m(Integer int1) {
	//	click(r.getNext7());
	}
	@When("The user have to fill the UBO information in the UBO form")
	public void the_user_have_to_fill_the_ubo_information_in_the_ubo_form() {
//		click(r.getUBOform());
//		sendkeys(r.getUBOFullName(), "tester");
//		sendkeys(r.getUBODesignation(), "Tester");
//		sendkeys(r.getUBOEmail(), Getdata("email"));
//		sendkeys(r.getNumberOfShares(), "234");
//		click(r.getUBOSubmit());
		//click(r.getNext8());
	}
	@When("The user have to fil the Manager details")
	public void the_user_have_to_fil_the_manager_details() throws InterruptedException {
//		sendkeys(r.getAddManagerName(), "Milan");
//		click(r.getNationlitydropdown());
//		click(r.getSelectnationlity().get(2));
//		sendkeys(r.getAddManagerPassportNo(), "765292879876");
//		sendkeys(r.getAddManagerEmail(), Getdata("email"));
//		click(r.getAddManagerPassportExpiryDate());
//		click(r.getExpirydateselect());
//		click(r.getYeardateofbirth());
//		click(r.getDateofbirthselect());
//		sendkeys(r.getAddManagerMobileNo(), "68538726290");
//		sleep(2000);
//		click(r.getAddManagerGender());
//		click(r.getGendermale());
//		sendkeys(r.getAddManagerDesignation(), "Manager");
		//click(r.getNext9());
		

	}
	@When("The user have to fill the Nature of Business")
	public void the_user_have_to_fill_the_nature_of_business() {
		click(r.getNext10());
	}
	@When("The user have to validate the Application details")
	public void the_user_have_to_validate_the_application_details() {
		click(r.getNext11());
	}
	@When("The user have to done the payment")
	public void the_user_have_to_done_the_payment() {
		click(r.getNext12());
	}
	@Then("The user have to validate the Application submitted successfully")
	public void the_user_have_to_validate_the_application_submitted_successfully() {
	    Assert.assertEquals("Verify the Application Submitted Successfully", "Your application was submitted successfully !", r.getSubmittedsuccessfully().getText());
	    click(r.getGotoProfile());
	}


}
