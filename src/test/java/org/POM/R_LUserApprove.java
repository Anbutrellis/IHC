package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class R_LUserApprove extends Baseclass {
	public R_LUserApprove() {
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

	@FindBy(id = "CompanyName")
	private WebElement searchcompany;

	@FindBy(id = "search")
	private WebElement applyfilter;
	@FindBy(id = "RnLListDateRangeType")
	private WebElement daterangetype;

	@FindBy(xpath = "//i[@class='ri-eye-fill fs-16']")
	private WebElement actions;
	@FindBy(id = "dropdownMenuReference")
	private WebElement dropdownMenu;
	@FindBy(xpath = "//a[text()='Review Completed']")
	private WebElement ReviewCompleted;

	@FindBy(id = "statusfeedback")
	private WebElement statusfeedback;

	@FindBy(xpath = "//button[@onclick='updateStatusOfRequest()']")
	private WebElement update;
	@FindBy(id = "swal2-title")
	private WebElement verifysuccess;
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okbtn;
	@FindBy(xpath = "//button[@onclick='openSceduleMeetingModal()']")
	private WebElement SceduleMeeting;
	@FindBy(id = "Subject")
	private WebElement Subject;
	@FindBy(id = "MeetingLocation")
	private WebElement MeetingLocation;
	@FindBy(id = "MeetingDate")
	private WebElement MeetingDate;
	@FindBy(id = "MeetingTime")
	private WebElement MeetingTime;
	@FindBy(xpath = "(//input[@class='choices__input choices__input--cloned'])[2]")
	private WebElement InviteAttendees;
	@FindBy(xpath = "//div[text()='gmhaske@trellissoft.ai']")
	private WebElement InviteAttendeesselect;
	@FindBy(xpath = "//button[@onclick='scheduleMeeting(0)']")
	private WebElement savebtn;
	@FindBy(xpath = "(//span[@class='flatpickr-day today'])[1]")
	private WebElement MeetingDateselect;
	@FindBy(xpath="(//span[@class='arrowUp'])[2]")
	private WebElement time;
	@FindBy(xpath="(//a[@class='nav-link profile fw-semibold'])[2]")
	private WebElement feedbacktab;
	@FindBy(id="RNLFeedbackStatus")
	private WebElement Meetingstatus;
	@FindBy(id="RNLRemark")
	private WebElement RNLRemark;
	@FindBy(id="RNLRecomendation")
	private WebElement RNLRecomendation;
	@FindBy(id="RNLConclusion")
	private WebElement RNLConclusion;
	@FindBy(xpath="(//button[text()='Save'])[1]")
	private WebElement RNLsavebtn;
	
	public WebElement getRNLsavebtn() {
		return RNLsavebtn;
	}

	public WebElement getFeedbacktab() {
		return feedbacktab;
	}

	public WebElement getMeetingstatus() {
		return Meetingstatus;
	}

	public WebElement getRNLRemark() {
		return RNLRemark;
	}

	public WebElement getRNLRecomendation() {
		return RNLRecomendation;
	}

	public WebElement getRNLConclusion() {
		return RNLConclusion;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getMeetingDateselect() {
		return MeetingDateselect;
	}

	public WebElement getSceduleMeeting() {
		return SceduleMeeting;
	}

	public WebElement getSubject() {
		return Subject;
	}

	public WebElement getMeetingLocation() {
		return MeetingLocation;
	}

	public WebElement getMeetingDate() {
		return MeetingDate;
	}

	public WebElement getMeetingTime() {
		return MeetingTime;
	}

	public WebElement getInviteAttendees() {
		return InviteAttendees;
	}

	public WebElement getInviteAttendeesselect() {
		return InviteAttendeesselect;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getOkbtn() {
		return okbtn;
	}

	public WebElement getVerifysuccess() {
		return verifysuccess;
	}

	public WebElement getActions() {
		return actions;
	}

	public WebElement getDropdownMenu() {
		return dropdownMenu;
	}

	public WebElement getReviewCompleted() {
		return ReviewCompleted;
	}

	public WebElement getStatusfeedback() {
		return statusfeedback;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getDaterangetype() {
		return daterangetype;
	}

	public WebElement getSearchcompany() {
		return searchcompany;
	}

	public WebElement getApplyfilter() {
		return applyfilter;
	}

	public WebElement getRequestlist() {
		return requestlist;
	}

	public WebElement getRegistrationrenewaldropdown() {
		return Registrationrenewaldropdown;
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

}
