package org.POM;

import org.Uttility.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EOI extends Baseclass {
	public EOI() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Expression Of Interest']")
	private WebElement EOI;
	
	

}
