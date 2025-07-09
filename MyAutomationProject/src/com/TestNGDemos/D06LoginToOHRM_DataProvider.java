package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06LoginToOHRM_DataProvider {
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;

	WebDriver driver;
	WebDriverWait wait;

	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		actUrl = driver.getCurrentUrl();

		Assert.assertEquals(actUrl, expUrl, "Invalid user name / password");
		//Assert.assertTrue(actUrl.contains("dashboard"), "Invalid user name / password");
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "deepak", "deepak123" },
			new Object[] {"soumya", "Soumya123"},
		};

		//String[][]data = {{"admin", "admin123"}, {"soumya", "Soumya123"}};
		//return data;
	}
	@AfterMethod
	public void logout() {
		/*if(wait.until(ExpectedConditions.alertIsPresent())==null)
		{
			
		}*/
		

		if (actUrl.contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Fail!!! \nInvalid user name / password");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
