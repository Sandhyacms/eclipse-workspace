package com.testing_Android.May;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ContactApp {
	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		// device and platform
		cap.setCapability("deviceName", "RFCNB050PMA");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platFormVersion", "12");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.samsung.android.app.contacts");
		cap.setCapability("appActivity", "com.samsung.android.contacts.contactslist.PeopleActivity");
		// cap.setCapability(MobileCapabilityType.Device_Name,""
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("contacts app launched succesfully");
		MobileElement search_Bar = driver.findElementByAccessibilityId("Search");
		TouchAction action = new AndroidTouchAction(driver);
		// action.tap(TapOptions.tapOptions().withElement(ElementOption.element(search_Bar))).perform();
		// MobileElement search_Box =
		// driver.findElementByAndroidUIAutomator("UiSelector().text(\"Search\")");
		// search_Box.sendKeys("airtel");
		Thread.sleep(5000);
		MobileElement menu = driver.findElement(By.id("com.samsung.android.app.contacts:id/drawer_icon"));
		menu.click();
		// swipe
	//	action.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(749, 1078)))
	//			.moveTo(ElementOption.point(80, 680)).release().perform();

		//action.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(530, 1530)))
		//		.moveTo(ElementOption.point(530, 680)).release().perform();

		// System.out.println(driver.manage().window().getSize());
		Dimension dimension =driver.manage().window().getSize();
		Double screenHeightStrat=dimension.getHeight()*0.5;
		int scrollStart=screenHeightStrat.intValue();       // start Y
		System.out.println(scrollStart);
		
		Double screenHeightEnd=dimension.getHeight()*0.2;   // end Y
		int scrollEnd=screenHeightEnd.intValue();
		System.out.println(scrollEnd);
		
		int center=(int)(dimension.width*0.5);             // start+end X
		System.out.println(center);
		
		action.press(PointOption.point(center, scrollStart))
		.waitAction(new WaitOptions().waitOptions(Duration.ofMillis(500)))
		.moveTo(PointOption.point(center, scrollEnd)).release().perform();

		Thread.sleep(5000);
		driver.quit();
		System.out.println("contacts app closed succesfully");

	}

}
