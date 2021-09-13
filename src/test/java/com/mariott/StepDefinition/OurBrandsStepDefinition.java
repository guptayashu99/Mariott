package com.mariott.StepDefinition;



import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.mariott.ReusableComponents.WebDriverHelper;
import com.mariott.Utility.ExtentReportGenerator;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.mariott.PageObjects.HomePage;
import com.mariott.ReusableComponents.ReusableMethods;

public class OurBrandsStepDefinition {
	WebDriver driver;
	String title;
	HomePage hp = new HomePage();
	ExtentReportGenerator erg = new ExtentReportGenerator();
	ExtentReports reporter;
	static ExtentTest test;
	

	@Given("^We are at Mariott Website$")
	public void we_are_at_Mariott_Website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reporter = ExtentReportGenerator.generateReport();
		test = reporter.createTest("Our Brand");
		   driver = WebDriverHelper.initializeDriver();
		   ReusableMethods.getURL(driver);
			erg.extentAdd("Open Website", "pass", test);
	}

	@When("^Our Brands link is clicked$")
	public void our_Brands_link_is_clicked() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   hp.getOurBrands(driver);
		erg.extentAdd("Click Our Brands", "pass", test);
	}


	@Then("^JW Mariott should be present in the list$")
	public void jw_Mariott_should_be_present_in_the_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   hp.verifyJW(driver);
		erg.extentAdd("Verify Jw Mariott", "pass", test);
	}
}
