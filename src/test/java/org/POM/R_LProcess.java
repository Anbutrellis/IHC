package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class R_LProcess extends Baseclass {
	public R_LProcess() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="6018")
	private WebElement options;
	@FindBy(xpath="//button[@onclick='addHowDidYouHear(2)']")
	private WebElement next1;
	@FindBy(id="check_2")
	private WebElement Formationtype;
	@FindBy(xpath="//button[@onclick='addFormationType(3)']")
	private WebElement next2;
	@FindBy(id="CompanyName")
	private WebElement companyname;
	@FindBy(xpath="(//input[@type='file'])[1]")
	private WebElement documents1;
	@FindBy(xpath="(//input[@type='file'])[2]")
	private WebElement documents2;
	@FindBy(xpath="(//input[@type='file'])[3]")
	private WebElement documents3;
	@FindBy(xpath="(//input[@type='file'])[4]")
	private WebElement documents4;
	@FindBy(xpath="(//input[@type='file'])[5]")
	private WebElement documents5;
	@FindBy(xpath="(//input[@type='file'])[6]")
	private WebElement documents6;
	@FindBy(xpath="(//input[@type='file'])[7]")
	private WebElement documents7;
	@FindBy(xpath="(//input[@type='file'])[8]")
	private WebElement documents8;
	@FindBy(xpath="(//input[@type='file'])[9]")
	private WebElement documents9;
	@FindBy(xpath="(//input[@type='file'])[10]")
	private WebElement documents10;
	@FindBy(xpath="(//input[@type='file'])[11]")
	private WebElement documents11;
	@FindBy(id="bpBtn")
	private WebElement businesstab;
	@FindBy(id="ExecutiveSummary")
	private WebElement ExecutiveSummary;
	@FindBy(id="VisionAndMision")
	private WebElement VisionAndMision;
	@FindBy(id="ActivitiesOrServices")
	private WebElement ActivitiesOrServices;
	@FindBy(id="CompanyBPTargetCountryselect")
	private WebElement Countryselect;
	@FindBy(id="btnAddSDGS")
	private WebElement SDGs;
	@FindBy(id="SDGId")
	private WebElement SDGDetails;
	@FindBy(id="SDGFormActivityDetails")
	private WebElement ActivityDetails;
	@FindBy(id="btnUpdateCompanySDGS")
	private WebElement savebtn;
	@FindBy(id="StrategicAlliances")
	private WebElement StrategicAlliances;
	@FindBy(id="Vendors")
	private WebElement Vendors;
	@FindBy(id="TeamDetails")
	private WebElement TeamDetails;
	@FindBy(id="ProfessionalSupport")
	private WebElement ProfessionalSupport;
	@FindBy(id="FundRaising")
	private WebElement FundRaising;
	@FindBy(id="BoardOfAdvisors")
	private WebElement BoardOfAdvisors;
	@FindBy(id="Assumptions")
	private WebElement Assumptions;
	@FindBy(id="FinancialPlan")
	private WebElement FinancialPlan;
	@FindBy(xpath="(//input[@type='file'])[12]")
	private WebElement Annexesupload;
	@FindBy(xpath="//button[@onclick='addFormationType(4)']")
	private WebElement next3;
	public WebElement getOptions() {
		return options;
	}
	public WebElement getNext1() {
		return next1;
	}
	public WebElement getFormationtype() {
		return Formationtype;
	}
	public WebElement getNext2() {
		return next2;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getDocuments1() {
		return documents1;
	}
	public WebElement getDocuments2() {
		return documents2;
	}
	public WebElement getDocuments3() {
		return documents3;
	}
	public WebElement getDocuments4() {
		return documents4;
	}
	public WebElement getDocuments5() {
		return documents5;
	}
	public WebElement getDocuments6() {
		return documents6;
	}
	public WebElement getDocuments7() {
		return documents7;
	}
	public WebElement getDocuments8() {
		return documents8;
	}
	public WebElement getDocuments9() {
		return documents9;
	}
	public WebElement getDocuments10() {
		return documents10;
	}
	public WebElement getDocuments11() {
		return documents11;
	}
	public WebElement getBusinesstab() {
		return businesstab;
	}
	public WebElement getExecutiveSummary() {
		return ExecutiveSummary;
	}
	public WebElement getVisionAndMision() {
		return VisionAndMision;
	}
	public WebElement getActivitiesOrServices() {
		return ActivitiesOrServices;
	}
	public WebElement getCountryselect() {
		return Countryselect;
	}
	public WebElement getSDGs() {
		return SDGs;
	}
	public WebElement getSDGDetails() {
		return SDGDetails;
	}
	public WebElement getActivityDetails() {
		return ActivityDetails;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getStrategicAlliances() {
		return StrategicAlliances;
	}
	public WebElement getVendors() {
		return Vendors;
	}
	public WebElement getTeamDetails() {
		return TeamDetails;
	}
	public WebElement getProfessionalSupport() {
		return ProfessionalSupport;
	}
	public WebElement getFundRaising() {
		return FundRaising;
	}
	public WebElement getBoardOfAdvisors() {
		return BoardOfAdvisors;
	}
	public WebElement getAssumptions() {
		return Assumptions;
	}
	public WebElement getFinancialPlan() {
		return FinancialPlan;
	}
	public WebElement getAnnexesupload() {
		return Annexesupload;
	}
	public WebElement getNext3() {
		return next3;
	}
	

}
