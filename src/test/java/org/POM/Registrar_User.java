package org.POM;

import java.util.List;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrar_User extends Baseclass{
	public Registrar_User() {
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

	@FindBy(xpath="//a[@href='#project-feedback']")
	private WebElement Feedbacktab;
	
	@FindBy(xpath="//h6[@class='fs-14 mb-1']")
	private List<WebElement> Approvalname;
	
	@FindBy(id="btnNsStatus")
	private WebElement btnNsStatus;
	
	@FindBy(xpath="//a[text()='Review Completed']")
	private List<WebElement> ReviewCompleted;
	
	@FindBy(id="btnMofaicStatus")
	private WebElement btnMofaicStatus;
	
	@FindBy(id="btnIacadStatus")
	private WebElement btnIacadStatus;
	
	@FindBy(id="dropdownMenuReference")
	private WebElement finalapprove;
	
	@FindBy(id="nsTextArea")
	private WebElement nsTextArea;
	
	@FindBy(id="mofaicTextArea")
	private WebElement mofaicTextArea;
	
	@FindBy(id="iacadTextArea")
	private WebElement iacadTextArea;
	
	@FindBy(id="statusfeedback")
	private WebElement statusfeedback;
	
	@FindBy(xpath="(//button[text()='Update'])[1]")
	private WebElement update;
	
	@FindBy(id="btnNSecurity")
	private WebElement btnNSecuritysubmit;
	
	@FindBy(id="btnMofaic")
	private WebElement btnMofaicsubmit;
	
	@FindBy(id="btnIacad")
	private WebElement btnIacadsubmit;
	
	
	
	
	
	
	public WebElement getNsTextArea() {
		return nsTextArea;
	}

	public WebElement getMofaicTextArea() {
		return mofaicTextArea;
	}

	public WebElement getIacadTextArea() {
		return iacadTextArea;
	}

	public WebElement getStatusfeedback() {
		return statusfeedback;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getBtnNSecuritysubmit() {
		return btnNSecuritysubmit;
	}

	public WebElement getBtnMofaicsubmit() {
		return btnMofaicsubmit;
	}

	public WebElement getBtnIacadsubmit() {
		return btnIacadsubmit;
	}

	public List<WebElement> getReviewCompleted() {
		return ReviewCompleted;
	}

	public WebElement getBtnNsStatus() {
		return btnNsStatus;
	}

	public WebElement getBtnMofaicStatus() {
		return btnMofaicStatus;
	}

	public WebElement getBtnIacadStatus() {
		return btnIacadStatus;
	}

	public WebElement getFinalapprove() {
		return finalapprove;
	}

	public WebElement getFeedbacktab() {
		return Feedbacktab;
	}

	public List<WebElement> getApprovalname() {
		return Approvalname;
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
