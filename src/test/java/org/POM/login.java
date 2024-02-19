package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends Baseclass{
	public login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginbtn;
	@FindBy(id="newPassword")
	private WebElement Newpassword;
	@FindBy(xpath="//input[@onclick='changePassword()']")
	private WebElement resetbtn;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement relogin;
	@FindBy(xpath="//p[text()='Your password has been changed successfully!']")
	private WebElement verifiypasswordreset;
	@FindBy(id="oldPassword")
	private WebElement oldPassword;
	
	
	
	public WebElement getOldPassword() {
		return oldPassword;
	}
	public WebElement getVerifiypasswordreset() {
		return verifiypasswordreset;
	}
	public WebElement getRelogin() {
		return relogin;
	}
	public WebElement getResetbtn() {
		return resetbtn;
	}
	public WebElement getNewpassword() {
		return Newpassword;
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

}
