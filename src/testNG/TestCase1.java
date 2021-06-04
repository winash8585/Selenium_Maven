package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method sucessfully executed");
		
	}
	
	@Test(groups= {"Regression"})
	public void test1() {
		System.out.println("Test Case is successfull");
	}
	@Test(groups= {"Regression"})
	public void test2() {
		System.out.println("Test 2 sucessfully executed");
	}
	@AfterMethod
	public void after() {
		System.out.print("Sucessfull");
	}

}


