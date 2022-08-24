package com.training.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	static WebDriver driver;
public static void main(String[]args) {

	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/home.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
	driver.findElement(By.id("password_field")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
	WebElement SwitchToButton=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(SwitchToButton));
	SwitchToButton.click();

}


}
