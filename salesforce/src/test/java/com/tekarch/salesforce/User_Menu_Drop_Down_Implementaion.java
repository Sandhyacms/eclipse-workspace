package com.tekarch.salesforce;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_Menu_Drop_Down_Implementaion {
	WebDriver driver;

	public User_Menu_Drop_Down_Implementaion() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void Login() {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("password")).sendKeys("SanShail123$");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("userNav")).click();
		String actual = driver.findElement(By.id("userNav-menuItems")).getText();
		List<String> messages = Arrays.asList("My Profile", "My Settings", "Developer Console",
				"Switch to Lightning Experience", "Logout");
		System.out.println(actual);

//		Assert.assertEquals("My Profile", driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[1]")).getText());
//		Assert.assertEquals("My Settings", driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[2]")).getText());
//		Assert.assertEquals("Developer Console", driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[3]")).getText());
//		Assert.assertEquals("Switch to Lightning Experience", driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[4]")).getText());

		for (String str : messages) {
			System.out.println(str + " - > " + actual.indexOf(str));
			Assert.assertTrue(actual.indexOf(str) >= 0);
		}

	}

	public void MyProfile() throws InterruptedException {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("password")).sendKeys("SanShail123$");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userNav")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@title='Edit Profile'])[1]")).click();
		Thread.sleep(6000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		driver.findElement(By.id("lastName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Kumari");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Post']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//html")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys("Hi all");
		Thread.sleep(6000);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement we = driver
				.findElement(By.xpath("//a[@id='publisherAttachContentPost']//img[contains(@class,'publishericon')]"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']//img[contains(@class,'publishericon')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id("chatterUploadFileAction")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='chatterFile']"))
				.sendKeys("C:\\Users\\sandh_ctyq64n\\Downloads\\BaseTest.java");
		action = new Actions(driver);
		we = driver
				.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@title='sandhya Kumari']"));
		action.moveToElement(we).build().perform();
		Thread.sleep(6000);
		 driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
//		 Actions actions = new Actions(driver);
//	        action.ClickAndHold(elementToDrag);
//	        action.MoveToElement(elementToDropOn, 5, 5);
//	        action.Perform();
//	        Thread.Sleep(250); //note the sleep here. magic sleep.
//	        action.Release(elementToDropOn);
//	        action.Perform();
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\sandh_ctyq64n\\OneDrive\\Pictures\\Capture.PNG");
		Thread.sleep(6000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//html")));
		Thread.sleep(10000);
		driver.findElement(By.id("j_id0:uploadFileForm:save")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")).click();
		Thread.sleep(20000);
	}
	public void Mysetting() throws InterruptedException {
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("password")).sendKeys("SanShail123$");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userNav")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='My Settings']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		Thread.sleep(10000);
		Actions	action = new Actions(driver);
		WebElement download = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		action.moveToElement(download).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		Thread.sleep(8000);

		driver.findElement(By.id("DisplayAndLayout_font")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("CustomizeTabs_font")).click();
		Thread.sleep(8000);
		Select se = new Select(driver.findElement(By.id("p4")));		
		se.selectByVisibleText("Salesforce Chatter");
		Select sec = new Select(driver.findElement(By.id("duel_select_0")));		
		sec.selectByVisibleText("Reports");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@title='Add']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("EmailSettings_font")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("sender_name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("sender_name")).sendKeys("Sandhya Kumari");
		Thread.sleep(5000);
		driver.findElement(By.id("sender_email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("sender_email")).sendKeys("sandhyacms@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("auto_bcc1")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CalendarAndReminders_font")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Reminders_font")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("testbtn")).click();
		Thread.sleep(2000);
}
	public void DevelopersConsole() throws InterruptedException {
		driver.get("https://login.salesforce.com");
		Thread.sleep(8000);
		driver.findElement(By.id("username")).sendKeys("sandhya@tek.com");
		driver.findElement(By.id("password")).sendKeys("SanShail123$");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userNav")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Developer Console']")).click();
		Thread.sleep(8000);
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}