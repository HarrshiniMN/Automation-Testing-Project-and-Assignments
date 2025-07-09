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
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D09Parametarization {
	WebDriver driver;
	
	@Parameters({"userName", "password"}) 
  @Test
  public void login(String un, String ps) {
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(ps);
	  driver.findElement(By.id("submit")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
  }
  @AfterMethod
  public void afterMethod() {
	  if(driver.getCurrentUrl().contains("successfully")) {
		  driver.findElement(By.partialLinkText("Log")).click();
	  }
  }

  @BeforeTest
  public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
