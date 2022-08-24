package com.training.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage {
	static WebDriver driver;
	public HomePage() {
		super(driver=BaseTest.getDriver());
	 addObject("FirstName",By.id("userNav"));
	 addObject("FatherName",By.id("password"));
	}

}