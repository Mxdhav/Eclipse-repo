package day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test          //Multiple @Test annotations can be used others can be only one. 
	public void test1 () {
		System.out.println("Test Case 01");
	}
	@Test
	public void  test2 () {
		System.out.println("Test Case 02");
	}
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method");
	}
	@BeforeClass
	public void beforeClass () {
		System.out.println("Before Class");
	}
	@AfterClass
	public void AfterClass () {
		System.out.println("After Class");
	}
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite () {
		System.out.println("After Suite");
	}
	@BeforeTest
	public void beforeTest () {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest () {
		System.out.println("After Test");
	}
}
