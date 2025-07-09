package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
  @Test    //it is the main method
  public void openSelenium() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.selenium.dev/downloads/");
	  
	  System.out.println("Title: " + driver.getTitle());
	  
	  driver.close();
	  
  }
  
}
