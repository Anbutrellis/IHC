package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finance_Audit extends Baseclass {
	public Finance_Audit() {
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

	@FindBy(xpath = "(//a[@class='nav-link profile fw-semibold'])[2]")
	private WebElement feedbacktab;

	@FindBy(xpath = "//small[@class='badge badge-soft-danger']")
	private WebElement expirydate;

	@FindBy(xpath = "//td[@class='today day highlight-today']")
	private WebElement FinancialStatementStartdate;
	
	@FindBy(id="startDate")
	private WebElement startDate;
	
	@FindBy(id="endDate")
	private WebElement endDate;
	
	@FindBy(xpath = "//td[@data-date='1709683200000']")
	private WebElement FinancialStatementenddate;

	@FindBy(id = "ExaminedBy")
	private WebElement ExaminedBy;

	@FindBy(id = "FinanceReviewReportViewModel_TotalAssets")
	private WebElement totalassets;

	@FindBy(id = "FinanceReviewReportViewModel_TotalLiabilities")
	private WebElement Totalliabilities;

	@FindBy(id = "FinanceReviewReportViewModel_CashAndBankBalances")
	private WebElement CashAndBankBalances;

	@FindBy(id = "FinanceReviewReportViewModel_TotalIncome")
	private WebElement totalincome;

	@FindBy(id = "FinanceReviewReportViewModel_TotalExpenses")
	private WebElement totalexpenses;

	@FindBy(id = "1")
	private WebElement DebtEquityRatio;

	@FindBy(id = "2")
	private WebElement CurrentRatio;

	@FindBy(id = "3")
	private WebElement AssetTurnoverRatio;

	@FindBy(id = "4")
	private WebElement ViabilityRatio;

	@FindBy(id = "5")
	private WebElement SavingsRatio;

	@FindBy(id = "6")
	private WebElement ProgramEfficiencyRatio;

	@FindBy(xpath = "//div[@class='ck ck-editor__main']")
	private WebElement Paragraph;

	@FindBy(id = "FinanceReviewReportViewModel_Feedback")
	private WebElement FinalComment;

	@FindBy(id = "signaturepad")
	private WebElement signaturepad;

	@FindBy(id = "btnAudit")
	private WebElement submitbtn;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okbtn;
	
	@FindBy(id = "swal2-title")
	private WebElement verifysuccess;

	@FindBy(xpath = "//span[text()=' Completed']")
	private WebElement completed;

	@FindBy(id = "pdfmodalopen")
	private WebElement pdfdownload;
	
	

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getCompleted() {
		return completed;
	}

	public WebElement getPdfdownload() {
		return pdfdownload;
	}

	public WebElement getOkbtn() {
		return okbtn;
	}

	public WebElement getVerifysuccess() {
		return verifysuccess;
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

	public WebElement getActions() {
		return actions;
	}

	public WebElement getFeedbacktab() {
		return feedbacktab;
	}

	public WebElement getExpirydate() {
		return expirydate;
	}

	public WebElement getFinancialStatementStartdate() {
		return FinancialStatementStartdate;
	}

	public WebElement getFinancialStatementenddate() {
		return FinancialStatementenddate;
	}

	public WebElement getExaminedBy() {
		return ExaminedBy;
	}

	public WebElement getTotalassets() {
		return totalassets;
	}

	public WebElement getTotalliabilities() {
		return Totalliabilities;
	}

	public WebElement getCashAndBankBalances() {
		return CashAndBankBalances;
	}

	public WebElement getTotalincome() {
		return totalincome;
	}

	public WebElement getTotalexpenses() {
		return totalexpenses;
	}

	public WebElement getDebtEquityRatio() {
		return DebtEquityRatio;
	}

	public WebElement getCurrentRatio() {
		return CurrentRatio;
	}

	public WebElement getAssetTurnoverRatio() {
		return AssetTurnoverRatio;
	}

	public WebElement getViabilityRatio() {
		return ViabilityRatio;
	}

	public WebElement getSavingsRatio() {
		return SavingsRatio;
	}

	public WebElement getProgramEfficiencyRatio() {
		return ProgramEfficiencyRatio;
	}

	public WebElement getParagraph() {
		return Paragraph;
	}

	public WebElement getFinalComment() {
		return FinalComment;
	}

	public WebElement getSignaturepad() {
		return signaturepad;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
