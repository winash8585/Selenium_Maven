package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	@Test(dataProvider="Data-provider")
	public void test(int a , int b) {
		int result =a+b;
		System.out.println(result);
		
	}
	@DataProvider(name="Data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2,3},{5,7}};
	}
}
