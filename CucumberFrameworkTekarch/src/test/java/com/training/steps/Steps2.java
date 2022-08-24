package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps2 extends BaseTest {  
	WebDriver driver;
	BasePage page;
	PageFactory pageFactory = new PageFactory();
	
	@Before
	public void setup() throws IOException {
		launchApplication();
	}
	
	
	
	
	
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
	 page=pageFactory.initialize(pageName);   
	}

	@When("User enter into box {string} {string}")
	public void user_enter_into_box(String logicalName, String value) {
		page.enterintoTextBox(logicalName, value);	
	

	}
	@Then("User clicks on Button {string}")
	public void user_clicks_on_button(String logicalName) {
	 page.clickOnButton(logicalName);  
	}
	@Then("User clicks on CheckBox {string}")
	public void user_clicks_on_check_box(String logicalName) {
	   page.clickOncheckBox(logicalName);
	}

	@When("User verify the text {string} {string}")
	public void user_verify_the_text(String logicalName, String ExpectedText) {
	   page.verifyText(logicalName, ExpectedText);
	}

	  
	  }
