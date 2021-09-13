package com.mariott.UIStore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	public By ourbrands = By.xpath("//p[contains(text(),'Our Brands')]");
	
	public By jwmariott = By.cssSelector(".t-brand-logo-icon-JW.t-alt-link.t-no-hover-link");
	
	public By destination = By.xpath("//input[@name='destinationAddress.destination']");
	
	public By findhotels = By.cssSelector("button.analytics-click.js-is-roomkey-enabled.m-button.m-button-primary");
	
	public By memberbenefits = By.xpath("//a[@title='Member Benefits ']");
	
	public By mobilecheck = By.xpath("//h3[contains(text(),'Mobile Check-In and Mobile Key')]");


}
