package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choosing_Property extends Baseclass {
	public Choosing_Property() {
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
	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement Profile;
	@FindBy(xpath="//a[@href='#project-documents']")
	private WebElement documents;
	@FindBy(id="70")
	private WebElement document1;
	@FindBy(id="71")
	private WebElement document2;
	@FindBy(id="72")
	private WebElement document3;
	@FindBy(id="73")
	private WebElement document4;
	@FindBy(id="74")
	private WebElement document5;
	@FindBy(id="75")
	private WebElement document6;
	@FindBy(id="76")
	private WebElement document7;
	@FindBy(id="77")
	private WebElement document8;
	@FindBy(id="78")
	private WebElement document9;
	@FindBy(id="79")
	private WebElement document10;
	@FindBy(xpath="//button[@onclick='addCompanyDocumentDetails()']")
	private WebElement savebtn;
	@FindBy(id = "Rolenamespan")
	private WebElement verifyusername;
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
	public WebElement getProfile() {
		return Profile;
	}
	public WebElement getDocuments() {
		return documents;
	}
	public WebElement getDocument1() {
		return document1;
	}
	public WebElement getDocument2() {
		return document2;
	}
	public WebElement getDocument3() {
		return document3;
	}
	public WebElement getDocument4() {
		return document4;
	}
	public WebElement getDocument5() {
		return document5;
	}
	public WebElement getDocument6() {
		return document6;
	}
	public WebElement getDocument7() {
		return document7;
	}
	public WebElement getDocument8() {
		return document8;
	}
	public WebElement getDocument9() {
		return document9;
	}
	public WebElement getDocument10() {
		return document10;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getVerifyusername() {
		return verifyusername;
	}
	
	
	
}
