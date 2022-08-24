package com.training.robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotExample {
public static void main(String[]args) throws AWTException, InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Robot robot=new Robot();
	Thread.sleep(10000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(10000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(10000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(10000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
//robot.mouseMove(750,380);
//	robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//	robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
//	Thread.sleep(10000);
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.mouseWheel(5);
}

}
