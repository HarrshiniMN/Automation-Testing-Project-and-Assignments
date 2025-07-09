package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
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
	  System.out.println("This is After Test Methos");
	  driver.close();
	  
  }
  
  
  @Test  (priority = 3)
  public void launchingMyntra() {
	  
	  driver.get("https://www.myntra.com/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  
  }
  @Test (priority = 2)
  public void launchingShein() {
	  
	  driver.get("https://www.sheinindia.in/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  
  }
  @Test 
  public void launchingPotteryBarn() {

	  
	  driver.get("https://potterybarn.in/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  
  }

 

  }
