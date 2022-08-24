package com.tekarch.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SdfcLogin_implement {
	WebDriver driver;

	public SdfcLogin_implement() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void browse_sfdc() {
		driver.get("https://www.salesforce.com");
	}

	public void Launch_app_withoutpassword() {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("sandhyatek.com");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("Login")).click();
	}

	public void Launch_app() {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("password")).sendKeys("SanShail123$");
		driver.findElement(By.id("Login")).click();
	}

	public void rememberMe() {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("password")).sendKeys("SanShail123$");
		driver.findElement(By.id("rememberUn")).click();
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	public void forgotPassword() {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.id("un")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("continue")).click();
	}

	public void forgotpassword_4b() throws InterruptedException {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("123");
		Thread.sleep(100);
		driver.findElement(By.id("password")).sendKeys("32546");
		Thread.sleep(100);
		driver.findElement(By.id("Login")).click();
		String expected = "Your login attempt has failed. The username or password may be incorrect, or your location or login time may be restricted. Please contact the administrator at your company for help";
		String actual = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println("Actual Value is "+actual);
		Assert.assertEquals(actual, expected);
		

	}

}
