package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finance_user extends Baseclass {
	public Finance_user() {
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

	@FindBy(xpath = "//td[text()='QATests']//following::i[1]")
	private WebElement action;

	@FindBy(xpath = "//a[@onclick='refreshRequestDetailview()']")
	private WebElement verifythecompanyname;
	@FindBy(xpath = "//button[@id='dropdownMenuReference']")
	private WebElement dropdownMenuReference;
	@FindBy(xpath = "//a[text()='Approved']")
	private WebElement Approve;
	@FindBy(id="statusfeedback")
	private WebElement statusfeedback;
	@FindBy(xpath="//button[@onclick='updateStatusOfRequest()']")
	private WebElement updateStatusOfRequest;
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okbtn;
	@FindBy(id = "swal2-title")
	private WebElement verifysuccess;
	

	public WebElement getVerifysuccess() {
		return verifysuccess;
	}

	public WebElement getStatusfeedback() {
		return statusfeedback;
	}

	public WebElement getUpdateStatusOfRequest() {
		return updateStatusOfRequest;
	}

	public WebElement getOkbtn() {
		return okbtn;
	}

	public WebElement getDropdownMenuReference() {
		return dropdownMenuReference;
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

	public WebElement getAction() {
		return action;
	}

	public WebElement getVerifythecompanyname() {
		return verifythecompanyname;
	}

	public WebElement getApprove() {
		return Approve;
	}

}
