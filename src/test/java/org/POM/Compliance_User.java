package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compliance_User extends Baseclass {
	public Compliance_User() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='Input.Username']")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginbtn;

	@FindBy(id = "Rolenamespan")
	private WebElement verifyusername;
	
	@FindBy(xpath = "//span[text()='Registration/Renewal']")
	private WebElement Registrationrenewaldropdown;
	@FindBy(xpath = "(//a[text()=' Request List '])[1]")
	private WebElement requestlist;
	@FindBy(xpath="(//a[@class='nav-link profile fw-semibold'])[2]")
	private WebElement feedbacktab;
	@FindBy(id="bussinessActivityDetails")
	private WebElement bussinessActivityDetails;
	@FindBy(id="companyFormationStructure")
	private WebElement companyFormationStructure;
	@FindBy(id="propertyType")
	private WebElement propertyType;
	@FindBy(id="geographicRisk")
	private WebElement geographicRisk;
	@FindBy(xpath="(//div[@class='col-xl-6'])[2]//following::select[@id='totalRisk']")
	private WebElement totalRisk;
	@FindBy(xpath="(//option[@value='1053'])[5]")
	private WebElement totalriskselect;
	@FindBy(id="comment")
	private WebElement comment;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	@FindBy(xpath = "//i[@class='ri-eye-fill fs-16']")
	private WebElement actions;
	
	public WebElement getTotalriskselect() {
		return totalriskselect;
	}
	public WebElement getActions() {
		return actions;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getVerifyusername() {
		return verifyusername;
	}
	public WebElement getRegistrationrenewaldropdown() {
		return Registrationrenewaldropdown;
	}
	public WebElement getRequestlist() {
		return requestlist;
	}
	public WebElement getFeedbacktab() {
		return feedbacktab;
	}
	public WebElement getBussinessActivityDetails() {
		return bussinessActivityDetails;
	}
	public WebElement getCompanyFormationStructure() {
		return companyFormationStructure;
	}
	public WebElement getPropertyType() {
		return propertyType;
	}
	public WebElement getGeographicRisk() {
		return geographicRisk;
	}
	public WebElement getTotalRisk() {
		return totalRisk;
	}
	public WebElement getComment() {
		return comment;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
