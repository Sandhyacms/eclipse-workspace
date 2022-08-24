package com.training.pages.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void LoginPage() {

		addObject("UserMenu", By.id("userNav"));
		addObject("password", By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("RememberMe", By.id("rememberUn"));
		addObject("errorMassage", By.id("error"));
	}

	public void dragandDrop() {
		System.out.println("Implementation");
	}

}