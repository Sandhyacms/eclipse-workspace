package com.training.pages.copy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage {
	static WebDriver driver;
	public HomePage() {
		super(driver=BaseTest.getDriver());
		
	}

	public void BasePage() {
	 addObject("Name",By.id("name"));
	 addObject("FatherName",By.id("lname"));
	}

}