package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
  
	  WebDriver driver;
	  @BeforeTest
	  public void launchingBrowser() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  
		  System.out.println("This is Before Test Method");
		  
	  }
	  
	  @AfterTest
	  public void closingBrowser() {
		  System.out.println("This is After Test Method");
		  driver.close();
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is Before Method");
		  
	  }
	  
	  @AfterMethod
	  public void printTitle() {
		  System.out.println("Title: " + driver.getTitle());
		  System.out.println("This is After Method");
		  
		  
	  }
  
	  @Test  (priority = 3)
	  public void launchingMyntra() {
		  
		  driver.get("https://www.myntra.com/");
		  
		  
	  }
	  @Test (priority = 2)
	  public void launchingShein() {
		  
		  driver.get("https://www.sheinindia.in/");
		  
	  
	  }
	  @Test 
	  public void launchingPotteryBarn() {

		  
		  driver.get("https://potterybarn.in/");
		  
	  
	  }

  }

