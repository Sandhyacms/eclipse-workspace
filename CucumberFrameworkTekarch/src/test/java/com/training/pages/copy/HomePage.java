package com.training.pages.copy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void BasePage() {
	 addObject("FirstName",By.id("userNav"));
	 addObject("FatherName",By.id("password"));
	}

}