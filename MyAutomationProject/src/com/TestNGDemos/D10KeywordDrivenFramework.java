package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D10KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	JavascriptExecutor js;
	
  @Test
  public void login() {
	  js.executeScript("window.scrollBy(0,1000)", "");
	  driver.findElement(By.id(prop.getProperty("unTxtBoxId"))).sendKeys("practice");
	  driver.findElement(By.name(prop.getProperty("pssTxtBoxName"))).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.xpath(prop.getProperty("lgnBttnXpath"))).submit();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText(prop.getProperty("lgOutBttnLink"))).click();
  }

  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File("/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/MyAutomationProject/src/com/TestNGDemos/MyData.properties");
	  fis = new FileInputStream(file);
	  prop = new Properties();
	  prop.load(fis);     //load all properties from properties file
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(prop.getProperty("URL"));
	  
	  js = (JavascriptExecutor) driver;
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
