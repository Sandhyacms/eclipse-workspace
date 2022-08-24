package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Automation {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/home.html");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println("Title of the page "+title);
String Expectedvalue="web login";
	
	String heading=driver.findElement(By.xpath("//h3[contains(text(),\" Web login \")]")).getText();
	System.out.println("expectedvalue "+Expectedvalue);
	System.out.println("actual value "+heading);
	if(Expectedvalue.equals(heading)) {
		System.out.println("Testing is passed");
	}else
	{
		System.out.println("Testing is failed");
	 
	WebElement email=driver.findElement(By.id("email_field"));
	email.sendKeys("admin123@gmail.com");
	WebElement password=driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");
	WebElement logintoaccount=driver.findElement(By.xpath("//button[text()='Login to Account']"));
	logintoaccount.click();
	Thread.sleep(5000);
	
    WebElement Name=driver.findElement(By.id("name"));
    Name.sendKeys("sandhya");
    WebElement Fathername=driver.findElement(By.id("lname"));
    Fathername.sendKeys("ShriBhagvan");
    driver.findElement(By.xpath("//input[@value='female']")).click();
    WebElement citydropdown = driver.findElement(By.id("city"));
    Select City = new Select(citydropdown);
    City.selectByVisibleText("GOA");
    WebElement courses = driver.findElement(By.id("course"));
    Select course = new Select(courses);
    course.selectByValue("btech");
    WebElement states = driver.findElement(By.id("state"));
    Select State = new Select(states);
    State.selectByIndex(2);
    
    
    
  //driver.close();
    
	
	
	}
	
	
	

	}

}
