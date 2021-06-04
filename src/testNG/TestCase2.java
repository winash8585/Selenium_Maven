package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test(groups= {"Regression"})
	public void test3() {
		System.out.println("3rd test case");
	}
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before Suit method");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("aftersuit");
	}

}

