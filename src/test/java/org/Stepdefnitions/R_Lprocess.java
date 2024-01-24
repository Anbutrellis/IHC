package org.Stepdefnitions;

import org.POM.R_LProcess;
import org.Uttility.Baseclass;
import org.junit.Assert;

public class R_Lprocess extends Baseclass {
	public static void main(String[] args) {
		Browerlauch("edge");
		url("https://202.131.99.210:82/");
		R_LProcess r=new R_LProcess();
		click(r.getLogin());
		sendkeys(r.getUsername(), "zu5j8xvem5@myinfoinc.com");
		sendkeys(r.getPassword(), "Trellis@123");
		click(r.getLoginbtn());
		
		
//		click(r.getOptions());
//		click(r.getNext1());
//		click(r.getFormationtype());
//		click(r.getNext2());
//		Assert.assertEquals("Verify the company name", "Aster Pharmacy", getattribute(r.getCompanyname()));
//		sendkeys(r.getDocuments1(), "E:\\IHC Project details\\ihc documents\\Board of Directors Resolution calling for the establishment of the branch at IHC.pdf");
//		sendkeys(r.getDocuments2(), "E:\\IHC Project details\\ihc documents\\Good Standing Certificate of the headquarter's.pdf");
//		sendkeys(r.getDocuments3(), "E:\\IHC Project details\\ihc documents\\Deed of Trust.pdf");
//		sendkeys(r.getDocuments4(), "E:\\IHC Project details\\ihc documents\\Good Standing Certificate of the headquarter's.pdf");
//		sendkeys(r.getDocuments5(), "E:\\IHC Project details\\ihc documents\\certificate-of-incumbency.pdf");
//		sendkeys(r.getDocuments6(), "E:\\IHC Project details\\ihc documents\\passport.pdf");
//		sendkeys(r.getDocuments7(), "E:\\IHC Project details\\ihc documents\\Annexes.pdf");
//		sendkeys(r.getDocuments8(), "E:\\IHC Project details\\ihc documents\\Annexes.pdf");
//		sendkeys(r.getDocuments9(), "E:\\IHC Project details\\ihc documents\\ImportLicense.pdf");
//		sendkeys(r.getDocuments10(), "E:\\IHC Project details\\ihc documents\\Annexes.pdf");
//		click(r.getBusinesstab());
//		sendkeys(r.getExecutiveSummary(), "Executive Summary");
//		sendkeys(r.getVisionAndMision(), "Vision & Mission");
//		sendkeys(r.getActivitiesOrServices(), "The Activities/Services");
//		click(r.getSDGs());
//		selectption("byvalue", r.getSDGDetails(), "3");
//		sendkeys(r.getActivityDetails(), "Activity Details");
//		click(r.getSavebtn());
//		click(r.getCountryselect());
//		click(r.getCountry1());
//		click(r.getCountry2());
//		click(r.getCountry3());
//		sendkeys(r.getStrategicAlliances(), "Strategic Alliances");
//		sendkeys(r.getVendors(), "Vendors");
//		sendkeys(r.getTeamDetails(), "Team");
//		sendkeys(r.getProfessionalSupport(), "Professional Support");
//		sendkeys(r.getFundRaising(), "Fundraising");
//		sendkeys(r.getBoardOfAdvisors(), "Board Of Advisors");
//		sendkeys(r.getAssumptions(), "Assumptions");
//		sendkeys(r.getFinancialPlan(), "Financial Plan – Budget");
//		sendkeys(r.getAnnexesupload(), "E:\\IHC Project details\\ihc documents\\Annexes.pdf");
	click(r.getNext3());
		
//		sendkeys(r.getNoOfExistingBranches(),"3");
//		click(r.getLocationofexistingbranches());
//		click(r.getExistingbranch1());
//		click(r.getExistingbranch2());
//		click(r.getExistingbranch3());
//		sendkeys(r.getEstablishedCompany_Emirates(), "getEstablishedCompanyEmirates");
		click(r.getNext4());
		
		
//		click(r.getCompanyActivity());
//		click(r.getCompanyActivitychoices1());
//		click(r.getCompanyActivitychoices2());
//		click(r.getCompanyActivitychoices3());
		click(r.getNext5());
		
		
		click(r.getOfficespace());
		sendkeys(r.getInitialOfficeRequirement(), "200");
		sendkeys(r.getInitialWarehouseRequirement(), "650");
		click(r.getNext6());
		
		
		
	}

}
