import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce extends ReusableMethods {
	WebDriver driver;

	@BeforeMethod

	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}

	/** this @AfterMethod annotation will be executed after each test case **/
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyPageTitleTest() // verify the title of salesforce application
	{
		String title = driver.getTitle();
		System.out.println("The page title is: " + title);
		Assert.assertEquals(title, "Login | Salesforce");
	}

	@Test(priority = 2)
	public void logintosalesforce() throws Exception // verify the title of salesforce application
	{
		WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
		// Uname.sendKeys("anoop123@tekarch.com");
		enterText(Uname, "Anoopns@abc.com", "UserName");

		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		enterText(pwd, "Anoop1234", "Password");
		WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));

		System.out.println("TC_1 Login Error Message completed");

	}

}
