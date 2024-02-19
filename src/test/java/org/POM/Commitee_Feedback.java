package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Commitee_Feedback extends Baseclass {
	public Commitee_Feedback() {
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
	@FindBy(xpath = "//i[@class='ri-eye-fill fs-16']")
	private WebElement actions;
	@FindBy(xpath="(//a[@class='nav-link profile fw-semibold'])[1]")
	private WebElement Feedbacktab;
	@FindBy(id="FeedbackStatus")
	private WebElement FeedbackStatus;
	@FindBy(id="Remark")
	private WebElement Remark;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submitbtn;
	private WebElement verifysuccess;
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okbtn;
	@FindBy(id="page-header-user-dropdown")
	private WebElement usericon;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement logout;

	public WebElement getUsericon() {
		return usericon;
	}

	public WebElement getLogout() {
		return logout;
	}

	
	
	
	

	public WebElement getVerifysuccess() {
		return verifysuccess;
	}

	public WebElement getOkbtn() {
		return okbtn;
	}

	public WebElement getActions() {
		return actions;
	}

	public WebElement getFeedbacktab() {
		return Feedbacktab;
	}

	public WebElement getFeedbackStatus() {
		return FeedbackStatus;
	}

	public WebElement getRemark() {
		return Remark;
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
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
