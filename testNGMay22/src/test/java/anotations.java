import org.testng.annotations.Test;
/*
@BeforeSuite - The @BeforeSuite method in TestNG runs before the execution of all other test methods.
@AfterSuite - The @AfterSuite method in TestNG runs after the execution of all other test methods.
@BeforeTest - The @BeforeTest method in TestNG runs before the execution of all the test methods that are inside that folder.
@AfterTest - The @AfterTest method in TestNG executes after the execution of all the test methods that are inside that folder.
@BeforeClass - The @BeforeClass method in TestNG will run before the first method invokes of the current class.
@AfterClass - The @AfterClass method in TestNG will execute after all the test methods of the current class execute.
@BeforeMethod - The @BeforeMethod method in TestNG will execute before each test method.
@AfterMethod - The @AfterMethod method in TestNG will run after each test method is executed.
@BeforeGroups - The @BeforeGroups method in TestNG run before the test cases of that group execute. It executes just once.
@AfterGroups - The @AfterGroups method in TestNG run after the test cases of that group execute. It executes only once.*/

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anotations {
	@Test
	public void login() {
		System.out.println("I'm in method login");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
	}
}
