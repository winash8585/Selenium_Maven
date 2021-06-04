package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
		@BeforeMethod
		public void setup() throws InterruptedException {
			System.setProperty("WebDriver.chrome.driver","chromedriver");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			driver.get("https://www.simplilearn.com");
			Thread.sleep(3000);
			
		}
		@Test
		@Parameters({"uname","pwd"})
		public void login(String userVal,String passVal) {
			WebElement loginlink= driver.findElement(By.linkText("Log in"));
			loginlink.click();
			
			WebElement username=driver.findElement(By.name("user_login"));
			username.sendKeys(userVal);
			
			WebElement password=driver.findElement(By.name("user_pwd"));
			password.sendKeys(passVal);
			
			WebElement checkbox=driver.findElement(By.className("rememberMe"));
			checkbox.click();
			
			WebElement logbutton=driver.findElement(By.name("btn_login"));
			logbutton.click();
		}
		@AfterMethod
		public void down() {
			driver.quit();
		}



}
