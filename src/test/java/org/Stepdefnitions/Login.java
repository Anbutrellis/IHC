package org.Stepdefnitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import org.POM.login;
import org.Uttility.Baseclass;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class Login extends Baseclass {
	public static login l = new login();
	@Given("the User is on the IHC Homepage")
	public void the_user_is_on_the_ihc_homepage() {
		url("https://202.131.99.210:83/");
		
	   
	}
	@When("the user click on the login button and navigate to login page")
	public void the_user_click_on_the_login_button_and_navigate_to_login_page() {
		click(l.getLogin());
		//Assert.assertEquals("verify the Login page url", "https://202.131.99.210:83/organization/login", geturl());
	   
	}
	@When("the user enter the vaid crendential on the username and password")
	public void the_user_enter_the_vaid_crendential_on_the_username_and_password() {
		sendkeys(l.getUsername(), "b6reqy855u@greencafe24.com");
		sendkeys(l.getPassword(), "User@IHC@@2023$$");
	    
	}
	@When("the user click on the Login button and navigate to the password reset popoup")
	public void the_user_click_on_the_login_button_and_navigate_to_the_password_reset_popoup() {
		click(l.getLoginbtn());
	    
	}
	@When("the user reset the password and should be able to see Succesfully")
	public void the_user_reset_the_password_and_should_be_able_to_see_succesfully() {
		sendkeys(l.getOldPassword(), "User@IHC@@2023$$");
		sendkeys(l.getNewpassword(), "Trellis@123");
		click(l.getResetbtn());
		Assert.assertEquals("verify the Password Reset", "Your password has been changed successfully!", l.getVerifiypasswordreset().getText());
		click(l.getRelogin());
	}
	@Then("the user login with reset password")
	public void the_user_login_with_reset_password() {
	  	sendkeys(l.getUsername(), "zu5j8xvem5@myinfoinc.com");
		sendkeys(l.getPassword(), "Trellis@123");
		click(l.getLoginbtn());
		
	}


}
