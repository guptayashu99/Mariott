package com.mariott.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mariott.ReusableComponents.ReusableMethods;
import com.mariott.UIStore.HotelPageUI;

public class HotelPage {
	
	HotelPageUI hpu = new HotelPageUI();
	
	public void getAddress(WebDriver driver) {
		WebElement add = ReusableMethods.getElement(driver,hpu.address);
		System.out.println(add.getAttribute("data-city"));
	}

}
