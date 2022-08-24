 package Test_appium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class Test_app {
  @Test
  public void f() {
	//object created
	  DesiredCapabilities capabilities=new DesiredCapabilities();
	  //Device Name
	  capabilities.setCapability("deviceName","RFCNB050PMA");
	  //Platform Version
	  capabilities.setCapability("platformVersion","12");
	  //Platform Name
	  capabilities.setCapability("platformName","Android");
	  //appPackage
	  capabilities.setCapability("appPackage","..................");

	  //appActivity
	  capabilities.setCapability("appActivity","..................");
  }
}
