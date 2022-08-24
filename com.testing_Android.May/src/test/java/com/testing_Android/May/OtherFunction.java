package com.testing_Android.May;

import java.time.Duration;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class OtherFunction {
	private static final String LongPressOption = null;
	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) {
		TouchAction action = new AndroidTouchAction(driver);
	//Drag & Drop
		action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element("source element")))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
			.moveTo((ElementOption.element("target element"))).release().perform();
		
	// Double Tap
		action.press(300,300).perform().waitAction(WaitOption.waitOption(Duration.ofMillis(100)).press(300,300).perform();
		
		
	}

}
