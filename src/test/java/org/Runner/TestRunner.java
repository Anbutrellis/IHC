package org.Runner;

import java.util.logging.LogManager;

import org.Uttility.JVMReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.core.logging.Logger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features\\IHC.feature", dryRun = false, glue = "org.Stepdefnitions", plugin = {
		"pretty", "json:src\\test\\resources\\reports\\jsonReport\\jsonReport.json" },tags = "@4")
public class TestRunner {
	@AfterClass
	public static void reports() {
		JVMReports.generateJVMReports("src\\test\\resources\\reports\\jsonReport\\jsonReport.json");

	}
}
