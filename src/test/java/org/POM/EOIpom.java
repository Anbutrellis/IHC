package org.POM;

import java.util.List;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EOIpom extends Baseclass {
	public EOIpom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Expression Of Interest']")
	private WebElement EOI;
	@FindBy(xpath="//label[@class='form-check-label']")
	private List<WebElement> companytype;
	@FindBy(id="LegalName")
	private WebElement companyname;
	@FindBy(id="POBox")
	private WebElement companypoboxno;
	@FindBy(id="City")
	private WebElement city;
	@FindBy(id="Address")
	private WebElement address;
	
	
	
	@FindBy(id="select2-Country-container")
	private WebElement country;
	@FindBy(xpath="//li[text()='United Arab Emirates']")
	private WebElement countryselect;
	
	
	@FindBy(id="Phone")
	private WebElement phone;
	@FindBy(id="EmailAddress")
	private WebElement email;
	@FindBy(id="DateOfIncorporation")
	private WebElement dateofincorporation;
	@FindBy(xpath="//td[@class='today day highlight-today']")
	private WebElement dateofincorporationselection;
	@FindBy(xpath="//span[@id='select2-CountryofIncorporationId-container']")
	private WebElement CountryofIncorporationdropdown;
	@FindBy (xpath="//li[text()='United Arab Emirates']")
	private WebElement UnitedArabEmirates;
	@FindBy(id="Website")
	private WebElement Website;
	@FindBy(id="ContactPersonName")
	private WebElement ContactPersonName;
	@FindBy(id="ContactPersonEmail")
	private WebElement ContactPersonEmail;
	@FindBy(id="ContactPersonAddress")
	private WebElement ContactPersonAddress;
	
	
	@FindBy(xpath="//span[@aria-labelledby='select2-ContactPersonNationality-container']")
	private WebElement ContactPersonNationality;
	@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--above']//li")
	private List<WebElement> ContactPersonNationalityselect;
	
	
	@FindBy(id="ContactPersonMobile")
	private WebElement ContactPersonMobile;
	@FindBy(xpath="//div[@class='choices__inner']")
	private WebElement proposedactivities;
	
	
	@FindBy(xpath="//div[@class='choices__item choices__item--choice choices__item--selectable']")
	private List<WebElement> proposedactivitiesselection;
	
	
	
	@FindBy(xpath="choices--CompanyActivity-item-choice-2")
	private WebElement proposedactivitiesselection2;
	@FindBy(id="whatServicesOrProductsOffers")
	private WebElement WhatServicesOrProductsOffers;
	@FindBy(xpath="//input[@name='TermAndConditions']")
	private WebElement TermAndConditions;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	
	
	public List<WebElement> getContactPersonNationalityselect() {
		return ContactPersonNationalityselect;
	}
	public WebElement getCountryofIncorporationdropdown() {
		return CountryofIncorporationdropdown;
	}
	public WebElement getUnitedArabEmirates() {
		return UnitedArabEmirates;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getEOI() {
		return EOI;
	}
	public List<WebElement> getCompanytype() {
		return companytype;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getCompanypoboxno() {
		return companypoboxno;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getCountryselect() {
		return countryselect;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getDateofincorporation() {
		return dateofincorporation;
	}
	public WebElement getDateofincorporationselection() {
		return dateofincorporationselection;
	}
	
	public WebElement getWebsite() {
		return Website;
	}
	public WebElement getContactPersonName() {
		return ContactPersonName;
	}
	public WebElement getContactPersonEmail() {
		return ContactPersonEmail;
	}
	public WebElement getContactPersonAddress() {
		return ContactPersonAddress;
	}
	public WebElement getContactPersonNationality() {
		return ContactPersonNationality;
	}
	public WebElement getContactPersonMobile() {
		return ContactPersonMobile;
	}
	public WebElement getProposedactivities() {
		return proposedactivities;
	}
	public List<WebElement> getProposedactivitiesselection() {
		return proposedactivitiesselection;
	}
	public WebElement getProposedactivitiesselection2() {
		return proposedactivitiesselection2;
	}
	public WebElement getWhatServicesOrProductsOffers() {
		return WhatServicesOrProductsOffers;
	}
	public WebElement getTermAndConditions() {
		return TermAndConditions;
	}
	
	
	

}
