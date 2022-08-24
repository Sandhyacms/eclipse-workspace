package com.training.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage {
	static WebDriver driver;
	public LoginPage() {
	super(driver=BaseTest.getDriver());
 addObject("UserMenu",By.id("userNav"));
 addObject("password",By.id("password"));
 addObject("Login",By.id("Login"));
 addObject("RememberMe",By.id("rememberUn"));
 addObject("errorMassage",By.id("error"));
}
public void dragandDrop() {
	System.out.println("Implementation");
}
	
	
	
	
}