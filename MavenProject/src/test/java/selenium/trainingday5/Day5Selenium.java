package selenium.trainingday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Selenium {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		login();
		//switchTo() ;
		//alertselect();
		//promptalert();
		intractionTab() ;
		//doubleClickAction();
		ToolTipaction();
	
	

	}
	public static void login() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement logintoaccount=driver.findElement(By.xpath("//button[text()='Login to Account']"));
		logintoaccount.click();
	}
	public static void switchTo() {
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(switchTo));
		
		Actions action = new Actions(driver);
		action.moveToElement(switchTo).build().perform();
		
	}
	public static void alertselect() throws InterruptedException {
		
		WebElement alert = driver.findElement(By.xpath("//a[normalize-space()='Alert']"));
		alert.click();

		WebElement windowAlert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowAlert.click();
		Thread.sleep(5000);
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println("Text in the alert is::"+alertText);
		

		
	}
	public static void promptalert() throws InterruptedException {
		WebElement alert = driver.findElement(By.xpath("//a[normalize-space()='Alert']"));
		Thread.sleep(5000);
		alert.click();
		

		WebElement promtAlert = driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		promtAlert.click();
		driver.switchTo().alert().sendKeys("Sandhya");
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	}
	public static void intractionTab() {
		
		WebElement intractions=driver.findElement(By.xpath("//button[normalize-space()='Intractions']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(intractions));
		Actions action = new Actions(driver);
		action.moveToElement(intractions).perform();
		
	}
	public static void doubleClickAction() {
		
		WebElement doubleClickOption=driver.findElement(By.xpath("//a[normalize-space()='Double Click']"));
		doubleClickOption.click();
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[normalize-space()='Double Click']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickButton).build().perform();
	}
	public static void ToolTipaction() {
		
		WebElement ToolTipOption=driver.findElement(By.xpath("//a[normalize-space()='Tool Tip']"));
		ToolTipOption.click();
		WebElement top=driver.findElement(By.xpath("//div[@class='tooltipt']"));
		Actions action = new Actions(driver);
		action.moveToElement(top).build().perform();
		
		WebElement toptext=driver.findElement(By.xpath("//span[@class='tooltiptextt']"));
		String Actualtooltip= toptext.getText();
		System.out.println("Text from tool tip is "+Actualtooltip);
	}
	
	
}
