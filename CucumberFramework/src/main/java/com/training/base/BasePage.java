package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;
	 
	
	public HashMap<String, By> ObjRep=new HashMap<String, By>();
	
	
	
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}


	public void addObject(String logicalName,By by) {
		ObjRep.put(logicalName, by);
	}	
		
		
	public void enterintoTextBox(String logicalName, String Value) {
		WebElement element=	getElement(logicalName);
		element.sendKeys(Value);
		
	}
	public void clickOnButton(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
		
	}
	public void clickOncheckBox(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
	}
	public void verifyText(String logicalName, String ExpectedValue) {
		WebElement element = getElement(logicalName);
		String ActualValue =element.getText();
		Assert.assertEquals(ExpectedValue,ActualValue);
	
	}
	public WebElement getElement(String logicalName) {
		WebElement element=null;
		By by = null;
	by=ObjRep.get(logicalName);
	element=driver.findElement(by);
	return element;
	}
}



