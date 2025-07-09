package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D07MyntraAssignment {
	WebDriver driver;
	@Test (priority = 1, enabled = false)
	public void clickOnMen() {
		driver.findElement(By.linkText("Men")).click();
	}
	@Test (priority = 2)
	public void clickOnWomen() {
		driver.findElement(By.linkText("Women")).click();
	}
	@Test (priority = 3)
	public void clickOnKids() {
		driver.findElement(By.linkText("Kids")).click();
	}
	@Test (priority = 4)
	public void clickOnHome() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest (alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
