package com.testing_Android.May;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class CalcyApp {
	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		// device and platform
		cap.setCapability("deviceName", "RFCNB050PMA");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platFormVersion", "12");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		// cap.setCapability(MobileCapabilityType.Device_Name,""
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("calculater app launched succesfully");
		MobileElement key_5 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		key_5.click();
		MobileElement key_plus = driver.findElementByAccessibilityId("Plus");
		key_plus.click();
		MobileElement key_2 = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.sec.android.app.popupcalculator:id/calc_keypad_btn_02\")");
		//key_2.click();
		//Tap (using Web Element)
		TouchAction action =new AndroidTouchAction(driver);
	//	action.tap(TapOptions.tapOptions().withElement(ElementOption.element(key_2))).perform();
		//Tap (using coordinate value (x,y))
		action.tap(PointOption.point(403,1884)).perform();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("calculater app closed succesfully");

	}

}
