package com.mariott.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.mariott.PageObjects.HomePage;
import com.mariott.PageObjects.HotelPage;
import com.mariott.ReusableComponents.ReusableMethods;
import com.mariott.ReusableComponents.WebDriverHelper;
import com.mariott.Utility.ExtentReportGenerator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindHotelStepDefinition {
	WebDriver driver;
	HomePage hp = new HomePage();
	HotelPage hpu = new HotelPage();
	ExtentReportGenerator erg = new ExtentReportGenerator();
	ExtentReports reporter;
	static ExtentTest test;
			
	@Given("^We are at the Mariott Website$")
	public void we_are_at_the_Mariott_Website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reporter = ExtentReportGenerator.generateReport();
		test = reporter.createTest("Find Hotel");
		driver = WebDriverHelper.initializeDriver();
		ReusableMethods.getURL(driver);
		erg.extentAdd("Open Website", "pass", test);
	}
	
    @When("^We enter Destination (.+)$")
    public void we_enter_destination(String city) throws Throwable {
        hp.getDestination(driver, city);
		erg.extentAdd("Enter City", "pass", test);
    }
    
    @And("^Click Find Hotels$")
    public void click_find_hotels() throws Throwable {
        hp.getFindHotel(driver);
		erg.extentAdd("Click Find Hotel", "pass", test);
    }

    @Then("^Verify if hotels are in that (.+)$")
    public void verify_if_hotels_are_in_that(String city) throws Throwable {
        hpu.getAddress(driver);
		erg.extentAdd("Verify Address", "pass", test);
    }

}
