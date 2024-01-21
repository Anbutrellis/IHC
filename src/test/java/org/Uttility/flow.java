package org.Uttility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class flow extends Baseclass {
	public static void main(String[] args) {
		Browerlauch("edge");
		url("https://202.131.99.210:82/");
		WebElement e = driver.findElement(By.xpath("//span[text()='Expression Of Interest']"));
		click(e);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='col-xl-3']"));
		click(e2.get(1));
		WebElement e3 = driver.findElement(By.id("LegalName"));
		sendkeys(e3, "Testdata");
		WebElement e4 = driver.findElement(By.id("POBox"));
		sendkeys(e4, "735686769287");
		WebElement e5 = driver.findElement(By.id("City"));
		sendkeys(e5, "dubai");
		WebElement e6 = driver.findElement(By.id("Address"));
		sendkeys(e6, "Testdata");
		click(driver.findElement(By.id("select2-Country-container")));
		click(driver.findElement(By.xpath("//li[text()='Belarus']")));
		sendkeys(driver.findElement(By.id("Phone")), "98676757655");
		sendkeys(driver.findElement(By.id("EmailAddress")), "Anbhbhbd@gmail.com");
		sendkeys(driver.findElement(By.id("DateOfIncorporation")), "12/12/2035");
		click(driver.findElement(By.xpath("//span[text()='Select country incorporation']")));
		click(driver.findElement(By.xpath("//li[text()='Aruba']")));
		sendkeys(driver.findElement(By.id("Website")), "www.test.com");
		sendkeys(driver.findElement(By.id("ContactPersonName")), "Testdata");
		sendkeys(driver.findElement(By.id("ContactPersonEmail")), "nbhbhbd@gmail.com");
		sendkeys(driver.findElement(By.id("ContactPersonAddress")), "Testdata");
		click(driver.findElement(By.id("select2-ContactPersonNationality-container")));
		click(driver.findElement(By.xpath("//li[text()='Mahoran']")));
		sendkeys(driver.findElement(By.id("ContactPersonMobile")), "873676209270");
		sendkeys(driver.findElement(By.id("whatServicesOrProductsOffers")), "Testdata");
		selectption("bytext", driver.findElement(By.id("CompanyActivity")), "1.1  Humanitarian Aid Material or Logistics (Non Food items “NFI”) ");
		selectption("bytext", driver.findElement(By.id("CompanyActivity")), "1.5  Construction & Rehabilitation");
		click(driver.findElement(By.name("TermAndConditions")));
	}

}
