package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
  @Test (priority = 3)
  public void launchingNykaa() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.nykaa.com/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  driver.close();
	  
  }
  
  @Test  (priority = 4)
  public void launchingMyntra() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.myntra.com/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  driver.close();
	  
  }
  @Test (priority = 2)
  public void launchingShein() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.sheinindia.in/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  driver.close();
	  
  }
  @Test 
  public void launchingPotteryBarn() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://potterybarn.in/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  driver.close();
	  
  }

  
}
