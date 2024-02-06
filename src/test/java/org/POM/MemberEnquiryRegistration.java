package org.POM;

import java.util.List;

import org.Uttility.Baseclass;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberEnquiryRegistration extends Baseclass {
	public MemberEnquiryRegistration() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginbtn;
	@FindBy(id = "6018")
	private WebElement options;
	@FindBy(xpath = "//button[@onclick='addHowDidYouHear(2)']")
	private WebElement next1;
	@FindBy(id = "check_2")
	private WebElement Formationtype;
	@FindBy(xpath = "//button[@onclick='addFormationType(3)']")
	private WebElement next2;
	@FindBy(id = "CompanyName")
	private WebElement companyname;
	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement documents1;
	@FindBy(xpath = "(//input[@type='file'])[2]")
	private WebElement documents2;
	@FindBy(xpath = "(//input[@type='file'])[3]")
	private WebElement documents3;
	@FindBy(xpath = "(//input[@type='file'])[4]")
	private WebElement documents4;
	@FindBy(xpath = "(//input[@type='file'])[5]")
	private WebElement documents5;
	@FindBy(xpath = "(//input[@type='file'])[6]")
	private WebElement documents6;
	@FindBy(xpath = "(//input[@type='file'])[7]")
	private WebElement documents7;
	@FindBy(xpath = "(//input[@type='file'])[8]")
	private WebElement documents8;
	@FindBy(xpath = "(//input[@type='file'])[9]")
	private WebElement documents9;
	@FindBy(xpath = "(//input[@type='file'])[10]")
	private WebElement documents10;
	@FindBy(xpath = "(//input[@type='file'])[11]")
	private WebElement documents11;
	@FindBy(id = "bpBtn")
	private WebElement businesstab;
	@FindBy(id = "ExecutiveSummary")
	private WebElement ExecutiveSummary;
	@FindBy(id = "VisionAndMision")
	private WebElement VisionAndMision;
	@FindBy(id = "ActivitiesOrServices")
	private WebElement ActivitiesOrServices;
	@FindBy(xpath = "(//input[@class='choices__input choices__input--cloned'])[1]")
	private WebElement Countryselect;
	@FindBy(xpath = "//div[@id='choices--CompanyBPTargetCountryselect-item-choice-25']")
	private WebElement country1;
	@FindBy(xpath = "//div[@id='choices--CompanyBPTargetCountryselect-item-choice-12']")
	private WebElement country2;
	@FindBy(xpath = "//div[@id='choices--CompanyBPTargetCountryselect-item-choice-33']")
	private WebElement country3;
	@FindBy(id = "btnAddSDGS")
	private WebElement SDGs;
	@FindBy(id = "SDGFormSDGId")
	private WebElement SDGDetails;
	@FindBy(id = "SDGFormActivityDetails")
	private WebElement ActivityDetails;
	@FindBy(id = "btnUpdateCompanySDGS")
	private WebElement savebtn;
	@FindBy(id = "StrategicAlliances")
	private WebElement StrategicAlliances;
	@FindBy(id = "Vendors")
	private WebElement Vendors;
	@FindBy(id = "TeamDetails")
	private WebElement TeamDetails;
	@FindBy(id = "ProfessionalSupport")
	private WebElement ProfessionalSupport;
	@FindBy(id = "FundRaising")
	private WebElement FundRaising;
	@FindBy(id = "BoardOfAdvisors")
	private WebElement BoardOfAdvisors;
	@FindBy(id = "Assumptions")
	private WebElement Assumptions;
	@FindBy(id = "FinancialPlan")
	private WebElement FinancialPlan;
	@FindBy(xpath = "(//input[@type='file'])[12]")
	private WebElement Annexesupload;
	@FindBy(xpath = "//button[@onclick='addCompanyName(4)']")
	private WebElement next3;
	@FindBy(id = "NoOfExistingBranches")
	private WebElement NoOfExistingBranches;
	@FindBy(xpath = "(//input[@class='choices__input choices__input--cloned'])[2]")
	private WebElement Locationofexistingbranches;
	@FindBy(id = "choices--LocationOfExistingBranchesComma-item-choice-21")
	private WebElement existingbranch1;
	@FindBy(id = "choices--LocationOfExistingBranchesComma-item-choice-12")
	private WebElement existingbranch2;
	@FindBy(id = "choices--LocationOfExistingBranchesComma-item-choice-17")
	private WebElement existingbranch3;
	@FindBy(id = "EstablishedCompany_Emirates")
	private WebElement EstablishedCompany_Emirates;
	@FindBy(xpath = "//button[@onclick='addCompanyInformation(5)']")
	private WebElement next4;
	@FindBy(xpath = "(//input[@class='choices__input choices__input--cloned'])[3]")
	private WebElement CompanyActivity;
	@FindBy(id = "choices--CompanyActivity-item-choice-2")
	private WebElement CompanyActivitychoices1;
	@FindBy(id = "choices--CompanyActivity-item-choice-4")
	private WebElement CompanyActivitychoices2;
	@FindBy(id = "choices--CompanyActivity-item-choice-6")
	private WebElement CompanyActivitychoices3;
	@FindBy(xpath = "//button[@onclick='addActivities(6)']")
	private WebElement next5;
	@FindBy(id = "InitialOfficeRequirement")
	private WebElement InitialOfficeRequirement;
	@FindBy(id = "InitialWarehouseRequirement")
	private WebElement InitialWarehouseRequirement;
	@FindBy(xpath = "//button[@onclick='addFacility(7)']")
	private WebElement next6;
	@FindBy(id = "office")
	private WebElement officespace;
	@FindBy(id = "BusinessCentre")
	private WebElement BusinessCentrespace;
	@FindBy(id = "Total_Visa_Rqmt")
	private WebElement TotalVisa;
	@FindBy(id = "Admin_Visa_Rqmt")
	private WebElement AdminVisa;
	@FindBy(id = "HigherMgmt_Visa_Rqmt")
	private WebElement HigherMgmtVisa;
	@FindBy(id = "MiddleMgmt_Visa_Rqmt")
	private WebElement MiddleMgmtVisa;
	@FindBy(id = "SkilledStaff_Visa_Rqmt")
	private WebElement SkilledStaffVisa;
	@FindBy(id = "Support_Visa_Rqmt")
	private WebElement SupportVisa;
	@FindBy(id = "AdminYr2_Visa_Rqmt")
	private WebElement AdminYr2Visa;
	@FindBy(id = "HigherMgmtYr2_Visa_Rqmt")
	private WebElement HigherMgmtYr2Visa;
	@FindBy(id = "MiddleMgmtYr2_Visa_Rqmt")
	private WebElement MiddleMgmtYr2Visa;
	@FindBy(id = "SkilledStaffYr2_Visa_Rqmt")
	private WebElement SkilledStaffYr2Visa;
	@FindBy(xpath = "//button[@onclick='addVisa(8)']")
	private WebElement next7;
	@FindBy(xpath = "//button[text()='UBO Form']")
	private WebElement UBOform;
	@FindBy(id = "uBOFullName")
	private WebElement UBOFullName;
	@FindBy(id = "uBOEmail")
	private WebElement UBOEmail;
	@FindBy(id = "uBODesignation")
	private WebElement UBODesignation;
	@FindBy(id = "uboSubmit")
	private WebElement UBOSubmit;
	@FindBy(xpath = "//button[@onclick='saveUBODetails(9)']")
	private WebElement next8;
	@FindBy(name = "Name")
	private WebElement AddManagerName;
	@FindBy(id = "select2-AddManagerNationalityId-container")
	private WebElement nationlitydropdown;
	@FindBy(xpath = "//li[@class='select2-results__option']")
	private List<WebElement> Selectnationlity;
	@FindBy(id = "AddManagerPassportNo")
	private WebElement AddManagerPassportNo;
	@FindBy(id = "AddManagerEmail")
	private WebElement AddManagerEmail;
	@FindBy(id = "AddManagerPassportExpiryDate")
	private WebElement AddManagerPassportExpiryDate;
	@FindBy(id = "AddManagerMobileNo")
	private WebElement AddManagerMobileNo;
	@FindBy(id = "AddManagerGender")
	private WebElement AddManagerGender;
	@FindBy(id = "AddManagerDesignation")
	private WebElement AddManagerDesignation;
	@FindBy(xpath = "//input[@name='DateOfBirth']")
	private WebElement AddManagerDateOfBirth;
	@FindBy(xpath = "//button[@onclick='addUpdateManager(10)']")
	private WebElement next9;
	@FindBy(xpath = "(//input[@aria-label='Year'])[6]")
	private WebElement yeardateofbirth;
	@FindBy(xpath = "//span[@aria-label='January 30, 1987']")
	private WebElement dateofbirthselect;
	@FindBy(xpath = "//button[@onclick='addNatureOfBusiness(11)']")
	private WebElement next10;
	@FindBy(xpath = "//span[@class='flatpickr-day today']")
	private WebElement expirydateselect;
	@FindBy(xpath = "//button[@onclick='markReviewCompleted(12)']")
	private WebElement next11;
	@FindBy(xpath = "//a[text()='Pay now']")
	private WebElement paynow;
	@FindBy(xpath = "//button[@onclick='paymentTabChange(1)']")
	private WebElement next12;
	@FindBy(xpath = "//h5[text()='Your application was submitted successfully !']")
	private WebElement submittedsuccessfully;
	@FindBy(xpath = "//button[@onclick='gotoProfile()']")
	private WebElement gotoProfile;
	@FindBy(xpath="(//input[@class='numInput cur-year'])[5]")
	private WebElement PassportExpiryDateyear;
	@FindBy(xpath="//h4[text()='Registration/Renewal Steps']")
	private WebElement Registration_renewal;
	
	
	
	
	public WebElement getRegistration_renewal() {
		return Registration_renewal;
	}

	public WebElement getPassportExpiryDateyear() {
		return PassportExpiryDateyear;
	}

	public WebElement getGotoProfile() {
		return gotoProfile;
	}

	public WebElement getSubmittedsuccessfully() {
		return submittedsuccessfully;
	}

	public WebElement getPaynow() {
		return paynow;
	}

	public WebElement getNext12() {
		return next12;
	}

	public WebElement getNext11() {
		return next11;
	}

	public WebElement getExpirydateselect() {
		return expirydateselect;
	}

	public WebElement getYeardateofbirth() {
		return yeardateofbirth;
	}

	public WebElement getDateofbirthselect() {
		return dateofbirthselect;
	}

	public WebElement getNext10() {
		return next10;
	}

	public WebElement getNext9() {
		return next9;
	}

	public WebElement getAddManagerDateOfBirth() {
		return AddManagerDateOfBirth;
	}

	public WebElement getUBOform() {
		return UBOform;
	}

	public WebElement getUBOFullName() {
		return UBOFullName;
	}

	public WebElement getUBOEmail() {
		return UBOEmail;
	}

	public WebElement getUBODesignation() {
		return UBODesignation;
	}

	public WebElement getUBOSubmit() {
		return UBOSubmit;
	}

	public WebElement getNext8() {
		return next8;
	}

	public WebElement getAddManagerName() {
		return AddManagerName;
	}

	public WebElement getNationlitydropdown() {
		return nationlitydropdown;
	}

	public List<WebElement> getSelectnationlity() {
		return Selectnationlity;
	}

	public WebElement getAddManagerPassportNo() {
		return AddManagerPassportNo;
	}

	public WebElement getAddManagerEmail() {
		return AddManagerEmail;
	}

	public WebElement getAddManagerPassportExpiryDate() {
		return AddManagerPassportExpiryDate;
	}

	public WebElement getAddManagerMobileNo() {
		return AddManagerMobileNo;
	}

	public WebElement getAddManagerGender() {
		return AddManagerGender;
	}

	public WebElement getAddManagerDesignation() {
		return AddManagerDesignation;
	}

	public WebElement getTotalVisa() {
		return TotalVisa;
	}

	public WebElement getAdminVisa() {
		return AdminVisa;
	}

	public WebElement getHigherMgmtVisa() {
		return HigherMgmtVisa;
	}

	public WebElement getMiddleMgmtVisa() {
		return MiddleMgmtVisa;
	}

	public WebElement getSkilledStaffVisa() {
		return SkilledStaffVisa;
	}

	public WebElement getSupportVisa() {
		return SupportVisa;
	}

	public WebElement getAdminYr2Visa() {
		return AdminYr2Visa;
	}

	public WebElement getHigherMgmtYr2Visa() {
		return HigherMgmtYr2Visa;
	}

	public WebElement getMiddleMgmtYr2Visa() {
		return MiddleMgmtYr2Visa;
	}

	public WebElement getSkilledStaffYr2Visa() {
		return SkilledStaffYr2Visa;
	}

	public WebElement getNext7() {
		return next7;
	}

	public WebElement getOfficespace() {
		return officespace;
	}

	public WebElement getBusinessCentrespace() {
		return BusinessCentrespace;
	}

	public WebElement getInitialOfficeRequirement() {
		return InitialOfficeRequirement;
	}

	public WebElement getInitialWarehouseRequirement() {
		return InitialWarehouseRequirement;
	}

	public WebElement getNext6() {
		return next6;
	}

	public WebElement getCompanyActivity() {
		return CompanyActivity;
	}

	public WebElement getCompanyActivitychoices1() {
		return CompanyActivitychoices1;
	}

	public WebElement getCompanyActivitychoices2() {
		return CompanyActivitychoices2;
	}

	public WebElement getCompanyActivitychoices3() {
		return CompanyActivitychoices3;
	}

	public WebElement getNext5() {
		return next5;
	}

	public WebElement getEstablishedCompany_Emirates() {
		return EstablishedCompany_Emirates;
	}

	public WebElement getNext4() {
		return next4;
	}

	public WebElement getNoOfExistingBranches() {
		return NoOfExistingBranches;
	}

	public WebElement getLocationofexistingbranches() {
		return Locationofexistingbranches;
	}

	public WebElement getExistingbranch1() {
		return existingbranch1;
	}

	public WebElement getExistingbranch2() {
		return existingbranch2;
	}

	public WebElement getExistingbranch3() {
		return existingbranch3;
	}

	public WebElement getCountry1() {
		return country1;
	}

	public WebElement getCountry2() {
		return country2;
	}

	public WebElement getCountry3() {
		return country3;
	}

	public WebElement getLogin() {
		return login;
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
