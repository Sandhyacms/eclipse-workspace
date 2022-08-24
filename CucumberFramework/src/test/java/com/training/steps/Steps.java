package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@Given("User is on Salesforce login page")
	public void user_is_on_salesforce_login_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com");
	
	   
	}
	@Then("User enters username {string}")
	public void user_enters_username(String username) {
		driver.findElement(By.id("username")).sendKeys("username");
	    
	}
	@Then("Enters password {string}")
	public void enters_password(String password) {
		driver.findElement(By.id("password")).sendKeys("password");  
	}
	@Then("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();
	   
	}
	@Then("Click on RememberMe Checkbox")
	public void click_on_remember_me_checkbox() {
	driver.findElement(By.id("rememberUn")).click();  
	}

	


	  
	  }
