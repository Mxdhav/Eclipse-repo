package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertDemo {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyUrl() {						// Tests will execute on alphabetical order, so we use priority
		String expected = "https://www.google.com/";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyTitle() {
		String expected = "Google";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
