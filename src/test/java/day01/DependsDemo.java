package day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsDemo {

	@Test(dependsOnMethods = "openBrowser")// if one dependent method is failed then this method will automatically skip
	public void signIn() {
		System.out.println("User has Signed in");
	}

	@Test
	public void openBrowser() {
		System.out.println("User has opened the browser");
		Assert.fail();
	}

	@Test(dependsOnMethods = {"openBrowser","signIn"})
	public void logOut() {
		System.out.println("User has logged out");
	}

}
