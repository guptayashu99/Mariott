package com.mariott.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.mariott.ReusableComponents.ReusableMethods;
import com.mariott.UIStore.HomePageUI;
import com.mariott.Utility.ExtentReportGenerator;

public class HomePage {
	
	ReusableMethods rm = new ReusableMethods();
	HomePageUI hp = new HomePageUI();
	ExtentReportGenerator erg = new ExtentReportGenerator();

	
	public void getOurBrands(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(hp.ourbrands);
		
		
	}
	
	public void verifyJW(WebDriver driver) {
		WebElement jw = ReusableMethods.getElement(driver, hp.jwmariott);
		if(jw.getText().contains("JW Marriott")) {
			Assert.assertTrue(true);
		}
	}
	public void getDestination(WebDriver driver, String city) {
		WebElement dest = rm.getElement(driver, hp.destination);
		dest.click();
		dest.sendKeys(city);
	}
	
	public void getFindHotel(WebDriver driver) {
		//rm.getElement(driver, hp.findhotels).click();
		List<WebElement> find = driver.findElements(hp.findhotels);
		find.get(1).click();
		
	}
	public void getMemberBenefits(WebDriver driver) {
		rm.getElement(driver, hp.memberbenefits).click();
	}
	
	public void getMobileCheck(WebDriver driver) {
		WebElement mob = driver.findElement(hp.mobilecheck);
		String txt = mob.getText();
		System.out.println(txt);
		Assert.assertTrue(true);
	}
	

}
