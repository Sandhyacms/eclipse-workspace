package com.training.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage {
	static WebDriver driver;
	public LoginPage() {
	super(driver=BaseTest.getDriver());
 addObject("Email",By.id("email_field"));
 addObject("password",By.id("password_field"));
 addObject("LogintoAccount",By.xpath("//button[contains(text(),'Login to Account')]"));

}
public void dragandDrop() {
	System.out.println("Implementation");
}
	
	
	
	
}