package com.mariott.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.mariott.PageObjects.HomePage;
import com.mariott.ReusableComponents.ReusableMethods;
import com.mariott.ReusableComponents.WebDriverHelper;
import com.mariott.Utility.ExtentReportGenerator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MemberBenefitsStepDefinition {
	
	WebDriver driver;
	HomePage hp = new HomePage();
	ExtentReportGenerator erg = new ExtentReportGenerator();
	ExtentReports reporter;
	static ExtentTest test;
	
	@Given("^We are at the Mariott Wesite\\.$")
	public void we_are_at_the_Mariott_Wesite() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reporter = ExtentReportGenerator.generateReport();
		test = reporter.createTest("Membership Benefit");
		   driver = WebDriverHelper.initializeDriver();
		   ReusableMethods.getURL(driver);
			erg.extentAdd("Open Website", "pass", test);
	}

	@When("^we click on Member Benefits$")
	public void we_click_on_Member_Benefits() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hp.getMemberBenefits(driver);
		erg.extentAdd("Click Membership Benefit", "pass", test);
	}

	@Then("^Member Benefits Page should Open$")
	public void member_Benefits_Page_should_Open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		erg.extentAdd("Click Membership Benefit Page", "pass", test);
	}

	@And("^Mobile Checkin and Mobile Key should be visible$")
	public void mobile_Checkin_and_Mobile_Key_should_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hp.getMobileCheck(driver);
		erg.extentAdd("Check Mobile Check-In and Key", "pass", test);

	}

}
