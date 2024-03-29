package org.Stepdefnitions;

import org.POM.EOIpom;
import org.Uttility.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class EOI extends Baseclass {
	public static EOIpom e = new EOIpom();

	@Given("the user is on the EOI form page")
	public void the_user_is_on_the_eoi_form_page() {
		
		url(Getdata("url"));
		click(e.getEOI());

	}

	@When("the user selects Company Type as Branch of Humanitarian organization")
	public void the_user_selects_company_type_as_branch_of_humanitarian_organization() {

		click(e.getCompanytype().get(1));
	}

	@When("the user provides the following Applicant Details")
	public void the_user_provides_the_following_applicant_details() {
		sendkeys(e.getCompanyname(), "QATests");
		sendkeys(e.getCompanypoboxno(), "735686769287");
		sendkeys(e.getCity(), "dubai");
		sendkeys(e.getAddress(),
				"ENOC site 1086 petrol pump Emirates Hills 3 Opposite to Emirates International School Meadows Dubai - United Arab Emirates");
		click(e.getCountry());
		click(e.getCountryselect());
		sendkeys(e.getPhone(), "98676757655");
		sendkeys(e.getWebsite(), "www.test.com");
		click(e.getDateofincorporation());
		click(e.getDateofincorporationselection());
		click(e.getCountryofIncorporationdropdown());
		click(e.getUnitedArabEmirates());

		
		sendkeys(e.getContactPersonName(), "Victor");
		sendkeys(e.getContactPersonEmail(), Getdata("email"));
		sendkeys(e.getContactPersonAddress(), "25,Arcot road,Chennai");
		sleep(2000);
		click(e.getContactPersonNationality());
		Actionclass("movetoelementclick", e.getContactPersonNationalityselect().get(3));

		sendkeys(e.getContactPersonMobile(), "873676209270");

	}

	@When("the user enters a brief description of proposed activities")
	public void the_user_enters_a_brief_description_of_proposed_activities() {
		click(e.getProposedactivities());
		sleep(2000);
		click(e.getProposedactivitiesselection().get(4));
		click(e.getProposedactivitiesselection().get(6));

	}

	@When("the user describes the services or products offered and how the business operates with the authority")
	public void the_user_describes_the_services_or_products_offered_and_how_the_business_operates_with_the_authority() {
		sendkeys(e.getWhatServicesOrProductsOffers(), "Testdata");
	}

	@When("the user accepts the terms and conditions")
	public void the_user_accepts_the_terms_and_conditions() {
		click(e.getTermAndConditions());
	}

	@Then("the user clicks on the Submit button")
	public void the_user_clicks_on_the_submit_button() {
		click(e.getSubmit());

	}

	@When("the user provides the following Applicant Details for Commercial")
	public void the_user_provides_the_following_applicant_details_for_commercial() {
		sendkeys(e.getCompanyname(), "Aster Pharmacy");
		sendkeys(e.getCompanypoboxno(), "735686769287");
		sendkeys(e.getCity(), "dubai");
		sendkeys(e.getAddress(),
				"ENOC site 1086 petrol pump Emirates Hills 3 Opposite to Emirates International School Meadows Dubai - United Arab Emirates");
		click(e.getCountry());
		click(e.getCountryselect());

		sendkeys(e.getPhone(), "98676757655");

		sendkeys(e.getWebsite(), "www.test.com");
		sendkeys(e.getContactPersonName(), "Victor");
		sendkeys(e.getContactPersonEmail(), "b6reqy855u@greencafe24.com");
		sendkeys(e.getContactPersonAddress(), "25,Arcot road,Chennai");
		click(e.getContactPersonNationality());
		click(e.getContactPersonNationalityselect().get(3));

		sendkeys(e.getContactPersonMobile(), "873676209270");

	}

	@When("the user selects Company Type as Branch of commercial company")
	public void the_user_selects_company_type_as_branch_of_commercial_company() {

		click(e.getCompanytype().get(1));
	}

	@When("the user selects Company Type as Commercial company FZ-LLC \\(Individual)")
	public void the_user_selects_company_type_as_commercial_company_fz_llc_individual() {

		click(e.getCompanytype().get(2));
	}

	@When("the user selects Company Type as Commercial company FZ-LLC \\(Corporate)")
	public void the_user_selects_company_type_as_commercial_company_fz_llc_corporate() {

		click(e.getCompanytype().get(3));
	}

}
