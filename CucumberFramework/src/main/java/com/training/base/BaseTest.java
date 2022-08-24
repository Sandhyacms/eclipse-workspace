package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	static CommonUtilities common=new CommonUtilities();
	
		public static WebDriver getDriver() {
			if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
			return driver;
		}
		public static void launchApplication() throws IOException {
			String url=common.getApplicationProperty("url");
			String browser=common.getApplicationProperty("browser");
			System.out.println("Browser Name" +browser);
			driver= getDriver();
			driver.get("url");
		}
	}



