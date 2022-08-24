package com.training.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	static WebDriver driver;
	
	public static void login() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
	}
	
	
	 public static void switchtoTab() {
		 
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		waitforElement(10,switchTo);
		Actions action = new Actions(driver);
		action.moveToElement(switchTo).build().perform();
		
	 }
	
  public static void alertselect()  {
		WebElement alert = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		alert.click();
		/*---Click on windows alert--*/
		WebElement windowAlert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowAlert.click();
		String alertText= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Text in the Alert is ::"+alertText);
	}
  
  
  public static void tabSelect() {
	
	  WebElement windows = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
	  windows.click();
	  WebElement newtab = driver.findElement(By.xpath("(//button[contains(text(),'Click To Open New')])[1]"));
	  newtab.click();
	
	  System.out.println(driver.getWindowHandles());
	 
	  for (String handle:driver.getWindowHandles()) {
		  
		  driver.switchTo().window(handle);
	  }
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  
	 
	  
  }
  
  public static void WindowSelect() {
		
	  WebElement windows = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
	  windows.click();
	  WebElement newwindow = driver.findElement(By.xpath("(//button[contains(text(),'Click To Open New')])[2]"));
	  newwindow.click();
	  
	  String parentwindow = driver.getWindowHandle();
	  System.out.println("Parent Window" +parentwindow);
	  
	
	  System.out.println(driver.getWindowHandles());
	 
	  for (String handle:driver.getWindowHandles()) {
		  
		  driver.switchTo().window(handle);
	  }
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  
	  driver.switchTo().window(parentwindow);
	  
	 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  
	 
  }
  
  
  
  public static void WidgetTab() {
		 
		WebElement widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		waitforElement(10,widget);
		Actions action = new Actions(driver);
		action.moveToElement(widget).build().perform();
		
	 }
  
  public static void autocomplete(String input) {
	  WebElement automCompleteOption = driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
	  automCompleteOption.click();
	  WebElement country = driver.findElement(By.id("myInput"));
	  country.sendKeys(input);
	  List<WebElement> countryList = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']"));
	  for(WebElement element:countryList ) {
		  System.out.println(element.getText());
	  }
  }
  
  
  public static void autocomplete(String input,String selection) {
	  WebElement automCompleteOption = driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
	  automCompleteOption.click();
	  WebElement country = driver.findElement(By.id("myInput"));
	  country.sendKeys(input);
	  List<WebElement> countryList = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
	  System.out.println("Expected country to be Chosen" +selection);
	  for(int i=0; i<countryList.size();i++) {
		 System.out.println(countryList.get(i).getText());
		 String ActualValue = countryList.get(i).getText();
		 if(selection.equalsIgnoreCase(ActualValue)) {
			 countryList.get(i).click();
			 break;
		 }
		 
	  }
	  
	  
  }
  
  public static void autocomplete(String input,int position) {
	  WebElement automCompleteOption = driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
	  automCompleteOption.click();
	  WebElement country = driver.findElement(By.id("myInput"));
	  country.sendKeys(input);
	  List<WebElement> countryList = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
	  countryList.get(position).click();
	  takeScreenShot(driver);
  }
  
  
  
  
  
  public static void waitforElement(int time,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
  
  public static void takeScreenShot(WebDriver driver) {
	  
	  TakesScreenshot screenshot = ((TakesScreenshot) driver);
	  File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	  
	  Date CurrentDate = new Date();
	  String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(CurrentDate);
	  String filePath = "C:\\May2022\\Selenium\\Day6\\ScreenShot"+timeStamp+".png";
	  File destFile = new File(filePath);
	  
	  try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
	  
  }
  
  




}


